package weborneo.project.foodmarketsanjaya.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import weborneo.project.foodmarketsanjaya.MainActivity
import weborneo.project.foodmarketsanjaya.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
    }
}