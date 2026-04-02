package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfwa extends zzftu<zzfyy> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwa() {
        super(zzfyy.class, new zzfvy(zzftj.class));
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzfyy zzc(zzgex zzgexVar) throws zzggm {
        return zzfyy.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzfyy zzfyyVar) throws GeneralSecurityException {
        zzfyy zzfyyVar2 = zzfyyVar;
        zzgdu.zzb(zzfyyVar2.zza(), 0);
        if (zzfyyVar2.zzc().zzc() == 64) {
            return;
        }
        int zzc = zzfyyVar2.zzc().zzc();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(zzc);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<?, zzfyy> zzh() {
        return new zzfvz(this, zzfzb.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }
}
