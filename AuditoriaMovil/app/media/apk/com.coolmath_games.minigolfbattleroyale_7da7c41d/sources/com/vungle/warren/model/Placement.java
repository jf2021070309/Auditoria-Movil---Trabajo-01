package com.vungle.warren.model;

import com.vungle.warren.AdConfig;
/* loaded from: classes2.dex */
public class Placement {
    public static final int INVALID_INTEGER_VALUE = Integer.MIN_VALUE;
    private static final String TAG = "Placement";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_DEPRECTAED_TEMPLATE = 2;
    public static final int TYPE_VUNGLE_BANNER = 1;
    public static final int TYPE_VUNGLE_MREC = 3;
    int adRefreshDuration;
    protected AdConfig.AdSize adSize;
    int autoCachePriority;
    boolean autoCached;
    boolean headerBidding;
    String identifier;
    boolean incentivized;
    boolean isValid;
    int maxHbCache;
    int placementAdType;
    protected AdConfig.AdSize recommendedAdSize;
    long wakeupTime;

    /* loaded from: classes2.dex */
    public @interface PlacementAdType {
    }

    public Placement(String str) {
        this.placementAdType = 0;
        this.recommendedAdSize = AdConfig.AdSize.VUNGLE_DEFAULT;
        this.identifier = str;
        this.autoCached = false;
        this.incentivized = false;
        this.headerBidding = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Placement() {
        this.placementAdType = 0;
        this.recommendedAdSize = AdConfig.AdSize.VUNGLE_DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
        if (r8.equals("banner") != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Placement(com.google.gson.JsonObject r8) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Placement.<init>(com.google.gson.JsonObject):void");
    }

    public void snooze(long j) {
        this.wakeupTime = System.currentTimeMillis() + (j * 1000);
    }

    public long getWakeupTime() {
        return this.wakeupTime;
    }

    public void setWakeupTime(long j) {
        this.wakeupTime = j;
    }

    public String getId() {
        return this.identifier;
    }

    public void setValid(boolean z) {
        this.isValid = z;
    }

    public int getPlacementAdType() {
        return this.placementAdType;
    }

    public AdConfig.AdSize getAdSize() {
        AdConfig.AdSize adSize = this.adSize;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    public AdConfig.AdSize getRecommendedAdSize() {
        return this.recommendedAdSize;
    }

    public void setAdSize(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public int getAdRefreshDuration() {
        int i = this.adRefreshDuration;
        if (i <= 0) {
            return 0;
        }
        return i;
    }

    public int getAutoCachePriority() {
        return this.autoCachePriority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Placement placement = (Placement) obj;
        String str = this.identifier;
        if (str == null ? placement.identifier == null : str.equals(placement.identifier)) {
            return this.placementAdType == placement.placementAdType && this.autoCached == placement.autoCached && this.incentivized == placement.incentivized && this.headerBidding == placement.headerBidding && this.isValid == placement.isValid;
        }
        return false;
    }

    public int hashCode() {
        String str = this.identifier;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + this.placementAdType) * 31) + (this.autoCached ? 1 : 0)) * 31) + (this.incentivized ? 1 : 0)) * 31) + (this.headerBidding ? 1 : 0)) * 31) + (this.isValid ? 1 : 0);
    }

    public boolean isAutoCached() {
        if (AdConfig.AdSize.isNonMrecBannerAdSize(this.adSize)) {
            return true;
        }
        return this.autoCached;
    }

    public boolean isIncentivized() {
        return this.incentivized;
    }

    public boolean isHeaderBidding() {
        return this.headerBidding;
    }

    public int getMaxHbCache() {
        return this.maxHbCache;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        return "Placement{identifier='" + this.identifier + "', autoCached=" + this.autoCached + ", incentivized=" + this.incentivized + ", wakeupTime=" + this.wakeupTime + ", adRefreshDuration=" + this.adRefreshDuration + ", autoCachePriority=" + this.autoCachePriority + ", headerBidding=" + this.headerBidding + ", isValid=" + this.isValid + ", placementAdType=" + this.placementAdType + ", adSize=" + this.adSize + ", maxHbCache=" + this.maxHbCache + ", adSize=" + this.adSize + ", recommendedAdSize=" + this.recommendedAdSize + '}';
    }

    public boolean isMultipleHBPEnabled() {
        return this.headerBidding && this.maxHbCache > 0;
    }

    public boolean isSingleHBPEnabled() {
        return this.headerBidding && this.maxHbCache == 1;
    }
}
