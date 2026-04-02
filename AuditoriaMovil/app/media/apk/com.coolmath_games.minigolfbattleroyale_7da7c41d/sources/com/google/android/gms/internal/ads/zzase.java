package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzase implements Runnable {
    final /* synthetic */ zzasl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzase(zzasl zzaslVar) {
        this.zza = zzaslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasl.zzx(this.zza);
    }
}
