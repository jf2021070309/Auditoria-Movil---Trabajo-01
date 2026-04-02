package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean b;
    public b c;
    public View d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public final boolean i;
    public boolean j;
    public final int k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        com.amazon.aps.iva.q.b bVar = new com.amazon.aps.iva.q.b(this);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.a);
        boolean z = false;
        this.f = obtainStyledAttributes.getDrawable(0);
        this.g = obtainStyledAttributes.getDrawable(2);
        this.k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.i = true;
            this.h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.i ? !(this.f != null || this.g != null) : this.h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f;
        if (drawable != null && drawable.isStateful()) {
            this.f.setState(getDrawableState());
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.g.setState(getDrawableState());
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.action_bar);
        this.e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.b && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        b bVar = this.c;
        boolean z3 = true;
        boolean z4 = false;
        if (bVar != null && bVar.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar != null && bVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) bVar.getLayoutParams()).bottomMargin;
            bVar.layout(i, (measuredHeight - bVar.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.i) {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f != null) {
                if (this.d.getVisibility() == 0) {
                    this.f.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
                } else {
                    View view = this.e;
                    if (view != null && view.getVisibility() == 0) {
                        this.f.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
                    } else {
                        this.f.setBounds(0, 0, 0, 0);
                    }
                }
                z4 = true;
            }
            this.j = z2;
            if (z2 && (drawable = this.g) != null) {
                drawable.setBounds(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (this.d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        b bVar = this.c;
        if (bVar != null && bVar.getVisibility() != 8 && mode != 1073741824) {
            View view = this.d;
            boolean z2 = true;
            int i5 = 0;
            if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i5 = a(this.d);
            } else {
                View view2 = this.e;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    i5 = a(this.e);
                }
            }
            if (mode == Integer.MIN_VALUE) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.c) + i5, i3));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.d;
            if (view != null) {
                this.f.setBounds(view.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? this.f != null || this.g != null : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        boolean z = this.i;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f != null || this.g != null) : this.h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.g);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.j && (drawable2 = this.g) != null) {
                drawable2.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
            }
        }
        if (!this.i ? !(this.f != null || this.g != null) : this.h == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.c;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.c = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.b = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        boolean z = this.i;
        if ((drawable == drawable2 && !z) || ((drawable == this.g && this.j) || ((drawable == this.h && z) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
