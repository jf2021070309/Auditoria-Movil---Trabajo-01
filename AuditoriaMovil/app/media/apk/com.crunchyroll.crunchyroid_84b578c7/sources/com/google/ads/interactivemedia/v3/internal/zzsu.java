package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzsu extends zzso {
    final /* synthetic */ zzsv zza;

    public zzsu(zzsv zzsvVar) {
        this.zza = zzsvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zztp zztpVar;
        zzso zzsoVar;
        zztpVar = this.zza.zza.zzc;
        E e = zztpVar.zzd.get(i);
        zzsoVar = this.zza.zza.zzd;
        return new AbstractMap.SimpleImmutableEntry(e, zzsoVar.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }
}
