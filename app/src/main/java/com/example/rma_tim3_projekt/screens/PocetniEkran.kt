package com.example.rma_tim3_projekt.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rma_tim3_projekt.R
import com.example.rma_tim3_projekt.navigation.Screen

@Composable
fun PocetniEkran(navController: NavController) {

    var text by remember {mutableStateOf("")}
    val screenWidthInDp = 800.dp

    Surface(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        color = Color.LightGray
    ) {

        Box(
            modifier = Modifier.size(600.dp, 200.dp)
        ) {

        Column{
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Tražilica") }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .height(180.dp)
                    .width(screenWidthInDp / 2 - 10.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xC8EB79FF))
                    .clickable { navController.navigate(Screen.PretrazivanjeScreen.route) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.paketici),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,

                    )
            }
            Text(
                text = "Popularno",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Vidi sve",
                color = Color.Yellow,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = "Vrste ljubimaca",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Vidi sve",
                color = Color.Yellow,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
          }
        }
    }
}




