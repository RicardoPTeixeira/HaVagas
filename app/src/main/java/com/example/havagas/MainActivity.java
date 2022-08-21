package com.example.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());


        amb.salvarBtn.setOnClickListener(view -> {
            pessoa = new Pessoa(
                    amb.nomeEt.getText().toString(),
                    amb.emailEt.getText().toString(),
                    amb.emailCb.isChecked() ? "Sim" : "Nao",
                    amb.editTextPhone.getText().toString(),
                    amb.comercial.isChecked() ? getString(R.string.comercial) : getString(R.string.residencial),
                    amb.adicionarCelular.isChecked() ? amb.celular.getText().toString() : "Nao adicionou celular",
                    amb.femininoRb.isChecked() ? getString(R.string.feminino) : getString(R.string.masculino),
                    amb.editTextDate.getText().toString(),
                    ((TextView) amb.spinner.getSelectedView()).getText().toString(),
                    amb.option1.getText().toString(),
                    ((TextView) amb.spinner.getSelectedView()).getText().toString().equals("Graduação") ? amb.anoConclusaoOp2.getText().toString() : ((TextView) amb.spinner.getSelectedView()).getText().toString().equals("Especialização") ? amb.anoConclusaoOp2.getText().toString() : amb.anoConclusaoOp3.getText().toString(),
                    ((TextView) amb.spinner.getSelectedView()).getText().toString().equals("Graduação") ? amb.instituicaoOp2.getText().toString() : ((TextView) amb.spinner.getSelectedView()).getText().toString().equals("Especialização") ? amb.instituicaoOp2.getText().toString() : amb.instituicaoOp3.getText().toString(),
                    amb.tituloMonografia.getText().toString(),
                    amb.orientador.getText().toString(),
                    amb.vagas.getText().toString()
            );
            Toast.makeText(this, pessoa.toString(), Toast.LENGTH_SHORT).show();
        });

        amb.limparBt.setOnClickListener(view -> {
            amb.nomeEt.setText("");
            amb.emailEt.setText("");
            amb.emailCb.setChecked(false);
            amb.editTextPhone.setText("");
            amb.comercial.setChecked(true);
            amb.adicionarCelular.setChecked(false);
            amb.celular.setText("");
            amb.femininoRb.setChecked(true);
            amb.editTextDate.setText("");
            amb.spinner.setSelection(0);
            amb.option1.setText("");
            amb.anoConclusaoOp2.setText("");
            amb.instituicaoOp2.setText("");
            amb.anoConclusaoOp3.setText("");
            amb.instituicaoOp3.setText("");
            amb.tituloMonografia.setText("");
            amb.orientador.setText("");
            amb.vagas.setText("");
            pessoa = null;
        });

        amb.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i <= 1) {
                    amb.option1.setVisibility(View.VISIBLE);
                    amb.option2.setVisibility(View.GONE);
                    amb.option3.setVisibility(View.GONE);
                } else if(i <= 3) {
                    amb.option1.setVisibility(View.GONE);
                    amb.option2.setVisibility(View.VISIBLE);
                    amb.option3.setVisibility(View.GONE);
                } else {
                    amb.option1.setVisibility(View.GONE);
                    amb.option2.setVisibility(View.GONE);
                    amb.option3.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        amb.adicionarCelular.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    amb.celular.setVisibility(View.VISIBLE);
                } else {
                    amb.celular.setVisibility(View.GONE);
                }
            }
        });
    }
}