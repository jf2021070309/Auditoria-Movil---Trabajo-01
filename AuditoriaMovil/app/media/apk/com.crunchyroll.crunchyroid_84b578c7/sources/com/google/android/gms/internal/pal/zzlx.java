package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzlx extends zzpa {
    public zzlx() {
        super(zzst.class, new zzlv(zzjt.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i, int i2) {
        zzsv zzc = zzsw.zzc();
        zzc.zza(i);
        return new zzoy((zzsw) zzc.zzan(), i2);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzlw(this, zzsw.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzst.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzst zzstVar = (zzst) zzaefVar;
        zzys.zzb(zzstVar.zza(), 0);
        zzys.zza(zzstVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int zzf() {
        return 2;
    }
}
