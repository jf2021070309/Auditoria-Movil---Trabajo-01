package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum dx implements Factory<dw> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public dw get() {
        return new dw();
    }

    public static Factory<dw> b() {
        return INSTANCE;
    }
}
