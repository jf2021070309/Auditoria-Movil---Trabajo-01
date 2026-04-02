package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
/* loaded from: classes2.dex */
public final class zzf extends Binder {
    private final zzb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzb zzbVar) {
        this.a = zzbVar;
    }

    public final void zza(z zVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (this.a.zzc(zVar.a)) {
            zVar.a();
            return;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.a.a.execute(new ab(this, zVar));
    }
}
