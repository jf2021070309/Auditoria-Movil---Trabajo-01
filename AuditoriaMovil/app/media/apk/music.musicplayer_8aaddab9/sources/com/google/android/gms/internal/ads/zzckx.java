package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzckx implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzcla zzd;

    public zzckx(zzcla zzclaVar, String str, String str2, int i2) {
        this.zzd = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcla.zzs(this.zzd, "onPrecacheEvent", hashMap);
    }
}
