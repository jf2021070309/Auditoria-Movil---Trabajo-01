package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzzp extends zzzn<Integer, Object> {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzzp() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Object> zza() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzzp(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = zzb.get(0) == null ? "E" : (String) zzb.get(0);
            this.zzb = zzb.get(1) != null ? ((Long) zzb.get(1)).longValue() : -1L;
            this.zzc = zzb.get(2) == null ? "E" : (String) zzb.get(2);
            this.zzd = zzb.get(3) == null ? "E" : (String) zzb.get(3);
            this.zze = zzb.get(4) != null ? (String) zzb.get(4) : "E";
        }
    }
}
