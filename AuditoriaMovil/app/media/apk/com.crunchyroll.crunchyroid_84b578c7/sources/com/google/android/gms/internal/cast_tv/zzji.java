package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzji {
    private static final zzjh zza;
    private static final zzjh zzb;

    static {
        zzjh zzjhVar;
        try {
            zzjhVar = (zzjh) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjhVar = null;
        }
        zza = zzjhVar;
        zzb = new zzjh();
    }

    public static zzjh zza() {
        return zza;
    }

    public static zzjh zzb() {
        return zzb;
    }
}
