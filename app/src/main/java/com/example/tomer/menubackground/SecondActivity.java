package com.example.tomer.menubackground;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {
    LinearLayout LL1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = (Button)findViewById(R.id.btn);
        LL1 = (LinearLayout)findViewById(R.id.LL1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,300,"Green");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id1 = item.getItemId();
        if(item.getTitle().toString().equals("Green"))
            LL1.setBackgroundColor(Color.GREEN);
        switch(id1){
            case R.id.menuPrpl: LL1.setBackgroundColor(Color.MAGENTA);
            break;
            case R.id.menuCyan: LL1.setBackgroundColor(Color.CYAN);
            break;
            case R.id.menuRed: LL1.setBackgroundColor(Color.RED);
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void back(View view) {
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
