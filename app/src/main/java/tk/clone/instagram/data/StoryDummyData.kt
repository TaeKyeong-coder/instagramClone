package tk.clone.instagram.data

object StoryDummyData {
    val originStory = Story(
        1,
        "참고 : https://www.youtube.com/watch?v=ps4Ay7XFidM",
        "taegomi33",
        "@taegomi33",
        "17m",
        "https://avatars.githubusercontent.com/u/68893329?v=4",
        100,
        12,
        15,
        "Twitter for web",
        "https://cdnweb01.wikitree.co.kr/webdata/editor/202302/07/img_20230207142115_3e5799ed.webp"
    )
    val storyList = listOf(
        originStory,
        originStory.copy(
            id = 2, author = "ming_chu85", handle = "@ming_chu85",
            authorImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSg7CvT_Z8DsZYjgUn08B5duYhsJRUllhlvSw&usqp=CAU",
            storyImageUrl = "https://i.ytimg.com/vi/8kfcakCUY4Q/maxresdefault.jpg",
            time = "11m"
        ),
        originStory.copy(
            id = 3, author = "Amazon", handle = "@Amazon",
            authorImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR71y0pC09upf1MuqL5YwboAt04SFbb5ZqGjw&usqp=CAU",
            storyImageUrl = "https://cdnweb01.wikitree.co.kr/webdata/editor/202104/01/img_20210401121045_d1993168.webp",
            time = "1h"
        )
    )
}