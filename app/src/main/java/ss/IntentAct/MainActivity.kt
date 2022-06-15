package ss.IntentAct

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.Composable
//import androidx.compose.ui.tooling.preview.Preview

import ss.IntentAct.ui.theme.IntentActTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentActTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NextPage()
                }
            }
        }
    }
}

@Composable
fun NextPage() {  
    Column(
    	modifier = Modifier.fillMaxSize(),
    	verticalArrangement = Arrangement.Center,
    	horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    	val context = LocalContext.current
    	Button(
    		enabled = true,
    		onClick = {
    		    context.startActivity(
    		        Intent(
    		            context,
    		            NextActivity::class.java
    		        )
    		    ) 
    		},
    	) {
    		Text(
    			text = "Next Page",
    			textAlign = TextAlign.Center,
    		)
    	}
    }
}
/*
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    IntentActTheme {
        NextPage()
    }
}
*/
