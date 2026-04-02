package com.vungle.publisher.inject;

import android.content.Context;
import android.view.WindowManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class o implements Factory<WindowManager> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;

    static {
        a = !o.class.desiredAssertionStatus();
    }

    public o(a aVar, Provider<Context> provider) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public WindowManager get() {
        return (WindowManager) Preconditions.checkNotNull(this.b.g(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<WindowManager> a(a aVar, Provider<Context> provider) {
        return new o(aVar, provider);
    }
}
