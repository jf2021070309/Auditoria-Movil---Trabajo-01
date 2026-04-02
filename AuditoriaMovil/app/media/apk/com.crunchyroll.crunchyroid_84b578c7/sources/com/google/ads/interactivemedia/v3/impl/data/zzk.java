package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzst;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzk extends zzd {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final zzso<String> mimeTypes;
    private final double playAdsAfterTime;
    private final zzst<UiElement> uiElements;

    private zzk(int i, zzso<String> zzsoVar, zzst<UiElement> zzstVar, boolean z, boolean z2, double d, boolean z3, int i2) {
        this.bitrate = i;
        this.mimeTypes = zzsoVar;
        this.uiElements = zzstVar;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d;
        this.disableUi = z3;
        this.loadVideoTimeout = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        zzso<String> zzsoVar;
        zzst<UiElement> zzstVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.bitrate == zzdVar.bitrate() && ((zzsoVar = this.mimeTypes) != null ? zzsoVar.equals(zzdVar.mimeTypes()) : zzdVar.mimeTypes() == null) && ((zzstVar = this.uiElements) != null ? zzstVar.equals(zzdVar.uiElements()) : zzdVar.uiElements() == null) && this.enablePreloading == zzdVar.enablePreloading() && this.enableFocusSkipButton == zzdVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(zzdVar.playAdsAfterTime()) && this.disableUi == zzdVar.disableUi() && this.loadVideoTimeout == zzdVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3 = this.bitrate ^ 1000003;
        zzso<String> zzsoVar = this.mimeTypes;
        int i4 = 0;
        if (zzsoVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzsoVar.hashCode();
        }
        int i5 = ((i3 * 1000003) ^ hashCode) * 1000003;
        zzst<UiElement> zzstVar = this.uiElements;
        if (zzstVar != null) {
            i4 = zzstVar.hashCode();
        }
        int i6 = (i5 ^ i4) * 1000003;
        int i7 = 1237;
        if (true != this.enablePreloading) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i8 = (i6 ^ i) * 1000003;
        if (true != this.enableFocusSkipButton) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int doubleToLongBits = (((i8 ^ i2) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003;
        if (true == this.disableUi) {
            i7 = 1231;
        }
        return ((doubleToLongBits ^ i7) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public zzso<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    public String toString() {
        int i = this.bitrate;
        String valueOf = String.valueOf(this.mimeTypes);
        String valueOf2 = String.valueOf(this.uiElements);
        boolean z = this.enablePreloading;
        boolean z2 = this.enableFocusSkipButton;
        double d = this.playAdsAfterTime;
        boolean z3 = this.disableUi;
        int i2 = this.loadVideoTimeout;
        return "AdsRenderingSettingsData{bitrate=" + i + ", mimeTypes=" + valueOf + ", uiElements=" + valueOf2 + ", enablePreloading=" + z + ", enableFocusSkipButton=" + z2 + ", playAdsAfterTime=" + d + ", disableUi=" + z3 + ", loadVideoTimeout=" + i2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public zzst<UiElement> uiElements() {
        return this.uiElements;
    }
}
