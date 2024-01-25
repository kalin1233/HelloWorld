package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworld.ui.theme.HelloWorldTheme
import android.view.View
import android.widget.Button
import android.widget.TextView




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayHelloButton = findViewById<Button>(R.id.sayHelloButton)
        val helloWorldTextView = findViewById<TextView>(R.id.helloWorldTextView)

        // Use View.OnClickListener to handle button click
        sayHelloButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Toggle visibility of "Hello World" text
                helloWorldTextView.setText(R.string.hello_world_placeholder)
                helloWorldTextView.visibility = View.VISIBLE
            }
        })
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Blue) {
        Text(
            text = "Hello $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("World")
    }
}