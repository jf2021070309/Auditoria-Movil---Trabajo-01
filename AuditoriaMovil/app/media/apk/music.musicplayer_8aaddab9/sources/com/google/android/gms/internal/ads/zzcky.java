package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzcky implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzcla zzd;

    public zzcky(zzcla zzclaVar, String str, String str2, long j2) {
        this.zzd = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcla.zzs(this.zzd, "onPrecacheEvent", hashMap);
    }
}
