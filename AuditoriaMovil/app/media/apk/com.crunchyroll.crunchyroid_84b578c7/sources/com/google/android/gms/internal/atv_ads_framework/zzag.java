package com.google.android.gms.internal.atv_ads_framework;

import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzag extends zzab {
    static final zzab zza = new zzag(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzag(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzn.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final Object[] zzg() {
        return this.zzb;
    }
}
