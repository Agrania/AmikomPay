package io.github.agrania.amikompay

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

class RowActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.row)

            setSupportActionBar(toolbar)
        }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.nav_menu, menu)
            return true
        }
}