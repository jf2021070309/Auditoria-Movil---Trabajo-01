package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfhp implements Runnable {
    final /* synthetic */ zzfhu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
