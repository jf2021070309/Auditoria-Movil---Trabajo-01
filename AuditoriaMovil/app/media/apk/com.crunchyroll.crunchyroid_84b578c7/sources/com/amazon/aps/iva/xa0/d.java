package com.amazon.aps.iva.xa0;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.v0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: Insetter.kt */
/* loaded from: classes4.dex */
public final class d extends v0.b {
    public final /* synthetic */ a a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, View view) {
        super(1);
        this.a = aVar;
        this.b = view;
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public final void onEnd(v0 v0Var) {
        j.f(v0Var, "animation");
        a aVar = this.a;
        int i = aVar.a;
        v0.e eVar = v0Var.a;
        int c = i & eVar.c();
        View view = this.b;
        if (c != 0) {
            aVar.a = (~eVar.c()) & aVar.a;
            w0 w0Var = aVar.b;
            if (w0Var != null) {
                g0.b(view, w0Var);
            }
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        for (View view2 : aVar.f) {
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
        }
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public final void onPrepare(v0 v0Var) {
        j.f(v0Var, "animation");
        a aVar = this.a;
        aVar.a = (v0Var.a.c() & aVar.e) | aVar.a;
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public final w0 onProgress(w0 w0Var, List<v0> list) {
        boolean z;
        j.f(w0Var, "insets");
        j.f(list, "runningAnimations");
        int i = 0;
        for (v0 v0Var : list) {
            i |= v0Var.a.c();
        }
        a aVar = this.a;
        int i2 = i & aVar.e;
        if (i2 == 0) {
            return w0Var;
        }
        com.amazon.aps.iva.g3.f a = w0Var.a(i2);
        j.e(a, "insets.getInsets(runningAnimatingTypes)");
        g gVar = aVar.c;
        gVar.getClass();
        g gVar2 = aVar.d;
        j.f(gVar2, "other");
        if ((gVar2.a | gVar2.b | gVar2.c | gVar2.d) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            g gVar3 = new g();
            gVar3.a = gVar.a | gVar2.a;
            gVar3.b = gVar.b | gVar2.b;
            gVar3.c = gVar.c | gVar2.c;
            gVar3.d = gVar.d | gVar2.d;
            gVar = gVar3;
        }
        com.amazon.aps.iva.g3.f a2 = w0Var.a((~i2) & (gVar.d | gVar.a | gVar.b | gVar.c));
        j.e(a2, "insets.getInsets(\n      …                        )");
        com.amazon.aps.iva.g3.f b = com.amazon.aps.iva.g3.f.b(a.a - a2.a, a.b - a2.b, a.c - a2.c, a.d - a2.d);
        com.amazon.aps.iva.g3.f b2 = com.amazon.aps.iva.g3.f.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0));
        float f = b2.a - b2.c;
        float f2 = b2.b - b2.d;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        for (View view2 : aVar.f) {
            view2.setTranslationX(f);
            view2.setTranslationY(f2);
        }
        return w0Var;
    }
}
