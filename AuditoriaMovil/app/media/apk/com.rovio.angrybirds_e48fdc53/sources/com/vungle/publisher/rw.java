package com.vungle.publisher;

import com.vungle.publisher.rv;
import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum rw implements Factory<rv.a> {
    INSTANCE;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public rv.a get() {
        return new rv.a();
    }

    public static Factory<rv.a> b() {
        return INSTANCE;
    }
}
