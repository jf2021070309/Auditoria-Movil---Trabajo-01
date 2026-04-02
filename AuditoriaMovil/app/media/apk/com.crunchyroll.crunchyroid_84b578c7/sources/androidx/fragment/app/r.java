package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.ArrayList;
/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class r {
    public final j a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public final ArrayList<a> c = new ArrayList<>();
    public boolean j = true;
    public boolean r = false;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public g.b h;
        public g.b i;

        public a() {
        }

        public a(Fragment fragment, int i) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            g.b bVar = g.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.c = true;
            g.b bVar = g.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(Fragment fragment, g.b bVar) {
            this.a = 10;
            this.b = fragment;
            this.c = false;
            this.h = fragment.mMaxState;
            this.i = bVar;
        }
    }

    public r(j jVar, ClassLoader classLoader) {
        this.a = jVar;
        this.b = classLoader;
    }

    public final void b(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public final void c(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void d(int i, Fragment fragment, String str, int i2);

    public final void e(int i, Fragment fragment, String str) {
        if (i != 0) {
            d(i, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void f(Class cls, Bundle bundle) {
        j jVar = this.a;
        if (jVar != null) {
            if (this.b != null) {
                Fragment a2 = jVar.a(cls.getName());
                if (bundle != null) {
                    a2.setArguments(bundle);
                }
                e(16908290, a2, null);
                return;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }
}
