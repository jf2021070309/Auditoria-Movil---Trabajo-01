package com.rovio.fusion;

import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes2.dex */
public class BatteryManagerWrapper {
    public static boolean isChargerConnected() {
        int intExtra = Globals.getActivity().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public static float getBatteryLevel() {
        Intent registerReceiver = Globals.getActivity().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
    }
}
