package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum ca implements Factory<bz> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public bz get() {
        return new bz();
    }

    public static Factory<bz> b() {
        return INSTANCE;
    }
}
