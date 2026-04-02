package com.google.ads.interactivemedia.v3.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzti extends zzso {
    static final zzso zza = new zzti(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzti(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzrm.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final Object[] zzg() {
        return this.zzb;
    }
}
