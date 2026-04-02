package com.vungle.warren;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public final class AdRequest implements Serializable {
    private final long adCount;
    private final AdMarkup adMarkup;
    private final String placementId;
    public AtomicLong timeStamp;
    private final int type;

    /* loaded from: classes2.dex */
    public @interface Type {
        public static final int NORMAL = 0;
        public static final int NO_ASSETS = 1;
        public static final int SINGLE_HBP = 2;
    }

    public AdRequest(String str, int i, long j) {
        this.timeStamp = new AtomicLong(0L);
        this.placementId = str;
        this.adMarkup = null;
        this.type = i;
        this.adCount = j;
    }

    public AdRequest(String str, AdMarkup adMarkup) {
        this.timeStamp = new AtomicLong(0L);
        this.placementId = str;
        this.adMarkup = adMarkup;
        this.type = 0;
        this.adCount = 1L;
    }

    public AdRequest(String str) {
        this(str, null);
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getEventId() {
        AdMarkup adMarkup = this.adMarkup;
        if (adMarkup != null) {
            return adMarkup.getEventId();
        }
        return null;
    }

    public String[] getImpression() {
        AdMarkup adMarkup = this.adMarkup;
        if (adMarkup != null) {
            return adMarkup.getImpression();
        }
        return null;
    }

    public int getType() {
        return this.type;
    }

    public long getAdCount() {
        return this.adCount;
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placementId + "', adMarkup=" + this.adMarkup + ", type=" + this.type + ", adCount=" + this.adCount + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (this.type == adRequest.type && this.placementId.equals(adRequest.placementId)) {
            AdMarkup adMarkup = this.adMarkup;
            AdMarkup adMarkup2 = adRequest.adMarkup;
            return adMarkup != null ? adMarkup.equals(adMarkup2) : adMarkup2 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.placementId.hashCode() * 31;
        AdMarkup adMarkup = this.adMarkup;
        return ((hashCode + (adMarkup != null ? adMarkup.hashCode() : 0)) * 31) + this.type;
    }
}
