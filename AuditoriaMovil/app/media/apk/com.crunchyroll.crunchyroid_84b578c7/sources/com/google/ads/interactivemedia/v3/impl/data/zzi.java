package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzst;
import com.google.common.base.Ascii;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzi extends zzc {
    private int bitrate;
    private boolean disableUi;
    private boolean enableFocusSkipButton;
    private boolean enablePreloading;
    private int loadVideoTimeout;
    private zzso<String> mimeTypes;
    private double playAdsAfterTime;
    private byte set$0;
    private zzst<UiElement> uiElements;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzd build() {
        if (this.set$0 != 63) {
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" bitrate");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" enablePreloading");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" enableFocusSkipButton");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" playAdsAfterTime");
            }
            if ((this.set$0 & Ascii.DLE) == 0) {
                sb.append(" disableUi");
            }
            if ((this.set$0 & 32) == 0) {
                sb.append(" loadVideoTimeout");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzk(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout);
    }

    public zzc setBitrate(int i) {
        this.bitrate = i;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setDisableUi(boolean z) {
        this.disableUi = z;
        this.set$0 = (byte) (this.set$0 | Ascii.DLE);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setEnableFocusSkipButton(boolean z) {
        this.enableFocusSkipButton = z;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setEnablePreloading(boolean z) {
        this.enablePreloading = z;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = i;
        this.set$0 = (byte) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setMimeTypes(List<String> list) {
        zzso<String> zzk;
        if (list == null) {
            zzk = null;
        } else {
            zzk = zzso.zzk(list);
        }
        this.mimeTypes = zzk;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = d;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setUiElements(Set<UiElement> set) {
        zzst<UiElement> zzl;
        if (set == null) {
            zzl = null;
        } else {
            zzl = zzst.zzl(set);
        }
        this.uiElements = zzl;
        return this;
    }
}
