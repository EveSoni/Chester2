package com.eve.chester2.ui.theme.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.eve.chester2.R
import com.eve.chester2.navigation.ROUTE_ABOUT
import com.eve.chester2.navigation.ROUTE_UPDATE_PRODUCT
import com.eve.chester2.navigation.ROUTE_VIEW_PRODUCT

@Composable
fun HomeScreen(navController:NavHostController){
    LazyColumn(){
        item{
            Column(modifier= Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(color = Color.Blue)) {
                Box{
                    Image(painter = painterResource(id = R.drawable.sch_logo),
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentDescription = null)
                }
            }

            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=10.dp, end=10.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.book_icon ) ,
                        contentDescription = null)

                    Spacer(modifier = Modifier.height(5.dp) )

                    Text("School Info", Modifier.clickable {
                       navController.navigate(ROUTE_ABOUT)})
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.page_icon ) ,
                        contentDescription = null)

                    Spacer(modifier = Modifier.height(5.dp) )

                    Text("Student Info", Modifier.clickable {
                        navController.navigate(ROUTE_UPDATE_PRODUCT)})
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.padding(start=10.dp, end=10.dp)) {
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.academics ) ,
                        contentDescription = null)

                    Text("Academics", Modifier.clickable {
                        navController.navigate(ROUTE_VIEW_PRODUCT)})
                }

                Spacer(modifier = Modifier.width(20.dp) )

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.activity_icon ) ,
                        contentDescription = null)

                    Text("Activities", Modifier.clickable {
                        navController.navigate(ROUTE_VIEW_PRODUCT)})
                }
            }
            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=10.dp, end=10.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.fees_icon ) ,
                        contentDescription = null)

                    Text("Fees", Modifier.clickable {
                        navController.navigate(ROUTE_VIEW_PRODUCT)})
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.records_icon ) ,
                        contentDescription = null)

                    Text("Records", Modifier.clickable {
                        navController.navigate(ROUTE_VIEW_PRODUCT)})
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.padding(start=10.dp, end=10.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.bus ) ,
                        contentDescription = null)

                    Text("Transport", Modifier.clickable {
                        navController.navigate(ROUTE_VIEW_PRODUCT)})
                }

            }

        }
    }
}
@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(horizontal = 15.dp, vertical = 10.dp)
                    .clip(MaterialTheme.shapes.large)
            ) {
                Image(
                    painter = painterResource(R.drawable.bus),
                    contentDescription = "home_screen_bg",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                "Home Screen",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(vertical = 20.dp)
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
