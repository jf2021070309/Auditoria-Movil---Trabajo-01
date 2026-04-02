package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzmc extends zzoz {
    final /* synthetic */ zzmd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmc(zzmd zzmdVar, Class cls) {
        super(cls);
        this.zza = zzmdVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzto zztoVar = (zzto) zzaefVar;
        zztk zzc = zztl.zzc();
        zzc.zzb(0);
        zzc.zza(zzaby.zzn(zzyq.zza(32)));
        return (zztl) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzto.zzd(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzoy(zzto.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzoy(zzto.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzto zztoVar = (zzto) zzaefVar;
    }
}
