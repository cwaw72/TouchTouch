package com.example.user.touchtouch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        View vm = new TouchEventView(this);
        setContentView(vm);

//        Intent intent = new Intent();
//        intent.setAction(Intent.ACTION_MAIN);
    //        intent.addCategory(Intent.CATEGORY_HOME);
//        startActivity(intent);

    }

}
