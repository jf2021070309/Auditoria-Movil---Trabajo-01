package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdao {
    private final Context zza;
    private final zzfar zzb;
    private final Bundle zzc;
    private final zzfam zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdao(zzdam zzdamVar, zzdan zzdanVar) {
        this.zza = zzdam.zza(zzdamVar);
        this.zzb = zzdam.zzb(zzdamVar);
        this.zzc = zzdam.zzc(zzdamVar);
        this.zzd = zzdam.zzd(zzdamVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdam zza() {
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zza);
        zzdamVar.zzf(this.zzb);
        zzdamVar.zzg(this.zzc);
        return zzdamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfar zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfam zzc() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zze(Context context) {
        return this.zza;
    }
}
