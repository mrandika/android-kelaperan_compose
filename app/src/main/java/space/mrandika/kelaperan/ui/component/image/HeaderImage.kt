package space.mrandika.kelaperan.ui.component.image

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun HeaderImage(
    modifier: Modifier = Modifier,
    imageUrl: String,
    imageDescription: String,
    size: Int = 240
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = imageDescription,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxWidth()
            .size(size.dp)
            .clip(RoundedCornerShape(10.dp))
    )
}