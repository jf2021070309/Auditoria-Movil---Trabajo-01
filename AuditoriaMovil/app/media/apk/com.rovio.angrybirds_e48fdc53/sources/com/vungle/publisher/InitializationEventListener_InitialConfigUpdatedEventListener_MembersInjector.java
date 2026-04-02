package com.vungle.publisher;

import com.vungle.publisher.InitializationEventListener;
import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class InitializationEventListener_InitialConfigUpdatedEventListener_MembersInjector implements MembersInjector<InitializationEventListener.a> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<c> c;
    private final Provider<yk> d;
    private final Provider<r> e;
    private final Provider<com.vungle.publisher.log.g> f;
    private final Provider<vc> g;
    private final Provider<bw> h;

    static {
        a = !InitializationEventListener_InitialConfigUpdatedEventListener_MembersInjector.class.desiredAssertionStatus();
    }

    public InitializationEventListener_InitialConfigUpdatedEventListener_MembersInjector(Provider<qg> provider, Provider<c> provider2, Provider<yk> provider3, Provider<r> provider4, Provider<com.vungle.publisher.log.g> provider5, Provider<vc> provider6, Provider<bw> provider7) {
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
    }

    public static MembersInjector<InitializationEventListener.a> create(Provider<qg> provider, Provider<c> provider2, Provider<yk> provider3, Provider<r> provider4, Provider<com.vungle.publisher.log.g> provider5, Provider<vc> provider6, Provider<bw> provider7) {
        return new InitializationEventListener_InitialConfigUpdatedEventListener_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InitializationEventListener.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.eventBus = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.d = this.f.get();
        aVar.e = this.g.get();
        aVar.f = this.h.get();
    }

    public static void injectAdManager(InitializationEventListener.a aVar, Provider<c> provider) {
        aVar.a = provider.get();
    }

    public static void injectReportManager(InitializationEventListener.a aVar, Provider<yk> provider) {
        aVar.b = provider.get();
    }

    public static void injectSdkState(InitializationEventListener.a aVar, Provider<r> provider) {
        aVar.c = provider.get();
    }

    public static void injectLoggingManager(InitializationEventListener.a aVar, Provider<com.vungle.publisher.log.g> provider) {
        aVar.d = provider.get();
    }

    public static void injectProtocolHttpGateway(InitializationEventListener.a aVar, Provider<vc> provider) {
        aVar.e = provider.get();
    }

    public static void injectExecutor(InitializationEventListener.a aVar, Provider<bw> provider) {
        aVar.f = provider.get();
    }
}
