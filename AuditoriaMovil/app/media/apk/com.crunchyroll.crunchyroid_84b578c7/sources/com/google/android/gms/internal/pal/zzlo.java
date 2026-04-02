package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzlo extends zzpa {
    public zzlo() {
        super(zzrv.class, new zzlm(zzjt.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzsd zzc = zzse.zzc();
        zzsg zzc2 = zzsh.zzc();
        zzc2.zza(16);
        zzc.zzb((zzsh) zzc2.zzan());
        zzc.zza(i);
        zzur zzc3 = zzus.zzc();
        zzuu zzc4 = zzuv.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzuv) zzc4.zzan());
        zzc3.zza(32);
        zzrx zza = zzry.zza();
        zza.zza((zzse) zzc.zzan());
        zza.zzb((zzus) zzc3.zzan());
        return new zzoy((zzry) zza.zzan(), i6);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzln(this, zzry.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzrv.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzrv zzrvVar = (zzrv) zzaefVar;
        zzys.zzb(zzrvVar.zza(), 0);
        new zzlr();
        zzlr.zzh(zzrvVar.zzf());
        new zzqr();
        zzqr.zzh(zzrvVar.zzg());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int zzf() {
        return 2;
    }
}
