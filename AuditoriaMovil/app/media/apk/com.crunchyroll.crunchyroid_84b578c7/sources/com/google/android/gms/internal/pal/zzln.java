package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzln extends zzoz {
    final /* synthetic */ zzlo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzln(zzlo zzloVar, Class cls) {
        super(cls);
        this.zza = zzloVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzry zzryVar = (zzry) zzaefVar;
        new zzlr();
        zzsb zzf = zzlq.zzf(zzryVar.zze());
        zzaef zza = new zzqr().zza().zza(zzryVar.zzf());
        zzru zzc = zzrv.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzup) zza);
        zzc.zzc(0);
        return (zzrv) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzry.zzd(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzlo.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzlo.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzlo.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzlo.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzry zzryVar = (zzry) zzaefVar;
        ((zzlq) new zzlr().zza()).zzd(zzryVar.zze());
        new zzqr().zza().zzd(zzryVar.zzf());
        zzys.zza(zzryVar.zze().zza());
    }
}
