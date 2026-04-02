package com.vungle.publisher;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class InitializationEventListener_Factory implements Factory<InitializationEventListener> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<InitializationEventListener> b;

    static {
        a = !InitializationEventListener_Factory.class.desiredAssertionStatus();
    }

    public InitializationEventListener_Factory(MembersInjector<InitializationEventListener> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    public InitializationEventListener get() {
        return (InitializationEventListener) MembersInjectors.injectMembers(this.b, new InitializationEventListener());
    }

    public static Factory<InitializationEventListener> create(MembersInjector<InitializationEventListener> membersInjector) {
        return new InitializationEventListener_Factory(membersInjector);
    }
}
