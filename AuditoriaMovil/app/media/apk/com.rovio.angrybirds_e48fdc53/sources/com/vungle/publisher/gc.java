package com.vungle.publisher;

import com.vungle.publisher.ek;
import com.vungle.publisher.el;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gc implements MembersInjector<ek> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<el.a> c;
    private final Provider<ek.a> d;

    static {
        a = !gc.class.desiredAssertionStatus();
    }

    public gc(Provider<ci> provider, Provider<el.a> provider2, Provider<ek.a> provider3) {
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

    public static MembersInjector<ek> a(Provider<ci> provider, Provider<el.a> provider2, Provider<ek.a> provider3) {
        return new gc(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ek ekVar) {
        if (ekVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ekVar.v = this.b.get();
        ekVar.c = this.c.get();
        ekVar.d = this.d.get();
    }
}
