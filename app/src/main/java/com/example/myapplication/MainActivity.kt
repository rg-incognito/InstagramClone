package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(0.dp, 20.dp),
                    color = MaterialTheme.colors.background
                ) {

                    Column{
                            InstagramPost()

                    }

                }
            }
        }
    }
}
//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InstagramStory(){
    val storyList = arrayListOf(

        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),
        Story(1,R.drawable.img_1,"name"),

    )

    StoryDesign(storyList = storyList)

}

@Composable
fun StoryDesign(storyList:ArrayList<Story>){
    LazyRow{
        items(storyList){
            NewStory(it)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InstagramPost(){
    val postList = arrayListOf(
        Post(
            1,
            223,
            R.drawable.post,
            R.drawable.post,
            "Rohit",
            "Hello"),
        Post(
            1,
            223,
            R.drawable.post,
            R.drawable.post,
            "Rohit",
            "Hello"),
        Post(
            1,
            223,
            R.drawable.post,
            R.drawable.post,
            "Rohit",
            "Hello"),
        Post(
            1,
            223,
            R.drawable.post,
            R.drawable.post,
            "Rohit",
            "Hello")

    )
     Design(postList = postList)
}                               
@Composable
fun Design(postList: ArrayList<Post>){
    LazyColumn{
        item{
            InstagramStory()
        }
        item{
            Spacer(modifier = Modifier.width(8.dp))
        }
        items(postList){
            NewPost(post = it)
        }
    }
}
