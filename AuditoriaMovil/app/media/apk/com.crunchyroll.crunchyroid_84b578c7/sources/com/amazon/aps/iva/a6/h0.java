package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements o.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(int i, int i2, Object obj) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((l0.c) obj).l0(i2, (com.amazon.aps.iva.q5.b0) obj2);
                return;
            default:
                ((com.amazon.aps.iva.b6.b) obj).H((b.a) obj2, i2);
                return;
        }
    }
}
