package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbzf extends Thread {
    final /* synthetic */ String zza;

    public zzbzf(zzbzh zzbzhVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbzt(null).zza(this.zza);
    }
}
