package com.google.android.gms.internal.cast;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzev implements Serializable {
    public static zzev zzb() {
        return zzer.zza;
    }

    public static zzev zzc(Object obj) {
        if (obj == null) {
            return zzer.zza;
        }
        return new zzfa(obj);
    }

    public abstract Object zza(Object obj);
}
