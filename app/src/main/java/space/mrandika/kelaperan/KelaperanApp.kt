package space.mrandika.kelaperan

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import space.mrandika.kelaperan.ui.navigation.Screen
import space.mrandika.kelaperan.ui.screen.AccountScreen
import space.mrandika.kelaperan.ui.screen.FoodDetailScreen
import space.mrandika.kelaperan.ui.screen.HomeScreen

@Composable
fun KelaperanApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        modifier = modifier
    ) { padding ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(padding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navigateToDetail = { id ->
                    navHostController.navigate(Screen.FoodDetail.createRoute(id))
                }, navHostController = navHostController)
            }

            composable(
                route = Screen.FoodDetail.route,
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) {
                val id = it.arguments?.getInt("id") ?: 0

                FoodDetailScreen(
                    foodId = id,
                    navHostController = navHostController
                )
            }

            composable(Screen.Account.route) {
                AccountScreen(navHostController = navHostController)
            }
        }
    }
}

