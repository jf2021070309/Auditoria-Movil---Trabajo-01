package com.amazon.aps.iva.g1;

import android.os.Bundle;
import android.text.Editable;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.q1;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.i7.g;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.q;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.t0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j, k.a, g.a, t.c, com.amazon.aps.iva.t5.g, p1.d, TextInputLayout.LengthCounter {
    public final /* synthetic */ int b;

    public /* synthetic */ e(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        int i = p1.i;
        ((v1) obj).w();
    }

    @Override // com.amazon.aps.iva.i7.g.a
    public final boolean c(int i, int i2, int i3, int i4, int i5) {
        e eVar = com.amazon.aps.iva.n7.d.u;
        if ((i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public final int countLength(Editable editable) {
        int lambda$new$0;
        lambda$new$0 = TextInputLayout.lambda$new$0(editable);
        return lambda$new$0;
    }

    @Override // com.amazon.aps.iva.b8.p1.d
    public final void d(v1 v1Var, q.e eVar) {
        q1.k(v1Var, eVar);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final com.amazon.aps.iva.q5.k e(Bundle bundle) {
        boolean z = false;
        switch (this.b) {
            case 1:
                int i = bundle.getInt(com.amazon.aps.iva.q5.q.g, 0);
                int i2 = bundle.getInt(com.amazon.aps.iva.q5.q.h, 0);
                int i3 = bundle.getInt(com.amazon.aps.iva.q5.q.i, 0);
                String string = bundle.getString(com.amazon.aps.iva.q5.q.j);
                q.a aVar = new q.a(i);
                aVar.b = i2;
                aVar.c = i3;
                com.amazon.aps.iva.cq.b.t((i != 0 || string == null) ? true : true);
                aVar.d = string;
                return aVar.a();
            case 2:
                return new b0.f(bundle.getLong(b0.f.h, -9223372036854775807L), bundle.getLong(b0.f.i, -9223372036854775807L), bundle.getLong(b0.f.j, -9223372036854775807L), bundle.getFloat(b0.f.k, -3.4028235E38f), bundle.getFloat(b0.f.l, -3.4028235E38f));
            case 3:
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(l0.a.d);
                if (integerArrayList == null) {
                    return l0.a.c;
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i4 = 0; i4 < integerArrayList.size(); i4++) {
                    sparseBooleanArray.append(integerArrayList.get(i4).intValue(), true);
                }
                return new l0.a(new com.amazon.aps.iva.q5.u(sparseBooleanArray));
            default:
                Bundle bundle2 = bundle.getBundle(t0.d);
                bundle2.getClass();
                int[] intArray = bundle.getIntArray(t0.e);
                intArray.getClass();
                return new t0((s0) s0.i.e(bundle2), Ints.asList(intArray));
        }
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        double d2;
        double d3;
        if (d < 0.0d) {
            d2 = -d;
        } else {
            d2 = d;
        }
        if (d2 >= 0.0031308049535603718d) {
            d2 = Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d;
            d3 = 0.9478672985781991d;
        } else {
            d3 = 0.07739938080495357d;
        }
        return Math.copySign(d2 / d3, d);
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        cVar.a(i);
    }
}
