package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.env.r;
import com.vungle.publisher.mg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class VungleAdActivity_MembersInjector implements MembersInjector<VungleAdActivity> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<bz> c;
    private final Provider<r> d;
    private final Provider<cn.b> e;
    private final Provider<lm> f;
    private final Provider<mg.a> g;
    private final Provider<u> h;
    private final Provider<com.vungle.publisher.log.g> i;

    static {
        a = !VungleAdActivity_MembersInjector.class.desiredAssertionStatus();
    }

    public VungleAdActivity_MembersInjector(Provider<qg> provider, Provider<bz> provider2, Provider<r> provider3, Provider<cn.b> provider4, Provider<lm> provider5, Provider<mg.a> provider6, Provider<u> provider7, Provider<com.vungle.publisher.log.g> provider8) {
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
        if (!a && provider7 == null) {
            throw new AssertionError();
        }
        this.h = provider7;
        if (!a && provider8 == null) {
            throw new AssertionError();
        }
        this.i = provider8;
    }

    public static MembersInjector<VungleAdActivity> create(Provider<qg> provider, Provider<bz> provider2, Provider<r> provider3, Provider<cn.b> provider4, Provider<lm> provider5, Provider<mg.a> provider6, Provider<u> provider7, Provider<com.vungle.publisher.log.g> provider8) {
        return new VungleAdActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VungleAdActivity vungleAdActivity) {
        if (vungleAdActivity == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        vungleAdActivity.c = this.b.get();
        vungleAdActivity.d = this.c.get();
        vungleAdActivity.e = this.d.get();
        vungleAdActivity.f = this.e.get();
        vungleAdActivity.g = this.f.get();
        vungleAdActivity.h = this.g.get();
        vungleAdActivity.i = this.h.get();
        vungleAdActivity.j = this.i.get();
    }

    public static void injectEventBus(VungleAdActivity vungleAdActivity, Provider<qg> provider) {
        vungleAdActivity.c = provider.get();
    }

    public static void injectUiExecutor(VungleAdActivity vungleAdActivity, Provider<bz> provider) {
        vungleAdActivity.d = provider.get();
    }

    public static void injectSdkState(VungleAdActivity vungleAdActivity, Provider<r> provider) {
        vungleAdActivity.e = provider.get();
    }

    public static void injectAdMediator(VungleAdActivity vungleAdActivity, Provider<cn.b> provider) {
        vungleAdActivity.f = provider.get();
    }

    public static void injectAudioHelper(VungleAdActivity vungleAdActivity, Provider<lm> provider) {
        vungleAdActivity.g = provider.get();
    }

    public static void injectAdPresenterMediator(VungleAdActivity vungleAdActivity, Provider<mg.a> provider) {
        vungleAdActivity.h = provider.get();
    }

    public static void injectAdConfigFactory(VungleAdActivity vungleAdActivity, Provider<u> provider) {
        vungleAdActivity.i = provider.get();
    }

    public static void injectLogger(VungleAdActivity vungleAdActivity, Provider<com.vungle.publisher.log.g> provider) {
        vungleAdActivity.j = provider.get();
    }
}
