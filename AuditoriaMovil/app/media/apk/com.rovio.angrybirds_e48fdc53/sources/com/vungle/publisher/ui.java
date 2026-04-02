package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum ui implements Factory<uh> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public uh get() {
        return new uh();
    }

    public static Factory<uh> b() {
        return INSTANCE;
    }
}
