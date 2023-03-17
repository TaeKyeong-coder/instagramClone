package tk.clone.instagram.data

data class Story(
    val id: Int,// = 1,
    val text: String,// = "참고 : https://www.youtube.com/watch?v=ps4Ay7XFidM",
    val author: String,// = "Taegomi",
    val handle: String,// = "@taegomi",
    val time: String,// = "17m",
    //val authorImageId: Int = "",
    val authorImageUrl : String,// = "https://avatars.githubusercontent.com/u/68893329?v=4",
    val likesCount: Int,// = 100,
    val commentsCount: Int,// = 12,
    val retweetCount: Int,// = 15,
    val source: String,// = "Twitter for web",
    //val storyImageId: Int = 0
    val storyImageUrl : String// = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOJh-XwQ_jvK7nQ_38BgAbHcWOPt24YNCaMvYN5CWG04AX4-lig1O8mjnJ8OsDwdWFvAg&usqp=CAU"
)
