package com.kwad.sdk.core.response.model;
/* loaded from: classes.dex */
public final class b {
    private boolean SI = true;
    private boolean auO;
    private int mHeight;
    private String mUrl;
    private int mWidth;

    public b(String str, int i, int i2, boolean z, boolean z2) {
        this.mUrl = str;
        this.mWidth = i;
        this.mHeight = i2;
        this.auO = z2;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final String getUrl() {
        return this.mUrl;
    }

    public final int getWidth() {
        return this.mWidth;
    }
}
