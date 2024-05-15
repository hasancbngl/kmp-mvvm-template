import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import navigation.SetupNavGraph
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    val lightColors = lightColorScheme(
        primary = Color.Gray,
        onPrimary = Color.LightGray,
        primaryContainer = Color.Gray,
        onPrimaryContainer = Color.LightGray
    )
    val darkColors = darkColorScheme(
        primary = Color.Gray,
        onPrimary = Color.LightGray,
        primaryContainer = Color.Gray,
        onPrimaryContainer = Color.LightGray
    )
    val colors by mutableStateOf(
        if (isSystemInDarkTheme()) darkColors else lightColors
    )

    MaterialTheme (colorScheme = colors){
        val navController = rememberNavController()
        SetupNavGraph(navController)
    }
}