package me.simongohl.thisnextsong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MediaBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
//        if (intent) {
//            String pressedMediaButton = intent.getStringExtra(Intent.EXTRA_KEY_EVENT);
//            System.out.println("In if state");
//            Toast.makeText(context, pressedMediaButton, Toast.LENGTH_SHORT).show();
//
//        }
//        Toast.makeText(context, "not working", Toast.LENGTH_SHORT).show();
//        System.out.print("Media class");

    }
}
