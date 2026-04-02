package com.vungle.publisher;

import com.vungle.publisher.py;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class qd implements MembersInjector<py.a> {
    static final /* synthetic */ boolean a;
    private final Provider<py> b;

    static {
        a = !qd.class.desiredAssertionStatus();
    }

    public qd(Provider<py> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<py.a> a(Provider<py> provider) {
        return new qd(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(py.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
