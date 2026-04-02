package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.facebook.appevents.integrity.IntegrityManager;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a implements c {
    final d a;
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String a = com.ironsource.c.a.a(context);
            if (a.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                a.this.a.a();
                return;
            }
            d dVar = a.this.a;
            new JSONObject();
            dVar.a(a);
        }
    };

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.b = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return new JSONObject();
    }
}
