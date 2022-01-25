package com.king.chatin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.king.chatin.ui.theme.*

class SignUp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatInTheme {
                Register()
            }
        }
    }
}

@Composable
fun Register() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(White)
        .padding(15.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight(0.6f)) {
            Text(text = "Sign Up", color = Purple700, fontSize = 30.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
            TextField()
            Username()
            TextField2()
            Password()
            RePassword()
            Policy()
            ButtonUp()
        }
        Column(modifier = Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight(0.35f)) {
            SocialMedia()
        }
    }
}

@Composable
fun TextField(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(value = textState.value, onValueChange = {textState.value = it},
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        placeholder = {Text(text = "Full name", color = Purple200)},
        label = { Text(text = "Full Name", color = Purple700)},
        trailingIcon = { Icon(painter = painterResource(id = R.drawable.person), contentDescription ="", tint = Purple700)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple200,
            unfocusedBorderColor = Purple700),
        shape = CircleShape,
        singleLine = true,)
}

@Composable
fun Username(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(value = textState.value, onValueChange = {textState.value = it},
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        placeholder = {Text(text = "UserName", color = Purple200)},
        label = { Text(text = "UserName", color = Purple700)},
        trailingIcon = { Icon(painter = painterResource(id = R.drawable.user), contentDescription ="", tint = Purple700)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple200,
            unfocusedBorderColor = Purple700),
        shape = CircleShape,
        singleLine = true,)
}

@Composable
fun TextField2(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(value = textState.value, onValueChange = {textState.value = it},
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        placeholder = {Text(text = "Enter Email Address", color = Purple200)},
        label = { Text(text = "Enter Email Address", color = Purple700)},
        trailingIcon = { Icon(painter = painterResource(id = R.drawable.mail), contentDescription ="", tint = Purple700)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple200,
            unfocusedBorderColor = Purple700),
        shape = CircleShape,
        singleLine = true,)
}

@Composable
fun Password(){
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    val passwordVisibility = remember { mutableStateOf(true) }
    OutlinedTextField(value = passwordState.value, onValueChange = {passwordState.value=it},
        visualTransformation = if (passwordVisibility.value) PasswordVisualTransformation() else VisualTransformation.None,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        placeholder = {Text(text = "Enter Password", color = Purple200)},
        label = { Text(text = "Enter Password", color = Purple700)},
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility.value = !passwordVisibility.value
            }) {
                Icon(
                    painter = painterResource(R.drawable.red_eye_24),
                    contentDescription = "Password",
                    tint = if (passwordVisibility.value) Purple500 else Purple700
                )
            }
        },
//        trailingIcon = { Icon(painter = painterResource(id = R.drawable.lock), contentDescription ="", tint = Purple700)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple200,
            unfocusedBorderColor = Purple700),
        shape = CircleShape,
        singleLine = true,
    )
}

@Composable
fun RePassword(){
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    val passwordVisibility = remember { mutableStateOf(true) }
    OutlinedTextField(value = passwordState.value, onValueChange = {passwordState.value=it},
        visualTransformation = if (passwordVisibility.value) PasswordVisualTransformation() else VisualTransformation.None,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        placeholder = {Text(text = "Re-Enter Password", color = Purple200)},
        label = { Text(text = "Re-Enter Password", color = Purple700)},
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility.value = !passwordVisibility.value
            }) {
                Icon(
                    painter = painterResource(R.drawable.red_eye_24),
                    contentDescription = "Password",
                    tint = if (passwordVisibility.value) Purple500 else Color.Gray
                )
            }
        },
//        trailingIcon = { Icon(painter = painterResource(id = R.drawable.lock), contentDescription ="", tint = Purple500)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple200,
            unfocusedBorderColor = Purple700),
        shape = CircleShape,
        singleLine = true,
    )
}

@Composable
fun ButtonUp (){
    Row(modifier = Modifier
        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(CircleShape), colors = ButtonDefaults.buttonColors(Purple500)) {
            Text(text = "Sign Up", fontSize = 20.sp, fontWeight = FontWeight.Light, color = White)
        }
    }
}

@Composable
fun Policy(){
    val checkedState= remember {mutableStateOf(false)}
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 10.dp, 0.dp, 10.dp), horizontalArrangement = Arrangement.Start) {
        Switch(
            checked= checkedState.value,
            enabled = true,
            onCheckedChange = { checkedState.value = it },

            colors = SwitchDefaults.colors(
                checkedThumbColor = Purple700,
                checkedTrackColor = Purple700,
                checkedTrackAlpha= 0.2f,
                uncheckedTrackColor = Purple200,
                uncheckedThumbColor = Purple200,
                uncheckedTrackAlpha= 0.6f,
            ),
        )
        Text(text = "  I have read and accepted ", fontSize = 14.sp)
        Text(text = "policy and terms", color = Purple500, fontSize = 14.sp, fontWeight = FontWeight.Bold, modifier = Modifier.clickable { /*TODO*/ })
    }
}

@Composable
fun SocialMedia(){
    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Or sign up using", modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp))
        Row(modifier = Modifier.fillMaxWidth(.45f), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceBetween) {
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "", modifier = Modifier
                .size(35.dp)
                .clickable { /*TODO*/ })
            Image(painter = painterResource(id = R.drawable.twitter), contentDescription = "", modifier = Modifier
                .size(35.dp)
                .clickable { /*TODO*/ })
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "", modifier = Modifier
                .size(35.dp)
                .clickable { /*TODO*/ })
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
            Text(text = "Already have an account? ", fontSize = 16.sp)
            Text(text = "LogIn" ,color = Purple500, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.clickable { /*TODO*/ })
        }
    }
}

@Preview(showBackground = false)
@Composable
fun SignUpPreview() {
    ChatInTheme {
        Register()
    }
}