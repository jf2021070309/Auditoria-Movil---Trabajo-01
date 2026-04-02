package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzael {
    private static final zzaek zza;
    private static final zzaek zzb;

    static {
        zzaek zzaekVar;
        try {
            zzaekVar = (zzaek) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaekVar = null;
        }
        zza = zzaekVar;
        zzb = new zzaek();
    }

    public static zzaek zza() {
        return zza;
    }

    public static zzaek zzb() {
        return zzb;
    }
}
