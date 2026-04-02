package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zzjs {
    private static final zzjq<?> zza = new zzjr();
    private static final zzjq<?> zzb;

    static {
        zzjq<?> zzjqVar;
        try {
            zzjqVar = (zzjq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjqVar = null;
        }
        zzb = zzjqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjq<?> zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjq<?> zzb() {
        zzjq<?> zzjqVar = zzb;
        if (zzjqVar != null) {
            return zzjqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
