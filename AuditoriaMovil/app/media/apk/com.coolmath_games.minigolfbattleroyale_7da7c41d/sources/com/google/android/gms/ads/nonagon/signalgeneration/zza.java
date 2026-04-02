package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zza extends LinkedHashMap<String, Pair<Long, String>> {
    final /* synthetic */ zzb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        int i;
        int size = size();
        i = this.zza.zza;
        return size > i;
    }
}
