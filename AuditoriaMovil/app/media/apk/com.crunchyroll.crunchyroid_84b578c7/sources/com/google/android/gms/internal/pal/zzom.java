package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzom implements zzoc {
    private final zznx zza;
    private final int zzb;

    private zzom(zznx zznxVar, int i) {
        this.zza = zznxVar;
        this.zzb = i;
    }

    public static zzom zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return new zzom(new zznx("HmacSha512"), 3);
            }
            return new zzom(new zznx("HmacSha384"), 2);
        }
        return new zzom(new zznx("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final zzod zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair zzc = zzxx.zzc(zzxx.zzk(this.zzb));
        byte[] zzg = zzxx.zzg((ECPrivateKey) zzc.getPrivate(), zzxx.zzj(zzxx.zzk(this.zzb), 1, bArr));
        byte[] zzl = zzxx.zzl(zzxx.zzk(this.zzb).getCurve(), 1, ((ECPublicKey) zzc.getPublic()).getW());
        byte[] zzc2 = zzxo.zzc(zzl, bArr);
        byte[] zzd = zzol.zzd(zzb());
        zznx zznxVar = this.zza;
        return new zzod(zznxVar.zzb(null, zzg, "eae_prk", zzc2, "shared_secret", zzd, zznxVar.zza()), zzl);
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        if (i != 0) {
            if (i != 1) {
                return zzol.zze;
            }
            return zzol.zzd;
        }
        return zzol.zzc;
    }
}
