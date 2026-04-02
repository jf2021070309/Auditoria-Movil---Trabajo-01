package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabj extends zzzn<Integer, Object> {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzabj() {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Object> zza() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzabj(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Boolean) zzb.get(1);
            this.zzc = (Boolean) zzb.get(2);
        }
    }
}
