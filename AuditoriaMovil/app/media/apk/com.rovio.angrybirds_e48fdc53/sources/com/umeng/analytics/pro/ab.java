package com.umeng.analytics.pro;
/* compiled from: DelayedStartCondition.java */
/* loaded from: classes3.dex */
public class ab implements aa {
    private long a;

    public ab(long j) {
        this.a = 0L;
        this.a = j;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
        return this.a;
    }
}
