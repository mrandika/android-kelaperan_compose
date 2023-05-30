package space.mrandika.kelaperan.ui.screen.state

import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.model.FoodGallery

data class FoodDetailUiState(
    val isError: Boolean = false,
    val food: Food = Food(0, "", "", "", "", 0.0, FoodGallery(emptyList())),
)