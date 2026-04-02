package com.vungle.publisher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class lp extends BroadcastReceiver {
    @Inject
    Context a;
    @Inject
    qg b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
            this.b.a(new ls());
        } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
            this.b.a(new lt());
        }
    }

    public void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.a.registerReceiver(this, intentFilter);
    }

    public void b() {
        try {
            this.a.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            Logger.w(Logger.DEVICE_TAG, "error unregistering external storage state broadcast receiver - not registered");
        }
    }
}
