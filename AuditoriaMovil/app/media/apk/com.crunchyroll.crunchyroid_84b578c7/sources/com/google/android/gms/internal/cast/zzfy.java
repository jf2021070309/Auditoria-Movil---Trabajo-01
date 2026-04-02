package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzfy extends zzfq {
    final /* synthetic */ zzfz zza;

    public zzfy(zzfz zzfzVar) {
        this.zza = zzfzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzez.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzfz zzfzVar = this.zza;
        objArr = zzfzVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfzVar.zzb;
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

    @Override // com.google.android.gms.internal.cast.zzfm
    public final boolean zzf() {
        return true;
    }
}
