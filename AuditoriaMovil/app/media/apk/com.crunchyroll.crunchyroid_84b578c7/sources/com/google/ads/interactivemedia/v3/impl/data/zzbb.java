package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.m80.a;
import com.google.ads.interactivemedia.v3.internal.zzqy;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@zzqy(zza = zzx.class)
/* loaded from: classes2.dex */
public abstract class zzbb {
    public abstract String alternateText();

    public abstract String creativeType();

    public abstract int height();

    public abstract String imageUrl();

    public final String toString() {
        int width = width();
        int height = height();
        String imageUrl = imageUrl();
        String alternateText = alternateText();
        String creativeType = creativeType();
        StringBuilder a = x.a("IconClickFallbackImageMsgData [width=", width, ", height=", height, ", imageUrl=");
        a.c(a, imageUrl, ", alternateText=", alternateText, ", creativeType=");
        return b.c(a, creativeType, "]");
    }

    public abstract int width();
}
