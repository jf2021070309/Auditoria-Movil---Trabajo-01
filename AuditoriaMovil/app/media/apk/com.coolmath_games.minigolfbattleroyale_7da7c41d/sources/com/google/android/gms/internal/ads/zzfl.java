package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfl {
    public final zzfo zza;
    public final MediaFormat zzb;
    public final zzafv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzfl(zzfo zzfoVar, MediaFormat mediaFormat, zzafv zzafvVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.zza = zzfoVar;
        this.zzb = mediaFormat;
        this.zzc = zzafvVar;
        this.zzd = surface;
    }

    public static zzfl zza(zzfo zzfoVar, MediaFormat mediaFormat, zzafv zzafvVar, MediaCrypto mediaCrypto) {
        return new zzfl(zzfoVar, mediaFormat, zzafvVar, null, null, 0, false);
    }

    public static zzfl zzb(zzfo zzfoVar, MediaFormat mediaFormat, zzafv zzafvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzfl(zzfoVar, mediaFormat, zzafvVar, surface, null, 0, false);
    }
}
