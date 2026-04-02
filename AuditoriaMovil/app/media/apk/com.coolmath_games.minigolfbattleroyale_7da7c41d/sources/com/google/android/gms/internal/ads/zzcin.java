package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcin implements Runnable {
    final /* synthetic */ zzcip zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcin(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
