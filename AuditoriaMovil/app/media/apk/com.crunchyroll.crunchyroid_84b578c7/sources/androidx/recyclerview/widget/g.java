package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
/* compiled from: ConcatAdapterController.java */
/* loaded from: classes.dex */
public final class g implements w.b {
    public final f a;
    public final j0 b;
    public final ArrayList c = new ArrayList();
    public final IdentityHashMap<RecyclerView.f0, w> d = new IdentityHashMap<>();
    public final ArrayList e = new ArrayList();
    public a f = new a();
    public final f.a.EnumC0056a g;
    public final g0 h;

    /* compiled from: ConcatAdapterController.java */
    /* loaded from: classes.dex */
    public static class a {
        public w a;
        public int b;
        public boolean c;
    }

    public g(f fVar, f.a aVar) {
        this.a = fVar;
        if (aVar.a) {
            this.b = new j0.a();
        } else {
            this.b = new j0.b();
        }
        f.a.EnumC0056a enumC0056a = aVar.b;
        this.g = enumC0056a;
        if (enumC0056a == f.a.EnumC0056a.NO_STABLE_IDS) {
            this.h = new g0.b();
        } else if (enumC0056a == f.a.EnumC0056a.ISOLATED_STABLE_IDS) {
            this.h = new g0.a();
        } else if (enumC0056a == f.a.EnumC0056a.SHARED_STABLE_IDS) {
            this.h = new g0.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public final void a() {
        RecyclerView.h.a aVar;
        Iterator it = this.e.iterator();
        while (true) {
            if (it.hasNext()) {
                w wVar = (w) it.next();
                RecyclerView.h.a stateRestorationPolicy = wVar.c.getStateRestorationPolicy();
                aVar = RecyclerView.h.a.PREVENT;
                if (stateRestorationPolicy == aVar || (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && wVar.e == 0)) {
                    break;
                }
            } else {
                aVar = RecyclerView.h.a.ALLOW;
                break;
            }
        }
        f fVar = this.a;
        if (aVar != fVar.getStateRestorationPolicy()) {
            fVar.e(aVar);
        }
    }

    public final int b(w wVar) {
        w wVar2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (wVar2 = (w) it.next()) != wVar) {
            i += wVar2.e;
        }
        return i;
    }

    public final a c(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w wVar = (w) it.next();
            int i3 = wVar.e;
            if (i3 > i2) {
                aVar.a = wVar;
                aVar.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (aVar.a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Cannot find wrapper for ", i));
    }

    public final w d(RecyclerView.f0 f0Var) {
        w wVar = this.d.get(f0Var);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public final int e(RecyclerView.h<RecyclerView.f0> hVar) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((w) arrayList.get(i)).c == hVar) {
                return i;
            }
        }
        return -1;
    }
}
