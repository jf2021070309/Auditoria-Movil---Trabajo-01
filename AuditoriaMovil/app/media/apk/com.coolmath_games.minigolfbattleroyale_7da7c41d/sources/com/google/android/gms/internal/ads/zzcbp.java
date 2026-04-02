package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcbp implements Callable<zzcbo> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbp(zzcbr zzcbrVar, Context context) {
        this.zzb = zzcbrVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzcbo call() throws Exception {
        WeakHashMap weakHashMap;
        zzcbo zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcbq zzcbqVar = (zzcbq) weakHashMap.get(this.zza);
        if (zzcbqVar == null || zzcbqVar.zza + zzbkq.zza.zze().longValue() < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()) {
            zza = new zzcbn(this.zza).zza();
        } else {
            zza = new zzcbn(this.zza, zzcbqVar.zzb).zza();
        }
        weakHashMap2 = this.zzb.zza;
        weakHashMap2.put(this.zza, new zzcbq(this.zzb, zza));
        return zza;
    }
}
