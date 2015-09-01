package com.example.snull.fragmentlistexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager=getFragmentManager();
        FragmentB f2= (FragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeData(i);


    }
}
