package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zznk extends zzpr {
    private static final byte[] zza = new byte[0];

    public zznk() {
        super(zzuc.class, zzuf.class, new zzni(zzjx.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzh(int i, int i2, int i3, zzkk zzkkVar, byte[] bArr, int i4) {
        zztv zza2 = zztw.zza();
        zzuh zza3 = zzui.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzaby.zzn(bArr));
        zzui zzuiVar = (zzui) zza3.zzan();
        zzvs zza4 = zzvt.zza();
        zza4.zza(zzkkVar.zza());
        zza4.zzb(zzaby.zzn(zzkkVar.zzb()));
        int zzc = zzkkVar.zzc() - 1;
        if (zzc != 0) {
            if (zzc != 1) {
                if (zzc != 2) {
                    i5 = 6;
                } else {
                    i5 = 5;
                }
            }
        } else {
            i5 = 3;
        }
        zza4.zzc(i5);
        zzts zza5 = zztt.zza();
        zza5.zza((zzvt) zza4.zzan());
        zzty zzc2 = zztz.zzc();
        zzc2.zzb(zzuiVar);
        zzc2.zza((zztt) zza5.zzan());
        zzc2.zzc(i3);
        zza2.zza((zztz) zzc2.zzan());
        return new zzoy((zztw) zza2.zzan(), i4);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zznj(this, zztw.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzuc.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzuc zzucVar = (zzuc) zzaefVar;
        if (!zzucVar.zzg().zzs()) {
            zzys.zzb(zzucVar.zza(), 0);
            zznt.zza(zzucVar.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
