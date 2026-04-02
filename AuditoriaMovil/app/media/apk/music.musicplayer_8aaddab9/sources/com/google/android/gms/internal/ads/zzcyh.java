package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class zzcyh implements zzfrz<zzcbj> {
    public final /* synthetic */ zzcyj zza;

    public zzcyh(zzcyj zzcyjVar) {
        this.zza = zzcyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzdgh zzdghVar;
        zzdghVar = this.zza.zzf;
        zzdghVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl zzcbj zzcbjVar) {
        zzdgh zzdghVar;
        zzdghVar = this.zza.zzf;
        zzdghVar.zzn(true);
    }
}
