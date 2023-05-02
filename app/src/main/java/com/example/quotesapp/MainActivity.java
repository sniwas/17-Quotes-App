package com.example.quotesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolb);
        setSupportActionBar(toolbar);
        textView=findViewById(R.id.quotetext);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if(item_id==R.id.q1)
        {
            textView.setText("Success is the problem but failure is the formula. You cant solve the problem without knowing the formula. ");
            return true;
        }
        else if(item_id==R.id.q2)
        {
            textView.setText("Leadership is an opportunity to serve. It is not a trumpet call to self-importance.\n- J. Donald Walters");
            return true;
        }
        else if(item_id==R.id.q3)
        {
            textView.setText("If you are going to achieve excellence in big things, you develop the habit in little matters. Excellence is not an exception, it is a prevailing attitude.\n- Colin Powell");
            return true;
        }
        else if(item_id==R.id.q4)
        {
            textView.setText("Self-preservation is the first law of nature.\n- Samuel Butler");
            return true;
        }
        else
        {
            Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}