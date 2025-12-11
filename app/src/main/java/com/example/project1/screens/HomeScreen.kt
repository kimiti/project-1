package com.example.project1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project1.components.Header
import com.example.project1.components.MiddleSection
import com.example.project1.components.TrendSection

@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .verticalScroll(rememberScrollState())
    ){
        Header()
        MiddleSection()
        TrendSection()
        Spacer(Modifier.height(80.dp))
    }
}



@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}