package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.b.i.b;
import c.b.i.t0;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public View f163b;

    /* renamed from: c  reason: collision with root package name */
    public View f164c;

    /* renamed from: d  reason: collision with root package name */
    public View f165d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f166e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f167f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f168g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f169h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f170i;

    /* renamed from: j  reason: collision with root package name */
    public int f171j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.a);
        boolean z = false;
        this.f166e = obtainStyledAttributes.getDrawable(0);
        this.f167f = obtainStyledAttributes.getDrawable(2);
        this.f171j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f169h = true;
            this.f168g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f169h ? !(this.f166e != null || this.f167f != null) : this.f168g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f166e;
        if (drawable != null && drawable.isStateful()) {
            this.f166e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f167f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f167f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f168g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f168g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f163b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f166e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f167f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f168g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f164c = findViewById(R.id.action_bar);
        this.f165d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f163b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f169h) {
            Drawable drawable2 = this.f168g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f166e != null) {
                if (this.f164c.getVisibility() == 0) {
                    this.f166e.setBounds(this.f164c.getLeft(), this.f164c.getTop(), this.f164c.getRight(), this.f164c.getBottom());
                } else {
                    View view2 = this.f165d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f166e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f166e.setBounds(this.f165d.getLeft(), this.f165d.getTop(), this.f165d.getRight(), this.f165d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f170i = z4;
            if (!z4 || (drawable = this.f167f) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f164c == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f171j) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Level.ALL_INT);
        }
        super.onMeasure(i2, i3);
        if (this.f164c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f163b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f163b) + (!b(this.f164c) ? a(this.f164c) : !b(this.f165d) ? a(this.f165d) : 0), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f166e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f166e);
        }
        this.f166e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f164c;
            if (view != null) {
                this.f166e.setBounds(view.getLeft(), this.f164c.getTop(), this.f164c.getRight(), this.f164c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f169h ? this.f166e != null || this.f167f != null : this.f168g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f168g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f168g);
        }
        this.f168g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f169h && (drawable2 = this.f168g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f169h ? !(this.f166e != null || this.f167f != null) : this.f168g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f167f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f167f);
        }
        this.f167f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f170i && (drawable2 = this.f167f) != null) {
                drawable2.setBounds(this.f163b.getLeft(), this.f163b.getTop(), this.f163b.getRight(), this.f163b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f169h ? this.f166e != null || this.f167f != null : this.f168g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(t0 t0Var) {
        View view = this.f163b;
        if (view != null) {
            removeView(view);
        }
        this.f163b = t0Var;
        if (t0Var != null) {
            addView(t0Var);
            ViewGroup.LayoutParams layoutParams = t0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f166e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f167f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f168g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f166e && !this.f169h) || (drawable == this.f167f && this.f170i) || ((drawable == this.f168g && this.f169h) || super.verifyDrawable(drawable));
    }
}
