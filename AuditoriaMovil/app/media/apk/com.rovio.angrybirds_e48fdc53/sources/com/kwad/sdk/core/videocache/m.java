package com.kwad.sdk.core.videocache;
/* loaded from: classes.dex */
public final class m {
    public final long axd;
    public final String axe;
    public final String url;

    public m(String str, long j, String str2) {
        this.url = str;
        this.axd = j;
        this.axe = str2;
    }

    public final String toString() {
        return "SourceInfo{url='" + this.url + "', length=" + this.axd + ", mime='" + this.axe + "'}";
    }
}
