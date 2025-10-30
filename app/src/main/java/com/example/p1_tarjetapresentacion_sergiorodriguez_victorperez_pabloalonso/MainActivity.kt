package com.example.p1_tarjetapresentacion_sergiorodriguez_victorperez_pabloalonso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_sergiorodriguez_victorperez_pabloalonso.ui.theme.P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Titulo(name: String, modifier: Modifier = Modifier, title: String) {
    val image = painterResource(R.drawable.doge_meme_png_photos_1504254126)
    Column(
        modifier = modifier
            .padding(
                top = 25.dp,
                start = 2.dp,
                end = 2.dp,
                bottom = 10.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Row {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier
                    .size(200.dp)
            )
        }
        Row {
            Text(
                text = "$name",
                modifier = modifier
                    .padding(2.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold

            )
        }
        Row {
            Text(
                text = "$title",
                modifier = modifier
                    .padding(2.dp)
            )
        }
    }
}

@Composable
fun Info(telfNumb: String, mail: String, socialHandle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        ContactDetail(
            Icons.Default.Phone,
            "Phone",
            telfNumb
        )
        ContactDetail(
            Icons.Default.Email,
            "Mail",
            mail
        )
        ContactDetail(
            Icons.Default.Share,
            "Social media",
            socialHandle
        )
    }
}

@Composable
private fun ContactDetail(icon: ImageVector, alt: String, content: String) {
    Row {
        Icon(imageVector = icon, contentDescription = alt)
        Text(
            text = content
        )
    }
}

@Composable
fun Greeting() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Column (
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ){
            Titulo(
                name = stringResource(R.string.pablo_alonso_sergio_rodr_guez_y_victor_p_rez),
                title = stringResource(
                    R.string.desarrolladores_moviles
                ),

                )
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(0.dp, 16.dp)
        ){
            Info(
                telfNumb = stringResource(R.string._34_640870770),
                mail = stringResource(R.string.correo_exampl_com),
                socialHandle = stringResource(R.string.second_example_com),
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            Greeting()
        }
    }
}