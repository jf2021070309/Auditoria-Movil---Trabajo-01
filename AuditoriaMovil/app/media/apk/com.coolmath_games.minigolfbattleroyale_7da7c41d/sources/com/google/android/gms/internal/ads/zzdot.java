package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdot implements zzfln<zzvy, Bitmap> {
    final /* synthetic */ double zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzdou zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdot(zzdou zzdouVar, double d, boolean z) {
        this.zzc = zzdouVar;
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final /* bridge */ /* synthetic */ Bitmap apply(zzvy zzvyVar) {
        return zzdou.zzb(this.zzc, zzvyVar.zzb, this.zza, this.zzb);
    }
}
