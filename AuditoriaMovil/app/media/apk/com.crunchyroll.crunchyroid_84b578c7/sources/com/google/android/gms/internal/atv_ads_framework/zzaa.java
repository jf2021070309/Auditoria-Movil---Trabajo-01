package com.google.android.gms.internal.atv_ads_framework;

import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzaa extends zzab {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzab zzc;

    public zzaa(zzab zzabVar, int i, int i2) {
        this.zzc = zzabVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzn.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, java.util.List
    /* renamed from: zzh */
    public final zzab subList(int i, int i2) {
        zzn.zzd(i, i2, this.zzb);
        zzab zzabVar = this.zzc;
        int i3 = this.zza;
        return zzabVar.subList(i + i3, i2 + i3);
    }
}
