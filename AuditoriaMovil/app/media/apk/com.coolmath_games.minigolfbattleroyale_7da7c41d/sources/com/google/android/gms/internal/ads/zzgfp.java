package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgfp {
    private static final zzgfn<?> zza = new zzgfo();
    private static final zzgfn<?> zzb;

    static {
        zzgfn<?> zzgfnVar;
        try {
            zzgfnVar = (zzgfn) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgfnVar = null;
        }
        zzb = zzgfnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgfn<?> zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgfn<?> zzb() {
        zzgfn<?> zzgfnVar = zzb;
        if (zzgfnVar != null) {
            return zzgfnVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
