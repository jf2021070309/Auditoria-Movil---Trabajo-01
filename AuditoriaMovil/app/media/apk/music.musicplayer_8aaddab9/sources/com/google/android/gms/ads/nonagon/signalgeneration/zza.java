package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zza extends LinkedHashMap<String, Pair<Long, String>> {
    public final /* synthetic */ zzb zza;

    public zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        int i2;
        int size = size();
        i2 = this.zza.zza;
        return size > i2;
    }
}
