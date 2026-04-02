package com.amazon.aps.iva.ke0;
/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes4.dex */
public abstract class e<K, T> extends a<K, T> {
    public c<T> b;

    public e() {
        l lVar = l.b;
        com.amazon.aps.iva.yb0.j.d(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.ke0.a
    public final c<T> b() {
        return this.b;
    }
}
