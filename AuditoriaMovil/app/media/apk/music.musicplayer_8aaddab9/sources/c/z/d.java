package c.z;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c.i.g.a;
import c.m.b.h0;
import c.z.i;
import java.util.ArrayList;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class d extends h0 {

    /* loaded from: classes.dex */
    public class a extends i.c {
        public a(d dVar, Rect rect) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements i.d {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2871b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.a = view;
            this.f2871b = arrayList;
        }

        @Override // c.z.i.d
        public void a(i iVar) {
            iVar.y(this);
            iVar.a(this);
        }

        @Override // c.z.i.d
        public void b(i iVar) {
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            iVar.y(this);
            this.a.setVisibility(8);
            int size = this.f2871b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2871b.get(i2)).setVisibility(0);
            }
        }

        @Override // c.z.i.d
        public void d(i iVar) {
        }

        @Override // c.z.i.d
        public void e(i iVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends l {
        public final /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2872b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2873c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2874d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f2875e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2876f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f2872b = arrayList;
            this.f2873c = obj2;
            this.f2874d = arrayList2;
            this.f2875e = obj3;
            this.f2876f = arrayList3;
        }

        @Override // c.z.l, c.z.i.d
        public void a(i iVar) {
            Object obj = this.a;
            if (obj != null) {
                d.this.u(obj, this.f2872b, null);
            }
            Object obj2 = this.f2873c;
            if (obj2 != null) {
                d.this.u(obj2, this.f2874d, null);
            }
            Object obj3 = this.f2875e;
            if (obj3 != null) {
                d.this.u(obj3, this.f2876f, null);
            }
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            iVar.y(this);
        }
    }

    /* renamed from: c.z.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062d implements a.InterfaceC0036a {
        public final /* synthetic */ i a;

        public C0062d(d dVar, i iVar) {
            this.a = iVar;
        }

        @Override // c.i.g.a.InterfaceC0036a
        public void a() {
            this.a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public class e implements i.d {
        public final /* synthetic */ Runnable a;

        public e(d dVar, Runnable runnable) {
            this.a = runnable;
        }

        @Override // c.z.i.d
        public void a(i iVar) {
        }

        @Override // c.z.i.d
        public void b(i iVar) {
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            this.a.run();
        }

        @Override // c.z.i.d
        public void d(i iVar) {
        }

        @Override // c.z.i.d
        public void e(i iVar) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends i.c {
        public f(d dVar, Rect rect) {
        }
    }

    public static boolean t(i iVar) {
        return (h0.i(iVar.f2889h) && h0.i(null) && h0.i(null)) ? false : true;
    }

    @Override // c.m.b.h0
    public void a(Object obj, View view) {
        ((i) obj).b(view);
    }

    @Override // c.m.b.h0
    public void b(Object obj, ArrayList<View> arrayList) {
        i iVar = (i) obj;
        if (iVar == null) {
            return;
        }
        int i2 = 0;
        if (iVar instanceof o) {
            o oVar = (o) iVar;
            int size = oVar.x.size();
            while (i2 < size) {
                b(oVar.L(i2), arrayList);
                i2++;
            }
        } else if (t(iVar) || !h0.i(iVar.f2890i)) {
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                iVar.b(arrayList.get(i2));
                i2++;
            }
        }
    }

    @Override // c.m.b.h0
    public void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    @Override // c.m.b.h0
    public boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // c.m.b.h0
    public Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // c.m.b.h0
    public Object j(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            o oVar = new o();
            oVar.K(iVar);
            oVar.K(iVar2);
            oVar.N(1);
            iVar = oVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 != null) {
            o oVar2 = new o();
            if (iVar != null) {
                oVar2.K(iVar);
            }
            oVar2.K(iVar3);
            return oVar2;
        }
        return iVar;
    }

    @Override // c.m.b.h0
    public Object k(Object obj, Object obj2, Object obj3) {
        o oVar = new o();
        if (obj != null) {
            oVar.K((i) obj);
        }
        oVar.K((i) obj2);
        return oVar;
    }

    @Override // c.m.b.h0
    public void l(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new b(this, view, arrayList));
    }

    @Override // c.m.b.h0
    public void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((i) obj).a(new c(obj2, arrayList, null, null, obj4, arrayList3));
    }

    @Override // c.m.b.h0
    public void n(Object obj, Rect rect) {
        ((i) obj).D(new f(this, rect));
    }

    @Override // c.m.b.h0
    public void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((i) obj).D(new a(this, rect));
        }
    }

    @Override // c.m.b.h0
    public void p(Fragment fragment, Object obj, c.i.g.a aVar, Runnable runnable) {
        i iVar = (i) obj;
        aVar.b(new C0062d(this, iVar));
        iVar.a(new e(this, runnable));
    }

    @Override // c.m.b.h0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        o oVar = (o) obj;
        ArrayList<View> arrayList2 = oVar.f2890i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h0.d(arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(oVar, arrayList);
    }

    @Override // c.m.b.h0
    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o oVar = (o) obj;
        if (oVar != null) {
            oVar.f2890i.clear();
            oVar.f2890i.addAll(arrayList2);
            u(oVar, arrayList, arrayList2);
        }
    }

    @Override // c.m.b.h0
    public Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = new o();
        oVar.K((i) obj);
        return oVar;
    }

    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        i iVar = (i) obj;
        int i2 = 0;
        if (iVar instanceof o) {
            o oVar = (o) iVar;
            int size = oVar.x.size();
            while (i2 < size) {
                u(oVar.L(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (t(iVar)) {
        } else {
            ArrayList<View> arrayList3 = iVar.f2890i;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size2) {
                iVar.b(arrayList2.get(i2));
                i2++;
            }
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                iVar.z(arrayList.get(size3));
            }
        }
    }
}
