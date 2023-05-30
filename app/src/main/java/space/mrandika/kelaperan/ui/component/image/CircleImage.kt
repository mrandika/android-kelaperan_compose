package space.mrandika.kelaperan.ui.component.image

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CircleImage(
    modifier: Modifier = Modifier,
    imageUrl: String,
    imageDescription: String,
    size: Int = 60,
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = imageDescription,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(end = 8.dp)
            .size(size.dp)
            .clip(CircleShape)
    )
}