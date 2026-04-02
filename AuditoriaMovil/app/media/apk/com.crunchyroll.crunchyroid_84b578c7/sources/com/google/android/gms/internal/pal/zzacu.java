package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzacu implements zzaed {
    private static final zzacu zza = new zzacu();

    private zzacu() {
    }

    public static zzacu zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final zzaec zzb(Class cls) {
        if (zzacz.class.isAssignableFrom(cls)) {
            try {
                return (zzaec) zzacz.zzav(cls.asSubclass(zzacz.class)).zzb(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final boolean zzc(Class cls) {
        return zzacz.class.isAssignableFrom(cls);
    }
}
