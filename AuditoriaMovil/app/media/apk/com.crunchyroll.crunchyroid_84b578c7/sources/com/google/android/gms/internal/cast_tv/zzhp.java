package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzhp implements zzja {
    private static final zzhp zza = new zzhp();

    private zzhp() {
    }

    public static zzhp zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzja
    public final zziz zzb(Class cls) {
        if (zzht.class.isAssignableFrom(cls)) {
            try {
                return (zziz) zzht.zzr(cls.asSubclass(zzht.class)).zzi(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzja
    public final boolean zzc(Class cls) {
        return zzht.class.isAssignableFrom(cls);
    }
}
