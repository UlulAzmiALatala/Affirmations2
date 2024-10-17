package ulul.azmi.a.latala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ulul.azmi.a.latala.data.Datasource
import ulul.azmi.a.latala.model.Affirmation
import ulul.azmi.a.latala.ui.theme.AffirmationsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationsTheme { // Menggunakan tema khusus untuk aplikasi
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), // Mengisi seluruh ukuran tampilan
                    color = MaterialTheme.colorScheme.background // Menggunakan warna latar belakang dari tema
                ) {
                    AffirmationsApp() // Memanggil fungsi Composable utama
                }
            }
        }
    }
}

@Composable
fun AffirmationsApp() {
    // Memanggil fungsi untuk menampilkan daftar afirmasi
    AffirmationList(
        affirmationList = Datasource().loadAffirmations(), // Memuat daftar afirmasi dari sumber data
    )
}

@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) { // Menggunakan LazyColumn untuk menampilkan daftar yang dapat digulir
        items(affirmationList) { affirmation -> // Mengiterasi setiap item dalam daftar
            AffirmationCard(
                affirmation = affirmation, // Mengirimkan afirmasi ke fungsi Composable card
                modifier = Modifier.padding(8.dp) // Menambahkan padding di sekitar card
            )
        }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(modifier = modifier) { // Membuat card untuk setiap afirmasi
        Column { // Mengatur elemen di dalam card dalam kolom
            Image(
                painter = painterResource(affirmation.imageResourceId), // Memuat gambar dari resource
                contentDescription = stringResource(affirmation.stringResourceId), // Deskripsi konten untuk aksesibilitas
                modifier = Modifier
                    .fillMaxWidth() // Mengisi lebar maksimum
                    .height(194.dp), // Mengatur tinggi gambar
                contentScale = ContentScale.Crop // Memotong gambar agar sesuai dengan ukuran
            )
            Text(
                text = LocalContext.current.getString(affirmation.stringResourceId), // Mengambil teks dari resource
                modifier = Modifier.padding(16.dp), // Menambahkan padding di sekitar teks
                style = MaterialTheme.typography.headlineSmall // Mengatur gaya teks
            )
        }
    }
}

@Preview // Menampilkan preview dari AffirmationCard di Android Studio
@Composable
private fun AffirmationCardPreview() {
    // Menampilkan contoh kartu afirmasi dengan data dummy
    AffirmationCard(Affirmation(R.string.affirmation1, R.drawable.semeru))
}
