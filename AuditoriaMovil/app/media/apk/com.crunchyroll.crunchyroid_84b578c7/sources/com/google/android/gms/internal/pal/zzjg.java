package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzjg extends zzjd {
    private final transient zzjc zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzjg(zzjc zzjcVar, Object[] objArr, int i, int i2) {
        this.zza = zzjcVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.pal.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzjd, com.google.android.gms.internal.pal.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.pal.zzjd, com.google.android.gms.internal.pal.zziw
    public final zzjl zzd() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.pal.zzjd
    public final zziz zzg() {
        return new zzjf(this);
    }
}
