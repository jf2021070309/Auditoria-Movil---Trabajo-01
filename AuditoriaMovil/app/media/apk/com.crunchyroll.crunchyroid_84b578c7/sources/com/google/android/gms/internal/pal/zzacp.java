package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzacp {
    private static final zzacn zza = new zzaco();
    private static final zzacn zzb;

    static {
        zzacn zzacnVar;
        try {
            zzacnVar = (zzacn) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzacnVar = null;
        }
        zzb = zzacnVar;
    }

    public static zzacn zza() {
        zzacn zzacnVar = zzb;
        if (zzacnVar != null) {
            return zzacnVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzacn zzb() {
        return zza;
    }
}
