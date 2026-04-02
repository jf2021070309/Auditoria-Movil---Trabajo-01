package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaeb {
    private static final zzaea zza;
    private static final zzaea zzb;

    static {
        zzaea zzaeaVar;
        try {
            zzaeaVar = (zzaea) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaeaVar = null;
        }
        zza = zzaeaVar;
        zzb = new zzaea();
    }

    public static zzaea zza() {
        return zza;
    }

    public static zzaea zzb() {
        return zzb;
    }
}
