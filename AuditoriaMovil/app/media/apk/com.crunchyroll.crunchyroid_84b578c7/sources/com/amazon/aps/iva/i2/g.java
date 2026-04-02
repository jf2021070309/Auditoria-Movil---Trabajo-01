package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: EditProcessor.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, CharSequence> {
    public final /* synthetic */ f h;
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, h hVar) {
        super(1);
        this.h = fVar;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(f fVar) {
        String str;
        String concat;
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "it");
        if (this.h == fVar2) {
            str = " > ";
        } else {
            str = "   ";
        }
        StringBuilder b = defpackage.c.b(str);
        this.i.getClass();
        if (fVar2 instanceof b) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            b bVar = (b) fVar2;
            sb.append(bVar.a.b.length());
            sb.append(", newCursorPosition=");
            concat = b2.b(sb, bVar.b, ')');
        } else if (fVar2 instanceof c0) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            c0 c0Var = (c0) fVar2;
            sb2.append(c0Var.a.b.length());
            sb2.append(", newCursorPosition=");
            concat = b2.b(sb2, c0Var.b, ')');
        } else if (fVar2 instanceof b0) {
            concat = fVar2.toString();
        } else if (fVar2 instanceof d) {
            concat = fVar2.toString();
        } else if (fVar2 instanceof e) {
            concat = fVar2.toString();
        } else if (fVar2 instanceof d0) {
            concat = fVar2.toString();
        } else if (fVar2 instanceof j) {
            concat = fVar2.toString();
        } else if (fVar2 instanceof c) {
            concat = fVar2.toString();
        } else {
            String k = com.amazon.aps.iva.yb0.e0.a(fVar2.getClass()).k();
            if (k == null) {
                k = "{anonymous EditCommand}";
            }
            concat = "Unknown EditCommand: ".concat(k);
        }
        b.append(concat);
        return b.toString();
    }
}
