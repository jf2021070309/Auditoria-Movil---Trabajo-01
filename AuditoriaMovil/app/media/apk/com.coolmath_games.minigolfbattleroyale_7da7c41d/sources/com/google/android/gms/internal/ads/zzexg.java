package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzexg implements zzfln<zzeap, zzexj> {
    final /* synthetic */ zzexk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexg(zzexk zzexkVar) {
        this.zza = zzexkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    @NullableDecl
    public final /* bridge */ /* synthetic */ zzexj apply(@NullableDecl zzeap zzeapVar) {
        zzfcm zze;
        zzexj zzexjVar;
        zzcgt.zzg("", zzeapVar);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzexk zzexkVar = this.zza;
        zze = zzexkVar.zze();
        zzexkVar.zzd = new zzexj(null, zze, null);
        zzexjVar = this.zza.zzd;
        return zzexjVar;
    }
}
