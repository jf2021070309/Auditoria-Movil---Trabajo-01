package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzhk {
    private static final zzhi zza = new zzhj();
    private static final zzhi zzb;

    static {
        zzhi zzhiVar;
        try {
            zzhiVar = (zzhi) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhiVar = null;
        }
        zzb = zzhiVar;
    }

    public static zzhi zza() {
        zzhi zzhiVar = zzb;
        if (zzhiVar != null) {
            return zzhiVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzhi zzb() {
        return zza;
    }
}
