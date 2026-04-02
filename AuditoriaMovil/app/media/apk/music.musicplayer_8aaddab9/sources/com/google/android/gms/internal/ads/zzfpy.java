package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzfpy extends zzfoj<Map.Entry> {
    public final /* synthetic */ zzfpz zza;

    public zzfpy(zzfpz zzfpzVar) {
        this.zza = zzfpzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3;
        Object[] objArr;
        Object[] objArr2;
        i3 = this.zza.zzc;
        zzflx.zze(i2, i3, "index");
        int i4 = i2 + i2;
        objArr = this.zza.zzb;
        Object obj = objArr[i4];
        obj.getClass();
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i4 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i2;
        i2 = this.zza.zzc;
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        return true;
    }
}
