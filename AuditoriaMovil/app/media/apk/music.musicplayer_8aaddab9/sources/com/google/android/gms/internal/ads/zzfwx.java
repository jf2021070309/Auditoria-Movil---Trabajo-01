package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfwx extends zzftu<zzgai> {
    public zzfwx() {
        super(zzgai.class, new zzfwv(zzfty.class));
    }

    public static final void zzl(zzgai zzgaiVar) throws GeneralSecurityException {
        zzgdu.zzb(zzgaiVar.zza(), 0);
        if (zzgaiVar.zzd().zzc() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzn(zzgaiVar.zzc());
    }

    public static /* synthetic */ zzftr<zzgal> zzm(int i2, int i3, int i4, int i5) {
        zzgak zze = zzgal.zze();
        zzgan zzc = zzgao.zzc();
        zzc.zzb(i4);
        zzc.zza(i3);
        zze.zza(zzc.zzah());
        zze.zzb(i2);
        return new zzftr<>(zze.zzah(), i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgao zzgaoVar) throws GeneralSecurityException {
        if (zzgaoVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzgaoVar.zzg() - 2;
        if (zzg == 1) {
            if (zzgaoVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 2) {
            if (zzgaoVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 3) {
            if (zzgaoVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzgaoVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (zzgaoVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzgai zzc(zzgex zzgexVar) throws zzggm {
        return zzgai.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzgai zzgaiVar) throws GeneralSecurityException {
        zzl(zzgaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<?, zzgai> zzh() {
        return new zzfww(this, zzgal.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzj() {
        return 2;
    }
}
