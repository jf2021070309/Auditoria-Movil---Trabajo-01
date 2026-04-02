package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzeg {
    public static final zzeg zza = new zzeg(true);
    private static volatile boolean zzb;
    private static volatile zzeg zzc;
    private final Map zzd;

    public zzeg() {
        this.zzd = new HashMap();
    }

    public zzeg(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzeg zza() {
        zzeg zzegVar = zzc;
        if (zzegVar == null) {
            synchronized (zzeg.class) {
                zzegVar = zzc;
                if (zzegVar == null) {
                    zzegVar = zza;
                    zzc = zzegVar;
                }
            }
        }
        return zzegVar;
    }
}
