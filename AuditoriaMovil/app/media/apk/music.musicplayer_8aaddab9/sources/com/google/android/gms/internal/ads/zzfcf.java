package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzfcf {
    private final zzfce zza = new zzfce();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfce zzf() {
        zzfce clone = this.zza.clone();
        zzfce zzfceVar = this.zza;
        zzfceVar.zza = false;
        zzfceVar.zzb = false;
        return clone;
    }

    public final String zzg() {
        StringBuilder y = a.y("\n\tPool does not exist: ");
        y.append(this.zzd);
        y.append("\n\tNew pools created: ");
        y.append(this.zzb);
        y.append("\n\tPools removed: ");
        y.append(this.zzc);
        y.append("\n\tEntries added: ");
        y.append(this.zzf);
        y.append("\n\tNo entries retrieved: ");
        return a.p(y, this.zze, "\n");
    }
}
