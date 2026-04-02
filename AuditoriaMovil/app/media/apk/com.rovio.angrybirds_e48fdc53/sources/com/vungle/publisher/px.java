package com.vungle.publisher;

import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class px implements MembersInjector<pj> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<bw> c;
    private final Provider<c> d;
    private final Provider<r> e;

    static {
        a = !px.class.desiredAssertionStatus();
    }

    public px(Provider<qg> provider, Provider<bw> provider2, Provider<c> provider3, Provider<r> provider4) {
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

    public static MembersInjector<pj> a(Provider<qg> provider, Provider<bw> provider2, Provider<c> provider3, Provider<r> provider4) {
        return new px(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(pj pjVar) {
        if (pjVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        pjVar.eventBus = this.b.get();
        pjVar.b = this.c.get();
        pjVar.c = this.d.get();
        pjVar.d = this.e.get();
    }
}
