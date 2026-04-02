package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
final class zzji implements Runnable {
    final /* synthetic */ zzjj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjj zzjjVar) {
        this.zza = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk.zzK(this.zza.zza, null);
        this.zza.zza.zzR();
    }
}
