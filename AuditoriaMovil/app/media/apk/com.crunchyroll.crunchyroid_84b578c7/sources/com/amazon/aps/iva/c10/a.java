package com.amazon.aps.iva.c10;

import android.content.DialogInterface;
import com.amazon.aps.iva.b40.f;
import com.amazon.aps.iva.b40.g;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ h c;

    public /* synthetic */ a(h hVar, int i) {
        this.b = i;
        this.c = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        h hVar = this.c;
        switch (i2) {
            case 0:
                b bVar = (b) hVar;
                j.f(bVar, "this$0");
                c cVar = bVar.c;
                if (cVar != null) {
                    cVar.b.b(true);
                    cVar.d.i(true);
                    cVar.c.invoke();
                    return;
                }
                j.m("presenter");
                throw null;
            default:
                f fVar = (f) hVar;
                f.a aVar = f.f;
                j.f(fVar, "this$0");
                ((g) fVar.e.getValue()).I1();
                return;
        }
    }
}
