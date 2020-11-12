package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnThem;
    Button btnXoa;
    EditText txtMa;
    EditText txtTen;
    Spinner spinMaLop;
    ListView lvSinhvien;
    RadioButton rdNam;
    RadioButton rdNu;
    SinhVien svx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnThem = (Button)findViewById(R.id.btnThem);
        btnXoa= (Button)findViewById(R.id.btnXoa);
        txtMa = (EditText)findViewById(R.id.txtmaSinhVien);
        txtTen = (EditText)findViewById(R.id.txtTenSinhVien);
        spinMaLop = (Spinner)findViewById(R.id.spinner);
        lvSinhvien = (ListView)findViewById(R.id.lvSinhvien);
        rdNam = (RadioButton)findViewById(R.id.rdNam);
        rdNu = (RadioButton)findViewById(R.id.rdNu);
        ////
        ArrayList<String> listLop = new ArrayList<String>();
        listLop.add("DHKTPM13B");
        listLop.add("DHKTPM13A");
        listLop.add("DHHTTT14F");
        ArrayAdapter adtLop = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,listLop);
        spinMaLop.setAdapter(adtLop);
        /////
        ///
        ArrayList<SinhVien> listSv = new ArrayList<SinhVien>();
        listSv.add(new SinhVien("17100311","Pham Quoc Toan","nam","DHKTPM13B"));
        ArrayAdapter adtSV = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listSv);
        lvSinhvien.setAdapter(adtSV);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ma = txtMa.getText().toString();
                String ten = txtTen.getText().toString();
                String lop = spinMaLop.getSelectedItem().toString();
                String gt = "Nam";
                if (rdNu.isChecked()==true){
                    gt = "Nu";
                }
                SinhVien sv = new SinhVien(ma,ten,lop,gt);
                listSv.add(sv);
                adtSV.notifyDataSetChanged();
            }
        });

        lvSinhvien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                svx = listSv.get(position);
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listSv.remove(svx);
                lvSinhvien.setAdapter(adtSV);
            }
        });
        ///
    }
}