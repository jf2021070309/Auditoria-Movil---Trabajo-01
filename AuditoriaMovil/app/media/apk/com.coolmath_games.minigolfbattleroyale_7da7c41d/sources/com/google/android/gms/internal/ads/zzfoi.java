package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfoi extends zzfoj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfoj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoi(zzfoj zzfojVar, int i, int i2) {
        this.zzc = zzfojVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzflx.zze(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfoe
    @CheckForNull
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final zzfoj zzh(int i, int i2) {
        zzflx.zzg(i, i2, this.zzb);
        zzfoj zzfojVar = this.zzc;
        int i3 = this.zza;
        return zzfojVar.subList(i + i3, i2 + i3);
    }
}
