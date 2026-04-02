package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes2.dex */
public final class zzab {
    private static zzab a;
    private final Context b;
    private final ScheduledExecutorService c;
    private c d = new c(this);
    private int e = 1;

    public static synchronized zzab zzc(Context context) {
        zzab zzabVar;
        synchronized (zzab.class) {
            if (a == null) {
                a = new zzab(context, Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("MessengerIpcClient")));
            }
            zzabVar = a;
        }
        return zzabVar;
    }

    private zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return a(new i(a(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return a(new k(a(), 1, bundle));
    }

    private final synchronized <T> Task<T> a(j<T> jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(jVar);
            Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(valueOf).length() + 9).append("Queueing ").append(valueOf).toString());
        }
        if (!this.d.a(jVar)) {
            this.d = new c(this);
            this.d.a(jVar);
        }
        return jVar.b.getTask();
    }

    private final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
