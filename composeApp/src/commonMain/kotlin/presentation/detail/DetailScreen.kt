package presentation.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import data.koinViewModel
import getPlatform

@Composable
fun DetailScreen(navController: NavController) {

    val viewModel = koinViewModel<DetailViewModel>()
    val data = viewModel.data.value

    Box(modifier = Modifier.fillMaxSize()) {
        if (data.isNotEmpty()) {
            Text("dummy data from db ${data[0].title}  and platform: ${getPlatform()}")
        } else Text("hello world")
    }
}