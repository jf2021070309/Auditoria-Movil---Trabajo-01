package com.google.ads.interactivemedia.v3.api;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public interface CuePoint {
    @Deprecated
    double getEndTime();

    long getEndTimeMs();

    @Deprecated
    double getStartTime();

    long getStartTimeMs();

    boolean isPlayed();
}
