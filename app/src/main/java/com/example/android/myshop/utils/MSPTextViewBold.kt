package com.example.android.myshop.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MSPTextViewBold(context: Context,attrs: AttributeSet) : AppCompatTextView(context, attrs){
    init {
        //Call the function to apply the font to the componenets.
        applyFont()
    }

    private fun applyFont() {
        // This is used to get the file from the assets folder and set it to the title textview.
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets,"Mogata.ttf")
        setTypeface(typeface)
    }

}