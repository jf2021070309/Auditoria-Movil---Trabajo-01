package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhh {
    public static boolean zza(BaseDisplayContainer baseDisplayContainer, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        int width = baseDisplayContainer.getAdContainer().getWidth();
        int height = baseDisplayContainer.getAdContainer().getHeight();
        if (resizeAndPositionVideoMsgData.x().intValue() >= 0 && resizeAndPositionVideoMsgData.width().intValue() >= 0) {
            if (resizeAndPositionVideoMsgData.width().intValue() + resizeAndPositionVideoMsgData.x().intValue() <= width && resizeAndPositionVideoMsgData.y().intValue() >= 0 && resizeAndPositionVideoMsgData.height().intValue() >= 0) {
                if (resizeAndPositionVideoMsgData.height().intValue() + resizeAndPositionVideoMsgData.y().intValue() <= height) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
