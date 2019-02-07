package com.example.ats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertData extends AppCompatActivity {

    EditText e_name,e_mail,e_contact,e_password;
    String name,email,contact,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        e_name = findViewById(R.id.name);
        e_mail = findViewById(R.id.email);
        e_contact = findViewById(R.id.contact);
        e_password = findViewById(R.id.password);
    }

    public void reguser(View view) {
        name  = e_name.getText().toString();
        email  = e_mail.getText().toString();
        contact  = e_contact.getText().toString();
        password  = e_password.getText().toString();
        String method  = "register";
        InsertDataBackground backgroundTask = new InsertDataBackground(this);
        backgroundTask.execute(method,name,email,contact,password);

        //Toast.makeText(this, "Name:E-Mail:ContactPassword"+name+e_mail+contact+password, Toast.LENGTH_SHORT).show();
        finish();

    }
}
