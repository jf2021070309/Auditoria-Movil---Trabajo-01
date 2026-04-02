package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzcxi<AdT> implements zzcxj<AdT> {
    private final Map<String, zzeec<AdT>> zza;

    public zzcxi(Map<String, zzeec<AdT>> map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final zzeec<AdT> zza(int i2, String str) {
        return this.zza.get(str);
    }
}
