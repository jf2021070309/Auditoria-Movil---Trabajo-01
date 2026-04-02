package com.amazon.aps.iva.a6;

import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.v6.m;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Pair pair = (Pair) this.d;
                ((j1.a) this.c).c.h.I(((Integer) pair.first).intValue(), (v.b) pair.second);
                return;
            case 1:
                j.a aVar = (j.a) this.c;
                aVar.getClass();
                int i = com.amazon.aps.iva.t5.g0.a;
                aVar.b.n((f) this.d);
                return;
            case 2:
                e.a aVar2 = (e.a) this.c;
                ((com.amazon.aps.iva.g6.e) this.d).I(aVar2.a, aVar2.b);
                return;
            case 3:
                m.a aVar3 = (m.a) this.c;
                f fVar = (f) this.d;
                aVar3.getClass();
                synchronized (fVar) {
                }
                com.amazon.aps.iva.v6.m mVar = aVar3.b;
                int i2 = com.amazon.aps.iva.t5.g0.a;
                mVar.r(fVar);
                return;
            case 4:
                List list = (List) this.d;
                int i3 = com.amazon.aps.iva.b8.m.b;
                if (((SettableFuture) this.c).isCancelled()) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        if (list.get(i4) != null) {
                            ((ListenableFuture) list.get(i4)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            default:
                com.amazon.aps.iva.ta0.a aVar4 = (com.amazon.aps.iva.ta0.a) this.c;
                WebView webView = (WebView) this.d;
                aVar4.getClass();
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                aVar4.d.post(new com.amazon.aps.iva.q.e1(webView, 9));
                return;
        }
    }
}
