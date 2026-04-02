package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.d0;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4706b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.d.b.d.p.a f4707c;

        public a(View view, int i2, e.d.b.d.p.a aVar) {
            this.a = view;
            this.f4706b = i2;
            this.f4707c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.f4706b) {
                e.d.b.d.p.a aVar = this.f4707c;
                expandableBehavior.C((View) aVar, this.a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    public final boolean B(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        e.d.b.d.p.a aVar = (e.d.b.d.p.a) view2;
        if (B(aVar.a())) {
            this.a = aVar.a() ? 1 : 2;
            return C((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        e.d.b.d.p.a aVar;
        AtomicInteger atomicInteger = d0.a;
        if (!d0.f.c(view)) {
            List<View> d2 = coordinatorLayout.d(view);
            int size = d2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d2.get(i3);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (e.d.b.d.p.a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null && B(aVar.a())) {
                int i4 = aVar.a() ? 1 : 2;
                this.a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, aVar));
            }
        }
        return false;
    }
}
