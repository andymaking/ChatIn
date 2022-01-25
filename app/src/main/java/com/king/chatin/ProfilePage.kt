package com.king.chatin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.king.chatin.ui.theme.ChatInTheme
import java.util.*

class ProfilePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatInTheme {
                Profile(

                )
            }
        }
    }
}

@Composable
fun Profile() {
    var scrollState = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = if (isSystemInDarkTheme()) {
            DarkGray
        } else {
            Color(209, 209, 209)
        })
        .verticalScroll(scrollState)) {
        Top(User1(profilePicture = R.drawable.glory, number = "+234 811 750 3698", name = "Glory Edem", message = "A collection of front-end libraries that make writing dapp front-ends easier and more predictable.", time = "2:30"))
        Spacer(modifier = Modifier.height(20.dp))
        StatusBar()
        Spacer(modifier = Modifier.height(20.dp))
        Media()
    }
}

@Composable
fun Top(user1: User1) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .background(color = if (isSystemInDarkTheme()) {
            Black
        } else {
            White
        })
        .height(300.dp), elevation = 5.dp){
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)){
            Row(Modifier
                .fillMaxWidth()
                .background(Transparent), verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(painter = painterResource(id = R.drawable.arrow_back2), contentDescription = "", tint = Gray, modifier = Modifier.clickable { /*TODO*/ })
                Icon(painter = painterResource(id = R.drawable.more_vert), contentDescription = "", tint = Gray, modifier = Modifier.clickable { /*TODO*/ })

            }
        }
        Column(modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(user1.profilePicture) /*TODO*/, contentScale = ContentScale.FillBounds, contentDescription = "", modifier = Modifier
                .size(100.dp)
                .clip(CircleShape))
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = user1.name /*TODO*/, fontSize = 27.sp, fontWeight = FontWeight.SemiBold, color = Black)
                Spacer(modifier = Modifier.height(5.dp))
                Text (text = user1.number /*TODO*/, fontSize = 18.sp, color = Gray )
            }
            Row(Modifier.fillMaxWidth(.6f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(id = R.drawable.message), contentDescription = "", tint = Color(53, 156, 80), modifier = Modifier.size(23.dp))
                    Spacer(modifier = Modifier.height(9.dp))
                    Text (text = "Chat", fontSize = 17.sp, color = Color(53, 156, 80 ))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(id = R.drawable.call), contentDescription = "", tint = Color(53, 156, 80), modifier = Modifier.size(23.dp))
                    Spacer(modifier = Modifier.height(9.dp))
                    Text (text = "Audio", fontSize = 17.sp, color = Color(53, 156, 80) )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(painter = painterResource(id = R.drawable.camera), contentDescription = "", tint = Color(53, 156, 80), modifier = Modifier.size(23.dp))
                    Spacer(modifier = Modifier.height(9.dp))
                    Text (text = "Video", fontSize = 17.sp, color = Color(53, 156, 80) )
                }
            }
        }
    }
}

@Composable
fun StatusBar() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .background(color = if (isSystemInDarkTheme()) {
            Black
        } else {
            White
        }), elevation = 5.dp){
        Column(modifier = Modifier.padding(20.dp, 15.dp),horizontalAlignment = Alignment.Start) {
            Text (text = "At Work"/*TODO*/, fontSize = 15.sp, color = Black, fontWeight = FontWeight.SemiBold )
            Text (text = "August, 5, 2021"/*TODO*/, fontSize = 17.sp, color = DarkGray )
        }
    }
}

@Composable
fun Media() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .background(color = if (isSystemInDarkTheme()) {
            Black
        } else {
            White
        }), elevation = 5.dp){
        Column(modifier = Modifier.padding(20.dp, 5.dp),horizontalAlignment = Alignment.Start) {
            Text (text = "Media"/*TODO*/, fontSize = 17.sp, color = DarkGray )
            /*CHANGE TO LAZY ROW*/
            Image(modifier = Modifier.padding(0.dp, 8.dp).height(100.dp).width(80.dp).clip(
                RoundedCornerShape(10.dp)),painter = painterResource(id = R.drawable.glory) /*TODO*/ , contentDescription = "", contentScale = ContentScale.FillBounds)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ChatInTheme {
        Profile()
    }
}