package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzboo extends zzbnu {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzboo(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zze(zzboe zzboeVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbof(zzboeVar));
    }
}
