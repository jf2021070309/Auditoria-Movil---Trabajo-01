package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum ty implements Factory<tw> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public tw get() {
        return new tw();
    }

    public static Factory<tw> b() {
        return INSTANCE;
    }
}
