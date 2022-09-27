package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewPost(
    post: Post
){
//    val post = Post(
//        1,
//        223,
//        R.drawable.post,
//        R.drawable.post,
//        "Rohit",
//        "hellow")

    val colors = listOf(Color(0xFFffe53b), Color(0xFFff2525))

    Column(Modifier.padding(2.dp)) {

            Row{
                Image(painter = painterResource(id = post.authorImage)
                    , contentDescription = "author",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(50.dp, 50.dp)
                        .padding(5.dp)
                        .border(
                            1.dp,
                            brush = Brush.horizontalGradient(colors = colors),
                            CircleShape
                        ))

                Spacer(modifier = Modifier.width(5.dp))
                Text(text = post.authorName, fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp,12.dp,0.dp,0.dp))
                Image(painter =
                painterResource(id = R.drawable.more_vert),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(5.dp),
                    contentDescription = "3Dot",
                    alignment = Alignment.TopEnd,
                )
            }
            Image(painter = painterResource(id = post.authorImage),
                contentDescription ="Post" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .border(1.dp, Color.Black, RectangleShape))
            Spacer(modifier = Modifier.width(5.dp))

            Row {
                Image(painter = painterResource
                    (id = R.drawable.insta_like),
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(5.dp,10.dp,0.dp,0.dp),
                    contentDescription = "Like",
                )
                Image(painter = painterResource
                    (id = R.drawable.insta_comment),
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(5.dp,10.dp,0.dp,0.dp),
                    contentDescription = "Like",
                )
                Image(painter = painterResource
                    (id = R.drawable.insta_send),
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(5.dp,10.dp,0.dp,0.dp),
                    contentDescription = "Share",
                )
                Image(painter = painterResource
                    (id = R.drawable.insta_save),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(0.dp,10.dp,10.dp,)
                        ,
                    contentDescription = "Save",
                    alignment = Alignment.CenterEnd

                )
            }
        }

    }

