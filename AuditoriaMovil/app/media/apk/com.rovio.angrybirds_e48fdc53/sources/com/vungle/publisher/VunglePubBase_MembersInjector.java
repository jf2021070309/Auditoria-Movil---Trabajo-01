package com.vungle.publisher;

import com.vungle.publisher.env.r;
import com.vungle.publisher.mj;
import com.vungle.publisher.py;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class VunglePubBase_MembersInjector implements MembersInjector<VunglePubBase> {
    static final /* synthetic */ boolean a;
    private final Provider<c> b;
    private final Provider<InitializationEventListener> c;
    private final Provider<py.a> d;
    private final Provider<qo> e;
    private final Provider<ci> f;
    private final Provider<com.vungle.publisher.env.i> g;
    private final Provider<qg> h;
    private final Provider<AdConfig> i;
    private final Provider<u> j;
    private final Provider<com.vungle.publisher.env.o> k;
    private final Provider<r> l;
    private final Provider<mj.a> m;
    private final Provider<com.vungle.publisher.log.g> n;

    static {
        a = !VunglePubBase_MembersInjector.class.desiredAssertionStatus();
    }

    public VunglePubBase_MembersInjector(Provider<c> provider, Provider<InitializationEventListener> provider2, Provider<py.a> provider3, Provider<qo> provider4, Provider<ci> provider5, Provider<com.vungle.publisher.env.i> provider6, Provider<qg> provider7, Provider<AdConfig> provider8, Provider<u> provider9, Provider<com.vungle.publisher.env.o> provider10, Provider<r> provider11, Provider<mj.a> provider12, Provider<com.vungle.publisher.log.g> provider13) {
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
        if (!a && provider9 == null) {
            throw new AssertionError();
        }
        this.j = provider9;
        if (!a && provider10 == null) {
            throw new AssertionError();
        }
        this.k = provider10;
        if (!a && provider11 == null) {
            throw new AssertionError();
        }
        this.l = provider11;
        if (!a && provider12 == null) {
            throw new AssertionError();
        }
        this.m = provider12;
        if (!a && provider13 == null) {
            throw new AssertionError();
        }
        this.n = provider13;
    }

    public static MembersInjector<VunglePubBase> create(Provider<c> provider, Provider<InitializationEventListener> provider2, Provider<py.a> provider3, Provider<qo> provider4, Provider<ci> provider5, Provider<com.vungle.publisher.env.i> provider6, Provider<qg> provider7, Provider<AdConfig> provider8, Provider<u> provider9, Provider<com.vungle.publisher.env.o> provider10, Provider<r> provider11, Provider<mj.a> provider12, Provider<com.vungle.publisher.log.g> provider13) {
        return new VunglePubBase_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VunglePubBase vunglePubBase) {
        if (vunglePubBase == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        vunglePubBase.a = this.b.get();
        vunglePubBase.b = this.c.get();
        vunglePubBase.c = this.d.get();
        vunglePubBase.d = this.e.get();
        vunglePubBase.e = this.f.get();
        vunglePubBase.f = this.g.get();
        vunglePubBase.g = this.h.get();
        vunglePubBase.h = this.i.get();
        vunglePubBase.i = this.j.get();
        vunglePubBase.j = this.k.get();
        vunglePubBase.k = this.l.get();
        vunglePubBase.l = this.m.get();
        vunglePubBase.m = this.n.get();
    }

    public static void injectAdManager(VunglePubBase vunglePubBase, Provider<c> provider) {
        vunglePubBase.a = provider.get();
    }

    public static void injectInitializationEventListener(VunglePubBase vunglePubBase, Provider<InitializationEventListener> provider) {
        vunglePubBase.b = provider.get();
    }

    public static void injectClientInitListenerAdapterFactory(VunglePubBase vunglePubBase, Provider<py.a> provider) {
        vunglePubBase.c = provider.get();
    }

    public static void injectCacheManager(VunglePubBase vunglePubBase, Provider<qo> provider) {
        vunglePubBase.d = provider.get();
    }

    public static void injectDatabaseHelper(VunglePubBase vunglePubBase, Provider<ci> provider) {
        vunglePubBase.e = provider.get();
    }

    public static void injectDevice(VunglePubBase vunglePubBase, Provider<com.vungle.publisher.env.i> provider) {
        vunglePubBase.f = provider.get();
    }

    public static void injectEventBus(VunglePubBase vunglePubBase, Provider<qg> provider) {
        vunglePubBase.g = provider.get();
    }

    public static void injectGlobalAdConfig(VunglePubBase vunglePubBase, Provider<AdConfig> provider) {
        vunglePubBase.h = provider.get();
    }

    public static void injectSafeBundleAdConfigFactory(VunglePubBase vunglePubBase, Provider<u> provider) {
        vunglePubBase.i = provider.get();
    }

    public static void injectSdkConfig(VunglePubBase vunglePubBase, Provider<com.vungle.publisher.env.o> provider) {
        vunglePubBase.j = provider.get();
    }

    public static void injectSdkState(VunglePubBase vunglePubBase, Provider<r> provider) {
        vunglePubBase.k = provider.get();
    }

    public static void injectDummyWebViewFactory(VunglePubBase vunglePubBase, Provider<mj.a> provider) {
        vunglePubBase.l = provider.get();
    }

    public static void injectLogger(VunglePubBase vunglePubBase, Provider<com.vungle.publisher.log.g> provider) {
        vunglePubBase.m = provider.get();
    }
}
