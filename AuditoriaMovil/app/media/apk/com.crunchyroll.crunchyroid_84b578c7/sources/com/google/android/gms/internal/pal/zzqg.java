package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzqg extends zzoz {
    public zzqg(zzqh zzqhVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzrp zzrpVar = (zzrp) zzaefVar;
        zzrl zzc = zzrm.zzc();
        zzc.zzc(0);
        zzc.zza(zzaby.zzn(zzyq.zza(zzrpVar.zza())));
        zzc.zzb(zzrpVar.zzf());
        return (zzrm) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzrp.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzro zzc = zzrp.zzc();
        zzc.zza(32);
        zzrr zzc2 = zzrs.zzc();
        zzc2.zza(16);
        zzc.zzb((zzrs) zzc2.zzan());
        hashMap.put("AES_CMAC", new zzoy((zzrp) zzc.zzan(), 1));
        zzro zzc3 = zzrp.zzc();
        zzc3.zza(32);
        zzrr zzc4 = zzrs.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzrs) zzc4.zzan());
        hashMap.put("AES256_CMAC", new zzoy((zzrp) zzc3.zzan(), 1));
        zzro zzc5 = zzrp.zzc();
        zzc5.zza(32);
        zzrr zzc6 = zzrs.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzrs) zzc6.zzan());
        hashMap.put("AES256_CMAC_RAW", new zzoy((zzrp) zzc5.zzan(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzrp zzrpVar = (zzrp) zzaefVar;
        zzqh.zzm(zzrpVar.zzf());
        zzqh.zzn(zzrpVar.zza());
    }
}
