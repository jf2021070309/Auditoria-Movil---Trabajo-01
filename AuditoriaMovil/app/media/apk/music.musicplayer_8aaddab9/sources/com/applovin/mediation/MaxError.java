package com.applovin.mediation;
/* loaded from: classes.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    String getMessage();

    MaxAdWaterfallInfo getWaterfall();
}
