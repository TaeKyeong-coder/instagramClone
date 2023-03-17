package tk.clone.instagram.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import tk.clone.instagram.data.StoryDummyData

@Composable
fun InstagramHome() {
    Scaffold(
        topBar = { InstagramHomeTopBar() }
    ) {
    }
}

@Composable
fun InstagramHomeTopBar() {
    TopAppBar(
        title = { Text(text = "Instagram") },
        backgroundColor = MaterialTheme.colors.onSurface,
        contentColor = MaterialTheme.colors.onSurface,
        elevation = 8.dp,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                //Icon(painter = painterResource(id = ), contentDescription = null)
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                //Icon(painter = painterResource(id = ), contentDescription = null)
            }
        },
//        content = {
//            InstagramHomeContent()
//        }
    )
}

@Composable
fun InstagramHomeContent() {
    val post = remember { StoryDummyData.storyList.filter { it.id != null } }
    LazyColumn {
        items(
            items = post,
            itemContent = {
                InstagramListItem(post = it)
            }
        )
    }
}