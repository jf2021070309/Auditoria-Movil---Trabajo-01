package com.amazon.aps.iva.l90;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$intoSet$2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lambda$intoSet$2 = Component.lambda$intoSet$2(obj, componentContainer);
                return lambda$intoSet$2;
            default:
                return CrashlyticsRegistrar.a((CrashlyticsRegistrar) obj, componentContainer);
        }
    }
}
