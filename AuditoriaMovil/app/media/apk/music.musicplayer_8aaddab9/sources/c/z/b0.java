package c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c.z.i;
/* loaded from: classes.dex */
public abstract class b0 extends i {
    public static final String[] x = {"android:visibility:visibility", "android:visibility:parent"};
    public int y = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements i.d {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2860b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f2861c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2862d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2863e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2864f = false;

        public a(View view, int i2, boolean z) {
            this.a = view;
            this.f2860b = i2;
            this.f2861c = (ViewGroup) view.getParent();
            this.f2862d = z;
            g(true);
        }

        @Override // c.z.i.d
        public void a(i iVar) {
        }

        @Override // c.z.i.d
        public void b(i iVar) {
            g(false);
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            f();
            iVar.y(this);
        }

        @Override // c.z.i.d
        public void d(i iVar) {
        }

        @Override // c.z.i.d
        public void e(i iVar) {
            g(true);
        }

        public final void f() {
            if (!this.f2864f) {
                t.a.f(this.a, this.f2860b);
                ViewGroup viewGroup = this.f2861c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f2862d || this.f2863e == z || (viewGroup = this.f2861c) == null) {
                return;
            }
            this.f2863e = z;
            s.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2864f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f2864f) {
                return;
            }
            t.a.f(this.a, this.f2860b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f2864f) {
                return;
            }
            t.a.f(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2865b;

        /* renamed from: c  reason: collision with root package name */
        public int f2866c;

        /* renamed from: d  reason: collision with root package name */
        public int f2867d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f2868e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f2869f;
    }

    public final void K(q qVar) {
        qVar.a.put("android:visibility:visibility", Integer.valueOf(qVar.f2907b.getVisibility()));
        qVar.a.put("android:visibility:parent", qVar.f2907b.getParent());
        int[] iArr = new int[2];
        qVar.f2907b.getLocationOnScreen(iArr);
        qVar.a.put("android:visibility:screenLocation", iArr);
    }

    public final b L(q qVar, q qVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.f2865b = false;
        if (qVar == null || !qVar.a.containsKey("android:visibility:visibility")) {
            bVar.f2866c = -1;
            bVar.f2868e = null;
        } else {
            bVar.f2866c = ((Integer) qVar.a.get("android:visibility:visibility")).intValue();
            bVar.f2868e = (ViewGroup) qVar.a.get("android:visibility:parent");
        }
        if (qVar2 == null || !qVar2.a.containsKey("android:visibility:visibility")) {
            bVar.f2867d = -1;
            bVar.f2869f = null;
        } else {
            bVar.f2867d = ((Integer) qVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f2869f = (ViewGroup) qVar2.a.get("android:visibility:parent");
        }
        if (qVar != null && qVar2 != null) {
            int i2 = bVar.f2866c;
            int i3 = bVar.f2867d;
            if (i2 == i3 && bVar.f2868e == bVar.f2869f) {
                return bVar;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    bVar.f2865b = false;
                    bVar.a = true;
                } else if (i3 == 0) {
                    bVar.f2865b = true;
                    bVar.a = true;
                }
            } else if (bVar.f2869f == null) {
                bVar.f2865b = false;
                bVar.a = true;
            } else if (bVar.f2868e == null) {
                bVar.f2865b = true;
                bVar.a = true;
            }
        } else if (qVar == null && bVar.f2867d == 0) {
            bVar.f2865b = true;
            bVar.a = true;
        } else if (qVar2 == null && bVar.f2866c == 0) {
            bVar.f2865b = false;
            bVar.a = true;
        }
        return bVar;
    }

    public abstract Animator N(ViewGroup viewGroup, View view, q qVar, q qVar2);

    @Override // c.z.i
    public void d(q qVar) {
        K(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (L(p(r1, false), s(r1, false)).a != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    @Override // c.z.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m(android.view.ViewGroup r22, c.z.q r23, c.z.q r24) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.z.b0.m(android.view.ViewGroup, c.z.q, c.z.q):android.animation.Animator");
    }

    @Override // c.z.i
    public String[] r() {
        return x;
    }

    @Override // c.z.i
    public boolean t(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar == null || qVar2 == null || qVar2.a.containsKey("android:visibility:visibility") == qVar.a.containsKey("android:visibility:visibility")) {
            b L = L(qVar, qVar2);
            if (L.a) {
                return L.f2866c == 0 || L.f2867d == 0;
            }
            return false;
        }
        return false;
    }
}
