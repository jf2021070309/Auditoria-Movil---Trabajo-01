package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzchk<T> extends zzchl<T> {
    private final T zza;

    private zzchk(T t) {
        this.zza = t;
    }

    public static <T> zzchk<T> zza(T t) {
        return new zzchk<>(t);
    }

    public final void zzb() {
        zzc(this.zza);
    }
}
