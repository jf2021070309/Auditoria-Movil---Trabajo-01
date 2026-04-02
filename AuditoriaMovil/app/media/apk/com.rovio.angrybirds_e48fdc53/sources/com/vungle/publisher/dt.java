package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum dt implements Factory<ds> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public ds get() {
        return new ds();
    }

    public static Factory<ds> b() {
        return INSTANCE;
    }
}
