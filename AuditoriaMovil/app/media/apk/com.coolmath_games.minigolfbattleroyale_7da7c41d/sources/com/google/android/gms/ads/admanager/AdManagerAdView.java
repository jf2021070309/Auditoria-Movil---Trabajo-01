package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbfn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zze();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzg();
    }

    public VideoController getVideoController() {
        return this.zza.zzw();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzz();
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        this.zza.zzh(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzj();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzo(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzq(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzr(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    public final boolean zza(zzbfn zzbfnVar) {
        return this.zza.zzA(zzbfnVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
