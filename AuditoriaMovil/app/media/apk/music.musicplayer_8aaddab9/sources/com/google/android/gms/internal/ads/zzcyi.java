package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class zzcyi implements zzfrz<Void> {
    public final /* synthetic */ zzcyj zza;

    public zzcyi(zzcyj zzcyjVar) {
        this.zza = zzcyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzdgh zzdghVar;
        zzdghVar = this.zza.zzf;
        zzdghVar.zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Void r2) {
        zzdgh zzdghVar;
        zzdghVar = this.zza.zzf;
        zzdghVar.zzo(true);
    }
}
