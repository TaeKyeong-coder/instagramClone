package tk.clone.instagram.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import tk.clone.instagram.data.Story
import tk.clone.instagram.data.StoryDummyData
import tk.clone.instagram.ui.theme.InstagramTheme
import tk.clone.instagram.ui.theme.instagramGradient

@Composable
fun InstagramStories() {
    val posts = remember { StoryDummyData.storyList }
    LazyRow(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)) {
        items(posts) {
            StoryListItem(post = it)
        }
    }
}

@Composable
fun StoryListItem(post: Story) {
    val imageModifier = if (post.id == 1) {
        Modifier
            .padding(start = 8.dp, end = 8.dp, top = 8.dp)
            .height(60.dp)
            .width(60.dp)
            .clip(CircleShape)
            .border(
                shape = CircleShape,
                border = BorderStroke(
                    width = 3.dp,
                    color = Color.LightGray
                )
            )
    } else {
        Modifier
            .padding(start = 8.dp, end = 8.dp, top = 8.dp)
            .height(60.dp)
            .width(60.dp)
            .clip(
                CircleShape
            )
            .border(
                shape = CircleShape, border = BorderStroke(
                    width = 3.dp,
                    brush = Brush.linearGradient(
                        colors = instagramGradient,
                        start = Offset(0f, 0f),
                        end = Offset(100f, 100f)
                    )
                )
            )
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        GlideImage(
            imageModel = post.authorImageUrl, //img url 로 다운받아서 표시할거면 manifest - 인터넷 권한 설정 필요
            contentScale = ContentScale.Fit,
            contentDescription = null,
            modifier = imageModifier
        )
        Text(text = post.author, style = typography.caption, textAlign = TextAlign.Center)
    }
}