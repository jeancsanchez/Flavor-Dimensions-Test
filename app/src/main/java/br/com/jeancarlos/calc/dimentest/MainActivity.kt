package br.com.jeancarlos.calc.dimentest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit  var txtDimensionMainActivity: TextView
    private lateinit var dimensionDataSource: DimensionDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDimensionMainActivity = findViewById(R.id.txtDimensionMainActivity) as TextView

        dimensionDataSource = Injection.providesDimensionDataSource()
        txtDimensionMainActivity.text = dimensionDataSource.getDimension()
    }
}
