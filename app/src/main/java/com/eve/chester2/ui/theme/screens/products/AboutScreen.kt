package com.eve.chester2.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eve.chester2.R

@Composable
fun School(){
    LazyColumn(){
        item{
            Column {
                Row {
                    Text("Mt.Clare's History",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Text("Mt.Clare Preparatory School started as a nursery school in 2008 with " +
                            "a population of 23 students. The idea of starting a school initially" +
                            " came when Founding Directors’ children started going to school." +
                            " He wanted them to have good education and though there were public " +
                            "schools, they wanted a better school for their children. " +
                            "They ended up taking their children to a private school, which " +
                            "was far away from home",
                        fontSize = 10.sp,
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("It was against this background that when the new Kikuyu started" +
                            " in 2008 consisting of eight class rooms, the directors realized " +
                            "that there was a need for a nursery school to cater for the new " +
                            "households. The school has now grown to become Mt.Clare Schools " +
                            "(Primary and Kindergarten) and Senior (Secondary) now Mt.Clare Kikuyu " +
                            "Campus with a population of 1000 plus. It has also grown and " +
                            "expanded with two more campuses: Mt.Clare Kikuyu Campus– Kindergarten," +
                            " Preparatory and Senior School.",
                        fontSize = 8.sp,
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Black)

                }

                Spacer(modifier = Modifier.height(10.dp))

                Row {
                    Text("Admission",
                        fontSize = 25.sp,
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Admissions are currently ongoing." +
                            "Click the link below to download our admission forms.",
                        fontSize = 10.sp,
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.SemiBold)

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        shape = RoundedCornerShape(3.dp)
                    ) {
                        Image(
                            painterResource(id = R.drawable.pdf),
                            contentDescription = null)
                        Text("Admission Form",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold)
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Box (
                    Modifier.background(color = Color.DarkGray,)
                ){
                    Row {
                        Text("Contact",
                            fontSize = 10.sp,
                            color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold)

                        Spacer(modifier = Modifier.height(20.dp))

                        Image(
                            painterResource(id = R.drawable.location ),
                            contentDescription = "Kikuyu")

                        Spacer(modifier = Modifier.height(20.dp))

                        Image(
                            painterResource(id = R.drawable.mailbox ),
                            contentDescription = "P.O Box 456, Kikuyu")

                        Spacer(modifier = Modifier.height(20.dp))

                        Image(
                            painterResource(id = R.drawable.email ),
                            contentDescription = "info@mtclare.co.ke")
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SchoolPreview(){
    School()
}
