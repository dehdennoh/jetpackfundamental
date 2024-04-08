package com.example.dennisapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dennisapplication.ui.theme.DennisApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo(){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)
        Text(text = "Check that Firefox has permission to access the web ")

        Spacer(modifier = Modifier.height(29.dp))

//Centering a button
       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Button(onClick = {   mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
           }, ) {
               Text(text = "Destination")
           }

       }

        
        Spacer(modifier = Modifier.height(29.dp))

        Text(text = "English Premier League",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(35.dp),
            textAlign = TextAlign.Center,
            color = Color.White)
        Text(text = "Liverpool", fontWeight = FontWeight.Bold)
        Text(text = "Manchester United", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(15.dp))
        
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterHorizontally))
        {
            Text(text = "More teams")
            
        }
        

        Divider()

        Spacer(modifier = Modifier.height(10.dp))


        //Centering an image
       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center)  {
           Image(painter = painterResource(id = R.drawable.dogs),
               contentDescription ="dog",
               modifier = Modifier.size(200.dp)
              .clip(shape = CircleShape),
               contentScale = ContentScale.Crop)
       }
        
        Button(onClick = {
             mContext.startActivity(Intent(mContext,layoutActivity::class.java))
        },
           shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp))
         {
            Text(text = "Continue")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}