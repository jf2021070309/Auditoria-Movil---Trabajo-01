package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.y;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public abstract class NavigationBarItemView extends FrameLayout implements k.a {
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private ActiveIndicatorTransform activeIndicatorTransform;
    private final View activeIndicatorView;
    private int activeTextAppearance;
    private BadgeDrawable badgeDrawable;
    private final ImageView icon;
    private final FrameLayout iconContainer;
    private ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;
    Drawable itemBackground;
    private h itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM = new ActiveIndicatorTransform();
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new ActiveIndicatorUnlabeledTransform();

    /* loaded from: classes3.dex */
    public static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
        }

        public float calculateAlpha(float f, float f2) {
            float f3;
            float f4;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = ALPHA_FRACTION;
            }
            return AnimationUtils.lerp(0.0f, 1.0f, f3, f4, f);
        }

        public float calculateScaleX(float f, float f2) {
            return AnimationUtils.lerp((float) SCALE_X_HIDDEN, 1.0f, f);
        }

        public float calculateScaleY(float f, float f2) {
            return 1.0f;
        }

        public void updateForProgress(float f, float f2, View view) {
            view.setScaleX(calculateScaleX(f, f2));
            view.setScaleY(calculateScaleY(f, f2));
            view.setAlpha(calculateAlpha(f, f2));
        }
    }

    /* loaded from: classes3.dex */
    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public float calculateScaleY(float f, float f2) {
            return calculateScaleX(f, f2);
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.activeTextAppearance = 0;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.iconContainer = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.activeIndicatorView = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.icon = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        this.activeIndicatorLabelPadding = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.s(textView, 2);
        g0.d.s(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
                    }
                }
            });
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    private static Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view != imageView || !BadgeUtils.USE_COMPAT_PARENT) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout == null) {
            return this.icon;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + max;
    }

    private boolean hasBadge() {
        if (this.badgeDrawable != null) {
            return true;
        }
        return false;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        if (this.activeIndicatorResizeable && this.labelVisibilityMode == 2) {
            return true;
        }
        return false;
    }

    private void maybeAnimateActiveIndicatorToProgress(final float f) {
        if (this.activeIndicatorEnabled && this.initialized) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(this)) {
                ValueAnimator valueAnimator = this.activeIndicatorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.activeIndicatorAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f);
                this.activeIndicatorAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
                    }
                });
                this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
                this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationLong2, getResources().getInteger(R.integer.material_motion_duration_long_1)));
                this.activeIndicatorAnimator.start();
                return;
            }
        }
        setActiveIndicatorProgress(f, f);
    }

    private void refreshChecked() {
        h hVar = this.itemData;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    private void refreshItemBackground() {
        Drawable drawable = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && this.iconContainer != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.iconContainer.setForeground(rippleDrawable);
        }
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.q(this, drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f, float f2) {
        View view = this.activeIndicatorView;
        if (view != null) {
            this.activeIndicatorTransform.updateForProgress(f, f2, view);
        }
        this.activeIndicatorProgress = f;
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, int i) {
        textView.setTextAppearance(i);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private static void setViewScaleValues(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void setViewTopMarginAndGravity(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (!hasBadge()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
        }
        this.badgeDrawable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (!hasBadge()) {
            return;
        }
        BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i) {
        int i2;
        if (this.activeIndicatorView != null && i > 0) {
            int min = Math.min(this.activeIndicatorDesiredWidth, i - (this.activeIndicatorMarginHorizontal * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (isActiveIndicatorResizeableAndUnlabeled()) {
                i2 = min;
            } else {
                i2 = this.activeIndicatorDesiredHeight;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private static void updateViewPaddingBottom(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && this.activeIndicatorEnabled) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.itemData;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (this.labelGroup.getVisibility() == 0) {
            i = this.activeIndicatorLabelPadding;
        } else {
            i = 0;
        }
        return this.labelGroup.getMeasuredHeight() + suggestedIconHeight + i + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void initialize(h hVar, int i) {
        CharSequence charSequence;
        int i2;
        this.itemData = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        if (!TextUtils.isEmpty(hVar.r)) {
            charSequence = hVar.r;
        } else {
            charSequence = hVar.e;
        }
        h1.a(this, charSequence);
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.initialized = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.itemData;
        if (hVar != null && hVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            h hVar = this.itemData;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.itemData.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) l.g.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) l.a.g.a);
        }
        l.b.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i);
            }
        });
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.activeIndicatorEnabled = z;
        refreshItemBackground();
        View view = this.activeIndicatorView;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.activeIndicatorDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.activeIndicatorLabelPadding != i) {
            this.activeIndicatorLabelPadding = i;
            refreshChecked();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.activeIndicatorMarginHorizontal = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.activeIndicatorResizeable = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.activeIndicatorDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        ImageView imageView;
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && (imageView = this.icon) != null) {
            tryRemoveBadgeFromAnchor(imageView);
        }
        this.badgeDrawable = badgeDrawable;
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            tryAttachBadgeToAnchor(imageView2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        float f;
        this.largeLabel.setPivotX(textView.getWidth() / 2);
        this.largeLabel.setPivotY(textView2.getBaseline());
        this.smallLabel.setPivotX(textView3.getWidth() / 2);
        this.smallLabel.setPivotY(textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        maybeAnimateActiveIndicatorToProgress(f);
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                        this.largeLabel.setVisibility(8);
                        this.smallLabel.setVisibility(8);
                    }
                } else {
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    if (z) {
                        setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                        setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                        TextView textView5 = this.smallLabel;
                        float f2 = this.scaleUpFactor;
                        setViewScaleValues(textView5, f2, f2, 4);
                    } else {
                        setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                        TextView textView6 = this.largeLabel;
                        float f3 = this.scaleDownFactor;
                        setViewScaleValues(textView6, f3, f3, 4);
                        setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            }
        } else if (this.isShifting) {
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView7 = this.smallLabel;
                float f4 = this.scaleUpFactor;
                setViewScaleValues(textView7, f4, f4, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                TextView textView8 = this.largeLabel;
                float f5 = this.scaleDownFactor;
                setViewScaleValues(textView8, f5, f5, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            PointerIcon b = y.b(getContext(), 1002);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.k.d(this, b);
            return;
        }
        WeakHashMap<View, r0> weakHashMap2 = g0.a;
        g0.k.d(this, null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData != null && (drawable = this.wrappedIconDrawable) != null) {
            a.b.h(drawable, colorStateList);
            this.wrappedIconDrawable.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : com.amazon.aps.iva.d3.a.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.itemPaddingBottom != i) {
            this.itemPaddingBottom = i;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.itemPaddingTop != i) {
            this.itemPaddingTop = i;
            refreshChecked();
        }
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            refreshChecked();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.activeTextAppearance = i;
        setTextAppearanceWithoutFontScaling(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.activeTextAppearance);
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        setTextAppearanceWithoutFontScaling(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        h hVar = this.itemData;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.itemData;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.itemData.r;
        }
        h1.a(this, charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    public void setShortcut(boolean z, char c) {
    }
}
