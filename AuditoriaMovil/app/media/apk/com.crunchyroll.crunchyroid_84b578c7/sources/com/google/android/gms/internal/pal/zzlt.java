package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzlt extends zzoz {
    final /* synthetic */ zzlu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlt(zzlu zzluVar, Class cls) {
        super(cls);
        this.zza = zzluVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzsn zzsnVar = (zzsn) zzaefVar;
        zzsj zzc = zzsk.zzc();
        zzc.zza(zzaby.zzn(zzyq.zza(zzsnVar.zza())));
        zzc.zzb(zzsnVar.zzf());
        zzc.zzc(0);
        return (zzsk) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzsn.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzlu.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzlu.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzlu.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzlu.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzsn zzsnVar = (zzsn) zzaefVar;
        zzys.zza(zzsnVar.zza());
        if (zzsnVar.zzf().zza() != 12 && zzsnVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
