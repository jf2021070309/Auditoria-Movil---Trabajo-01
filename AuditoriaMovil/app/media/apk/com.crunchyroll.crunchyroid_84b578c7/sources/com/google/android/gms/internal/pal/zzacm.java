package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzacm {
    static final zzacm zza = new zzacm(true);
    private static volatile boolean zzb;
    private static volatile zzacm zzc;
    private final Map zzd;

    public zzacm() {
        this.zzd = new HashMap();
    }

    public static zzacm zza() {
        zzacm zzacmVar = zzc;
        if (zzacmVar == null) {
            synchronized (zzacm.class) {
                zzacmVar = zzc;
                if (zzacmVar == null) {
                    zzacmVar = zza;
                    zzc = zzacmVar;
                }
            }
        }
        return zzacmVar;
    }

    public final zzacx zzb(zzaef zzaefVar, int i) {
        return (zzacx) this.zzd.get(new zzacl(zzaefVar, i));
    }

    public zzacm(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
