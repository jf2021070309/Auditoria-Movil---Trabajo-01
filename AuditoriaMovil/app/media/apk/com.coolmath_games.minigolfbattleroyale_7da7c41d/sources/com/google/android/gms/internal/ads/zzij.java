package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzij implements zzhq {
    private final zzai zza;
    private final zzhw zzb;
    private int zzc;
    private final zzku zzd;
    private final zzex zze;

    public zzij(zzai zzaiVar, final zzoa zzoaVar) {
        zzhw zzhwVar = new zzhw(zzoaVar) { // from class: com.google.android.gms.internal.ads.zzii
            private final zzoa zza;

            /* JADX INFO: Access modifiers changed from: package-private */
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

    public final zzij zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzil zzb(zzagk zzagkVar) {
        if (zzagkVar.zzc != null) {
            return new zzil(zzagkVar, this.zza, this.zzb, zzff.zza, this.zzd, this.zzc, null, null);
        }
        throw null;
    }
}
