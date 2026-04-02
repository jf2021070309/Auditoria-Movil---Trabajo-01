package com.amazon.aps.iva.i5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.g;
/* compiled from: LifecycleService.kt */
/* loaded from: classes.dex */
public class q extends Service implements o {
    public final androidx.lifecycle.s b = new androidx.lifecycle.s(this);

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        return this.b.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        androidx.lifecycle.s sVar = this.b;
        sVar.getClass();
        sVar.a(g.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        androidx.lifecycle.s sVar = this.b;
        sVar.getClass();
        sVar.a(g.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.lifecycle.s sVar = this.b;
        sVar.getClass();
        sVar.a(g.a.ON_STOP);
        sVar.a(g.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        androidx.lifecycle.s sVar = this.b;
        sVar.getClass();
        sVar.a(g.a.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
