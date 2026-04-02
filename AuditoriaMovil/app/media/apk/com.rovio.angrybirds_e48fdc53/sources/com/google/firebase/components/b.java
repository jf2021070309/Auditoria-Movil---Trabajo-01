package com.google.firebase.components;
/* loaded from: classes2.dex */
final /* synthetic */ class b implements ComponentFactory {
    private final Object a;

    private b(Object obj) {
        this.a = obj;
    }

    public static ComponentFactory a(Object obj) {
        return new b(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Component.b(this.a);
    }
}
