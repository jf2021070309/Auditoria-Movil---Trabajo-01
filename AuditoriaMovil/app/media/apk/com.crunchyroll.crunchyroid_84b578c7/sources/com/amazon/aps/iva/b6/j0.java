package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements o.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ b.a c;

    public /* synthetic */ j0(b.a aVar, int i) {
        this.b = i;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        b.a aVar = this.c;
        switch (i) {
            case 0:
                ((b) obj).k(aVar);
                return;
            default:
                ((b) obj).E(aVar);
                return;
        }
    }
}
