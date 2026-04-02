package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcyi implements zzfrz<Void> {
    final /* synthetic */ zzcyj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
