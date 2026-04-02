package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public final C0629a b;
    public final Context c;
    public ActionMenuView d;
    public androidx.appcompat.widget.a e;
    public int f;
    public com.amazon.aps.iva.p3.r0 g;
    public boolean h;
    public boolean i;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: com.amazon.aps.iva.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0629a implements com.amazon.aps.iva.p3.s0 {
        public boolean a = false;
        public int b;

        public C0629a() {
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void a(View view) {
            this.a = true;
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void c() {
            a.super.setVisibility(0);
            this.a = false;
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.b);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final com.amazon.aps.iva.p3.r0 e(int i, long j) {
        com.amazon.aps.iva.p3.r0 r0Var = this.g;
        if (r0Var != null) {
            r0Var.b();
        }
        C0629a c0629a = this.b;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            com.amazon.aps.iva.p3.r0 a = com.amazon.aps.iva.p3.g0.a(this);
            a.a(1.0f);
            a.c(j);
            a.this.g = a;
            c0629a.b = i;
            a.d(c0629a);
            return a;
        }
        com.amazon.aps.iva.p3.r0 a2 = com.amazon.aps.iva.p3.g0.a(this);
        a2.a(0.0f);
        a2.c(j);
        a.this.g = a2;
        c0629a.b = i;
        a2.d(c0629a);
        return a2;
    }

    public int getAnimatedVisibility() {
        if (this.g != null) {
            return this.b.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, com.amazon.aps.iva.j.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.e;
        if (aVar != null) {
            Configuration configuration2 = aVar.c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            aVar.r = i;
            androidx.appcompat.view.menu.f fVar = aVar.d;
            if (fVar != null) {
                fVar.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            com.amazon.aps.iva.p3.r0 r0Var = this.g;
            if (r0Var != null) {
                r0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new C0629a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.c = context;
        }
    }
}
