package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;
/* loaded from: classes.dex */
public final class zzetx {
    private final zzcbj zza;
    private final int zzb;

    public zzetx(zzcbj zzcbjVar, int i2) {
        this.zza = zzcbjVar;
        this.zzb = i2;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return this.zza.zza.getString("ms");
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List<String> zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final boolean zzg() {
        return this.zza.zza.getBoolean("is_gbid");
    }
}
