package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfrc implements Runnable {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfrd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrc(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        this.zzb = zzfrdVar;
        this.zza = zzfoeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfrd.zzy(this.zzb, this.zza);
    }
}
