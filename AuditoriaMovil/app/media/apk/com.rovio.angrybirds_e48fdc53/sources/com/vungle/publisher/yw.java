package com.vungle.publisher;

import com.vungle.publisher.cz;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class yw implements MembersInjector<ys> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<cz.b> c;
    private final Provider<yk> d;
    private final Provider<tj> e;
    private final Provider<com.vungle.publisher.env.o> f;
    private final Provider<zf> g;

    static {
        a = !yw.class.desiredAssertionStatus();
    }

    public yw(Provider<qg> provider, Provider<cz.b> provider2, Provider<yk> provider3, Provider<tj> provider4, Provider<com.vungle.publisher.env.o> provider5, Provider<zf> provider6) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
        if (!a && provider6 == null) {
            throw new AssertionError();
        }
        this.g = provider6;
    }

    public static MembersInjector<ys> a(Provider<qg> provider, Provider<cz.b> provider2, Provider<yk> provider3, Provider<tj> provider4, Provider<com.vungle.publisher.env.o> provider5, Provider<zf> provider6) {
        return new yw(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ys ysVar) {
        if (ysVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ysVar.eventBus = this.b.get();
        ysVar.d = this.c.get();
        ysVar.e = this.d.get();
        ysVar.f = this.e.get();
        ysVar.g = this.f.get();
        ysVar.h = this.g.get();
    }
}
