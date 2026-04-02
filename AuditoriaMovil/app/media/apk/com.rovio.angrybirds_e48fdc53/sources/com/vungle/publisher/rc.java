package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum rc implements Factory<rb> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rb get() {
        return new rb();
    }

    public static Factory<rb> b() {
        return INSTANCE;
    }
}
