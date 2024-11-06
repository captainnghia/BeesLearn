package fpl.md07.beeslearn.main

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpl.md07.beeslearn.navigation.BottomNavBar
import fpl.md07.beeslearn.screens.tabs.HomeScreen
import fpl.md07.beeslearn.screens.tabs.IPAExercise
import fpl.md07.beeslearn.screens.movie.MovieListScreen
import fpl.md07.beeslearn.screens.music.MusicListScreen
import fpl.md07.beeslearn.screens.podcast.PodcastListScreen
import fpl.md07.beeslearn.screens.lessons.SelectLessonScreen
import fpl.md07.beeslearn.ui.theme.BeesLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeesLearnTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    BottomNavBar (navController = navController)
//                    WelcomeScreen(navController)
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController : NavHostController) {
    val navController = rememberNavController()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Chứa BottomNavBar và NavHost
        BottomNavBar(navController = navController)
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "mainScreen"
    ) {

        composable("mainScreen") { MainScreen(navController = navController) }

        composable("homeScreen") { HomeScreen(navController = navController) }
        composable("ipaExercise") { IPAExercise( navController = navController) }
        composable("podcastScreen") { PodcastListScreen( navController = navController) }
        composable("movieScreen") { MovieListScreen (navController = navController) }
        composable("musicScreen") { MusicListScreen (navController = navController) }
        composable("selectExercise") { SelectLessonScreen (navController = navController) }

        composable("bottomNavBar") { BottomNavBar(navController = navController) }
    }
}