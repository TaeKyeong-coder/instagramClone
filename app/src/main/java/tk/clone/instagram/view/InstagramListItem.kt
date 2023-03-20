package tk.clone.instagram.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guru.fontawesomecomposelib.FaIcon
import com.guru.fontawesomecomposelib.FaIcons
import com.skydoves.landscapist.glide.GlideImage
import tk.clone.instagram.data.Story
import tk.clone.instagram.data.StoryDummyData

@Composable
fun InstagramListItem(post: Story) {
    Column() {
        ProfileInfoSection(post)
        InstagramImage(imageId = post.storyImageUrl)
        InstagramIconSection()
        InstagramLikesSection(post)
        Text(
            text = "View all ${post.commentsCount} comments",
            style = typography.caption,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp),
            color = Color.Gray
        )
        Text(
            text = "${post.time} ago",
            style = typography.caption,
            modifier = Modifier.padding(start = 8.dp, top = 2.dp, bottom = 8.dp),
            color = Color.Gray
        )
    }
}

@Composable
fun ProfileInfoSection(post: Story) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        GlideImage(
            imageModel = post.authorImageUrl,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = post.author,
            style = typography.body1,
            modifier = Modifier
                .padding(8.dp)
                .weight(1f),
            textAlign = TextAlign.Left
        )
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
    }
}

@Composable
fun InstagramImage(imageId: String?) {
    if (imageId != null) {
        GlideImage(
            imageModel = imageId,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun InstagramIconSection() {
    Row() {
        var fav by remember { mutableStateOf(false) }
        IconToggleButton(checked = fav, onCheckedChange = { fav = it }) {
            val icon = if (fav) FaIcons.Heart else FaIcons.HeartRegular
            val tint = if (fav) Color.Red else MaterialTheme.colors.onBackground
            FaIcon(
                faIcon = icon,
                tint = tint
            )
        }
        IconToggleButton(checked = false, onCheckedChange = {/*TODO*/ }) {
            FaIcon(faIcon = FaIcons.CommentAltRegular, tint = MaterialTheme.colors.onSurface)
        }
        IconToggleButton(checked = false, onCheckedChange = {/*TODO*/ }) {
            FaIcon(faIcon = FaIcons.PaperPlaneRegular, tint = MaterialTheme.colors.onSurface)
        }
    }
}

@Composable
fun InstagramLikesSection(post: Story) {
    Row(
        modifier = Modifier
            .padding(start = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        GlideImage(
            imageModel = post.authorImageUrl, modifier = Modifier
                .size(20.dp)
                .clip(CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Liked by ${post.author} and ${post.likesCount} others",
            style = typography.caption,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview
@Composable
fun ItemPreview(){
    val post = remember { StoryDummyData.storyList.filter { true } }
    ProfileInfoSection(post[0])
//    InstagramListItem(post = post[0])
    // InstagramImage(imageId = post[0].storyImageUrl)
    //InstagramLikesSection(post[0])
}