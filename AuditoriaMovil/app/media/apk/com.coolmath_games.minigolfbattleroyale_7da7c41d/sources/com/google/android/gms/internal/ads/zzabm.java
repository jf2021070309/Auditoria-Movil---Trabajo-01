package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabm extends zzzn<Integer, Long> {
    public Long zza;
    public Long zzb;

    public zzabm() {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Long> zza() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzabm(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
        }
    }
}
