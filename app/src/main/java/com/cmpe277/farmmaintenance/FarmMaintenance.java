package com.cmpe277.farmmaintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FarmMaintenance extends AppCompatActivity {

    public static String iotmode;
    private Button fan_on;
    private Button fan_sprinkler_on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_maintenance);
        fan_on = (Button) findViewById(R.id.fan_on);
        fan_sprinkler_on = (Button) findViewById(R.id.fan_sprinkler_on);
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(FarmMaintenance.this, "This app shows the status of devices",
                Toast.LENGTH_LONG).show();
        if(iotmode.equals("FAN_ON")){
            fan_sprinkler_on.setVisibility(View.GONE);
           // fan_on.setEnabled(true);
            //fan_sprinkler_on.setEnabled(false);
        }
        /*else
        {
            fan_on.setVisibility(View.GONE);
            //fan_sprinkler_on.setEnabled(true);
            //fan_on.setEnabled(true);
        } */
    }

    public void onFanOn(){
        Toast.makeText(FarmMaintenance.this, "Only Fan is switched on now",
                Toast.LENGTH_LONG).show();
    }
}
