package com.example.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun PostItem(userId: Int, postId: Int, title: String, body: String, onClick: ()-> Unit){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        modifier = Modifier
            .padding(all = 10.dp)
            .fillMaxWidth()
            .clickable { onClick() },

    ) {
        Column(modifier = Modifier
            .padding(horizontal = 10.dp)) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(vertical = 16.dp),
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = body,
                textAlign = TextAlign.Start,
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .padding(vertical = 7.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.inverseSurface,
                text = "User ID: $userId",
            )
            Text(
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.inverseSurface,
                text = "Post ID: $postId",
            )
        }

    }
}