package com.google.android.gms.internal.pal;

import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zziy extends zziz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zziz zzc;

    public zziy(zziz zzizVar, int i, int i2) {
        this.zzc = zzizVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzip.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.pal.zziz, java.util.List
    /* renamed from: zzf */
    public final zziz subList(int i, int i2) {
        zzip.zzc(i, i2, this.zzb);
        zziz zzizVar = this.zzc;
        int i3 = this.zza;
        return zzizVar.subList(i + i3, i2 + i3);
    }
}
