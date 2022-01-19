package com.rajesh.android_git.Broadcast_Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String str_intent=intent.getAction();
        Log.d("Action Receiver",str_intent);
        Toast.makeText(context,str_intent,Toast.LENGTH_LONG).show();
    }
}
