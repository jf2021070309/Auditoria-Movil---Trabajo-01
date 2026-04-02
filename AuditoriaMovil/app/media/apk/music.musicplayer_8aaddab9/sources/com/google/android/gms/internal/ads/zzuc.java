package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes.dex */
public final class zzuc {
    private final List<zzafv> zza;
    private final zzox[] zzb;

    public zzuc(List<zzafv> list) {
        this.zza = list;
        this.zzb = new zzox[list.size()];
    }

    public final void zza(zznx zznxVar, zzun zzunVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzunVar.zza();
            zzox zzB = zznxVar.zzB(zzunVar.zzb(), 3);
            zzafv zzafvVar = this.zza.get(i2);
            String str = zzafvVar.zzl;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            zzakt.zzb(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = zzafvVar.zza;
            if (str2 == null) {
                str2 = zzunVar.zzc();
            }
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzD(str2);
            zzaftVar.zzN(str);
            zzaftVar.zzH(zzafvVar.zzd);
            zzaftVar.zzG(zzafvVar.zzc);
            zzaftVar.zzaf(zzafvVar.zzD);
            zzaftVar.zzP(zzafvVar.zzn);
            zzB.zzs(zzaftVar.zzah());
            this.zzb[i2] = zzB;
        }
    }

    public final void zzb(long j2, zzamf zzamfVar) {
        zznm.zza(j2, zzamfVar, this.zzb);
    }
}
