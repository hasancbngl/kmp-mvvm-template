import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.KoinInitializer

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp-mvvm-shared-viewmodel-room-koin",
    ) {
        KoinInitializer().init()
        App()
    }
}