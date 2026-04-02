package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztt extends zzst {
    final transient Object zza;

    public zztt(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztb(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return e.e("[", this.zza.toString(), "]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zzso zzd() {
        Object obj = this.zza;
        int i = zzso.zzd;
        Object[] objArr = {obj};
        zztg.zzb(objArr, 1);
        return zzso.zzj(objArr, 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zztw zze() {
        return new zztb(this.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return false;
    }
}
