package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzlu extends zzpa {
    public zzlu() {
        super(zzsk.class, new zzls(zzjt.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i, int i2, int i3) {
        zzsm zzc = zzsn.zzc();
        zzc.zza(i);
        zzsp zzc2 = zzsq.zzc();
        zzc2.zza(16);
        zzc.zzb((zzsq) zzc2.zzan());
        return new zzoy((zzsn) zzc.zzan(), i3);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzlt(this, zzsn.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzsk.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzsk zzskVar = (zzsk) zzaefVar;
        zzys.zzb(zzskVar.zza(), 0);
        zzys.zza(zzskVar.zzg().zzd());
        if (zzskVar.zzf().zza() != 12 && zzskVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
