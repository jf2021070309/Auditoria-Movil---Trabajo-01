package com.amazon.aps.iva.du;

import android.view.View;
import com.amazon.aps.iva.q30.d;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                EventDispatcher eventDispatcher = (EventDispatcher) obj2;
                x xVar = (x) obj;
                com.amazon.aps.iva.yb0.j.f(eventDispatcher, "$eventDispatcher");
                com.amazon.aps.iva.yb0.j.f(xVar, "$model");
                eventDispatcher.notify(new c(xVar));
                return;
            default:
                d.a aVar = (d.a) obj2;
                com.amazon.aps.iva.q30.b bVar = (com.amazon.aps.iva.q30.b) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = d.a.e;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(bVar, "$recentSearch");
                aVar.b.e5(bVar, aVar.getBindingAdapterPosition());
                return;
        }
    }
}
