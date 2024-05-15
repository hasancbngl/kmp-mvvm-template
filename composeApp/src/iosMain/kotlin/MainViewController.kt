import androidx.compose.ui.window.ComposeUIViewController
import data.KoinInitializer

fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInitializer().init()
    }
) { App() }