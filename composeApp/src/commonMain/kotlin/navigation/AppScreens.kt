package navigation

sealed class AppScreens(val route: String) {
    object Main : AppScreens("app_screen_main")
    object Detail : AppScreens("app_screen_detail")
}
