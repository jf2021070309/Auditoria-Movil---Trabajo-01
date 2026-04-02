package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements o.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ b.a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ a0(b.a aVar, int i, long j, long j2, int i2) {
        this.b = i2;
        this.c = aVar;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((b) obj).U(this.c, this.d, this.e, this.f);
                return;
            default:
                ((b) obj).z(this.c, this.d, this.e);
                return;
        }
    }
}
