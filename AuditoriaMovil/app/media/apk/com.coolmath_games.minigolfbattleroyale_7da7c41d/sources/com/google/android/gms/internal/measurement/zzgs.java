package com.google.android.gms.internal.measurement;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public enum zzgs implements zzkf {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);
    
    private static final zzkg<zzgs> zzf = new zzkg<zzgs>() { // from class: com.google.android.gms.internal.measurement.zzgq
    };
    private final int zzg;

    zzgs(int i) {
        this.zzg = i;
    }

    public static zzgs zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return STATEMENT;
                    }
                    return BOOLEAN;
                }
                return NUMBER;
            }
            return STRING;
        }
        return UNKNOWN;
    }

    public static zzkh zzb() {
        return zzgr.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
    }
}
