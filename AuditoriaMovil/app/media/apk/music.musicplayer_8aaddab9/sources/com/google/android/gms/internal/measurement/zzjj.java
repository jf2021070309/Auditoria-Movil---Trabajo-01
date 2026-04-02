package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzjj {
    public static final zzjj zza = new zzjj(true);
    private static volatile boolean zzb;
    private static volatile zzjj zzc;
    private static volatile zzjj zzd;
    private final Map<zzji, zzjv<?, ?>> zze;

    public zzjj() {
        this.zze = new HashMap();
    }

    public zzjj(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzjj zza() {
        zzjj zzjjVar = zzc;
        if (zzjjVar == null) {
            synchronized (zzjj.class) {
                zzjjVar = zzc;
                if (zzjjVar == null) {
                    zzjjVar = zza;
                    zzc = zzjjVar;
                }
            }
        }
        return zzjjVar;
    }

    public static zzjj zzb() {
        zzjj zzjjVar = zzd;
        if (zzjjVar != null) {
            return zzjjVar;
        }
        synchronized (zzjj.class) {
            zzjj zzjjVar2 = zzd;
            if (zzjjVar2 != null) {
                return zzjjVar2;
            }
            zzjj zzb2 = zzjr.zzb(zzjj.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final <ContainingType extends zzlc> zzjv<ContainingType, ?> zzc(ContainingType containingtype, int i2) {
        return (zzjv<ContainingType, ?>) this.zze.get(new zzji(containingtype, i2));
    }
}
