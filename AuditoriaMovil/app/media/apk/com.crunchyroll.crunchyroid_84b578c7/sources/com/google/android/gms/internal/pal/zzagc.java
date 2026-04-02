package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzagc extends zzagf {
    public static final zzagc zza = new zzagc(0);

    public zzagc(long j) {
        super(j);
    }

    public static zzagc zza(long j) {
        if (j == 0) {
            return zza;
        }
        return new zzagc(j);
    }

    public static zzagc zzb(long j) {
        return new zzagc(zzagg.zza(j, 3600000));
    }

    public static zzagc zzc(long j) {
        return new zzagc(zzagg.zza(j, 1000));
    }
}
