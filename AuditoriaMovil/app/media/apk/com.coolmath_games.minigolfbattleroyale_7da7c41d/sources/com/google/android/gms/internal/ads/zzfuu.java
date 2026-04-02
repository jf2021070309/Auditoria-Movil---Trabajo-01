package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfuu extends zzftu<zzfxo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuu() {
        super(zzfxo.class, new zzfus(zzftg.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzftr<zzfxr> zzk(int i, int i2, int i3, int i4, int i5, int i6) {
        zzfxw zze = zzfxx.zze();
        zzfxz zzc = zzfya.zzc();
        zzc.zza(16);
        zze.zza(zzc.zzah());
        zze.zzb(i);
        zzgak zze2 = zzgal.zze();
        zzgan zzc2 = zzgao.zzc();
        zzc2.zzb(5);
        zzc2.zza(i4);
        zze2.zza(zzc2.zzah());
        zze2.zzb(32);
        zzfxq zze3 = zzfxr.zze();
        zze3.zza(zze.zzah());
        zze3.zzb(zze2.zzah());
        return new zzftr<>(zze3.zzah(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzfxo zzc(zzgex zzgexVar) throws zzggm {
        return zzfxo.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzfxo zzfxoVar) throws GeneralSecurityException {
        zzfxo zzfxoVar2 = zzfxoVar;
        zzgdu.zzb(zzfxoVar2.zza(), 0);
        new zzfux();
        zzfux.zzl(zzfxoVar2.zzc());
        new zzfwx();
        zzfwx.zzl(zzfxoVar2.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<?, zzfxo> zzh() {
        return new zzfut(this, zzfxr.class);
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
