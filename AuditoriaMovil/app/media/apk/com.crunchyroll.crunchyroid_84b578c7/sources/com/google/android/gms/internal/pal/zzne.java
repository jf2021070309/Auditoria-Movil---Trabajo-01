package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.c80.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzne extends zzpa {
    public zzne() {
        super(zztf.class, new zznc(zzjw.class));
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zznd(this, zzti.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zztf.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zztf zztfVar = (zztf) zzaefVar;
        zzys.zzb(zztfVar.zza(), 0);
        if (zztfVar.zzf().zzd() == 64) {
            return;
        }
        throw new InvalidKeyException(a.d("invalid key size: ", zztfVar.zzf().zzd(), ". Valid keys must have 64 bytes."));
    }
}
