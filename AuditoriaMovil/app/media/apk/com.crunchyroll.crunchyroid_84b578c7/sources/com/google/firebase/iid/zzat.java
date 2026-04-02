package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzat {
    private final Executor zza;
    private final Map<Pair<String, String>, Task<InstanceIdResult>> zzb = new a();

    public zzat(Executor executor) {
        this.zza = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized Task<InstanceIdResult> zza(String str, String str2, zzav zzavVar) {
        final Pair pair = new Pair(str, str2);
        Task<InstanceIdResult> task = this.zzb.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                new StringBuilder(String.valueOf(pair).length() + 29);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            new StringBuilder(String.valueOf(pair).length() + 24);
        }
        Task continueWithTask = zzavVar.zza().continueWithTask(this.zza, new Continuation(this, pair) { // from class: com.google.firebase.iid.zzas
            private final zzat zza;
            private final Pair zzb;

            {
                this.zza = this;
                this.zzb = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.zza.zza(this.zzb, task2);
            }
        });
        this.zzb.put(pair, continueWithTask);
        return continueWithTask;
    }

    public final /* synthetic */ Task zza(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.zzb.remove(pair);
        }
        return task;
    }
}
