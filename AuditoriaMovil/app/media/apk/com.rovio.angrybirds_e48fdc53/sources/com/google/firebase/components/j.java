package com.google.firebase.components;

import com.google.firebase.inject.Provider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Provider {
    private final ComponentFactory a;
    private final ComponentContainer b;

    private j(ComponentFactory componentFactory, ComponentContainer componentContainer) {
        this.a = componentFactory;
        this.b = componentContainer;
    }

    public static Provider a(ComponentFactory componentFactory, ComponentContainer componentContainer) {
        return new j(componentFactory, componentContainer);
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object create;
        create = this.a.create(this.b);
        return create;
    }
}
