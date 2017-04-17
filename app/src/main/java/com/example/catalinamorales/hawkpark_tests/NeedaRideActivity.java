package com.example.catalinamorales.hawkpark_tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;



abstract class NeedaRideActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        Spinner lotSpinner;
        ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_needaride);

        adapter = ArrayAdapter.createFromResource(this, R.array.parkingLot_array, android.R.layout.simple_spinner_item);
        lotSpinner = (Spinner) findViewById(R.id.lot_spinner);
        lotSpinner.setAdapter(adapter);
        lotSpinner.setOnItemSelectedListener(NeedaRideActivity.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }


}





