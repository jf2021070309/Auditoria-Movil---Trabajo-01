package com.google.firebase.iid;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ab implements Runnable {
    private final /* synthetic */ z a;
    private final /* synthetic */ zzf b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(zzf zzfVar, z zVar) {
        this.b = zzfVar;
        this.a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        zzbVar = this.b.a;
        zzbVar.zzd(this.a.a);
        this.a.a();
    }
}
