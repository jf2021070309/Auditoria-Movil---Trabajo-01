package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
@TargetApi(24)
/* loaded from: classes.dex */
public final class zzapd {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* synthetic */ void zza(zzapd zzapdVar, int i2, int i3) {
        zzapdVar.zzb.set(0, 0);
        zzapdVar.zza.setPattern(zzapdVar.zzb);
    }
}
