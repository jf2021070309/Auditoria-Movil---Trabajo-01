package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzdao {
    private final Context zza;
    private final zzfar zzb;
    private final Bundle zzc;
    private final zzfam zzd;

    public /* synthetic */ zzdao(zzdam zzdamVar, zzdan zzdanVar) {
        this.zza = zzdam.zza(zzdamVar);
        this.zzb = zzdam.zzb(zzdamVar);
        this.zzc = zzdam.zzc(zzdamVar);
        this.zzd = zzdam.zzd(zzdamVar);
    }

    public final zzdam zza() {
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zza);
        zzdamVar.zzf(this.zzb);
        zzdamVar.zzg(this.zzc);
        return zzdamVar;
    }

    public final zzfar zzb() {
        return this.zzb;
    }

    public final zzfam zzc() {
        return this.zzd;
    }

    public final Bundle zzd() {
        return this.zzc;
    }

    public final Context zze(Context context) {
        return this.zza;
    }
}
