package fabianv.cl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Resultado;
    EditText PESO,ALTURA;

    Button CALCULAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PESO = findViewById(R.id.txtpeso);
        ALTURA = findViewById(R.id.txtaltura);
        Resultado = findViewById(R.id.result);
        CALCULAR = findViewById(R.id.botoncalcu);

        CALCULAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesoStr = PESO.getText().toString();
                String alturaStr = ALTURA.getText().toString();

                float p = Float.parseFloat(pesoStr);
                float a = Float.parseFloat(alturaStr) / 100;

                //Calcular IMc
                float imc = p / (a*a);
                Resultado.setText(String.format("IMC: %.2f",imc));
            }
        });
    }
}