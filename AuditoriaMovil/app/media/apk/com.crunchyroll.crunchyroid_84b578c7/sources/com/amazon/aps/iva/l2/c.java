package com.amazon.aps.iva.l2;

import android.graphics.Typeface;
import android.text.Spannable;
import com.amazon.aps.iva.c2.u;
import com.amazon.aps.iva.f2.m;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.h2.t;
import com.amazon.aps.iva.h2.y;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SpannableExtensions.android.kt */
/* loaded from: classes.dex */
public final class c extends l implements q<u, Integer, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Spannable h;
    public final /* synthetic */ r<k, y, t, com.amazon.aps.iva.h2.u, Typeface> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Spannable spannable, com.amazon.aps.iva.k2.c cVar) {
        super(3);
        this.h = spannable;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(u uVar, Integer num, Integer num2) {
        int i;
        int i2;
        u uVar2 = uVar;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        j.f(uVar2, "spanStyle");
        y yVar = uVar2.c;
        if (yVar == null) {
            yVar = y.g;
        }
        t tVar = uVar2.d;
        if (tVar != null) {
            i = tVar.a;
        } else {
            i = 0;
        }
        t tVar2 = new t(i);
        com.amazon.aps.iva.h2.u uVar3 = uVar2.e;
        if (uVar3 != null) {
            i2 = uVar3.a;
        } else {
            i2 = 1;
        }
        this.h.setSpan(new m(this.i.K(uVar2.f, yVar, tVar2, new com.amazon.aps.iva.h2.u(i2))), intValue, intValue2, 33);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
