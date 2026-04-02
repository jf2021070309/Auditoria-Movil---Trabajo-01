package com.amazon.aps.iva.vr;
/* compiled from: ServiceNameDecorator.java */
/* loaded from: classes2.dex */
public final class f extends a {
    public final boolean c;

    public f() {
        this("service.name", false);
    }

    @Override // com.amazon.aps.iva.vr.a
    public final boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        bVar.h(String.valueOf(obj));
        return this.c;
    }

    public f(String str, boolean z) {
        this.c = z;
        this.a = str;
    }
}
