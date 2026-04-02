package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.amazon.aps.iva.d3.a;
import com.google.android.material.R;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
/* loaded from: classes3.dex */
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {
    private StateListAnimator stateListAnimator;

    /* loaded from: classes3.dex */
    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        public AlwaysStatefulMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    private StateListAnimator createDefaultStateListAnimator(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET, createElevationAnimator(f, f3));
        stateListAnimator.addState(FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f, f2));
        stateListAnimator.addState(FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f, f2));
        stateListAnimator.addState(FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET, createElevationAnimator(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.view, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR);
        stateListAnimator.addState(FloatingActionButtonImpl.ENABLED_STATE_SET, animatorSet);
        stateListAnimator.addState(FloatingActionButtonImpl.EMPTY_STATE_SET, createElevationAnimator(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator createElevationAnimator(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.view, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR);
        return animatorSet;
    }

    public BorderDrawable createBorderDrawable(int i, ColorStateList colorStateList) {
        Context context = this.view.getContext();
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearance;
        shapeAppearanceModel.getClass();
        BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel);
        borderDrawable.setGradientColors(a.getColor(context, R.color.design_fab_stroke_top_outer_color), a.getColor(context, R.color.design_fab_stroke_top_inner_color), a.getColor(context, R.color.design_fab_stroke_end_inner_color), a.getColor(context, R.color.design_fab_stroke_end_outer_color));
        borderDrawable.setBorderWidth(i);
        borderDrawable.setBorderTint(colorStateList);
        return borderDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public MaterialShapeDrawable createShapeDrawable() {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearance;
        shapeAppearanceModel.getClass();
        return new AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public float getElevation() {
        return this.view.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void getPadding(Rect rect) {
        if (this.shadowViewDelegate.isCompatPaddingEnabled()) {
            super.getPadding(rect);
        } else if (!shouldExpandBoundsForA11y()) {
            int sizeDimension = (this.minTouchTargetSize - this.view.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void initializeBackgroundDrawable(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable createShapeDrawable = createShapeDrawable();
        this.shapeDrawable = createShapeDrawable;
        createShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        if (i > 0) {
            this.borderDrawable = createBorderDrawable(i, colorStateList);
            BorderDrawable borderDrawable = this.borderDrawable;
            borderDrawable.getClass();
            MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
            materialShapeDrawable.getClass();
            drawable = new LayerDrawable(new Drawable[]{borderDrawable, materialShapeDrawable});
        } else {
            this.borderDrawable = null;
            drawable = this.shapeDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), drawable, null);
        this.rippleDrawable = rippleDrawable;
        this.contentBackground = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onCompatShadowChanged() {
        updatePadding();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onElevationsChanged(float f, float f2, float f3) {
        if (this.view.getStateListAnimator() == this.stateListAnimator) {
            StateListAnimator createDefaultStateListAnimator = createDefaultStateListAnimator(f, f2, f3);
            this.stateListAnimator = createDefaultStateListAnimator;
            this.view.setStateListAnimator(createDefaultStateListAnimator);
        }
        if (shouldAddPadding()) {
            updatePadding();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public boolean requirePreDrawListener() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable = this.rippleDrawable;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.setRippleColor(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public boolean shouldAddPadding() {
        if (!this.shadowViewDelegate.isCompatPaddingEnabled() && shouldExpandBoundsForA11y()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void jumpDrawableToCurrentState() {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void updateFromViewRotation() {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onDrawableStateChanged(int[] iArr) {
    }
}
