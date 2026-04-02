package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgho {
    private static final zzghn zza;
    private static final zzghn zzb;

    static {
        zzghn zzghnVar;
        try {
            zzghnVar = (zzghn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzghnVar = null;
        }
        zza = zzghnVar;
        zzb = new zzghn();
    }

    public static zzghn zza() {
        return zza;
    }

    public static zzghn zzb() {
        return zzb;
    }
}
