package com.example.p1_tarjetapresentacion_sergiorodriguez_victorperez_pabloalonso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p1_tarjetapresentacion_sergiorodriguez_victorperez_pabloalonso.ui.theme.P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme {
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
                    .padding(2.dp)
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
fun Info(telfNumb: String, mail: String, secondMail: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding()

    ) {
        Row {
            Text(
                text = telfNumb
            )
        }
        Row {
            Text(
                text = mail
            )
        }
        Row {
            Text(
            text = secondMail
        ) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_SergioRodriguez_VictorPerez_PabloAlonsoTheme {
        Titulo(name = stringResource(R.string.pablo_alonso_sergio_rodr_guez_y_victor_p_rez),
            title = stringResource(
            R.string.desarrolladores_moviles
        ))
        Info(
            telfNumb = stringResource(R.string._34_640870770),
            mail = stringResource(R.string.correo_exampl_com),
            secondMail = stringResource(R.string.second_example_com),
        )
    }
}