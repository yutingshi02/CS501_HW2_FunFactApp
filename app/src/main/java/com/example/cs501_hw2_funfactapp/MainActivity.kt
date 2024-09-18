package com.example.cs501_hw2_funfactapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimalFactsApp()
        }
    }
}

@Composable
fun AnimalFactsApp() {
    val facts = listOf(
        "A group of flamingos is called a 'flamboyance.'",
        "Octopuses have three hearts and blue blood.",
        "Honey never spoils; archeologists have found pots of honey in ancient Egyptian tombs that are over 3000 years old!",
        "Hermit crabs drink water by dipping their claws into the water and scooping it into their mouths.",
        "Sea otters hold hands while sleeping to avoid drifting apart.",
        "A snail can sleep for three years.",
        "Sloths can hold their breath longer than dolphins—up to 40 minutes.",
        "Cows have best friends and get stressed when they are separated.",
        "A group of owls is called a parliament.",
        "Penguins propose to their mates with a pebble.",
        "Sea horses are the only animals in which the male carries the young.",
        "Elephants are the only mammals that can't jump."

    )

    var currentFactIndex by remember { mutableStateOf(Random.nextInt(facts.size)) }

    fun nextFact() {
        currentFactIndex = Random.nextInt(facts.size)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFFFC0CB)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = facts[currentFactIndex],
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
            color = Color(0xFFDB7093)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { nextFact() }) {
            Text(text = "Next Fact", color = Color.White)
        }
    }
}
