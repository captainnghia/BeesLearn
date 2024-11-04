package fpl.md07.beeslearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fpl.md07.beeslearn.R

@Composable
fun SettingScreen (navController: NavController) {
    Column (
        modifier = Modifier
            .background(color = colorResource(id = R.color.primary_color))
            .padding(horizontal = 20.dp)
            .fillMaxSize()
    ) {
        Text(
            "CCCCC"
        )
    }
}

@Preview (showSystemUi = true, showBackground = true)
@Composable
fun PreviewSettingScreen () {
    var navController = rememberNavController()
    SettingScreen(navController)
}