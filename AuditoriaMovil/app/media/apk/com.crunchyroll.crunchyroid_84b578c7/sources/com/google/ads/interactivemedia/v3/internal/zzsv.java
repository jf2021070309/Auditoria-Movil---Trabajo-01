package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzsv extends zzss {
    final /* synthetic */ zzsw zza;

    public zzsv(zzsw zzswVar) {
        this.zza = zzswVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zztw zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzss
    public final zzsr zzh() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    public final zzso zzk() {
        return new zzsu(this);
    }
}
