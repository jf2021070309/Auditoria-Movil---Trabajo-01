package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzmm extends zzoz {
    final /* synthetic */ zzmn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zzmn zzmnVar, Class cls) {
        super(cls);
        this.zza = zzmnVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzxd zzxdVar = (zzxd) zzaefVar;
        zzwz zzc = zzxa.zzc();
        zzc.zzb(0);
        zzc.zza(zzaby.zzn(zzyq.zza(32)));
        return (zzxa) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zzxd.zzd(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzoy(zzxd.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzoy(zzxd.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zzxd zzxdVar = (zzxd) zzaefVar;
    }
}
