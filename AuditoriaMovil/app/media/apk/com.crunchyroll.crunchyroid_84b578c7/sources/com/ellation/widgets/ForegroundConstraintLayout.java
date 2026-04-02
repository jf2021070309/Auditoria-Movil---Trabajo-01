package com.ellation.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: ForegroundConstraintLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ellation/widgets/ForegroundConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/drawable/Drawable;", "getForeground", "drawable", "Lcom/amazon/aps/iva/kb0/q;", "setForeground", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes2.dex */
public final class ForegroundConstraintLayout extends ConstraintLayout {
    public Drawable b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForegroundConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public final void G() {
        Drawable drawable = this.b;
        if (drawable != null) {
            if (drawable.isStateful()) {
                Drawable drawable2 = this.b;
                if (drawable2 != null) {
                    drawable2.setState(getDrawableState());
                    return;
                } else {
                    j.m("foreground");
                    throw null;
                }
            }
            return;
        }
        j.m("foreground");
        throw null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j.f(canvas, "canvas");
        super.draw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        } else {
            j.m("foreground");
            throw null;
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        } else {
            j.m("foreground");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable;
        }
        j.m("foreground");
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        } else {
            j.m("foreground");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        } else {
            j.m("foreground");
            throw null;
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        j.f(drawable, "drawable");
        this.b = drawable;
        drawable.setCallback(null);
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            unscheduleDrawable(drawable2);
            drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
            setWillNotDraw(false);
            drawable.setCallback(this);
            G();
            invalidate();
            return;
        }
        j.m("foreground");
        throw null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        j.f(drawable, "who");
        if (!super.verifyDrawable(drawable)) {
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                if (drawable != drawable2) {
                    return false;
                }
            } else {
                j.m("foreground");
                throw null;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ForegroundView);
        j.e(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ForegroundView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ForegroundView_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
            obtainStyledAttributes.recycle();
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            return;
        }
        throw new IllegalArgumentException("Add foreground drawable or use regular ConstraintLayout");
    }
}
