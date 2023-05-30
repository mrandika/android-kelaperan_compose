package space.mrandika.kelaperan.ui.component.item

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import space.mrandika.kelaperan.ui.component.image.CircleImage

@Composable
fun GalleryItem(
    name: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    CircleImage(imageUrl = imageUrl, imageDescription = name, size = 80, modifier = modifier)
}