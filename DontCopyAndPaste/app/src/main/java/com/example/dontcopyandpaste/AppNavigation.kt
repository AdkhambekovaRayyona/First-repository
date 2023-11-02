package com.example.dontcopyandpaste

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson

//@Composable
//fun AppNavigation() {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = "home") {
//        composable("home") {
//            HomePage(navController)
//        }
//        composable("add") {
//            AddPage(navController)
//        }
//    }
//}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
           ProductListPage(navController)
        }
        composable(
            "deatail/{ProductInfo}",
            arguments = listOf(navArgument("data"){
                type= NavType.StringType
            })
        ) {navBackStackEntry->
            navBackStackEntry.arguments?.let { 
                val gson = Gson()
                val data =it.getString("data")
                DatailPage(gson.fromJson(data,Product::class.java))
            }
        }
    }
}

