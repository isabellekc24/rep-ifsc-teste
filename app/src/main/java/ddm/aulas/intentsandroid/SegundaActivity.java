package ddm.aulas.intentsandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView txtNome = findViewById(R.id.txtNome);
        String nome = getIntent().getStringExtra("nome");
        txtNome.setText("Bem-vindo, " + nome + "!");
    }



}
