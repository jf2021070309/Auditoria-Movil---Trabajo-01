package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfvt extends zzftu<zzgcb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvt() {
        super(zzgcb.class, new zzfvr(zzftg.class));
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzgcb zzc(zzgex zzgexVar) throws zzggm {
        return zzgcb.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzgcb zzgcbVar) throws GeneralSecurityException {
        zzgcb zzgcbVar2 = zzgcbVar;
        zzgdu.zzb(zzgcbVar2.zza(), 0);
        if (zzgcbVar2.zzc().zzc() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<?, zzgcb> zzh() {
        return new zzfvs(this, zzgce.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }
}
