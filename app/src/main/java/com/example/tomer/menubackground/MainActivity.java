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


public class MainActivity extends AppCompatActivity {
    Button btn;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        LL = (LinearLayout)findViewById(R.id.LL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id1 = item.getItemId();
        switch (id1){
            case R.id.menuPrpl: LL.setBackgroundColor(Color.MAGENTA);
            break;
            case R.id.menuCyan: LL.setBackgroundColor(Color.CYAN);
            break;
            case R.id.menuRed: LL.setBackgroundColor(Color.RED);
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void nextAct(View view) {
        Intent t = new Intent(this, SecondActivity.class);
        startActivity(t);
    }
}
