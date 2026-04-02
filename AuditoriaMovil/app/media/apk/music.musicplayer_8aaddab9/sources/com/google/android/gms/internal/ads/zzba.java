package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzba {
    public final String zza;
    public final zzafv zzb;
    public final zzafv zzc;
    public final int zzd;
    public final int zze;

    public zzba(String str, zzafv zzafvVar, zzafv zzafvVar2, int i2, int i3) {
        boolean z = false;
        if (i2 != 0) {
            i3 = i3 == 0 ? 0 : i3;
            zzakt.zza(z);
            zzakt.zzf(str);
            this.zza = str;
            Objects.requireNonNull(zzafvVar);
            this.zzb = zzafvVar;
            Objects.requireNonNull(zzafvVar2);
            this.zzc = zzafvVar2;
            this.zzd = i2;
            this.zze = i3;
        }
        z = true;
        zzakt.zza(z);
        zzakt.zzf(str);
        this.zza = str;
        Objects.requireNonNull(zzafvVar);
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzafvVar2);
        this.zzc = zzafvVar2;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzd == zzbaVar.zzd && this.zze == zzbaVar.zze && this.zza.equals(zzbaVar.zza) && this.zzb.equals(zzbaVar.zzb) && this.zzc.equals(zzbaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = a.x(this.zza, (((this.zzd + 527) * 31) + this.zze) * 31, 31);
        return this.zzc.hashCode() + ((this.zzb.hashCode() + x) * 31);
    }
}
