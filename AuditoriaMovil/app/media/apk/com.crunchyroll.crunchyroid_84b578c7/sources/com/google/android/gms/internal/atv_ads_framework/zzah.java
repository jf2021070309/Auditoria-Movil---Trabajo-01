package com.google.android.gms.internal.atv_ads_framework;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzah extends zzab {
    final /* synthetic */ zzai zza;

    public zzah(zzai zzaiVar) {
        this.zza = zzaiVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzn.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzai zzaiVar = this.zza;
        objArr = zzaiVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzaiVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return true;
    }
}
