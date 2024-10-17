package ulul.azmi.a.latala.data

import ulul.azmi.a.latala.R
import ulul.azmi.a.latala.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.semeru),
            Affirmation(R.string.affirmation2, R.drawable.rinjani),
            Affirmation(R.string.affirmation3, R.drawable.slamet),
            Affirmation(R.string.affirmation4, R.drawable.sumbing),
            Affirmation(R.string.affirmation5, R.drawable.sindoro),
            Affirmation(R.string.affirmation6, R.drawable.merbabu),
            Affirmation(R.string.affirmation7, R.drawable.bromo),
            Affirmation(R.string.affirmation8, R.drawable.jayawijaya),
            Affirmation(R.string.affirmation9, R.drawable.lawu),
            Affirmation(R.string.affirmation10, R.drawable.merapi)
        )
    }
}