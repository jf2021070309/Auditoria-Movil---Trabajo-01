package com.amazon.aps.iva.v1;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.m2;
import java.lang.ref.WeakReference;
/* compiled from: ComposeView.android.kt */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public WeakReference<com.amazon.aps.iva.o0.g0> b;
    public IBinder c;
    public com.amazon.aps.iva.o0.f0 d;
    public com.amazon.aps.iva.o0.g0 e;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* compiled from: ComposeView.android.kt */
    /* renamed from: com.amazon.aps.iva.v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0776a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public C0776a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                a.this.a(iVar2, 8);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public static boolean h(com.amazon.aps.iva.o0.g0 g0Var) {
        if ((g0Var instanceof com.amazon.aps.iva.o0.m2) && ((m2.d) ((com.amazon.aps.iva.o0.m2) g0Var).r.getValue()).compareTo(m2.d.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private final void setParentContext(com.amazon.aps.iva.o0.g0 g0Var) {
        if (this.e != g0Var) {
            this.e = g0Var;
            if (g0Var != null) {
                this.b = null;
            }
            com.amazon.aps.iva.o0.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.dispose();
                this.d = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.c != iBinder) {
            this.c = iBinder;
            this.b = null;
        }
    }

    public abstract void a(com.amazon.aps.iva.o0.i iVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        boolean z;
        if (this.e == null && !isAttachedToWindow()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            e();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void d() {
        com.amazon.aps.iva.o0.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.dispose();
        }
        this.d = null;
        requestLayout();
    }

    public final void e() {
        if (this.d == null) {
            try {
                this.h = true;
                this.d = androidx.compose.ui.platform.j.a(this, i(), com.amazon.aps.iva.v0.b.c(-656146368, new C0776a(), true));
            } finally {
                this.h = false;
            }
        }
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r2 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.o0.g0 i() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.a.i():com.amazon.aps.iva.o0.g0");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.i && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(com.amazon.aps.iva.o0.g0 g0Var) {
        setParentContext(g0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.p) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.i = true;
    }

    public final void setViewCompositionStrategy(t2 t2Var) {
        com.amazon.aps.iva.yb0.j.f(t2Var, "strategy");
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.f;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f = t2Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        r2 r2Var = new r2(this);
        addOnAttachStateChangeListener(r2Var);
        s2 s2Var = new s2(this);
        com.amazon.aps.iva.dg.b.v(this).a.add(s2Var);
        this.f = new q2(this, r2Var, s2Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
