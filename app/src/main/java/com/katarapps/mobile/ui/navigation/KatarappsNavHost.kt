package com.katarapps.mobile.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.katarapps.mobile.ui.screens.home.HomeScreen
import com.katarapps.mobile.ui.screens.members.MembersScreen
import com.katarapps.mobile.ui.screens.events.EventsScreen
import com.katarapps.mobile.ui.screens.profile.ProfileScreen

@Composable
fun KatarappsNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavigationItem.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(NavigationItem.Members.route) {
            MembersScreen(navController = navController)
        }
        composable(NavigationItem.Events.route) {
            EventsScreen(navController = navController)
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen(navController = navController)
        }
    }
}
