package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Deferred.DeferredHandler, ComponentRegistrarProcessor {
    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        OptionalProvider.lambda$static$0(provider);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
