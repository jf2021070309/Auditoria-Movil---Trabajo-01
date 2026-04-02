package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzmk extends zzpa {
    public zzmk() {
        super(zzwp.class, new zzmi(zzjt.class));
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzmj(this, zzws.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.REMOTE;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) throws zzadi {
        return zzwp.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) throws GeneralSecurityException {
        zzys.zzb(((zzwp) zzaefVar).zza(), 0);
    }
}
