package com.google.android.gms.internal.measurement;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public enum zzep implements zzkf {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    
    private static final zzkg<zzep> zzf = new zzkg<zzep>() { // from class: com.google.android.gms.internal.measurement.zzen
    };
    private final int zzg;

    zzep(int i) {
        this.zzg = i;
    }

    public static zzep zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BETWEEN;
                    }
                    return EQUAL;
                }
                return GREATER_THAN;
            }
            return LESS_THAN;
        }
        return UNKNOWN_COMPARISON_TYPE;
    }

    public static zzkh zzb() {
        return zzeo.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
    }
}
