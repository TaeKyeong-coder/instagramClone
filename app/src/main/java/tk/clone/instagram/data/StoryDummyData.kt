package tk.clone.instagram.data

object StoryDummyData {
    private val originStory = Story()
    val storyList = listOf(
        originStory,
        originStory.copy(
            id = 2, author = "Google", handle = "@google",
            authorImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSg7CvT_Z8DsZYjgUn08B5duYhsJRUllhlvSw&usqp=CAU",
            storyImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlryBnMRle_5jHRxyTOpOFmXRgezPHh6lS3w&usqp=CAU",
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