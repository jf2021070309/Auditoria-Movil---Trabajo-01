package com.google.android.gms.ads.internal.util;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzm implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzs zzsVar, Context context) {
        this.zzb = zzsVar;
        this.zza = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzb.zzf;
        synchronized (obj) {
            this.zzb.zzg = zzs.zzU(this.zza);
            obj2 = this.zzb.zzf;
            obj2.notifyAll();
        }
    }
}
