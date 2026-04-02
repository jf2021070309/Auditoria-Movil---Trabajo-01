package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum zm implements Factory<zl> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public zl get() {
        return new zl();
    }

    public static Factory<zl> b() {
        return INSTANCE;
    }
}
