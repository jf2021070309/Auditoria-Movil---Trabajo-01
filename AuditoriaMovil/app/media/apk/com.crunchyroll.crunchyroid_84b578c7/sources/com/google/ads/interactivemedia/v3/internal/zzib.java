package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzib extends zzhz {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzib() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzib(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = zza.get(0) == null ? "E" : (String) zza.get(0);
            this.zzb = zza.get(1) != null ? ((Long) zza.get(1)).longValue() : -1L;
            this.zzc = zza.get(2) == null ? "E" : (String) zza.get(2);
            this.zzd = zza.get(3) == null ? "E" : (String) zza.get(3);
            this.zze = zza.get(4) != null ? (String) zza.get(4) : "E";
        }
    }
}
