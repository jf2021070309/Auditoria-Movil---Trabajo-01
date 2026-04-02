package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zztk extends zzst {
    private final transient zzsr zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zztk(zzsr zzsrVar, Object[] objArr, int i, int i2) {
        this.zza = zzsrVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zztw zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    public final zzso zzk() {
        return new zztj(this);
    }
}
