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
public class cf extends BroadcastReceiver {
    @Inject
    Context a;
    @Inject
    ci b;
    @Inject
    com.vungle.publisher.env.n c;

    public void a() {
        this.a.registerReceiver(this, new IntentFilter("com.vungle.publisher.db.DUMP_TABLES"));
    }

    public void b() {
        try {
            this.a.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            Logger.w(Logger.DATABASE_DUMP_TAG, "error unregistering database broadcast receiver - not registered");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("com.vungle.publisher.db.DUMP_TABLES".equals(intent.getAction())) {
                Logger.d(Logger.DATABASE_DUMP_TAG, this.c.b() + " received dump tables request");
                this.b.a(intent.getStringArrayExtra("tables"));
            }
        } catch (Exception e) {
            Logger.w(Logger.DATABASE_DUMP_TAG, "error dumping database", e);
        }
    }
}
