package com.fitriasari.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] negara ={
      "indonesia",
            "malaysia",
            "singapore",
            "Italia",
            "Inggris",
            "Belanda",
            "Argentina","Chile",
            "Mesir","Uganda"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Sederhana");

        listView = findViewById(R.id.lvnegara);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                negara
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Memilih : "+negara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}