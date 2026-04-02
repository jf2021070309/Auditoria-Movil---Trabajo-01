package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzpa {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzpa(Class cls, zzpq... zzpqVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzpq zzpqVar = zzpqVarArr[i];
            if (!hashMap.containsKey(zzpqVar.zzb())) {
                hashMap.put(zzpqVar.zzb(), zzpqVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzpqVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzpqVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzoz zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzvn zzb();

    public abstract zzaef zzc(zzaby zzabyVar) throws zzadi;

    public abstract String zzd();

    public abstract void zze(zzaef zzaefVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzaef zzaefVar, Class cls) throws GeneralSecurityException {
        zzpq zzpqVar = (zzpq) this.zzb.get(cls);
        if (zzpqVar != null) {
            return zzpqVar.zza(zzaefVar);
        }
        throw new IllegalArgumentException(e.e("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
