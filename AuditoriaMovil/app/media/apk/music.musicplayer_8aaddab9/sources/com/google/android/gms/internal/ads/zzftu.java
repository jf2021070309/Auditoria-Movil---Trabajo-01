package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import e.a.d.a.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class zzftu<KeyProtoT extends zzghi> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzftt<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    @SafeVarargs
    public zzftu(Class<KeyProtoT> cls, zzftt<?, KeyProtoT>... zzfttVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 <= 0; i2++) {
            zzftt<?, KeyProtoT> zzfttVar = zzfttVarArr[i2];
            if (hashMap.containsKey(zzfttVar.zza())) {
                String valueOf = String.valueOf(zzfttVar.zza().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(zzfttVar.zza(), zzfttVar);
        }
        this.zzc = zzfttVarArr[0].zza();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public final Class<KeyProtoT> zza() {
        return this.zza;
    }

    public abstract String zzb();

    public abstract KeyProtoT zzc(zzgex zzgexVar) throws zzggm;

    public abstract void zzd(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final <P> P zze(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzftt<?, KeyProtoT> zzfttVar = this.zzb.get(cls);
        if (zzfttVar != null) {
            return (P) zzfttVar.zzb(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(a.s(new StringBuilder(String.valueOf(canonicalName).length() + 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    public final Set<Class<?>> zzf() {
        return this.zzb.keySet();
    }

    public final Class<?> zzg() {
        return this.zzc;
    }

    public zzfts<?, KeyProtoT> zzh() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int zzi();

    public int zzj() {
        return 1;
    }
}
