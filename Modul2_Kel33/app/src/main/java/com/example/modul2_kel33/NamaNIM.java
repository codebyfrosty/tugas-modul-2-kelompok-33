package com.example.modul2_kel33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NamaNIM extends AppCompatActivity {

    ListView simpleList;
    String nameList[] = {"Kelompok 33", "Anggota 1: Paquita Putri Ababil (21120119120030)", "Anggota 2: NADIA (21120119120023)", "Anggota 3: Saifudin Nur Alfianto (21120119130087)", "Anggota 4: Hilmi Ahmad Dhiya'ulhaq (21120119130048)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_nim);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, nameList);
        simpleList.setAdapter(arrayAdapter);
    }
}
