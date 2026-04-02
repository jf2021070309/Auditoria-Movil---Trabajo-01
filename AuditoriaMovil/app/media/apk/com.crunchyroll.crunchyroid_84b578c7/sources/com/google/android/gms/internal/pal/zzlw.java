package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzlw extends zzoz {
    final /* synthetic */ zzlx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzlx zzlxVar, Class cls) {
        super(cls);
        this.zza = zzlxVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzss zzc = zzst.zzc();
        zzc.zza(zzaby.zzn(zzyq.zza(((zzsw) zzaefVar).zza())));
        zzc.zzb(0);
        return (zzst) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzsw.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzlx.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzlx.zzg(16, 3));
        hashMap.put("AES256_GCM", zzlx.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzlx.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzys.zza(((zzsw) zzaefVar).zza());
    }
}
