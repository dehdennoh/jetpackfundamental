package com.example.dennisapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dennisapplication.ui.theme.DennisApplicationTheme

class furnitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFurniture()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyFurniture(){
    val mContext = LocalContext.current

    Column (modifier = Modifier.fillMaxSize()){

        //TopAppBar
        TopAppBar(
            title = {},
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "Arrowback", tint = Color.Black)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Lock ,
                        contentDescription = "Lock", tint = Color.Black)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription = "Menu", tint = Color.Black)
                }
            }
        )
        //End of TopUpBar


        Row(  modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Text(
                text = "Chairs",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif

            )
Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Tables",
                fontSize = 30.sp,
                color = Color.LightGray,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Sofa",
                fontSize = 30.sp,
                color = Color.LightGray,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Bed",
                fontSize = 30.sp,
                color = Color.LightGray,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )

        }
       Row {
           Text(text = "120 Products")
           Spacer(modifier = Modifier.width(200.dp))

           Text(text = "Popular",)
           IconButton(onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Default.KeyboardArrowDown ,
                   contentDescription = "arrow", tint = Color.Black)
           }
       }
        Row (modifier = Modifier.fillMaxWidth()){
            Column {
                Card(modifier = Modifier.height(200.dp)
                    .width(150.dp)) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.kiti),
                            contentDescription ="China",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds)
                        Icon(imageVector = Icons.Default.FavoriteBorder,
                            contentDescription ="Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp))

                    }

                }
            }

        }








        }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyFurniturePreview(){
    MyFurniture()
}