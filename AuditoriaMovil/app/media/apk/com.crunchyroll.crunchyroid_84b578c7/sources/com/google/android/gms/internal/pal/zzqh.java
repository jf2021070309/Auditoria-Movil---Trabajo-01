package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqh extends zzpa {
    public zzqh() {
        super(zzrm.class, new zzqf(zzkq.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzrs zzrsVar) throws GeneralSecurityException {
        if (zzrsVar.zza() >= 10) {
            if (zzrsVar.zza() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzqg(this, zzrp.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzrm.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzrm zzrmVar = (zzrm) zzaefVar;
        zzys.zzb(zzrmVar.zza(), 0);
        zzn(zzrmVar.zzg().zzd());
        zzm(zzrmVar.zzf());
    }
}
