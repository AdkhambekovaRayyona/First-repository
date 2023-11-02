package com.example.anew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    @Option(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var url by remember { mutableStateOf("") }
            var input by remember { mutableStateOf("") }
            Box(Modifier.fillMaxSize()){
                if(url)
            }
        }

        }

//            Box(Modifier.fillMaxSize()) {
//                WriteFormulaOfLiquid(
//                    Modifier.align(Alignment.Center)
//                )
//            }
//        }
//    }
//}
//@Composable
//fun WriteFormulaOfLiquid(
//    modifier:Modifier
//){
//    Text(
//        buildAnnotatedString {
//        withStyle(
//            style = SpanStyle(
//                color= Color.Black,
//                fontSize = 30.sp
//            )
//        ){
//            append("H")
//        }
//            withStyle(
//                style = SpanStyle(
//                    color = Color.Gray,
//                    fontSize = 20.sp,
//                    baselineShift = BaselineShift.Subscript//-------pastda; Superscript----- tepada
//            )
//            ){
//                append("2")
//            }
//            withStyle(
//                style = SpanStyle(
//                    color = Color.Green,
//                    fontSize = 30.sp
//                )
//            ){
//                append("0")
//            }
//    },
//        modifier = Modifier
//    )
//}