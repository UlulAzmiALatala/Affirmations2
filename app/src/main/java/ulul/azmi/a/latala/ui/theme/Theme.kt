package ulul.azmi.a.latala.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

// Mendefinisikan skema warna untuk tema gelap
private val DarkColorScheme = darkColorScheme(
    primary = Purple80, // Warna primer untuk tema gelap
    secondary = PurpleGrey80, // Warna sekunder untuk tema gelap
    tertiary = Pink80 // Warna tersier untuk tema gelap
)

// Mendefinisikan skema warna untuk tema terang
private val LightColorScheme = lightColorScheme(
    primary = Purple40, // Warna primer untuk tema terang
    secondary = PurpleGrey40, // Warna sekunder untuk tema terang
    tertiary = Pink40 // Warna tersier untuk tema terang

    /* Other default colors to override
    background = Color(0xFFFFFBFE), // Warna latar belakang
    surface = Color(0xFFFFFBFE), // Warna permukaan
    onPrimary = Color.White, // Warna untuk teks di atas warna primer
    onSecondary = Color.White, // Warna untuk teks di atas warna sekunder
    onTertiary = Color.White, // Warna untuk teks di atas warna tersier
    onBackground = Color(0xFF1C1B1F), // Warna untuk teks di atas latar belakang
    onSurface = Color(0xFF1C1B1F), // Warna untuk teks di atas permukaan
    */
)

// Fungsi Composable untuk tema aplikasi
@Composable
fun AffirmationsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Menggunakan tema gelap jika sistem berada dalam tema gelap
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true, // Menentukan apakah warna dinamis diizinkan
    content: @Composable () -> Unit // Konten yang akan ditampilkan dalam tema
) {
    // Menentukan skema warna berdasarkan kondisi
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current // Mendapatkan konteks saat ini
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme // Menggunakan skema warna gelap
        else -> LightColorScheme // Menggunakan skema warna terang
    }

    // Menerapkan tema dengan skema warna dan tipografi yang ditentukan
    MaterialTheme(
        colorScheme = colorScheme, // Skema warna untuk tema
        typography = Typography, // Tipografi untuk tema
        content = content // Konten yang akan ditampilkan
    )
}
