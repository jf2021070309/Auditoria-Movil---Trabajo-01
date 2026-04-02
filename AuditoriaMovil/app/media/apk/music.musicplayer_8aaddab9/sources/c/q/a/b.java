package c.q.a;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import c.f.i;
import c.p.g0;
import c.p.i0;
import c.p.j0;
import c.p.l0;
import c.p.m0;
import c.p.p;
import c.p.w;
import c.p.x;
import c.q.a.a;
import c.q.b.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
/* loaded from: classes.dex */
public class b extends c.q.a.a {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2477b;

    /* loaded from: classes.dex */
    public static class a<D> extends w<D> implements b.InterfaceC0050b<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f2478l;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f2479m;

        /* renamed from: n  reason: collision with root package name */
        public final c.q.b.b<D> f2480n;
        public p o;
        public C0048b<D> p;
        public c.q.b.b<D> q;

        public a(int i2, Bundle bundle, c.q.b.b<D> bVar, c.q.b.b<D> bVar2) {
            this.f2478l = i2;
            this.f2479m = bundle;
            this.f2480n = bVar;
            this.q = bVar2;
            bVar.registerListener(i2, this);
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            this.f2480n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void f() {
            this.f2480n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(x<? super D> xVar) {
            super.g(xVar);
            this.o = null;
            this.p = null;
        }

        @Override // c.p.w, androidx.lifecycle.LiveData
        public void h(D d2) {
            super.h(d2);
            c.q.b.b<D> bVar = this.q;
            if (bVar != null) {
                bVar.reset();
                this.q = null;
            }
        }

        public c.q.b.b<D> j(boolean z) {
            this.f2480n.cancelLoad();
            this.f2480n.abandon();
            C0048b<D> c0048b = this.p;
            if (c0048b != null) {
                super.g(c0048b);
                this.o = null;
                this.p = null;
                if (z && c0048b.f2482c) {
                    c0048b.f2481b.onLoaderReset(c0048b.a);
                }
            }
            this.f2480n.unregisterListener(this);
            if ((c0048b == null || c0048b.f2482c) && !z) {
                return this.f2480n;
            }
            this.f2480n.reset();
            return this.q;
        }

        public void k() {
            p pVar = this.o;
            C0048b<D> c0048b = this.p;
            if (pVar == null || c0048b == null) {
                return;
            }
            super.g(c0048b);
            d(pVar, c0048b);
        }

        public void l(c.q.b.b<D> bVar, D d2) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                i(d2);
                return;
            }
            super.h(d2);
            c.q.b.b<D> bVar2 = this.q;
            if (bVar2 != null) {
                bVar2.reset();
                this.q = null;
            }
        }

        public c.q.b.b<D> m(p pVar, a.InterfaceC0047a<D> interfaceC0047a) {
            C0048b<D> c0048b = new C0048b<>(this.f2480n, interfaceC0047a);
            d(pVar, c0048b);
            C0048b<D> c0048b2 = this.p;
            if (c0048b2 != null) {
                g(c0048b2);
            }
            this.o = pVar;
            this.p = c0048b;
            return this.f2480n;
        }

        public String toString() {
            StringBuilder v = e.a.d.a.a.v(64, "LoaderInfo{");
            v.append(Integer.toHexString(System.identityHashCode(this)));
            v.append(" #");
            v.append(this.f2478l);
            v.append(" : ");
            c.i.a.d(this.f2480n, v);
            v.append("}}");
            return v.toString();
        }
    }

    /* renamed from: c.q.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0048b<D> implements x<D> {
        public final c.q.b.b<D> a;

        /* renamed from: b  reason: collision with root package name */
        public final a.InterfaceC0047a<D> f2481b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2482c = false;

        public C0048b(c.q.b.b<D> bVar, a.InterfaceC0047a<D> interfaceC0047a) {
            this.a = bVar;
            this.f2481b = interfaceC0047a;
        }

        @Override // c.p.x
        public void a(D d2) {
            this.f2481b.onLoadFinished(this.a, d2);
            this.f2482c = true;
        }

        public String toString() {
            return this.f2481b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g0 {

        /* renamed from: c  reason: collision with root package name */
        public static final i0 f2483c = new a();

        /* renamed from: d  reason: collision with root package name */
        public i<a> f2484d = new i<>();

        /* renamed from: e  reason: collision with root package name */
        public boolean f2485e = false;

        /* loaded from: classes.dex */
        public static class a implements i0 {
            @Override // c.p.i0
            public <T extends g0> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // c.p.g0
        public void a() {
            int g2 = this.f2484d.g();
            for (int i2 = 0; i2 < g2; i2++) {
                this.f2484d.j(i2).j(true);
            }
            i<a> iVar = this.f2484d;
            int i3 = iVar.f1668d;
            Object[] objArr = iVar.f1667c;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            iVar.f1668d = 0;
        }
    }

    public b(p pVar, m0 m0Var) {
        this.a = pVar;
        i0 i0Var = c.f2483c;
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String k2 = e.a.d.a.a.k("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        g0 g0Var = m0Var.a.get(k2);
        if (!c.class.isInstance(g0Var)) {
            g0Var = i0Var instanceof j0 ? ((j0) i0Var).c(k2, c.class) : ((c.a) i0Var).a(c.class);
            g0 put = m0Var.a.put(k2, g0Var);
            if (put != null) {
                put.a();
            }
        } else if (i0Var instanceof l0) {
            ((l0) i0Var).b(g0Var);
        }
        this.f2477b = (c) g0Var;
    }

    @Override // c.q.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f2477b;
        if (cVar.f2484d.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < cVar.f2484d.g(); i2++) {
                a j2 = cVar.f2484d.j(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f2484d.e(i2));
                printWriter.print(": ");
                printWriter.println(j2.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(j2.f2478l);
                printWriter.print(" mArgs=");
                printWriter.println(j2.f2479m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(j2.f2480n);
                j2.f2480n.dump(e.a.d.a.a.k(str2, "  "), fileDescriptor, printWriter, strArr);
                if (j2.p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(j2.p);
                    C0048b<D> c0048b = j2.p;
                    Objects.requireNonNull(c0048b);
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0048b.f2482c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                c.q.b.b<D> bVar = j2.f2480n;
                Object obj = j2.f451f;
                if (obj == LiveData.a) {
                    obj = null;
                }
                printWriter.println(bVar.dataToString(obj));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(j2.f449d > 0);
            }
        }
    }

    public String toString() {
        StringBuilder v = e.a.d.a.a.v(128, "LoaderManager{");
        v.append(Integer.toHexString(System.identityHashCode(this)));
        v.append(" in ");
        c.i.a.d(this.a, v);
        v.append("}}");
        return v.toString();
    }
}
