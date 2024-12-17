package devandroid.depaula.applistaproduto.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.depaula.applistaproduto.R;
import devandroid.depaula.applistaproduto.model.Produto;

public class MainActivity extends AppCompatActivity {
    Produto produto;

    EditText editNomeProduto;
    EditText editCorProduto;
    EditText editQuantidadeProduto;
    EditText editPrecoProduto;

    Button btnFinalizar;
    Button btnSalvar;
    Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        produto = new Produto();

        editNomeProduto = findViewById(R.id.editNomeProduto);
        editCorProduto = findViewById(R.id.editCorProduto);
        editQuantidadeProduto = findViewById(R.id.editQuantidadeProduto);
        editPrecoProduto = findViewById(R.id.editPrecoProduto);

        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);

        editNomeProduto.setText(produto.getNome());
        editCorProduto.setText(produto.getCor());
        editQuantidadeProduto.setText(produto.getQuantidade());
        editPrecoProduto.setText(produto.getPreco());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNomeProduto.setText("");
                editCorProduto.setText("");
                editQuantidadeProduto.setText("");
                editPrecoProduto.setText("");
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 produto.setNome(editNomeProduto.getText().toString());
                 produto.setCor(editCorProduto.getText().toString());
                 produto.setQuantidade(editQuantidadeProduto.getText().toString());
                 produto.setPreco(editPrecoProduto.getText().toString());

                Toast.makeText(MainActivity.this,"Dados Salvos"+produto.toString(), Toast.LENGTH_LONG).show();            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });



    }
}