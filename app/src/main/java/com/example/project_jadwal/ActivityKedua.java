package com.example.project_jadwal;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityKedua extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.onEdit)
            task = edttask.getText().toString();
        jenis = edtjenis.getText().toString();
        time = edttime.getText().toString();

        if (edttask.getText().toString().length()==0){
            edttask.setError("Task Diperlukan!!");
        }
        if (edtjenis.getText().toString().length()==0){
            edtjenis.setError("Jenis Task Diperlukan!!");
        }
        if (edttime.getText().toString().length()==0){
            edttime.setError("Time Task Diperlukan!!");
        }
        if (task.isEmpty() || jenis.isEmpty() || time.isEmpty()) {
            Toast t = Toast.makeText(getApplicationContext(),
                    "Isi semua data!!!", Toast.LENGTH_LONG);
            t.show();
        } else {
            Toast t = Toast.makeText(getApplicationContext(),
                    "Berhasil", Toast.LENGTH_LONG);
            t.show();

            Bundle b = new Bundle();

            b.putString("a", task.trim());
            b.putString("b", jenis.trim());
            b.putString("c", time.trim());
            Intent i = new Intent(getApplicationContext(), com.example.project_jadwal.DaftarActivity.class);
            i.putExtras(b);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnDelete) {
            Intent l = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(l);
        }

        return super.onOptionsItemSelected(item);
    }

    EditText edttask, edtjenis, edttime;
    FloatingActionButton fab;
    String task, jenis, time, name;
    TextView username;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        edttask = findViewById(R.id.edttask);
        edtjenis = findViewById(R.id.edtjenis);
        edttime = findViewById(R.id.edttime);
        username = findViewById(R.id.tvusername);

        Bundle bundle = getIntent().getExtras();

        String user = bundle.getString("a");
        username.setText(user);

        fab = findViewById(R.id.faButton);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                task = edttask.getText().toString();
                jenis = edtjenis.getText().toString();
                time = edttime.getText().toString();

                if(task.isEmpty() || jenis.isEmpty() || time.isEmpty())
                {
                    Snackbar.make(view, "Isi semua Data!", Snackbar.LENGTH_LONG).show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Berhasil", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", task.trim());
                    b.putString("b", jenis.trim());
                    b.putString("c", time.trim());
                    Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }



}