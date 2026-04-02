package com.google.ads.interactivemedia.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzar implements Runnable {
    public final /* synthetic */ NonceManager zza;

    public /* synthetic */ zzar(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NonceManager.zzh(this.zza);
    }
}
