package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import presentation.detail.DetailScreen
import presentation.main.MainScreen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = AppScreens.Main.route
    ) {
        composable(route = AppScreens.Main.route) {
            MainScreen(
                navController = navController
            )
        }
        composable(route = AppScreens.Detail.route) {
            DetailScreen(navController)
        }
    }
}