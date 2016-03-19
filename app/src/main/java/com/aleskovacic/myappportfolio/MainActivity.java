package com.aleskovacic.myappportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto: alesko.8b@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Contact from app portfolio app"));
                break;
            case R.id.spotify_streamer:
                Snackbar.make(v, getString(R.string.main_snackbar,
                        getString(R.string.spotify_streamer)), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.super_duo:
                Snackbar.make(v, getString(R.string.main_snackbar,
                        getString(R.string.super_duo)), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.build_it_bigger:
                Snackbar.make(v, getString(R.string.main_snackbar,
                        getString(R.string.build_it_bigger)), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.xyz_reader:
                Snackbar.make(v, getString(R.string.main_snackbar,
                        getString(R.string.xyz_reader)), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.capstone:
                Snackbar.make(v, getString(R.string.main_snackbar,
                        getString(R.string.capstone)), Snackbar.LENGTH_LONG).show();
                break;
        }
    }
}
