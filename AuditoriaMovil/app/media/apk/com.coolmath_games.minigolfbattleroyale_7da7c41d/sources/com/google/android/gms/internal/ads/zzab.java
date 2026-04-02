package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzab {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzab zzabVar, int i, int i2) {
        zzabVar.zzb.set(i, i2);
        zzabVar.zza.setPattern(zzabVar.zzb);
    }
}
