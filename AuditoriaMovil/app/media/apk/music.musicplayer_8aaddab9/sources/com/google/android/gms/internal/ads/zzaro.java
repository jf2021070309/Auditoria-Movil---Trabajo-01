package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* loaded from: classes.dex */
public final class zzaro implements zzarn {
    private zzaro() {
    }

    public /* synthetic */ zzaro(zzarq zzarqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final MediaCodecInfo zzb(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final boolean zzd(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
