package com.vungle.publisher;

import com.vungle.publisher.th;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class yc implements MembersInjector<xy> {
    static final /* synthetic */ boolean a;
    private final Provider<th.a> b;
    private final Provider<uu> c;
    private final Provider<uz> d;
    private final Provider<yd> e;

    static {
        a = !yc.class.desiredAssertionStatus();
    }

    public yc(Provider<th.a> provider, Provider<uu> provider2, Provider<uz> provider3, Provider<yd> provider4) {
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
    }

    public static MembersInjector<xy> a(Provider<th.a> provider, Provider<uu> provider2, Provider<uz> provider3, Provider<yd> provider4) {
        return new yc(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(xy xyVar) {
        if (xyVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        xyVar.a = this.b.get();
        xyVar.b = this.c.get();
        xyVar.c = this.d.get();
        xyVar.d = this.e.get();
    }
}
