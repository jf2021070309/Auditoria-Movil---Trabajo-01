package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum zd implements Factory<zc> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public zc get() {
        return new zc();
    }

    public static Factory<zc> b() {
        return INSTANCE;
    }
}
