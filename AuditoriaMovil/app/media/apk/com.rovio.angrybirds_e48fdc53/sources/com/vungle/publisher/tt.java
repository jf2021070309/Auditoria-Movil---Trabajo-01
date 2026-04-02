package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum tt implements Factory<ts> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ts get() {
        return new ts();
    }

    public static Factory<ts> b() {
        return INSTANCE;
    }
}
