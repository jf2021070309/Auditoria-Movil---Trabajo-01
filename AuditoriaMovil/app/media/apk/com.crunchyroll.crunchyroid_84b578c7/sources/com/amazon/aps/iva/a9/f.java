package com.amazon.aps.iva.a9;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.a9.n;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class f extends com.amazon.aps.iva.n4.c0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class b extends n.f {
        public final /* synthetic */ Rect a;

        public b(Rect rect) {
            this.a = rect;
        }

        @Override // com.amazon.aps.iva.a9.n.f
        public final Rect a() {
            Rect rect = this.a;
            if (rect != null && !rect.isEmpty()) {
                return rect;
            }
            return null;
        }
    }

    public static boolean s(n nVar) {
        if (com.amazon.aps.iva.n4.c0.h(nVar.getTargetIds()) && com.amazon.aps.iva.n4.c0.h(nVar.getTargetNames()) && com.amazon.aps.iva.n4.c0.h(nVar.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void a(View view, Object obj) {
        ((n) obj).addTarget(view);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void b(Object obj, ArrayList<View> arrayList) {
        n nVar;
        n nVar2 = (n) obj;
        if (nVar2 == null) {
            return;
        }
        int i = 0;
        if (nVar2 instanceof r) {
            r rVar = (r) nVar2;
            int size = rVar.b.size();
            while (i < size) {
                if (i >= 0 && i < rVar.b.size()) {
                    nVar = rVar.b.get(i);
                } else {
                    nVar = null;
                }
                b(nVar, arrayList);
                i++;
            }
        } else if (!s(nVar2) && com.amazon.aps.iva.n4.c0.h(nVar2.getTargets())) {
            int size2 = arrayList.size();
            while (i < size2) {
                nVar2.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void c(ViewGroup viewGroup, Object obj) {
        p.a(viewGroup, (n) obj);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final boolean e(Object obj) {
        return obj instanceof n;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((n) obj).mo4clone();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object i(Object obj, Object obj2, Object obj3) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        n nVar3 = (n) obj3;
        if (nVar != null && nVar2 != null) {
            r rVar = new r();
            rVar.a(nVar);
            rVar.a(nVar2);
            rVar.e(1);
            nVar = rVar;
        } else if (nVar == null) {
            if (nVar2 != null) {
                nVar = nVar2;
            } else {
                nVar = null;
            }
        }
        if (nVar3 != null) {
            r rVar2 = new r();
            if (nVar != null) {
                rVar2.a(nVar);
            }
            rVar2.a(nVar3);
            return rVar2;
        }
        return nVar;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object j(Object obj, Object obj2) {
        r rVar = new r();
        if (obj != null) {
            rVar.a((n) obj);
        }
        rVar.a((n) obj2);
        return rVar;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((n) obj).addListener(new a(view, arrayList));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((n) obj).addListener(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            com.amazon.aps.iva.n4.c0.g(rect, view);
            ((n) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void n(Object obj, Rect rect) {
        ((n) obj).setEpicenterCallback(new b(rect));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void o(Object obj, com.amazon.aps.iva.k3.f fVar, com.amazon.aps.iva.n4.d dVar) {
        n nVar = (n) obj;
        fVar.b(new h(nVar));
        nVar.addListener(new i(dVar));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        r rVar = (r) obj;
        List<View> targets = rVar.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.amazon.aps.iva.n4.c0.d(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(rVar, arrayList);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        r rVar = (r) obj;
        if (rVar != null) {
            rVar.getTargets().clear();
            rVar.getTargets().addAll(arrayList2);
            t(rVar, arrayList, arrayList2);
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        r rVar = new r();
        rVar.a((n) obj);
        return rVar;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        n nVar;
        n nVar2 = (n) obj;
        int i = 0;
        if (nVar2 instanceof r) {
            r rVar = (r) nVar2;
            int size2 = rVar.b.size();
            while (i < size2) {
                if (i >= 0 && i < rVar.b.size()) {
                    nVar = rVar.b.get(i);
                } else {
                    nVar = null;
                }
                t(nVar, arrayList, arrayList2);
                i++;
            }
        } else if (!s(nVar2)) {
            List<View> targets = nVar2.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    nVar2.addTarget(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        nVar2.removeTarget(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class a implements n.g {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public a(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            nVar.removeListener(this);
            this.a.setVisibility(8);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionStart(n nVar) {
            nVar.removeListener(this);
            nVar.addListener(this);
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionCancel(n nVar) {
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionPause(n nVar) {
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionResume(n nVar) {
        }
    }
}
