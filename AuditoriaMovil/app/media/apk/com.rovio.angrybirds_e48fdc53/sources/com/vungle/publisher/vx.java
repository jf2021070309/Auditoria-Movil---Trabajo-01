package com.vungle.publisher;

import com.vungle.publisher.vu;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class vx implements MembersInjector<vu.a> {
    static final /* synthetic */ boolean a;
    private final Provider<vu> b;

    static {
        a = !vx.class.desiredAssertionStatus();
    }

    public vx(Provider<vu> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<vu.a> a(Provider<vu> provider) {
        return new vx(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(vu.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
