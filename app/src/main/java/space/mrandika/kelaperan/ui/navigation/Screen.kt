package space.mrandika.kelaperan.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Account : Screen("account")

    object FoodDetail : Screen("food/{id}") {
        fun createRoute(id: Int) = "food/$id"
    }
}
