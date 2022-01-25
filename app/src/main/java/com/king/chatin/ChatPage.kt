package com.king.chatin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.king.chatin.ui.theme.ChatInTheme
import com.king.chatin.ui.theme.Purple500

class ChatPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatInTheme {
                ScaffoldDemo()
            }
        }
    }
}

@Composable
fun ScaffoldDemo() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(235, 235, 235, 0x9f)), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        TopBar()
        Content()
    }
}

@Composable
fun TopBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(.08f)
        .padding(10.dp, 0.dp),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
        Box(modifier = Modifier.padding(15.dp, 0.dp, 0.dp, 0.dp)) {
            Image(painter = painterResource(id = R.drawable.arrow_back2),
                contentDescription = "",
                modifier = Modifier
                    .clickable { /*TODO*/ }
                    .size(30.dp))
        }
        Text(text = "Maria Dowell", fontSize = 24.sp)
        Box(modifier = Modifier.padding(0.dp, 0.dp,15.dp,0.dp)){
            Image(painter = painterResource(id = R.drawable.white), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier
                .padding(0.dp, 0.dp, 2.dp, 0.dp)
                .size(35.dp)
                .fillMaxWidth(.3f)
                .clip(CircleShape))
        }
    }
}

@Composable
fun Content(){




    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(246, 168, 88),
            Color(238, 131, 121)
        )
    )


    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(246, 168, 88),
            Color(238, 131, 121)
        )
    )



    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .clip(RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp))
        .background(White)) {
        Column(modifier = Modifier.fillMaxHeight(.89f).fillMaxWidth(), verticalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.verticalScroll(scrollState)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(5.dp, 5.dp, 5.dp, 0.dp)) {
                /*TODO*/
                Designer2()
                Designer()
                Designer()
                Designer2()
                Designer()
                Designer2()
                Designer()
                Designer()

            }
        }
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween , modifier = Modifier
            .padding(10.dp, 0.dp)
            .fillMaxWidth()
            .fillMaxHeight()) {
            val textState = remember { mutableStateOf(TextFieldValue()) }
            TextField(value = textState.value, onValueChange = {textState.value = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(horizontalGradientBrush),
                leadingIcon = {
                    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Transparent), elevation= ButtonDefaults.elevation(0.dp), shape = CircleShape
                    ) {
                        Icon(painter = painterResource(id = R.drawable.emoji), contentDescription ="",tint = Purple500)
                    }
                },
                placeholder = {Text(text = "Send message", color = White)},
                trailingIcon = {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center,modifier = Modifier
                        .padding(5.dp, 0.dp)
                        .size(40.dp)
                        .clip(CircleShape)
                        .padding(5.dp, 5.dp)){
                        Icon(painter = painterResource(id = R.drawable.send), contentDescription ="", tint = White, modifier = Modifier
                            .fillMaxSize()
                            .clickable { /*TODO*/ })
                    }
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                shape = CircleShape,
                singleLine = false,
                maxLines = 3)
        }
    }
}

@Composable
fun Input(){

}

@Preview(showBackground = false)
@Composable
fun ChatPagePreview() {
    ChatInTheme {
        ScaffoldDemo()
    }
}