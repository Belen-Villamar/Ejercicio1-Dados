package movil.ejercicio1_belen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Resultado : AppCompatActivity() {
    var Texto1: TextView? = null
    var valor: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val Intent_obj: Intent =intent
        Texto1= findViewById<EditText>(R.id.N_lados)
        valor= findViewById<EditText>(R.id.Resultado)
        var Nombre=Intent_obj.getStringExtra("lados")
        var Valor=Intent_obj.getStringExtra("valores")
        Texto1?.setText(Nombre.toString())
        valor?.setText(Valor.toString())
    }
    fun Regresar_a_Inicio(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}