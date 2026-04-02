package com.vungle.publisher;

import com.vungle.publisher.my;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nh implements MembersInjector<my.b> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;

    static {
        a = !nh.class.desiredAssertionStatus();
    }

    public nh(Provider<qg> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<my.b> a(Provider<qg> provider) {
        return new nh(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(my.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bVar.eventBus = this.b.get();
    }
}
