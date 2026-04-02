package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfpy extends zzfoj<Map.Entry> {
    final /* synthetic */ zzfpz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpy(zzfpz zzfpzVar) {
        this.zza = zzfpzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzflx.zze(i, i2, FirebaseAnalytics.Param.INDEX);
        int i3 = i + i;
        objArr = this.zza.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = this.zza.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        return true;
    }
}
