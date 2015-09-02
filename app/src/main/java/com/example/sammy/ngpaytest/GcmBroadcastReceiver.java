package com.example.sammy.ngpaytest;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;


// For mobile one plus
//key=AIzaSyB56F3w_rAE3AkFejMT4-NYruMKPOmy0nE

//{ "notification": {
//        "title": "Portugal vs. india",
//        "text": "5 to 1"
//        },
//        "to" : "APA91bFg1Bo9WEvS6DxYvJ16TkV8SimctJjRYbxTzGwM-ST4XerIIia578vQaPVxG398_HaugHj97UcujZVMzCUm3uNM7NORv5JFDccGLnnFKqbBaFRQAPOdcSdka4aJuRMWeZu7IjEQ"
//        }

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final String TAG = GcmBroadcastReceiver.class.getSimpleName();


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, ".....................I am in Gcm BroadCast receiver.......................");
        ComponentName comp = new ComponentName(context.getPackageName(),
                GCMNotificationIntentService.class.getName());
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
    }
}
