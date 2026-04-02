package com.rovio.rcs;

import android.app.Activity;
import android.content.Intent;
import com.rovio.fusion.Globals;
/* loaded from: classes4.dex */
public class Application {
    public static void setActivity(Activity activity) {
        Globals.setActivity(activity);
    }

    public static void onActivityResult(int i, int i2, Intent intent) {
        Globals.onActivityResult(i, i2, intent);
    }

    public static void onResume() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.Application.1
            @Override // java.lang.Runnable
            public void run() {
                Globals.onResume();
            }
        });
    }

    public static void onPause() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.Application.2
            @Override // java.lang.Runnable
            public void run() {
                Globals.onPause();
            }
        });
    }

    public static void onDestroy() {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.Application.3
            @Override // java.lang.Runnable
            public void run() {
                Globals.onDestroy();
            }
        });
    }

    public static void onNewIntent(final Intent intent) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.Application.4
            @Override // java.lang.Runnable
            public void run() {
                Globals.onNewIntent(intent);
            }
        });
    }
}
