package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfhp implements Runnable {
    public final /* synthetic */ zzfhu zza;

    public zzfhp(zzfhu zzfhuVar) {
        this.zza = zzfhuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfho zzfhoVar;
        zzfhoVar = this.zza.zzh;
        zzfhoVar.zzc();
    }
}
