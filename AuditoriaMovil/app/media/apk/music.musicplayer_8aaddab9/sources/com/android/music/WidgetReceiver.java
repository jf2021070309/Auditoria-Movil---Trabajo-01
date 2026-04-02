package com.android.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.h.d.m0;
import e.h.g.d1.k;
/* loaded from: classes.dex */
public class WidgetReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.jrtstudio.audio.musicservicecommand.next2".equals(action)) {
            m0.N0(k.USER_NEXT_FOREGROUND);
        } else if ("com.jrtstudio.audio.musicservicecommand.togglepause2".equals(action)) {
            m0.N0(k.TOGGLE_PAUSE_FOREGROUND);
        }
    }
}
