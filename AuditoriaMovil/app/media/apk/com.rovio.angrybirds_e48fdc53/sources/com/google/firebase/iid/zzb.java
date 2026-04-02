package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public abstract class zzb extends Service {
    final ExecutorService a;
    private Binder b;
    private final Object c;
    private int d;
    private int e;

    public zzb() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.a = Executors.newSingleThreadExecutor(new NamedThreadFactory(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        this.c = new Object();
        this.e = 0;
    }

    public abstract void zzd(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new zzf(this);
        }
        return this.b;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent zzb = zzb(intent);
        if (zzb == null) {
            a(intent);
            return 2;
        } else if (zzc(zzb)) {
            a(intent);
            return 2;
        } else {
            this.a.execute(new y(this, zzb, intent));
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    protected Intent zzb(Intent intent) {
        return intent;
    }

    public boolean zzc(Intent intent) {
        return false;
    }
}
