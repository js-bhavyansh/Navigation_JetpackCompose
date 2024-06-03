package com.example.nested_nav_graph.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nested_nav_graph.R
import com.example.nested_nav_graph.navigation.ScreenName

@Composable
fun HomeScreen(
    navController: NavHostController
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.img4),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(15.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        navController.navigate(route = ScreenName.Detail.route)
                    }
            )

            Text(
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                text = "Home Screen"
            )
        }
    }

}