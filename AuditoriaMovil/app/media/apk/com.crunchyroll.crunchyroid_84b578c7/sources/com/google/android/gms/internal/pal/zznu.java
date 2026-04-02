package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznu implements zzxr {
    private final String zza;
    private final int zzb;
    private zzst zzc;
    private zzrv zzd;
    private int zze;
    private zztf zzf;

    public zznu(zzvt zzvtVar) throws GeneralSecurityException {
        String zzf = zzvtVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzli.zzb)) {
            try {
                zzsw zze = zzsw.zze(zzvtVar.zze(), zzacm.zza());
                this.zzc = (zzst) zzlf.zzd(zzvtVar);
                this.zzb = zze.zza();
            } catch (zzadi e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zzf.equals(zzli.zza)) {
            try {
                zzry zzd = zzry.zzd(zzvtVar.zze(), zzacm.zza());
                this.zzd = (zzrv) zzlf.zzd(zzvtVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
            } catch (zzadi e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (zzf.equals(zznf.zza)) {
            try {
                zzti zze2 = zzti.zze(zzvtVar.zze(), zzacm.zza());
                this.zzf = (zztf) zzlf.zzd(zzvtVar);
                this.zzb = zze2.zza();
            } catch (zzadi e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzxr
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzxr
    public final zzoq zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.zzb) {
            if (this.zza.equals(zzli.zzb)) {
                zzss zzc = zzst.zzc();
                zzc.zzal(this.zzc);
                zzc.zza(zzaby.zzo(bArr, 0, this.zzb));
                return new zzoq((zzjt) zzlf.zzh(this.zza, (zzst) zzc.zzan(), zzjt.class));
            } else if (this.zza.equals(zzli.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                zzsa zzc2 = zzsb.zzc();
                zzc2.zzal(this.zzd.zzf());
                zzc2.zza(zzaby.zzn(copyOfRange));
                zzuo zzc3 = zzup.zzc();
                zzc3.zzal(this.zzd.zzg());
                zzc3.zza(zzaby.zzn(copyOfRange2));
                zzru zzc4 = zzrv.zzc();
                zzc4.zzc(this.zzd.zza());
                zzc4.zza((zzsb) zzc2.zzan());
                zzc4.zzb((zzup) zzc3.zzan());
                return new zzoq((zzjt) zzlf.zzh(this.zza, (zzrv) zzc4.zzan(), zzjt.class));
            } else if (this.zza.equals(zznf.zza)) {
                zzte zzc5 = zztf.zzc();
                zzc5.zzal(this.zzf);
                zzc5.zza(zzaby.zzo(bArr, 0, this.zzb));
                return new zzoq((zzjw) zzlf.zzh(this.zza, (zztf) zzc5.zzan(), zzjw.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
