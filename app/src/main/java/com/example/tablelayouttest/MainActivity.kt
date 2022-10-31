package com.example.tablelayouttest

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        // Create a new table row.
        val tableRow = TableRow(this) // this
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        // add values into row by calling addView()
        val tvVer = TextView(this)
        tvVer.width = 197
        tvVer.text = version.text
        tvVer.setBackgroundColor(Color.parseColor("#F42485"));

        val tvNm = TextView(this)
        tvNm.width = 197
        tvNm.text = R.id.namev.toString()
        tvNm.setBackgroundColor(Color.parseColor("#F42485"));

        tvVer.text= R.id.version.toString()
        tableRow.addView(tvVer,0)
        tableRow.addView(tvNm,1)

        // Finally add the created row row into layout
        table.addView(tableRow) // id from Layout_file
    }
}