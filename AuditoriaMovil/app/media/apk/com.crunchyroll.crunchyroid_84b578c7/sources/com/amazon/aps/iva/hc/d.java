package com.amazon.aps.iva.hc;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.a0;
import com.amazon.aps.iva.a2.b0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.hc.n;
import com.amazon.aps.iva.s1.f;
import com.bumptech.glide.integration.compose.GlideNodeElement;
/* compiled from: GlideModifier.kt */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] a = {defpackage.e.b(d.class, "displayedDrawable", "getDisplayedDrawable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/jvm/functions/Function0;", 1)};
    public static final b0 b = new b0("DisplayedDrawable", a0.h);

    public static com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.ec.f fVar2, String str, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar3, Float f, y yVar, n.a aVar2, m mVar, Boolean bool, int i) {
        String str2;
        com.amazon.aps.iva.a1.a aVar3;
        com.amazon.aps.iva.s1.f fVar4;
        Float f2;
        y yVar2;
        n.a aVar4;
        m mVar2;
        com.amazon.aps.iva.a1.f fVar5;
        Boolean bool2 = null;
        if ((i & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 4) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        if ((i & 8) != 0) {
            fVar4 = null;
        } else {
            fVar4 = fVar3;
        }
        if ((i & 16) != 0) {
            f2 = null;
        } else {
            f2 = f;
        }
        if ((i & 32) != 0) {
            yVar2 = null;
        } else {
            yVar2 = yVar;
        }
        if ((i & 64) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar2;
        }
        if ((i & 128) != 0) {
            mVar2 = null;
        } else {
            mVar2 = mVar;
        }
        if ((i & 256) == 0) {
            bool2 = bool;
        }
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(fVar2, "requestBuilder");
        if (fVar4 == null) {
            fVar4 = f.a.e;
        }
        if (aVar3 == null) {
            aVar3 = a.C0097a.e;
        }
        com.amazon.aps.iva.a1.f o = fVar.o(new GlideNodeElement(fVar2, fVar4, aVar3, f2, yVar2, mVar2, bool2, aVar4)).o(com.amazon.aps.iva.cq.b.G(fVar));
        if (str2 != null) {
            fVar5 = o.a(fVar, false, new c(str2));
        } else {
            fVar5 = f.a.c;
        }
        return o.o(fVar5);
    }
}
