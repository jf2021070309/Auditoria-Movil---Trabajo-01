package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfom implements Serializable {
    public static zzfom zzc() {
        return zzfnu.zza;
    }

    public static zzfom zzd(Object obj) {
        if (obj == null) {
            return zzfnu.zza;
        }
        return new zzfov(obj);
    }

    public abstract zzfom zza(zzfoe zzfoeVar);

    public abstract Object zzb(Object obj);
}
