package com.google.android.gms.internal.pal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzjf extends zziz {
    final /* synthetic */ zzjg zza;

    public zzjf(zzjg zzjgVar) {
        this.zza = zzjgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzip.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzjg zzjgVar = this.zza;
        int i3 = i + i;
        objArr = zzjgVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzjgVar.zzb;
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
}
