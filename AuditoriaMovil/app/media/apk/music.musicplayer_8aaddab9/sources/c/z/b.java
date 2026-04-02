package c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import c.i.k.d0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b extends c.z.i {
    public int[] F = new int[2];
    public static final String[] x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> y = new a(PointF.class, "boundsOrigin");
    public static final Property<i, PointF> z = new C0061b(PointF.class, "topLeft");
    public static final Property<i, PointF> A = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> B = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> C = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> D = new f(PointF.class, "position");
    public static c.z.g E = new c.z.g();

    /* loaded from: classes.dex */
    public class a extends Property<Drawable, PointF> {
        public Rect a;

        public a(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    }

    /* renamed from: c.z.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0061b extends Property<i, PointF> {
        public C0061b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2854b = round;
            int i2 = iVar2.f2858f + 1;
            iVar2.f2858f = i2;
            if (i2 == iVar2.f2859g) {
                t.b(iVar2.f2857e, iVar2.a, round, iVar2.f2855c, iVar2.f2856d);
                iVar2.f2858f = 0;
                iVar2.f2859g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f2855c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2856d = round;
            int i2 = iVar2.f2859g + 1;
            iVar2.f2859g = i2;
            if (iVar2.f2858f == i2) {
                t.b(iVar2.f2857e, iVar2.a, iVar2.f2854b, iVar2.f2855c, round);
                iVar2.f2858f = 0;
                iVar2.f2859g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            t.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends l {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2853b;

        public h(b bVar, ViewGroup viewGroup) {
            this.f2853b = viewGroup;
        }

        @Override // c.z.l, c.z.i.d
        public void b(c.z.i iVar) {
            s.a(this.f2853b, false);
        }

        @Override // c.z.i.d
        public void c(c.z.i iVar) {
            if (!this.a) {
                s.a(this.f2853b, false);
            }
            iVar.y(this);
        }

        @Override // c.z.l, c.z.i.d
        public void d(c.z.i iVar) {
            s.a(this.f2853b, false);
            this.a = true;
        }

        @Override // c.z.l, c.z.i.d
        public void e(c.z.i iVar) {
            s.a(this.f2853b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2854b;

        /* renamed from: c  reason: collision with root package name */
        public int f2855c;

        /* renamed from: d  reason: collision with root package name */
        public int f2856d;

        /* renamed from: e  reason: collision with root package name */
        public View f2857e;

        /* renamed from: f  reason: collision with root package name */
        public int f2858f;

        /* renamed from: g  reason: collision with root package name */
        public int f2859g;

        public i(View view) {
            this.f2857e = view;
        }
    }

    public final void K(q qVar) {
        View view = qVar.f2907b;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (!d0.f.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        qVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        qVar.a.put("android:changeBounds:parent", qVar.f2907b.getParent());
    }

    @Override // c.z.i
    public void d(q qVar) {
        K(qVar);
    }

    @Override // c.z.i
    public void g(q qVar) {
        K(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.z.i
    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        int i2;
        b bVar;
        ObjectAnimator A2;
        if (qVar == null || qVar2 == null) {
            return null;
        }
        Map<String, Object> map = qVar.a;
        Map<String, Object> map2 = qVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = qVar2.f2907b;
        Rect rect = (Rect) qVar.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) qVar2.a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) qVar.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) qVar2.a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 > 0) {
            t.b(view, i3, i5, i7, i9);
            if (i15 != 2) {
                bVar = this;
                A2 = (i3 == i4 && i5 == i6) ? c.t.m.A(view, B, bVar.w.a(i7, i9, i8, i10)) : c.t.m.A(view, C, bVar.w.a(i3, i5, i4, i6));
            } else if (i11 == i13 && i12 == i14) {
                bVar = this;
                A2 = c.t.m.A(view, D, bVar.w.a(i3, i5, i4, i6));
            } else {
                bVar = this;
                i iVar = new i(view);
                ObjectAnimator A3 = c.t.m.A(iVar, z, bVar.w.a(i3, i5, i4, i6));
                ObjectAnimator A4 = c.t.m.A(iVar, A, bVar.w.a(i7, i9, i8, i10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(A3, A4);
                animatorSet.addListener(new g(bVar, iVar));
                A2 = animatorSet;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                s.a(viewGroup4, true);
                bVar.a(new h(bVar, viewGroup4));
            }
            return A2;
        }
        return null;
    }

    @Override // c.z.i
    public String[] r() {
        return x;
    }
}
