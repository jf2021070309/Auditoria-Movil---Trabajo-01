package com.amazon.aps.iva.a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class b extends n {
    public static final String[] b = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C0108b c;
    public static final c d;
    public static final d e;
    public static final e f;
    public static final f g;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class a extends Property<Drawable, PointF> {
        public final Rect a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: com.amazon.aps.iva.a9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0108b extends Property<i, PointF> {
        public C0108b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.b = round;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                z.a(iVar2.e, iVar2.a, round, iVar2.c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.d = round;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                z.a(iVar2.e, iVar2.a, iVar2.b, iVar2.c, round);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            z.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            z.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            z.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends o {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionCancel(n nVar) {
            y.a(this.b, false);
            this.a = true;
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            if (!this.a) {
                y.a(this.b, false);
            }
            nVar.removeListener(this);
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionPause(n nVar) {
            y.a(this.b, false);
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionResume(n nVar) {
            y.a(this.b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    static {
        new a();
        c = new C0108b();
        d = new c();
        e = new d();
        f = new e();
        g = new f();
    }

    public static void a(u uVar) {
        View view = uVar.b;
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        if (g0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = uVar.a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", uVar.b.getParent());
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void captureEndValues(u uVar) {
        a(uVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void captureStartValues(u uVar) {
        a(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.a9.n
    public final Animator createAnimator(ViewGroup viewGroup, u uVar, u uVar2) {
        int i2;
        ObjectAnimator ofObject;
        if (uVar != null && uVar2 != null) {
            HashMap hashMap = uVar.a;
            HashMap hashMap2 = uVar2.a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = uVar2.b;
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
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
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i11 != 0 && i12 != 0) || (i13 != 0 && i14 != 0)) {
                    if (i3 == i4 && i5 == i6) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                int i15 = i2;
                if (i15 > 0) {
                    z.a(view, i3, i5, i7, i9);
                    if (i15 == 2) {
                        if (i11 == i13 && i12 == i14) {
                            ofObject = ObjectAnimator.ofObject(view, g, (TypeConverter) null, getPathMotion().getPath(i3, i5, i4, i6));
                        } else {
                            i iVar = new i(view);
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(iVar, c, (TypeConverter) null, getPathMotion().getPath(i3, i5, i4, i6));
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(iVar, d, (TypeConverter) null, getPathMotion().getPath(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new g(iVar));
                            ofObject = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        ofObject = ObjectAnimator.ofObject(view, e, (TypeConverter) null, getPathMotion().getPath(i7, i9, i8, i10));
                    } else {
                        ofObject = ObjectAnimator.ofObject(view, f, (TypeConverter) null, getPathMotion().getPath(i3, i5, i4, i6));
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        y.a(viewGroup4, true);
                        addListener(new h(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.a9.n
    public final String[] getTransitionProperties() {
        return b;
    }
}
