package com.example.sammy.ngpaytest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Created by sammy on 20/7/15.
 */
public class MySMSReceiver extends BroadcastReceiver {

    MainActivity mainActivity = null;

    private static final String TAGG = MySMSReceiver.class.getSimpleName();


    void setMainActivityHandler(MainActivity mainAct){
        this.mainActivity = mainAct;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAGG, "##################################################");
        Bundle extras = intent.getExtras();

        if (extras == null)
            return;

        Object[] pdus = (Object[]) extras.get("pdus");
        SmsMessage msg = SmsMessage.createFromPdu((byte[]) pdus[0]);
        String origNumber = msg.getOriginatingAddress();
        String msgBody = msg.getMessageBody();

        mainActivity.displaySMSVerification(msgBody);

    }
}
