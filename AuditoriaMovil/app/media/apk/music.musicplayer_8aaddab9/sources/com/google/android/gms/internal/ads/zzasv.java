package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzasv implements zzasr {
    private final zzasr[] zza;
    private final ArrayList<zzasr> zzb;
    private zzasq zzd;
    private zzanx zze;
    private zzasu zzg;
    private final zzanw zzc = new zzanw();
    private int zzf = -1;

    public zzasv(zzasr... zzasrVarArr) {
        this.zza = zzasrVarArr;
        this.zzb = new ArrayList<>(Arrays.asList(zzasrVarArr));
    }

    public static /* synthetic */ void zzf(zzasv zzasvVar, int i2, zzanx zzanxVar, Object obj) {
        zzasu zzasuVar;
        if (zzasvVar.zzg == null) {
            for (int i3 = 0; i3 <= 0; i3++) {
                zzanxVar.zzg(i3, zzasvVar.zzc, false);
            }
            int i4 = zzasvVar.zzf;
            if (i4 == -1) {
                zzasvVar.zzf = 1;
            } else if (i4 != 1) {
                zzasuVar = new zzasu(1);
                zzasvVar.zzg = zzasuVar;
            }
            zzasuVar = null;
            zzasvVar.zzg = zzasuVar;
        }
        if (zzasvVar.zzg != null) {
            return;
        }
        zzasvVar.zzb.remove(zzasvVar.zza[i2]);
        if (i2 == 0) {
            zzasvVar.zze = zzanxVar;
        }
        if (zzasvVar.zzb.isEmpty()) {
            zzasvVar.zzd.zzi(zzasvVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zza(zzanc zzancVar, boolean z, zzasq zzasqVar) {
        this.zzd = zzasqVar;
        int i2 = 0;
        while (true) {
            zzasr[] zzasrVarArr = this.zza;
            if (i2 >= zzasrVarArr.length) {
                return;
            }
            zzasrVarArr[i2].zza(zzancVar, false, new zzast(this, i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzb() throws IOException {
        zzasu zzasuVar = this.zzg;
        if (zzasuVar != null) {
            throw zzasuVar;
        }
        for (zzasr zzasrVar : this.zza) {
            zzasrVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzc(zzasp zzaspVar) {
        zzass zzassVar = (zzass) zzaspVar;
        int i2 = 0;
        while (true) {
            zzasr[] zzasrVarArr = this.zza;
            if (i2 >= zzasrVarArr.length) {
                return;
            }
            zzasrVarArr[i2].zzc(zzassVar.zza[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzd() {
        for (zzasr zzasrVar : this.zza) {
            zzasrVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final zzasp zze(int i2, zzauc zzaucVar) {
        int length = this.zza.length;
        zzasp[] zzaspVarArr = new zzasp[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzaspVarArr[i3] = this.zza[i3].zze(i2, zzaucVar);
        }
        return new zzass(zzaspVarArr);
    }
}
