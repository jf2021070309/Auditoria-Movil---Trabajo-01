package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class zzab {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* synthetic */ void zza(zzab zzabVar, int i2, int i3) {
        zzabVar.zzb.set(i2, i3);
        zzabVar.zza.setPattern(zzabVar.zzb);
    }
}
