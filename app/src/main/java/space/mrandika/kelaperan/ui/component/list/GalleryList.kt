package space.mrandika.kelaperan.ui.component.list

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import space.mrandika.kelaperan.model.GalleryItem
import space.mrandika.kelaperan.ui.component.item.GalleryItem

@Composable
fun GalleryList(
    foodName: String,
    items: List<GalleryItem>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = Modifier.padding(top = 8.dp)
    ) {
        items(items, key = { it.id }) { gallery ->
            GalleryItem(name = foodName, imageUrl = gallery.imageUrl)
        }
    }
}