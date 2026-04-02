package com.amazon.aps.iva.t90;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        UserAgentPublisher lambda$component$0;
        lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
        return lambda$component$0;
    }
}
