package com.vungle.publisher;
/* loaded from: classes4.dex */
public abstract class ph implements qf {
    private final long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ph() {
        this(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ph(long j) {
        this.a = j;
    }

    @Override // com.vungle.publisher.qf
    public long e() {
        return this.a;
    }
}
