package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaay extends zzzn<Integer, Long> {
    public long zza;
    public long zzb;

    public zzaay() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Long> zza() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzaay(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = ((Long) zzb.get(0)).longValue();
            this.zzb = ((Long) zzb.get(1)).longValue();
        }
    }
}
