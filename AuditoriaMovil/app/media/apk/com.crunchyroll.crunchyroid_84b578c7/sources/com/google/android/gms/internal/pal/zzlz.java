package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzlz extends zzoz {
    final /* synthetic */ zzma zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlz(zzma zzmaVar, Class cls) {
        super(cls);
        this.zza = zzmaVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzsy zzc = zzsz.zzc();
        zzc.zza(zzaby.zzn(zzyq.zza(((zztc) zzaefVar).zza())));
        zzc.zzb(0);
        return (zzsz) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zztc.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzma.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzma.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzma.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzma.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzys.zza(((zztc) zzaefVar).zza());
    }
}
