package com.amazon.aps.iva.i2;
/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class j implements f {
    @Override // com.amazon.aps.iva.i2.f
    public final void a(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "buffer");
        iVar.d = -1;
        iVar.e = -1;
    }

    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    public final int hashCode() {
        return com.amazon.aps.iva.yb0.e0.a(j.class).hashCode();
    }

    public final String toString() {
        return "FinishComposingTextCommand()";
    }
}
