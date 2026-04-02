package com.google.android.gms.internal.ads;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzrb implements zzqz {
    private final int zza;
    private final int zzb;
    private final zzamf zzc;

    public zzrb(zzqw zzqwVar, zzafv zzafvVar) {
        zzamf zzamfVar = zzqwVar.zza;
        this.zzc = zzamfVar;
        zzamfVar.zzh(12);
        int zzB = zzamfVar.zzB();
        if ("audio/raw".equals(zzafvVar.zzl)) {
            int zzS = zzamq.zzS(zzafvVar.zzA, zzafvVar.zzy);
            if (zzB == 0 || zzB % zzS != 0) {
                Log.w("AtomParsers", a.S(88, "Audio sample size mismatch. stsd sample size: ", zzS, ", stsz sample size: ", zzB));
                zzB = zzS;
            }
        }
        this.zza = zzB == 0 ? -1 : zzB;
        this.zzb = zzamfVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzc() {
        int i2 = this.zza;
        return i2 == -1 ? this.zzc.zzB() : i2;
    }
}
