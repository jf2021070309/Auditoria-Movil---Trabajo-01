package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbrf extends zzbfy {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbrf(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zze(zzbgi zzbgiVar) {
        this.zza.onNativeAdLoaded(new zzbqy(zzbgiVar));
    }
}
