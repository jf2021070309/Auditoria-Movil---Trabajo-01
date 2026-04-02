package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes.dex */
public final class zzij implements zzhq {
    private final zzai zza;
    private final zzhw zzb;
    private int zzc;
    private final zzku zzd;
    private final zzex zze;

    public zzij(zzai zzaiVar, final zzoa zzoaVar) {
        zzhw zzhwVar = new zzhw(zzoaVar) { // from class: com.google.android.gms.internal.ads.zzii
            private final zzoa zza;

            {
                this.zza = zzoaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzhw
            public final zzhx zza() {
                return new zzgk(this.zza);
            }
        };
        this.zza = zzaiVar;
        this.zzb = zzhwVar;
        this.zze = new zzex();
        this.zzd = new zzku(-1);
        this.zzc = 1048576;
    }

    public final zzij zza(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzil zzb(zzagk zzagkVar) {
        Objects.requireNonNull(zzagkVar.zzc);
        return new zzil(zzagkVar, this.zza, this.zzb, zzff.zza, this.zzd, this.zzc, null, null);
    }
}
