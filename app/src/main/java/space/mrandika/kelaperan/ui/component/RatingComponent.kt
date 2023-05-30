package space.mrandika.kelaperan.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import space.mrandika.kelaperan.R

@Composable
fun RatingComponent(
    rating: Double
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = stringResource(R.string.reviews),
            tint = Color.Yellow
        )

        Text(
            text = rating.toString(),
            fontWeight = FontWeight.Normal,
        )
    }
}