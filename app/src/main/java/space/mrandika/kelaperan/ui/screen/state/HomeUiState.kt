package space.mrandika.kelaperan.ui.screen.state

import space.mrandika.kelaperan.model.Food

data class HomeUiState(
    val isError: Boolean = false,
    val foods: List<Food> = emptyList(),

    val query: String = "",
    val isSearchActive: Boolean = false
)