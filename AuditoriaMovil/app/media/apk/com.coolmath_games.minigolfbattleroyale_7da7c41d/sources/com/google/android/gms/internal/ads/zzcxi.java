package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcxi<AdT> implements zzcxj<AdT> {
    private final Map<String, zzeec<AdT>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxi(Map<String, zzeec<AdT>> map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final zzeec<AdT> zza(int i, String str) {
        return this.zza.get(str);
    }
}
