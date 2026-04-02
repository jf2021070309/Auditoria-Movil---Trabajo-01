package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzckw implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ int zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ zzcla zzj;

    public zzckw(zzcla zzclaVar, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.zzj = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = z;
        this.zzh = i4;
        this.zzi = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", Long.toString(this.zze));
        hashMap.put("totalDuration", Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcla.zzs(this.zzj, "onPrecacheEvent", hashMap);
    }
}
