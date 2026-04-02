package com.amazon.aps.iva.o60;
/* compiled from: Translations.kt */
/* loaded from: classes2.dex */
public final class d implements a {
    public static final d a = new d();
    public static com.amazon.aps.iva.t60.a b;

    @Override // com.amazon.aps.iva.o60.a
    public final void a() {
        com.amazon.aps.iva.t60.a aVar = b;
        if (aVar != null) {
            aVar.d = aVar.a.invoke();
        } else {
            com.amazon.aps.iva.yb0.j.m("repositoryFactory");
            throw null;
        }
    }
}
