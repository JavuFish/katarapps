package com.katarapps.mobile.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : NavigationItem("home", "Home", Icons.Filled.Home)
    object Members : NavigationItem("members", "Members", Icons.Filled.People)
    object Events : NavigationItem("events", "Events", Icons.Filled.Event)
    object Profile : NavigationItem("profile", "Profile", Icons.Filled.Person)

    companion object {
        fun getNavigationItems(): List<NavigationItem> {
            return listOf(Home, Members, Events, Profile)
        }
    }
}
