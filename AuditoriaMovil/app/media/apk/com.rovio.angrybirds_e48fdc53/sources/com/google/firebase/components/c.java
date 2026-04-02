package com.google.firebase.components;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ComponentFactory {
    private final Object a;

    private c(Object obj) {
        this.a = obj;
    }

    public static ComponentFactory a(Object obj) {
        return new c(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Component.a(this.a);
    }
}
