package medina.diana.thecheezerys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnHot: Button =findViewById(R.id.btnHotDrinks) as Button
        var btnSweets: Button=findViewById(R.id.btnSweets) as Button
        var btnSalties: Button=findViewById(R.id.btnSalties) as Button
        var btnCold: Button =findViewById(R.id.btnColdDrinks) as Button
        var btnCombo: Button=findViewById(R.id.btnCombos) as Button
        var btnCustom: Button=findViewById(R.id.btnCustom) as Button

        btnCold.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","coldDrinks")
            startActivity(intent)
        }
        btnHot.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","hotDrinks")
            startActivity(intent)
        }
        btnSweets.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","sweets")
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","salties")
            startActivity(intent)
        }
        btnCombo.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","combos")
            startActivity(intent)
        }
        btnCustom.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","custom")
            startActivity(intent)
        }
    }
}