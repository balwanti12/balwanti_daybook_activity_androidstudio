package com.example.daybook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText date;
    TextView trans;
    TextView total;
    TextView in;
    TextView out;
    TextView total1;
    EditText e1;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date=findViewById(R.id.editText);
        trans=findViewById(R.id.textView);
        total=findViewById(R.id.textView2);
        in=findViewById(R.id.textView3);
        out=findViewById(R.id.textView5);
        total1=findViewById(R.id.textView5);
        e1=findViewById(R.id.editText2);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText(day+"-"+month+"-"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         int id=item.getItemId();
         if(id == R.id.first)
         {
             Toast.makeText(getApplicationContext(),"acces to pdf",Toast.LENGTH_SHORT).show();
         }
         if(id==R.id.second)
         {
             Toast.makeText(getApplicationContext(),"access to excel",Toast.LENGTH_SHORT).show();
         }
        return super.onOptionsItemSelected(item);
    }
}
