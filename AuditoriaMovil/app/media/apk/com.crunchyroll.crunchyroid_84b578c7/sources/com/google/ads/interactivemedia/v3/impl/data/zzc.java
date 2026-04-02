package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzc {
    public abstract zzd build();

    public abstract zzc setDisableUi(boolean z);

    public abstract zzc setEnableFocusSkipButton(boolean z);

    public abstract zzc setEnablePreloading(boolean z);

    public abstract zzc setLoadVideoTimeout(int i);

    public abstract zzc setMimeTypes(List<String> list);

    public abstract zzc setPlayAdsAfterTime(double d);

    public abstract zzc setUiElements(Set<UiElement> set);
}
