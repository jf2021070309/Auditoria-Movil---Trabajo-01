package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzoi extends zzpr {
    public zzoi() {
        super(zzvg.class, zzvj.class, new zzog(zzjx.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i, int i2, int i3, int i4) {
        zzvc zza = zzvd.zza();
        zza.zzc(i);
        zza.zzb(i2);
        zza.zza(i3);
        zzuz zza2 = zzva.zza();
        zza2.zza((zzvd) zza.zzan());
        return new zzoy((zzva) zza2.zzan(), i4);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzoh(this, zzva.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzvg.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzvg zzvgVar = (zzvg) zzaefVar;
        if (!zzvgVar.zzg().zzs()) {
            if (zzvgVar.zzk()) {
                zzys.zzb(zzvgVar.zza(), 0);
                zzol.zza(zzvgVar.zzf().zzc());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }
}
