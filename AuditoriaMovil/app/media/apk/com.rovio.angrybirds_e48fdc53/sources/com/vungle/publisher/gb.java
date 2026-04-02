package com.vungle.publisher;

import com.vungle.publisher.ek;
import com.vungle.publisher.ge;
import com.vungle.publisher.m;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gb implements MembersInjector<ek.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<m.a> c;
    private final Provider<ek> d;
    private final Provider<ge.a> e;

    static {
        a = !gb.class.desiredAssertionStatus();
    }

    public gb(Provider<ci> provider, Provider<m.a> provider2, Provider<ek> provider3, Provider<ge.a> provider4) {
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

    public static MembersInjector<ek.a> a(Provider<ci> provider, Provider<m.a> provider2, Provider<ek> provider3, Provider<ge.a> provider4) {
        return new gb(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ek.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.e = this.c.get();
        aVar.a = this.d;
        aVar.b = this.e.get();
    }
}
