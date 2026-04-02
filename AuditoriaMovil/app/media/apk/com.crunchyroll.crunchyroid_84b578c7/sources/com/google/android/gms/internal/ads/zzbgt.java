package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgt extends zzbfy {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbgt(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zze(zzbgi zzbgiVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbgj(zzbgiVar));
    }
}
