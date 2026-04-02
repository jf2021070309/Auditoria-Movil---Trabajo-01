package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzash implements Runnable {
    public final /* synthetic */ IOException zza;
    public final /* synthetic */ zzasl zzb;

    public zzash(zzasl zzaslVar, IOException iOException) {
        this.zzb = zzaslVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasm zzasmVar;
        zzasmVar = this.zzb.zze;
        zzasmVar.zzi(this.zza);
    }
}
