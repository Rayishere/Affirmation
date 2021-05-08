package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.Affirmation

/**
 * Create a class to be a data source
 * Due to the data source could be vary
 * Therefore, it is important to arrange data properly.
 */
class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}