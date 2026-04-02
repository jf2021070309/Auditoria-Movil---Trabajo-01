package com.google.android.gms.internal.cast;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzvf {
    private static final zzvf zza = new zzvf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzvj zzb = new zzup();

    private zzvf() {
    }

    public static zzvf zza() {
        return zza;
    }

    public final zzvi zzb(Class cls) {
        zzty.zzc(cls, "messageType");
        zzvi zzviVar = (zzvi) this.zzc.get(cls);
        if (zzviVar == null) {
            zzviVar = this.zzb.zza(cls);
            zzty.zzc(cls, "messageType");
            zzvi zzviVar2 = (zzvi) this.zzc.putIfAbsent(cls, zzviVar);
            if (zzviVar2 != null) {
                return zzviVar2;
            }
        }
        return zzviVar;
    }
}
