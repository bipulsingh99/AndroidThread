package com.example.androidthread.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.androidthread.IgViewModel

@Composable
fun SearchScreen(navController: NavController, vm: IgViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {

        }
        BottomNavigationMenu(
            selectedItem = BottomNavigationMenu.SEARCH,
            navController = navController
        )
    }
}

