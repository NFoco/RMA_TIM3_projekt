package com.example.rma_tim3_projekt.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rma_tim3_projekt.R
import com.example.rma_tim3_projekt.navigation.Screen

@Composable
fun PretrazivanjeScreen(navController: NavHostController) {

    var text by remember { mutableStateOf("") }
    val screenWidthInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.widthPixels.toDp()
    }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Kategorije",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = { Text("Tražilica") }
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            LazyColumn(){

                item {
                    Row(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC8FFF179))
                                .clickable { navController.navigate(Screen.PocetniEkran.route) }
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.suha_hrana),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC891FF8E))
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.poslastica),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                    }
                }

                item{
                    Spacer(modifier = Modifier.height(10.dp))
                }

                item {
                    Row(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC879BAFF))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.dentalno),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC8EB79FF))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.igracke),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                    }
                }

                item{
                    Spacer(modifier = Modifier.height(10.dp))
                }

                item {
                    Row(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC8FF8D79))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.sampon),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC8C079FF))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.krevet),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                    }
                }

                item {
                    Row(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC8FF7979))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.mokra),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .width(screenWidthInDp / 2 - 10.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xC892FF79))                        ){
                            Image(
                                painter = painterResource(id = R.drawable.transporter),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,

                                )
                        }

                    }
                }

            }
        }
    }
}


