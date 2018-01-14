package com.example.nimes.calldetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Nimes on 1/14/2018.
 */

public class DetectCall extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        try{
            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
     /* Display Receiving call */                 if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)){ Toast.makeText(context, "Incoming Call!", Toast.LENGTH_SHORT).show(); }
     /* Display Termination of the call */        if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_OFFHOOK)){ Toast.makeText(context, "Call Accepted!", Toast.LENGTH_SHORT).show(); }
     /* Display Idle state */                     if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_IDLE)){ Toast.makeText(context, "Call Terminated!", Toast.LENGTH_SHORT).show(); }
        } catch (Exception e){ e.printStackTrace(); }
    }
}