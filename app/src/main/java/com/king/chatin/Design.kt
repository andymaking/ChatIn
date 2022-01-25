package com.king.chatin

import android.app.Notification
import android.os.Parcel
import android.util.Size
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.king.chatin.ui.theme.ChatInTheme
import com.king.chatin.ui.theme.Purple200
import com.king.chatin.ui.theme.Purple700


@Composable
fun Designer(){

    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(224, 222, 222),
//            Color(0xff8D6E63),
            Color(207, 224, 191)
        )
    )

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start){
        Card(modifier = Modifier
            .fillMaxWidth(.9f)
            .padding(5.dp)
            .clip(shape = RoundedCornerShape(0.dp, 20.dp, 20.dp, 20.dp)), backgroundColor = Transparent) {
            Box(modifier = Modifier.background(horizontalGradientBrush)) {
                Row(modifier = Modifier
                    .padding(15.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center) {
                    Text(modifier = Modifier.fillMaxWidth(.95f),
                        text = /*TODO*/"100% COMMISSIONS ON FE Coupons will be available - 85% Off. Make sure to sign up to the JV List and you will receive the code OR Contact me - details on JV Page and ill send you them 0- 25 Sales- you will be set to delayed commissions or denied (Paid within 45 to 60 days) If you wish to promote and can state how you intend on promoting this product then please leave a message below",
                        textAlign = TextAlign.Justify,
                        color = Black)
                    Spacer(modifier = Modifier.width(3.dp))
                }
            }
        }
    }
}


@Preview(showBackground = false)
@Composable
fun DesignPreview() {
    ChatInTheme {
        Designer()
    }
}

@Composable
fun Designer2(){

    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(246, 168, 88),
//            Color(0xff8D6E63),
            Color(238, 131, 121)
        )
    )

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End){
        Card(modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(0.9f), shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 20.dp), backgroundColor = Transparent) {
            Box(modifier = Modifier.background(horizontalGradientBrush)){
                Row(modifier = Modifier
                    .padding(15.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center) {
                    Text(modifier = Modifier.fillMaxWidth(), text = /*TODO*/"100% COMMISSIONS ON FEE", textAlign = TextAlign.Justify, color = White)
                    Spacer(modifier = Modifier.width(3.dp))
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun Design2Preview() {
    ChatInTheme {
        Designer2()
    }
}


@Composable
fun ChatContact(user1: User1){
    Card(modifier = Modifier.fillMaxWidth(), backgroundColor = White, elevation = 10.dp, shape = RoundedCornerShape(15.dp), border = BorderStroke(2.dp, Gray), contentColor = Gray) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = if (isSystemInDarkTheme()) {
                Black
            } else {
                White
            })
            .padding(15.dp, 10.dp)
            .clickable { /*TODO*/ }
            .height(60.dp), verticalAlignment = Alignment.CenterVertically){
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(user1.profilePicture /*TODO*/), contentDescription = "Profile Picture Placement", contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape)
                    .size(55.dp))
            }
            Column(horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top, modifier = Modifier
                    .padding(10.dp, 0.dp)
                    .fillMaxWidth(0.8f)) {
                Text(text = user1.name /*TODO*/, fontSize = 18.sp, fontWeight = FontWeight.Normal, color = if (isSystemInDarkTheme()){White}else{Black}, modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp))
                Text(text = user1.message/*TODO*/, maxLines = 1, fontSize = 12.sp, color = if (isSystemInDarkTheme()){LightGray}else{DarkGray}, fontWeight = FontWeight.Light)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top, modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.call), contentDescription = "", tint = if (isSystemInDarkTheme()){Purple200}else{Purple700} )
                Notification(Parcel.obtain())/*TODO*/
            }

        }
    }
}

@Preview(showBackground = false)
@Composable
fun ChatContactPreview() {
    ChatInTheme {
        ChatContact(
            User1(profilePicture = R.drawable.glory, number = "+234 811 750 3698", name = "Glory Edem", message = "A collection of front-end libraries that make writing dapp front-ends easier and more predictable.", time = "2:30")
        )
    }
}

@Composable
fun Status() {
    
}