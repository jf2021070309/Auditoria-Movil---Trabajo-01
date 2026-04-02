package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements o.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ b.a c;
    public final /* synthetic */ Exception d;

    public /* synthetic */ f0(b.a aVar, Exception exc, int i) {
        this.b = i;
        this.c = aVar;
        this.d = exc;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((b) obj).d(this.c, this.d);
                return;
            default:
                ((b) obj).getClass();
                return;
        }
    }
}
