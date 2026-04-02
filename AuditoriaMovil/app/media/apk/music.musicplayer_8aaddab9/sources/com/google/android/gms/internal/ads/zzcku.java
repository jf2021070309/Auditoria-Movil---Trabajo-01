package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzcku implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzcla zze;

    public zzcku(zzcla zzclaVar, String str, String str2, int i2, int i3, boolean z) {
        this.zze = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        zzcla.zzs(this.zze, "onPrecacheEvent", hashMap);
    }
}
