package ac.id.atmaluhur.mhs.intenteksplisit_fionaavrielia2011500049

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvData = findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("NAMA")

        tvData.text ="""
            Data yang dimasukan:
            NIM: $nim
            Nama: $nama
         """.trimIndent()

    }
}