package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzof {
    public static zzny zza(zzvd zzvdVar) throws GeneralSecurityException {
        if (zzvdVar.zze() == 3) {
            return new zznv(16);
        }
        if (zzvdVar.zze() == 4) {
            return new zznv(32);
        }
        if (zzvdVar.zze() == 5) {
            return new zznw();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzoc zzb(zzvd zzvdVar) throws GeneralSecurityException {
        if (zzvdVar.zzg() == 3) {
            return new zzoo(new zznx("HmacSha256"));
        }
        if (zzvdVar.zzg() == 4) {
            return zzom.zzc(1);
        }
        if (zzvdVar.zzg() == 5) {
            return zzom.zzc(2);
        }
        if (zzvdVar.zzg() == 6) {
            return zzom.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static zznx zzc(zzvd zzvdVar) {
        if (zzvdVar.zzf() == 3) {
            return new zznx("HmacSha256");
        }
        if (zzvdVar.zzf() == 4) {
            return new zznx("HmacSha384");
        }
        if (zzvdVar.zzf() == 5) {
            return new zznx("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
