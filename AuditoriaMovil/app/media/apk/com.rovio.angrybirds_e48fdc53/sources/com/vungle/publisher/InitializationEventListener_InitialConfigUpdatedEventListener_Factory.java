package com.vungle.publisher;

import com.vungle.publisher.InitializationEventListener;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class InitializationEventListener_InitialConfigUpdatedEventListener_Factory implements Factory<InitializationEventListener.a> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<InitializationEventListener.a> b;

    static {
        a = !InitializationEventListener_InitialConfigUpdatedEventListener_Factory.class.desiredAssertionStatus();
    }

    public InitializationEventListener_InitialConfigUpdatedEventListener_Factory(MembersInjector<InitializationEventListener.a> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    public InitializationEventListener.a get() {
        return (InitializationEventListener.a) MembersInjectors.injectMembers(this.b, new InitializationEventListener.a());
    }

    public static Factory<InitializationEventListener.a> create(MembersInjector<InitializationEventListener.a> membersInjector) {
        return new InitializationEventListener_InitialConfigUpdatedEventListener_Factory(membersInjector);
    }
}
