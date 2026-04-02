package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.q.c0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqj extends zzqu {
    private final int zza;
    private final zzqi zzb;

    private zzqj(int i, zzqi zzqiVar) {
        this.zza = i;
        this.zzb = zzqiVar;
    }

    public static zzqj zzb(int i, zzqi zzqiVar) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            return new zzqj(i, zzqiVar);
        }
        throw new GeneralSecurityException(c0.a("Invalid tag size for AesCmacParameters: ", i));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        if (zzqjVar.zza() != zza() || zzqjVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String zzqiVar = this.zzb.toString();
        int i = this.zza;
        return "AES-CMAC Parameters (variant: " + zzqiVar + ", " + i + "-byte tags)";
    }

    public final int zza() {
        zzqi zzqiVar = this.zzb;
        if (zzqiVar == zzqi.zzd) {
            return this.zza;
        }
        if (zzqiVar == zzqi.zza || zzqiVar == zzqi.zzb || zzqiVar == zzqi.zzc) {
            return this.zza + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean zzc() {
        if (this.zzb != zzqi.zzd) {
            return true;
        }
        return false;
    }
}
