package com.amazon.aps.iva.q2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.g0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.o0.y1;
import com.google.android.gms.ads.AdRequest;
/* compiled from: AndroidPopup.android.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.v1.a {
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
    public z k;
    public String l;
    public final View m;
    public final v n;
    public final WindowManager o;
    public final WindowManager.LayoutParams p;
    public y q;
    public com.amazon.aps.iva.o2.l r;
    public final y1 s;
    public final y1 t;
    public com.amazon.aps.iva.o2.i u;
    public final q0 v;
    public final Rect w;
    public final y1 x;
    public boolean y;
    public final int[] z;

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            t.this.a(iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public t() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(com.amazon.aps.iva.xb0.a r6, com.amazon.aps.iva.q2.z r7, java.lang.String r8, android.view.View r9, com.amazon.aps.iva.o2.c r10, com.amazon.aps.iva.q2.y r11, java.util.UUID r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.t.<init>(com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.q2.z, java.lang.String, android.view.View, com.amazon.aps.iva.o2.c, com.amazon.aps.iva.q2.y, java.util.UUID):void");
    }

    private final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> getContent() {
        return (com.amazon.aps.iva.xb0.p) this.x.getValue();
    }

    private final int getDisplayHeight() {
        return com.amazon.aps.iva.ob0.f.a(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return com.amazon.aps.iva.ob0.f.a(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.s1.q getParentLayoutCoordinates() {
        return (com.amazon.aps.iva.s1.q) this.t.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = this.p;
        if (z) {
            i = layoutParams.flags & (-513);
        } else {
            i = layoutParams.flags | AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        layoutParams.flags = i;
        this.n.a(this.o, this, layoutParams);
    }

    private final void setContent(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        this.x.setValue(pVar);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = this.p;
        if (!z) {
            i = layoutParams.flags | 8;
        } else {
            i = layoutParams.flags & (-9);
        }
        layoutParams.flags = i;
        this.n.a(this.o, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(com.amazon.aps.iva.s1.q qVar) {
        this.t.setValue(qVar);
    }

    private final void setSecurePolicy(a0 a0Var) {
        int i;
        boolean a2 = b0.a(a0Var, g.b(this.m));
        WindowManager.LayoutParams layoutParams = this.p;
        if (a2) {
            i = layoutParams.flags | 8192;
        } else {
            i = layoutParams.flags & (-8193);
        }
        layoutParams.flags = i;
        this.n.a(this.o, this, layoutParams);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(-857613600);
        e0.b bVar = e0.a;
        getContent().invoke(g, 0);
        j2 X = g.X();
        if (X != null) {
            X.d = new a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        com.amazon.aps.iva.yb0.j.f(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.k.b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.f(z, i, i2, i3, i4);
        if (this.k.g || (childAt = getChildAt(0)) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.p;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.n.a(this.o, this, layoutParams);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void g(int i, int i2) {
        if (this.k.g) {
            super.g(i, i2);
        } else {
            super.g(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.p;
    }

    public final com.amazon.aps.iva.o2.l getParentLayoutDirection() {
        return this.r;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final com.amazon.aps.iva.o2.j m22getPopupContentSizebOM6tXw() {
        return (com.amazon.aps.iva.o2.j) this.s.getValue();
    }

    public final y getPositionProvider() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.v1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.y;
    }

    public final String getTestTag() {
        return this.l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void k(g0 g0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "parent");
        setParentCompositionContext(g0Var);
        setContent(pVar);
        this.y = true;
    }

    public final void l(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, z zVar, String str, com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(zVar, "properties");
        com.amazon.aps.iva.yb0.j.f(str, "testTag");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        this.j = aVar;
        if (zVar.g && !this.k.g) {
            WindowManager.LayoutParams layoutParams = this.p;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.n.a(this.o, this, layoutParams);
        }
        this.k = zVar;
        this.l = str;
        setIsFocusable(zVar.a);
        setSecurePolicy(zVar.d);
        setClippingEnabled(zVar.f);
        int i = b.a[lVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    public final void m() {
        com.amazon.aps.iva.s1.q parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long a2 = parentLayoutCoordinates.a();
        long J = parentLayoutCoordinates.J(com.amazon.aps.iva.e1.c.b);
        long e = com.amazon.aps.iva.e.w.e(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.c(J)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.d(J)));
        int i = (int) (e >> 32);
        com.amazon.aps.iva.o2.i iVar = new com.amazon.aps.iva.o2.i(i, com.amazon.aps.iva.o2.h.b(e), ((int) (a2 >> 32)) + i, com.amazon.aps.iva.o2.j.b(a2) + com.amazon.aps.iva.o2.h.b(e));
        if (!com.amazon.aps.iva.yb0.j.a(iVar, this.u)) {
            this.u = iVar;
            o();
        }
    }

    public final void n(com.amazon.aps.iva.s1.q qVar) {
        setParentLayoutCoordinates(qVar);
        m();
    }

    public final void o() {
        com.amazon.aps.iva.o2.j m22getPopupContentSizebOM6tXw;
        com.amazon.aps.iva.o2.i iVar = this.u;
        if (iVar != null && (m22getPopupContentSizebOM6tXw = m22getPopupContentSizebOM6tXw()) != null) {
            v vVar = this.n;
            Rect rect = this.w;
            vVar.b(rect, this.m);
            w0 w0Var = g.a;
            long a2 = com.amazon.aps.iva.o2.k.a(rect.right - rect.left, rect.bottom - rect.top);
            long a3 = this.q.a(iVar, this.r, m22getPopupContentSizebOM6tXw.a);
            WindowManager.LayoutParams layoutParams = this.p;
            int i = com.amazon.aps.iva.o2.h.c;
            layoutParams.x = (int) (a3 >> 32);
            layoutParams.y = com.amazon.aps.iva.o2.h.b(a3);
            if (this.k.e) {
                vVar.c(this, (int) (a2 >> 32), com.amazon.aps.iva.o2.j.b(a2));
            }
            vVar.a(this.o, this, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.k.c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.j;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z2 = true;
        }
        if (z2) {
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setParentLayoutDirection(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        this.r = lVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m23setPopupContentSizefhxjrPA(com.amazon.aps.iva.o2.j jVar) {
        this.s.setValue(jVar);
    }

    public final void setPositionProvider(y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "<set-?>");
        this.q = yVar;
    }

    public final void setTestTag(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "<set-?>");
        this.l = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public com.amazon.aps.iva.v1.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
