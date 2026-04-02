package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzciu implements Runnable {
    final /* synthetic */ zzcih zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzciu(zzciv zzcivVar, zzcih zzcihVar) {
        this.zza = zzcihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi();
    }
}
