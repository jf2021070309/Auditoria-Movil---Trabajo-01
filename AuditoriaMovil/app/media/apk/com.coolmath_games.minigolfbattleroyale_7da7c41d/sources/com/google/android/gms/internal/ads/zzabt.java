package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabt extends zzzn<Integer, Long> {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;
    public Long zzf;
    public Long zzg;
    public Long zzh;
    public Long zzi;
    public Long zzj;
    public Long zzk;

    public zzabt() {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Long> zza() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        hashMap.put(5, this.zzf);
        hashMap.put(6, this.zzg);
        hashMap.put(7, this.zzh);
        hashMap.put(8, this.zzi);
        hashMap.put(9, this.zzj);
        hashMap.put(10, this.zzk);
        return hashMap;
    }

    public zzabt(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
            this.zzc = (Long) zzb.get(2);
            this.zzd = (Long) zzb.get(3);
            this.zze = (Long) zzb.get(4);
            this.zzf = (Long) zzb.get(5);
            this.zzg = (Long) zzb.get(6);
            this.zzh = (Long) zzb.get(7);
            this.zzi = (Long) zzb.get(8);
            this.zzj = (Long) zzb.get(9);
            this.zzk = (Long) zzb.get(10);
        }
    }
}
