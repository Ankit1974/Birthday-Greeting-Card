@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.example.myapplicationfuyj
//import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.alpha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationfuyj.ui.theme.MyApplicationfuyjTheme
//import kotlinx.coroutines.NonCancellable.message

//import kotlinx.coroutines.NonCancellable.message



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationfuyjTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Happy Birthday sam!", from = "From ankit")
                        // stringResource(R.string.happy_birthday_text),
                        // stringResource(R.string.signature_text

                }
            }
        }
    }
}



//@Preview(showBackground = true)
@Composable
fun GreetingText(message: String , from : String ,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center ,
        modifier = modifier
    ){

        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),
                  //textAlign = TextAlign.Center,


           )
  }

}
@Composable
fun GreetingImage(message : String , from : String , modifier : Modifier = Modifier){
    //val image = painterResource(R.drawable.androidparty )
    Box(modifier) {
        Image(
             painter = painterResource(id = R.drawable.androidparty),
            //painter = image,
            contentDescription = null ,
            contentScale = ContentScale.Crop ,
            alpha = 0.5F

        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun MyApplicationfuyjPreview() {
    MyApplicationfuyjTheme {
        //GreetingText(message = " Happy Birthday Ayush " , from = "from ankit")
       // GreetingImage ("Happy Birthday same!","From ankit")
        GreetingImage( message = "Happy Birthday sam!" , from = "From ankit")
//                 stringResource(R.string.happy_birthday_text),
//                 stringResource(R.string.signature_text)
    }
}