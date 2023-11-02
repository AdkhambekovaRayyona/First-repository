package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity :ComponentActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContent{

        }
    }
}
//@Preview(showSystemUi = true)
//@Composable
//fun Task3(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween
//    ){
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ){
//            LetterText("A")
//            LetterText("B")
//            LetterText("C")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ){
//            LetterText("C")
//            LetterText("A")
//            LetterText("B")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//        ){
//            LetterText("A")
//            LetterText("B")
//            LetterText("C")
//        }
//    }
//}
//@Composable
//fun LetterText(letter:String){
//    Text(
//        letter,
//        style = TextStyle(
//            fontSize=30 sp,
//            fontWeight = FontWeight.Bold
//        )
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun Preview(){
//    Text(
//        text="Hello",
//        fontFamily = FontFamily(Font(R.font.dancing)),
//        fontSize=30.sp
//    )
//}

@Preview
@Composable
fun DefaultPreview(){
    Text(
        buildAnnotatedString {
            withStyle(
                SpanStyle(
                    color= Color.Green,
                    fontFamily= FontFamily((Font(R.font.dancing)))
                )
            ){
                append("H")
            }
            withStyle(
                SpanStyle(
                    color= Color.Yellow,
                    fontSize = 30.sp
                )
            ){
                append("ello")
            }
        }

    )
}









