package c.m.b;

import androidx.fragment.app.Fragment;
import c.p.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: b  reason: collision with root package name */
    public int f2315b;

    /* renamed from: c  reason: collision with root package name */
    public int f2316c;

    /* renamed from: d  reason: collision with root package name */
    public int f2317d;

    /* renamed from: e  reason: collision with root package name */
    public int f2318e;

    /* renamed from: f  reason: collision with root package name */
    public int f2319f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2320g;

    /* renamed from: i  reason: collision with root package name */
    public String f2322i;

    /* renamed from: j  reason: collision with root package name */
    public int f2323j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2324k;

    /* renamed from: l  reason: collision with root package name */
    public int f2325l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2326m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f2327n;
    public ArrayList<String> o;
    public ArrayList<a> a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2321h = true;
    public boolean p = false;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f2328b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2329c;

        /* renamed from: d  reason: collision with root package name */
        public int f2330d;

        /* renamed from: e  reason: collision with root package name */
        public int f2331e;

        /* renamed from: f  reason: collision with root package name */
        public int f2332f;

        /* renamed from: g  reason: collision with root package name */
        public int f2333g;

        /* renamed from: h  reason: collision with root package name */
        public j.b f2334h;

        /* renamed from: i  reason: collision with root package name */
        public j.b f2335i;

        public a() {
        }

        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.f2328b = fragment;
            this.f2329c = false;
            j.b bVar = j.b.RESUMED;
            this.f2334h = bVar;
            this.f2335i = bVar;
        }

        public a(int i2, Fragment fragment, boolean z) {
            this.a = i2;
            this.f2328b = fragment;
            this.f2329c = z;
            j.b bVar = j.b.RESUMED;
            this.f2334h = bVar;
            this.f2335i = bVar;
        }
    }

    public d0(u uVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.a.add(aVar);
        aVar.f2330d = this.f2315b;
        aVar.f2331e = this.f2316c;
        aVar.f2332f = this.f2317d;
        aVar.f2333g = this.f2318e;
    }

    public abstract int c();

    public abstract void d(int i2, Fragment fragment, String str, int i3);

    public d0 e(int i2, Fragment fragment) {
        if (i2 != 0) {
            d(i2, fragment, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
