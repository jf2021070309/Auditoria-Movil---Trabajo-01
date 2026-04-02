package com.amazon.aps.iva.a6;

import android.view.View;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.q3.p;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements o.a, com.amazon.aps.iva.q3.p {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(int i, int i2, Object obj) {
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
                ((l0.c) obj).g0(i2, ((k1) obj2).l);
                return;
            default:
                ((com.amazon.aps.iva.b6.b) obj).p((b.a) obj2, i2);
                return;
        }
    }

    @Override // com.amazon.aps.iva.q3.p
    public final boolean perform(View view, p.a aVar) {
        boolean lambda$createAccessibilityViewCommandForState$2;
        lambda$createAccessibilityViewCommandForState$2 = ((SideSheetBehavior) this.d).lambda$createAccessibilityViewCommandForState$2(this.c, view, aVar);
        return lambda$createAccessibilityViewCommandForState$2;
    }
}
