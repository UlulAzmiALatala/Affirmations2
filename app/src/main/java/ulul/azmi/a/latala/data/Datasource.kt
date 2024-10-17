package ulul.azmi.a.latala.data

import ulul.azmi.a.latala.R
import ulul.azmi.a.latala.model.Affirmation

// Kelas Datasource yang digunakan untuk menyediakan data afirmasi
class Datasource() {

    // Fungsi untuk memuat daftar afirmasi
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>( // Mengembalikan daftar afirmasi
            Affirmation(R.string.affirmation1, R.drawable.semeru), // Afirmasi 1
            Affirmation(R.string.affirmation2, R.drawable.rinjani), // Afirmasi 2
            Affirmation(R.string.affirmation3, R.drawable.slamet), // Afirmasi 3
            Affirmation(R.string.affirmation4, R.drawable.sumbing), // Afirmasi 4
            Affirmation(R.string.affirmation5, R.drawable.sindoro), // Afirmasi 5
            Affirmation(R.string.affirmation6, R.drawable.merbabu), // Afirmasi 6
            Affirmation(R.string.affirmation7, R.drawable.bromo), // Afirmasi 7
            Affirmation(R.string.affirmation8, R.drawable.jayawijaya), // Afirmasi 8
            Affirmation(R.string.affirmation9, R.drawable.lawu), // Afirmasi 9
            Affirmation(R.string.affirmation10, R.drawable.merapi) // Afirmasi 10
        )
    }
}
