package com.igaworks.lucy.igawpromotionsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.igaworks.IgawCommon;
import com.igaworks.promotion.IgawPromotion;


public class MainActivity extends ActionBarActivity {

    // Igaworks Common
    String tag = "Igaw";

    // Igaworks Promotion
    String usn;
    String encryptUsn;
    String adspace_key = "sample_pro";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Your Code
        TelephonyManager manager =  (TelephonyManager)getSystemService(MainActivity.this.TELEPHONY_SERVICE);
        usn = manager.getDeviceId().toString();
        usn = usn+"a";
        encryptUsn = Base64.encodeToString(usn.getBytes(), 0);


        // Igaworks Common
        IgawCommon.startApplication(MainActivity.this);
        Log.d(tag, "startApplication ::: MainActivity");

        // Igaworks Promotion
        IgawCommon.setUserId(encryptUsn);
        Log.d(tag, "setUserId ::: " + encryptUsn);

        /*
         * Your Code
         */
    }


     /*
      * Your Code
      */


    // Your Code
    public void showPromotion(View view){
        Log.d(tag, "showPromotion ::: Button Click");

        // Igaworks Promotion
        IgawPromotion.showAD(adspace_key, this);
        Log.d(tag, "showAD ::: " + adspace_key);

    }

    @Override
    protected void onResume() {
        super.onResume();

        // Igaworks Common
        IgawCommon.startSession(MainActivity.this);
        Log.d(tag, "startSession ::: MainActivity" );

        /*
         * Your Code
         */
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Igaworks Common
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: MainActivity");

        /*
         * Your Code
         */
    }

}
