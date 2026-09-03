package ddm.aulas.intentsandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /*EXPLICAR ddd*/
        Button bIntExplicita = findViewById(R.id.bIntExplicita);
        Button bIntImplicita = findViewById(R.id.bIntImplicita);

        // Intent Explícita - abre outra Activity do próprio app
        bIntExplicita.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            intent.putExtra("nome", "Isabelle");
            startActivity(intent);
        });

        // Intent Implícita - abre o navegador (app do sistema decide)
        bIntImplicita.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniasselvi.com.br"));
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}