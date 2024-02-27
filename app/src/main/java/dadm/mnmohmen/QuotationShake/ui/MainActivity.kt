package dadm.mnmohmen.QuotationShake.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import dadm.mnmohmen.QuotationShake.R
import dadm.mnmohmen.QuotationShake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.yepa.text = "Hello Wold ma G"
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.newQF -> {
                    true
                }
                R.id.favsF -> {
                    true
                }
                R.id.settingsF -> {
                    true
                }
                else -> false
            }
        }
    }

}