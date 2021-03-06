package software.ifto.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        {
            setContentView(R.layout.activity_lista_alunos);

            String[] alunos = {"Daniel", "Ronaldo", "Jeferson", "Felipe", "Ronaldo", "Jeferson", "Felipe", "Ronaldo", "Jeferson", "Felipe"};
            ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
            listaAlunos.setAdapter(adapter);

            Button novoAluno = (Button) findViewById(R.id.novo_aluno);
            novoAluno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v)  {
                    Intent  intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                    startActivity(intentVaiProFormulario);
                }
            });

        }
    }
}
