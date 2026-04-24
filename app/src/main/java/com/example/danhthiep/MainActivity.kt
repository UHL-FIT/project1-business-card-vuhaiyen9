package com.example.danhthiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danhthiep.ui.theme.DanhThiepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DanhThiepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    HienthiDanhthiep()
                }
            }
        }
    }
}

@Composable
fun HienthiDanhthiep(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBEECBE))
    ) {
        Column(
            modifier = Modifier
                .weight(0.70f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Anhdaidien()
            Spacer(modifier = Modifier.height(20.dp))
            TenChucdanh()
        }

        Column(
            modifier = Modifier
                .weight(0.30f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Lienhe()
        }
    }
}
@Composable
fun Anhdaidien(){
    Image(
        painter= painterResource(id=R.drawable.android_logo),
        contentDescription ="Ảnh đại diện",
        modifier= Modifier
            .size(120.dp)
            .background(Color.DarkGray)
    )
}
@Composable
fun TenChucdanh(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Vu Thi Yen",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color=Color(0xFF212020)
        )
        Text(
            text = "Lap trinh tren thiet bi di dong",
            fontSize = 18.sp,
            color = Color(0xFF0DA450)
        )
    }
}
@Composable
fun Lienhe(){
    Box (modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Donglienhe(
                icon = Icons.Default.Phone,
                text = "+84 111 1111 111",
                mota = "Số điện thoại",
            )
            Donglienhe(
                icon = Icons.Default.Share,
                text = "@Yen",
                mota = "git"
            )
            Donglienhe(
                icon = Icons.Default.Email,
                text = "@android.com",
                mota = "email"
            )
        }
    }
}
@Composable
fun Donglienhe(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    mota: String
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = mota,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text=text,
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanhThiepTheme {
        HienthiDanhthiep()
    }
}