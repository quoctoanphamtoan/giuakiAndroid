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
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Spinner spMaLop;
    ListView lvSinhVien;
    EditText txtMaSinhVien;
    EditText txtTenSinhVien;
    Button btnThem;
    Button btnXoa;
    RadioButton rdNam;
    RadioButton rdNu;
    SinhVien svx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      spMaLop = (Spinner)findViewById(R.id.spinner);
      lvSinhVien = (ListView)findViewById(R.id.lvSinhVien);
      txtMaSinhVien = (EditText)findViewById(R.id.idMaSinhVien);
      txtTenSinhVien = (EditText)findViewById(R.id.idTenSinhVien);
      btnThem = (Button)findViewById(R.id.btnThem);
      btnXoa = (Button)findViewById(R.id.btnXoa);
      rdNam = (RadioButton)findViewById(R.id.rdNam);
      rdNu = (RadioButton)findViewById(R.id.rdNu);
      ////////////////////////////////////spinMaLop/////////////////////
        ArrayList<String> listMalop = new ArrayList<String>();
        listMalop.add("DHKTPM13B");
        listMalop.add("DHKTPM13A");
        listMalop.add("DHKTPM13C");
        ArrayAdapter aptMalop = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,listMalop);
        spMaLop.setAdapter(aptMalop);
        ///////////////////////////////////////////////////////////////
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien("17100311","PhamQuocToan","DHKTPM13B","Nam");
        list.add(sv1);
        ArrayAdapter aptSinhVien = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        lvSinhVien.setAdapter(aptSinhVien);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gioitinh ="";
                if(rdNam.isChecked()){
                    gioitinh = "Nam";
                }
                else
                {
                    gioitinh = "Nu";
                }
                SinhVien sv = new SinhVien(txtMaSinhVien.getText().toString(),
                        txtTenSinhVien.getText().toString(),
                        spMaLop.getSelectedItem().toString(),
                        gioitinh);
                list.add(sv);
                aptSinhVien.notifyDataSetChanged();
            }
        });
        lvSinhVien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMaSinhVien.setText(list.get(position).getMa().toString());
                svx = list.get(position);
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean i =list.remove(svx);

                lvSinhVien.setAdapter(aptSinhVien);
            }
        });

    }

}