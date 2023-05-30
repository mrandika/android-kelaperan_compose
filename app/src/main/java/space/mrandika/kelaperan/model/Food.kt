package space.mrandika.kelaperan.model

data class Food(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val origin: String,
    val rating: Double,
    val galleries: FoodGallery
)

data class FoodGallery(
    val items: List<GalleryItem>
)

data class GalleryItem(
    val id: Int,
    val imageUrl: String
)
