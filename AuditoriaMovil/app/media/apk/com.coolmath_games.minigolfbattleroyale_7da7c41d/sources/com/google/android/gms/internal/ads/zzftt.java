package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzftt<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zza;

    public zzftt(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zzb(KeyT keyt) throws GeneralSecurityException;
}
