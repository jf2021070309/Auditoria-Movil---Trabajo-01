package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
final class w extends BroadcastReceiver {
    @Nullable
    private v a;

    public w(v vVar) {
        this.a = vVar;
    }

    public final void a() {
        if (FirebaseInstanceId.d()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a != null && this.a.b()) {
            if (FirebaseInstanceId.d()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a(this.a, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
