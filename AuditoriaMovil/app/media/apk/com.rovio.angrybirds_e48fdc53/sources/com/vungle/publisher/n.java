package com.vungle.publisher;

import com.vungle.publisher.m;
import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum n implements Factory<m.a> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public m.a get() {
        return new m.a();
    }

    public static Factory<m.a> b() {
        return INSTANCE;
    }
}
