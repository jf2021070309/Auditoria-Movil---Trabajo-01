package com.vungle.publisher;

import com.vungle.publisher.cn;
/* loaded from: classes4.dex */
public abstract class ad<A extends cn> extends ph implements ac<A> {
    protected final A b;
    protected final String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ad(A a, String str, long j) {
        super(j);
        this.b = a;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ad(A a, String str) {
        this.b = a;
        this.c = str;
    }

    @Override // com.vungle.publisher.ac
    public A b() {
        return this.b;
    }

    @Override // com.vungle.publisher.ac
    public String c() {
        return this.c;
    }
}
