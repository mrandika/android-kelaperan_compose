package space.mrandika.kelaperan.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import space.mrandika.kelaperan.R
import space.mrandika.kelaperan.ui.component.RatingComponent
import space.mrandika.kelaperan.ui.component.TopBar
import space.mrandika.kelaperan.ui.component.image.HeaderImage
import space.mrandika.kelaperan.ui.component.list.GalleryList
import space.mrandika.kelaperan.viewmodel.FoodViewModel

@Composable
fun FoodDetailScreen(
    modifier: Modifier = Modifier,
    foodId: Int,
    navHostController: NavHostController,
    viewModel: FoodViewModel = hiltViewModel()
) {
    // State
    val foodDetailUiState by viewModel.uiState.collectAsState()

    LaunchedEffect(true) {
        viewModel.getFood(foodId)
    }

    Scaffold(
        topBar = {
            TopBar(
                title = foodDetailUiState.food.name,
                navHostController = navHostController
            )
        },
        modifier = modifier
    ) { padding ->
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier
                .padding(padding)
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            HeaderImage(
                imageUrl = foodDetailUiState.food.imageUrl,
                imageDescription = foodDetailUiState.food.name
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Icon(Icons.Default.LocationOn, contentDescription = stringResource(R.string.location))

                    Text(
                        text = foodDetailUiState.food.origin,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                    )
                }

                RatingComponent(foodDetailUiState.food.rating)
            }

            Text(
                text = foodDetailUiState.food.description,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = stringResource(R.string.food_gallery),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 18.dp)
            )

            GalleryList(
                foodName = foodDetailUiState.food.name,
                foodDetailUiState.food.galleries.items
            )
        }
    }
}