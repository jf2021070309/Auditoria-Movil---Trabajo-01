package com.vungle.publisher;

import com.vungle.publisher.hr;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class iu implements MembersInjector<hr> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<qg> c;
    private final Provider<hr.a> d;

    static {
        a = !iu.class.desiredAssertionStatus();
    }

    public iu(Provider<ci> provider, Provider<qg> provider2, Provider<hr.a> provider3) {
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

    public static MembersInjector<hr> a(Provider<ci> provider, Provider<qg> provider2, Provider<hr.a> provider3) {
        return new iu(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hr hrVar) {
        if (hrVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        hrVar.v = this.b.get();
        hrVar.F = this.c.get();
        hrVar.w = this.d.get();
    }
}
