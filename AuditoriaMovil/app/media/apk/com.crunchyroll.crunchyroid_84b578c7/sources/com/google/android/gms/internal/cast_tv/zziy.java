package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zziy {
    private static final zzix zza;
    private static final zzix zzb;

    static {
        zzix zzixVar;
        try {
            zzixVar = (zzix) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzixVar = null;
        }
        zza = zzixVar;
        zzb = new zzix();
    }

    public static zzix zza() {
        return zza;
    }

    public static zzix zzb() {
        return zzb;
    }
}
