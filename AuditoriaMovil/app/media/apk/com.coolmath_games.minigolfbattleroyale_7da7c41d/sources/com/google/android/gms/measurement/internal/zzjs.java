package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
final class zzjs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzjz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzjz zzjzVar, long j) {
        this.zzb = zzjzVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz.zzi(this.zzb, this.zza);
    }
}
