package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum uv implements Factory<uu> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uu get() {
        return new uu();
    }

    public static Factory<uu> b() {
        return INSTANCE;
    }
}
