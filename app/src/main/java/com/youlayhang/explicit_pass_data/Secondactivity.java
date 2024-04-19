package com.youlayhang.explicit_pass_data;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Secondactivity extends AppCompatActivity {
    TextView fname, lname;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondactivity);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(Secondactivity.this, MainActivity.class);
                startActivity(data);
            }
        });

        fname = (TextView) findViewById(R.id.viewFname);
        lname = (TextView) findViewById(R.id.viewLname);
        Bundle values = getIntent().getExtras();
        if (values != null){
            String first_name =values.getString("Fname");
            String last_name = values.getString("lname");

            fname.setText(first_name);
            lname.setText(last_name);
        }

    }
}