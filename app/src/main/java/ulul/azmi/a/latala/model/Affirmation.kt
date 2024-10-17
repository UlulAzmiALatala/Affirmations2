package ulul.azmi.a.latala.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data class yang merepresentasikan sebuah afirmasi
data class Affirmation(
    @StringRes val stringResourceId: Int, // ID resource string untuk teks afirmasi
    @DrawableRes val imageResourceId: Int // ID resource drawable untuk gambar afirmasi
)
