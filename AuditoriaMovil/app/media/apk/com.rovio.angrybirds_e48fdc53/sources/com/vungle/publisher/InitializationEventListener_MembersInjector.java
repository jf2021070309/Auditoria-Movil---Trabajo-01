package com.vungle.publisher;

import com.vungle.publisher.InitializationEventListener;
import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class InitializationEventListener_MembersInjector implements MembersInjector<InitializationEventListener> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<bw> c;
    private final Provider<vc> d;
    private final Provider<InitializationEventListener.a> e;
    private final Provider<r> f;

    static {
        a = !InitializationEventListener_MembersInjector.class.desiredAssertionStatus();
    }

    public InitializationEventListener_MembersInjector(Provider<qg> provider, Provider<bw> provider2, Provider<vc> provider3, Provider<InitializationEventListener.a> provider4, Provider<r> provider5) {
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
    }

    public static MembersInjector<InitializationEventListener> create(Provider<qg> provider, Provider<bw> provider2, Provider<vc> provider3, Provider<InitializationEventListener.a> provider4, Provider<r> provider5) {
        return new InitializationEventListener_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InitializationEventListener initializationEventListener) {
        if (initializationEventListener == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        initializationEventListener.eventBus = this.b.get();
        initializationEventListener.a = this.c.get();
        initializationEventListener.b = this.d.get();
        initializationEventListener.c = this.e.get();
        initializationEventListener.d = this.f.get();
    }

    public static void injectExecutor(InitializationEventListener initializationEventListener, Provider<bw> provider) {
        initializationEventListener.a = provider.get();
    }

    public static void injectProtocolHttpGateway(InitializationEventListener initializationEventListener, Provider<vc> provider) {
        initializationEventListener.b = provider.get();
    }

    public static void injectInitialConfigUpdatedEventListener(InitializationEventListener initializationEventListener, Provider<InitializationEventListener.a> provider) {
        initializationEventListener.c = provider.get();
    }

    public static void injectSdkState(InitializationEventListener initializationEventListener, Provider<r> provider) {
        initializationEventListener.d = provider.get();
    }
}
