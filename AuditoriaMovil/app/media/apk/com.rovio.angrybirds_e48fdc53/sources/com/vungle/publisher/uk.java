package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum uk implements Factory<uj> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uj get() {
        return new uj();
    }

    public static Factory<uj> b() {
        return INSTANCE;
    }
}
