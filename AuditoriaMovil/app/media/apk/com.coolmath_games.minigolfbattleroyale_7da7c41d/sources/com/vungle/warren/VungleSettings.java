package com.vungle.warren;
/* loaded from: classes2.dex */
public final class VungleSettings {
    private static final long MEGABYTE = 1048576;
    private final boolean androidIdOptedOut;
    private final boolean disableRefresh;
    private final long maximumStorageForCleverCache;
    private final long minimumSpaceForAd;
    private final long minimumSpaceForInit;

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean androidIdOptedOut;
        private boolean disableRefresh;
        private long minimumSpaceForInit = 53477376;
        private long minimumSpaceForAd = 52428800;
        private long maximumStorageForCleverCache = 104857600;

        public VungleSettings build() {
            return new VungleSettings(this);
        }

        public Builder setMinimumSpaceForInit(long j) {
            this.minimumSpaceForInit = j;
            return this;
        }

        public Builder setMinimumSpaceForAd(long j) {
            this.minimumSpaceForAd = j;
            return this;
        }

        public Builder setAndroidIdOptOut(boolean z) {
            this.androidIdOptedOut = z;
            return this;
        }

        public Builder disableBannerRefresh() {
            this.disableRefresh = true;
            return this;
        }

        public Builder setMaximumStorageForCleverCache(long j) {
            this.maximumStorageForCleverCache = j;
            return this;
        }
    }

    private VungleSettings(Builder builder) {
        this.minimumSpaceForAd = builder.minimumSpaceForAd;
        this.minimumSpaceForInit = builder.minimumSpaceForInit;
        this.androidIdOptedOut = builder.androidIdOptedOut;
        this.disableRefresh = builder.disableRefresh;
        this.maximumStorageForCleverCache = builder.maximumStorageForCleverCache;
    }

    public long getMinimumSpaceForAd() {
        return this.minimumSpaceForAd;
    }

    public long getMinimumSpaceForInit() {
        return this.minimumSpaceForInit;
    }

    public boolean getAndroidIdOptOut() {
        return this.androidIdOptedOut;
    }

    public boolean getBannerRefreshDisabled() {
        return this.disableRefresh;
    }

    public long getMaximumStorageForCleverCache() {
        return this.maximumStorageForCleverCache;
    }
}
