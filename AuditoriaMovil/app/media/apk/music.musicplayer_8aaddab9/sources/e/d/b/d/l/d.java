package e.d.b.d.l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes2.dex */
public interface d {

    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> a = new b();

        /* renamed from: b  reason: collision with root package name */
        public final e f6400b = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f2, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f6400b;
            float R = e.d.b.d.a.R(eVar3.a, eVar4.a, f2);
            float R2 = e.d.b.d.a.R(eVar3.f6401b, eVar4.f6401b, f2);
            float R3 = e.d.b.d.a.R(eVar3.f6402c, eVar4.f6402c, f2);
            eVar5.a = R;
            eVar5.f6401b = R2;
            eVar5.f6402c = R3;
            return this.f6400b;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: e.d.b.d.l.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0140d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0140d("circularRevealScrimColor");

        public C0140d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f6401b;

        /* renamed from: c  reason: collision with root package name */
        public float f6402c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.f6401b = f3;
            this.f6402c = f4;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
