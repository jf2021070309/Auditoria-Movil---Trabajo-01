package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public enum zzdn implements zzhv {
    UNKNOWN(0),
    REQUESTED_BY_SENDER(1),
    ERROR(2);
    
    private static final zzhw zzd = new zzhw() { // from class: com.google.android.gms.internal.cast_tv.zzdl
    };
    private final int zzf;

    zzdn(int i) {
        this.zzf = i;
    }

    public static zzdn zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ERROR;
            }
            return REQUESTED_BY_SENDER;
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzhv
    public final int zza() {
        return this.zzf;
    }
}
