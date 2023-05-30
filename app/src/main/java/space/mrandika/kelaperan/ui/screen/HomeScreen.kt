package space.mrandika.kelaperan.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch
import space.mrandika.kelaperan.R
import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.ui.component.item.FoodItem
import space.mrandika.kelaperan.ui.navigation.Screen
import space.mrandika.kelaperan.viewmodel.FoodsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    navigateToDetail: (Int) -> Unit,
    viewModel: FoodsViewModel = hiltViewModel()
) {
    val coroutineScope = rememberCoroutineScope()

    // State
    val homeUiState by viewModel.uiState.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SearchBar(
            modifier = Modifier.fillMaxWidth(),
            query = homeUiState.query,
            placeholder = { Text(stringResource(R.string.placeholder_search)) },
            onQueryChange = { viewModel.updateQuery(it) },
            active = homeUiState.isSearchActive,
            onActiveChange = { viewModel.updateSearchState(it) },
            leadingIcon = {
                Icon(Icons.Default.Search, stringResource(R.string.action_search))
            },
            trailingIcon = {
                if (homeUiState.isSearchActive) {
                    Icon(
                        modifier = Modifier.clickable {
                            if (homeUiState.query.isEmpty()) {
                                viewModel.updateSearchState(false)
                            } else {
                                viewModel.updateQuery("")
                            }
                        },
                        imageVector = Icons.Default.Clear,
                        contentDescription = stringResource(R.string.action_delete)
                    )
                } else {
                    Icon(
                        modifier = Modifier.clickable {
                            navHostController.navigate(Screen.Account.route)
                        },
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = stringResource(R.string.about_page)
                    )
                }
            },
            onSearch = { query ->
                viewModel.updateSearchState(false)

                coroutineScope.launch {
                    viewModel.searchFoods(query)
                }
            }
        ) {
            if (homeUiState.query.isNotEmpty()) {
                FoodSearchResultScreen(
                    foods = homeUiState.foods,
                    navigateToDetail = { id ->
                        navHostController.navigate(Screen.FoodDetail.createRoute(id))
                    }
                )
            }
        }

        FoodListColumn(
            data = homeUiState.foods,
            navigateToDetail = navigateToDetail,
            modifier = modifier.padding(horizontal = 8.dp)
        )
    }
}

@Composable
private fun FoodListColumn(
    data: List<Food>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(data, key = { it.id }) { food ->
            FoodItem(
                name = food.name,
                imageUrl = food.imageUrl,
                description = food.description,
                rating = food.rating,
                modifier = Modifier.clickable {
                    navigateToDetail(food.id)
                }
            )
        }
    }
}