package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcim implements Runnable {
    final /* synthetic */ zzcip zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcim(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
