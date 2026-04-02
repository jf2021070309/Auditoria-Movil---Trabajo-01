package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqr extends zzpa {
    public zzqr() {
        super(zzup.class, new zzqp(zzkq.class));
    }

    public static final void zzh(zzup zzupVar) throws GeneralSecurityException {
        zzys.zzb(zzupVar.zza(), 0);
        if (zzupVar.zzh().zzd() >= 16) {
            zzn(zzupVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static /* bridge */ /* synthetic */ zzoy zzm(int i, int i2, int i3, int i4) {
        zzur zzc = zzus.zzc();
        zzuu zzc2 = zzuv.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzuv) zzc2.zzan());
        zzc.zza(i);
        return new zzoy((zzus) zzc.zzan(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzuv zzuvVar) throws GeneralSecurityException {
        if (zzuvVar.zza() >= 10) {
            int zzg = zzuvVar.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg == 5) {
                                if (zzuvVar.zza() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (zzuvVar.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (zzuvVar.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (zzuvVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (zzuvVar.zza() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzqq(this, zzus.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzup.zzf(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzh((zzup) zzaefVar);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int zzf() {
        return 2;
    }
}
