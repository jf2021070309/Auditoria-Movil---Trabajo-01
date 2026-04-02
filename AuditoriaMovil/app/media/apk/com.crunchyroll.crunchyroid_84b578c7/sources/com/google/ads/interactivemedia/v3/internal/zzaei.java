package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzaei {
    private static final zzaeg zza = new zzaeh();
    private static final zzaeg zzb;

    static {
        zzaeg zzaegVar;
        try {
            zzaegVar = (zzaeg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaegVar = null;
        }
        zzb = zzaegVar;
    }

    public static zzaeg zza() {
        zzaeg zzaegVar = zzb;
        if (zzaegVar != null) {
            return zzaegVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzaeg zzb() {
        return zza;
    }
}
