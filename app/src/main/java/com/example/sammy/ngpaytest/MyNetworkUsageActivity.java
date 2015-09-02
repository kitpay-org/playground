package com.example.sammy.ngpaytest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyNetworkUsageActivity extends ActionBarActivity {

    TextView textView = null;

    private static final String TAG = MyNetworkUsageActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_network_usage);
        textView = (TextView) findViewById(R.id.network_usuage_text);
        calculateNetworkUsage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_network_usage, menu);
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

    private void calculateNetworkUsage() {
        Log.e("bytes recvd",""+android.net.TrafficStats.getMobileRxBytes());

        Log.e("Total","Bytes received"+android.net.TrafficStats.getTotalRxBytes());

        String str = "";

        str += "Bytes Received: " + android.net.TrafficStats.getTotalRxBytes();

        str += "\n Bytes Sent: " + android.net.TrafficStats.getTotalTxBytes();


        textView.setText(str);


    }
}
