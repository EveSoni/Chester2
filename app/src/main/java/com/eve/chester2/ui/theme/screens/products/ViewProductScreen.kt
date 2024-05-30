package com.eve.chester2.ui.theme.screens.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.eve.chester2.data.productviewmodel
import com.eve.chester2.model.Product
import com.eve.chester2.navigation.ROUTE_UPDATE_PRODUCT

@Composable
fun ViewProductsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = productviewmodel(navController, context)
        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "STUDENT CATALOGUE",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(products){
                    ProductItem(
                        name = it.name,
                        adminid = it.adminid,
                        email = it.email,
                        password = it.password,
                        userid = it.userid,
                        navController = navController,
                        productRepository = productRepository
                    )
                }

                }
            }
        }
    }

@Composable
fun ProductItem(name:String, adminid:String, email:String, userid:String, password:String,
                navController: NavHostController, productRepository:productviewmodel) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = adminid)
        Text(text = email)
        Text(text = password)
        Text(text = userid)


        Button(onClick = {
            productRepository.deleteProduct(userid)
        }) {
            Text(text = "Delete")
        }

        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_PRODUCT+"/$userid")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun view() {
    ViewProductsScreen(rememberNavController())
}



