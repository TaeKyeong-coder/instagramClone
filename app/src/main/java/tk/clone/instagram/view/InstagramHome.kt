package tk.clone.instagram.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tk.clone.Instagram.R
import tk.clone.instagram.data.StoryDummyData


@Composable
fun InstagramHome() {
    Scaffold(
        topBar = { InstagramHomeTopBar() },
        content = {
            InstagramHomeContent()
        }
    )
}

@Composable
fun InstagramHomeTopBar() {
    TopAppBar(
        title = { Text(text = "FakeInstagram") },
        backgroundColor = MaterialTheme.colors.onSecondary,//Color.White,//Color(0xffF6F1F1),//MaterialTheme.colors.onSurface,
        contentColor = MaterialTheme.colors.onSurface,//Color(0xff413543),//MaterialTheme.colors.onSurface,
        elevation = 8.dp,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.ic_send), contentDescription = null)
            }
        }
    )
}

@Composable
fun InstagramHomeContent() {
    val post = remember { StoryDummyData.storyList.filter { true } }
    LazyColumn {
        items(
            items = post,
            itemContent = {
                InstagramListItem(post = it)
            }
        )
    }
}

@Composable
fun ForPreview() {
//    Scaffold(
//        topBar = { InstagramHomeTopBar() }
//    ) {}
    InstagramHomeContent()
}

@Preview
@Composable
fun ToolbarPreview(){
    ForPreview()
}