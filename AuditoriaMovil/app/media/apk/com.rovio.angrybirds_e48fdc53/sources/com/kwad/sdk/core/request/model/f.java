package com.kwad.sdk.core.request.model;
/* loaded from: classes.dex */
public class f extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public int adStyle;
    public long auE;
    public int count;
    public int taskType;

    public f() {
    }

    public f(int i, int i2, int i3, long j) {
        this.adStyle = i;
        this.taskType = i2;
        this.count = 1;
        this.auE = j;
    }

    public final void af(long j) {
        this.auE = j;
    }
}
