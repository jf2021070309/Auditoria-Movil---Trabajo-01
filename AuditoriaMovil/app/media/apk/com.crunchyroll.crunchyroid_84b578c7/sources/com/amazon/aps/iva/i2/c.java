package com.amazon.aps.iva.i2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class c implements f {
    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        iVar.e(0, iVar.d(), "");
    }

    public final boolean equals(Object obj) {
        return obj instanceof c;
    }

    public final int hashCode() {
        return com.amazon.aps.iva.yb0.e0.a(c.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
