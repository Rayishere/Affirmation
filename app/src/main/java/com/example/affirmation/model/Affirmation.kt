package com.example.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// data needs at least one property defined
// The @XXX infront of the constructors are strictly managed
// In order not to be mistaken the parameters from developers or IDEs
data class Affirmation (
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId: Int){

}