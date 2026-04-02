package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum yf implements Factory<yd> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public yd get() {
        return new yd();
    }

    public static Factory<yd> b() {
        return INSTANCE;
    }
}
