package com.vungle.publisher;

import com.vungle.publisher.wg;
import com.vungle.publisher.wj;
import com.vungle.publisher.wr;
import com.vungle.publisher.yg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class yi implements MembersInjector<yg.a> {
    static final /* synthetic */ boolean a;
    private final Provider<wg.a> b;
    private final Provider<wj.a> c;
    private final Provider<wr.a> d;

    static {
        a = !yi.class.desiredAssertionStatus();
    }

    public yi(Provider<wg.a> provider, Provider<wj.a> provider2, Provider<wr.a> provider3) {
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
    }

    public static MembersInjector<yg.a> a(Provider<wg.a> provider, Provider<wj.a> provider2, Provider<wr.a> provider3) {
        return new yi(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(yg.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
        aVar.c = this.d.get();
    }
}
