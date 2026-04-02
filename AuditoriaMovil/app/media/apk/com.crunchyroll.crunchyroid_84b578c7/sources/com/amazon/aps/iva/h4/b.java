package com.amazon.aps.iva.h4;

import android.view.View;
import com.amazon.aps.iva.h4.a;
import com.amazon.aps.iva.h4.b;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {
    public static final i l;
    public static final j m;
    public static final k n;
    public static final l o;
    public static final m p;
    public static final c q;
    public final Object d;
    public final com.amazon.aps.iva.h4.c e;
    public final float i;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public final float g = -3.4028235E38f;
    public long h = 0;
    public final ArrayList<p> j = new ArrayList<>();
    public final ArrayList<q> k = new ArrayList<>();

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class a extends r {
        public a() {
            super("y");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: com.amazon.aps.iva.h4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0322b extends r {
        public C0322b() {
            super("z");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            return g0.i.m(view);
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.i.x(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class c extends r {
        public c() {
            super("alpha");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class d extends r {
        public d() {
            super("scrollX");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class e extends r {
        public e() {
            super("scrollY");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class f extends r {
        public f() {
            super("translationX");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class g extends r {
        public g() {
            super("translationY");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class h extends r {
        public h() {
            super("translationZ");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            return g0.i.l(view);
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.i.w(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class i extends r {
        public i() {
            super("scaleX");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class j extends r {
        public j() {
            super("scaleY");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class k extends r {
        public k() {
            super("rotation");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class l extends r {
        public l() {
            super("rotationX");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class m extends r {
        public m() {
            super("rotationY");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class n extends r {
        public n() {
            super("x");
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class o {
        public float a;
        public float b;
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface p {
        void onAnimationEnd();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface q {
        void a();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static abstract class r extends com.amazon.aps.iva.h4.c<View> {
    }

    static {
        new f();
        new g();
        new h();
        l = new i();
        m = new j();
        n = new k();
        o = new l();
        p = new m();
        new n();
        new a();
        new C0322b();
        q = new c();
        new d();
        new e();
    }

    public <K> b(K k2, com.amazon.aps.iva.h4.c<K> cVar) {
        this.d = k2;
        this.e = cVar;
        if (cVar != n && cVar != o && cVar != p) {
            if (cVar == q) {
                this.i = 0.00390625f;
                return;
            } else if (cVar != l && cVar != m) {
                this.i = 1.0f;
                return;
            } else {
                this.i = 0.00390625f;
                return;
            }
        }
        this.i = 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    @Override // com.amazon.aps.iva.h4.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r26) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h4.b.a(long):boolean");
    }

    public final void b(float f2) {
        ArrayList<q> arrayList;
        this.e.setValue(this.d, f2);
        int i2 = 0;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).a();
            }
            i2++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }
}
