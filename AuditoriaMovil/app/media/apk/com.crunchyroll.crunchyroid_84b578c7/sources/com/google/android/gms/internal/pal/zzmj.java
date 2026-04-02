package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzmj extends zzoz {
    final /* synthetic */ zzmk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmj(zzmk zzmkVar, Class cls) {
        super(cls);
        this.zza = zzmkVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzwo zzc = zzwp.zzc();
        zzc.zza((zzws) zzaefVar);
        zzc.zzb(0);
        return (zzwp) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzws.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzws zzwsVar = (zzws) zzaefVar;
        if (!zzwsVar.zzf().isEmpty() && zzwsVar.zzg()) {
            return;
        }
        throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
    }
}
