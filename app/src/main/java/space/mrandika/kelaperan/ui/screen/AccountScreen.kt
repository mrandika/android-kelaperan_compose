package space.mrandika.kelaperan.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import space.mrandika.kelaperan.R
import space.mrandika.kelaperan.ui.component.TopBar

@Composable
fun AccountScreen(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopBar(title = stringResource(R.string.account),
                navHostController = navHostController)
        }
    ) { padding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(padding).fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.account_photo),
                contentDescription = stringResource(id = R.string.account_photo),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(180.dp)
                    .clip(CircleShape)
            )

            Text(
                text = "Muhammad Rizki Andika",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 18.dp)
            )

            Text(
                text = "mrizkiandika@icloud.com",
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}