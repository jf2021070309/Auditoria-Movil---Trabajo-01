package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgfv implements zzghg {
    private static final zzgfv zza = new zzgfv();

    private zzgfv() {
    }

    public static zzgfv zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final boolean zzb(Class<?> cls) {
        return zzgga.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final zzghf zzc(Class<?> cls) {
        if (!zzgga.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzghf) zzgga.zzax(cls.asSubclass(zzgga.class)).zzb(3, null, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
