package com.example.project1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project1.R
import com.example.project1.model.Trend
import com.example.project1.ui.theme.DarkBlue
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.lazy.items
import com.example.project1.ui.theme.TextGrayColor

@Composable
fun TrendSection() {
    val trends = listOf(
        Trend(title = "Hello World", subtitle = "Hello World", picRes = R.drawable.trends2),
        Trend(title = "Hello World", subtitle = "Hello World", picRes = R.drawable.trends2),
        Trend(title = "Hello World", subtitle = "Hello World", picRes = R.drawable.trends2)
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(32.dp)
                .padding(top = 32.dp, bottom = 12.dp)
        ) {
            Text(
                text = "Trends",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = DarkBlue,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "View All",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = DarkBlue,
                modifier = Modifier.clickable {}
            )
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(trends) { item -> TrendItem(trend = item) }
        }
    }
}


@Composable
fun TrendItem(trend: Trend) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .width(205.dp)
            .height(260.dp)
            .padding(bottom = 8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(trend.picRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                trend.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = TextGrayColor,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = trend.subtitle,
                fontSize = 12.sp,
                color = DarkBlue,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
            )
        }
    }
}


@Preview
@Composable
fun TrendSectionPreview() {
    TrendSection()
//    TrendItem(
//        trend = Trend(
//            title = "Hello World",
//            subtitle = "Hello World",
//            picRes = R.drawable.trends2
//        )
//    )
}