package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum qh implements Factory<qg> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public qg get() {
        return new qg();
    }

    public static Factory<qg> b() {
        return INSTANCE;
    }
}
