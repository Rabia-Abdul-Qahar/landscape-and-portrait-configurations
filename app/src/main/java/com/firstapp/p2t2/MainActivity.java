package com.firstapp.p2t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.btnShowToast);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                                           Toast.makeText(MainActivity.this, "WE ARE IN PORTRAIT MODE", Toast.LENGTH_SHORT).show();
                                       }
                                       else{
                                           Toast.makeText(MainActivity.this,"WE ARE IN LANDSCAPE MODE",Toast.LENGTH_SHORT).show();
                                       }

                                   }
                               }
        );

//                Toast.makeText(this,"WE ARE IN PORTRAIT MODE",Toast.LENGTH_LONG).show();
//    }
}
}