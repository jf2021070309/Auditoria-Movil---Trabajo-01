package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
public final class zzfw {
    private static final zzfv zza;
    private static final zzfv zzb;

    static {
        zzfv zzfvVar;
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfvVar = null;
        }
        zza = zzfvVar;
        zzb = new zzfv();
    }

    public static zzfv zza() {
        return zza;
    }

    public static zzfv zzb() {
        return zzb;
    }
}
