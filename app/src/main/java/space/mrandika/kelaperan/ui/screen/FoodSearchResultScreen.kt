package space.mrandika.kelaperan.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.ui.component.item.FoodItem

@Composable
fun FoodSearchResultScreen(
    foods: List<Food>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn {
        items(foods, key = { it.id }) { food ->
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