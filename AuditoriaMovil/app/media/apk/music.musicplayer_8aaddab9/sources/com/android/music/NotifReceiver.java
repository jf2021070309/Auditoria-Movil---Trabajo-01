package com.android.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.c.a7;
/* loaded from: classes.dex */
public class NotifReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.jrtstudio.shutup".equals(intent.getAction())) {
            return;
        }
        a7.f(true);
    }
}
