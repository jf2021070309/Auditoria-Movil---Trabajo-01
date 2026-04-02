package com.applovin.impl.mediation;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
/* loaded from: classes.dex */
public class MaxErrorImpl implements MaxError {
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i2) {
        this(i2, "");
    }

    public MaxErrorImpl(int i2, String str) {
        this.errorCode = i2;
        this.errorMessage = StringUtils.emptyIfNull(str);
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    @Override // com.applovin.mediation.MaxError
    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(String str) {
        this.loadTag = str;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MaxError{code=");
        y.append(getCode());
        y.append(", message='");
        y.append(getMessage());
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
