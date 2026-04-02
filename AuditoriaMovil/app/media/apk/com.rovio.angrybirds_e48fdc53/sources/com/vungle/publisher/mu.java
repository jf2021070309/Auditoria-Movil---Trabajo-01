package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum mu implements Factory<mq> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public mq get() {
        return new mq();
    }

    public static Factory<mq> b() {
        return INSTANCE;
    }
}
