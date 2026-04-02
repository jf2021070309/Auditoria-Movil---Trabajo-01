package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfvd extends zzftu<zzfym> {
    public zzfvd() {
        super(zzfym.class, new zzfvb(zzftg.class));
    }

    public static /* synthetic */ zzftr<zzfyp> zzk(int i2, int i3) {
        zzfyo zzd = zzfyp.zzd();
        zzd.zza(i2);
        return new zzftr<>(zzd.zzah(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzfym zzc(zzgex zzgexVar) throws zzggm {
        return zzfym.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzfym zzfymVar) throws GeneralSecurityException {
        zzfym zzfymVar2 = zzfymVar;
        zzgdu.zzb(zzfymVar2.zza(), 0);
        zzgdu.zza(zzfymVar2.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<?, zzfym> zzh() {
        return new zzfvc(this, zzfyp.class);
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
