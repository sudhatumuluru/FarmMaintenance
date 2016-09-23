package com.cmpe277.farmmaintenance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GetValueBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("poultry.farm.on.fan.sprinkler")) {

            FarmMaintenance.iotmode = intent.getExtras().getString("iotMode");

            Intent statusIntent = new Intent(context,FarmMaintenance.class);
            statusIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(statusIntent);

        }

    }
}
