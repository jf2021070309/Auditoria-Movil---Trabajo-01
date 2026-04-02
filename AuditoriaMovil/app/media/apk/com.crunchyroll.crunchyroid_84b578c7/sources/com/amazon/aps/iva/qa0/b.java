package com.amazon.aps.iva.qa0;
/* loaded from: classes4.dex */
public enum b {
    AD_FETCH_COMPLETED("adFetchCompleted"),
    AD_STARTED("adStarted"),
    AD_DISPLAYED("adDisplayed"),
    AD_COMPLETED("adCompleted"),
    AD_ERROR("adError"),
    NO_ADS_AVAILABLE("noAdsAvailable"),
    AD_FREE_POD("adFreePod"),
    USER_CANCEL_STREAM("userCancelStream"),
    OPT_IN("optIn"),
    OPT_OUT("optOut"),
    SKIP_CARD_SHOWN("skipCardShown"),
    USER_CANCEL("userCancel"),
    VIDEO_EVENT("videoEvent"),
    POPUP_WEBSITE("popupWebsite"),
    XTENDED_VIEW_STARTED("xtendedViewStarted");
    
    private final String a;

    b(String str) {
        this.a = str;
    }

    public static b toEvent(String str) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.a.equals(str)) {
                return bVar;
            }
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("ad event not found: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
