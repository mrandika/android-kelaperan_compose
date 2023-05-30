package space.mrandika.kelaperan.ui.component.item

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import space.mrandika.kelaperan.ui.component.RatingComponent
import space.mrandika.kelaperan.ui.component.image.CircleImage
import space.mrandika.kelaperan.ui.theme.KelaperanTheme

@Composable
fun FoodItem(
    name: String,
    imageUrl: String,
    description: String,
    rating: Double,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(8.dp),
    ) {
        CircleImage(imageUrl = imageUrl, imageDescription = name, size = 80)

        Column(
            modifier = modifier.padding(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Medium,
                )

                RatingComponent(rating)
            }

            Text(
                text = description,
                maxLines = 2,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodItemPreview() {
    KelaperanTheme {
        FoodItem(
            name = "Bakso",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_bakso.jpg",
            description = "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.\\n\\nBakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur dan ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar.\\n\\nBerbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, atau capcai.",
            rating = 4.7
        )
    }
}