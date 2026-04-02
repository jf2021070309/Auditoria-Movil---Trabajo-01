package com.google.android.gms.internal.pal;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzdn extends zzbi {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzdn() {
    }

    @Override // com.google.android.gms.internal.pal.zzbi
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzdn(String str) {
        HashMap zza = zzbi.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }
}
