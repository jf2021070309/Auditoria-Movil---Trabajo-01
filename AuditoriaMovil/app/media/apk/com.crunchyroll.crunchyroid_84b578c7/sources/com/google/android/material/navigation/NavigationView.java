package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.drawerlayout.widget.DrawerLayout;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.b;
import com.amazon.aps.iva.g1.p;
import com.amazon.aps.iva.o.f;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q.d1;
import com.google.android.material.R;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.d backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = R.style.Widget_Design_NavigationView;

    /* loaded from: classes3.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.crunchyroll.crunchyroid.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private Drawable createDefaultItemBackground(d1 d1Var) {
        return createDefaultItemDrawable(d1Var, MaterialResources.getColorStateList(getContext(), d1Var, R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(d1 d1Var, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), d1Var.i(R.styleable.NavigationView_itemShapeAppearance, 0), d1Var.i(R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, d1Var.d(R.styleable.NavigationView_itemShapeInsetStart, 0), d1Var.d(R.styleable.NavigationView_itemShapeInsetTop, 0), d1Var.d(R.styleable.NavigationView_itemShapeInsetEnd, 0), d1Var.d(R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new f(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(d1 d1Var) {
        if (!d1Var.l(R.styleable.NavigationView_itemShapeAppearance) && !d1Var.l(R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        boolean z;
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.e) && this.drawerLayoutCornerSize > 0 && (getBackground() instanceof MaterialShapeDrawable)) {
            int i3 = ((DrawerLayout.e) getLayoutParams()).a;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (Gravity.getAbsoluteGravity(i3, g0.e.d(this)) == 3) {
                z = true;
            } else {
                z = false;
            }
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
            ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
            if (z) {
                allCornerSizes.setTopLeftCornerSize(0.0f);
                allCornerSizes.setBottomLeftCornerSize(0.0f);
            } else {
                allCornerSizes.setTopRightCornerSize(0.0f);
                allCornerSizes.setBottomRightCornerSize(0.0f);
            }
            ShapeAppearanceModel build = allCornerSizes.build();
            materialShapeDrawable.setShapeAppearanceModel(build);
            this.shapeableDelegate.onShapeAppearanceChanged(this, build);
            this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
            this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
        }
    }

    @CanIgnoreReturnValue
    private Pair<DrawerLayout, DrawerLayout.e> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.e)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            {
                NavigationView.this = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onGlobalLayout() {
                /*
                    r6 = this;
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r1 = com.google.android.material.navigation.NavigationView.access$100(r0)
                    r0.getLocationOnScreen(r1)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$100(r0)
                    r1 = 1
                    r0 = r0[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r0 = r1
                    goto L18
                L17:
                    r0 = r2
                L18:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    com.google.android.material.internal.NavigationMenuPresenter r3 = com.google.android.material.navigation.NavigationView.access$200(r3)
                    r3.setBehindStatusBar(r0)
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    if (r0 == 0) goto L2d
                    boolean r0 = r3.isTopInsetScrimEnabled()
                    if (r0 == 0) goto L2d
                    r0 = r1
                    goto L2e
                L2d:
                    r0 = r2
                L2e:
                    r3.setDrawTopInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$100(r0)
                    r0 = r0[r2]
                    if (r0 == 0) goto L4f
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$100(r0)
                    r0 = r0[r2]
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r3 = r3 + r0
                    if (r3 != 0) goto L4d
                    goto L4f
                L4d:
                    r0 = r2
                    goto L50
                L4f:
                    r0 = r1
                L50:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    r3.setDrawLeftInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    android.content.Context r0 = r0.getContext()
                    android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
                    if (r0 == 0) goto Lca
                    android.graphics.Rect r3 = com.google.android.material.internal.WindowUtils.getCurrentWindowBounds(r0)
                    int r4 = r3.height()
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int r5 = r5.getHeight()
                    int r4 = r4 - r5
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int[] r5 = com.google.android.material.navigation.NavigationView.access$100(r5)
                    r5 = r5[r1]
                    if (r4 != r5) goto L7c
                    r4 = r1
                    goto L7d
                L7c:
                    r4 = r2
                L7d:
                    android.view.Window r0 = r0.getWindow()
                    int r0 = r0.getNavigationBarColor()
                    int r0 = android.graphics.Color.alpha(r0)
                    if (r0 == 0) goto L8d
                    r0 = r1
                    goto L8e
                L8d:
                    r0 = r2
                L8e:
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    if (r4 == 0) goto L9c
                    if (r0 == 0) goto L9c
                    boolean r0 = r5.isBottomInsetScrimEnabled()
                    if (r0 == 0) goto L9c
                    r0 = r1
                    goto L9d
                L9c:
                    r0 = r2
                L9d:
                    r5.setDrawBottomInsetForeground(r0)
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r4 = com.google.android.material.navigation.NavigationView.this
                    int[] r4 = com.google.android.material.navigation.NavigationView.access$100(r4)
                    r4 = r4[r2]
                    if (r0 == r4) goto Lc5
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r0 = r0 - r3
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int[] r3 = com.google.android.material.navigation.NavigationView.access$100(r3)
                    r3 = r3[r2]
                    if (r0 != r3) goto Lc4
                    goto Lc5
                Lc4:
                    r1 = r2
                Lc5:
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    r0.setDrawRightInsetForeground(r1)
                Lca:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.AnonymousClass3.onGlobalLayout():void");
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new p(this, 9));
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.e> requireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) requireDrawerLayoutParent.first;
        b onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((DrawerLayout.e) requireDrawerLayoutParent.second).a, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
            return;
        }
        drawerLayout.c(this, true);
    }

    public View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.d dVar = this.backDrawerListener;
            if (dVar == null) {
                drawerLayout.getClass();
            } else {
                ArrayList arrayList = drawerLayout.u;
                if (arrayList != null) {
                    arrayList.remove(dVar);
                }
            }
            drawerLayout.a(this.backDrawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.d dVar = this.backDrawerListener;
            if (dVar == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.u;
            if (arrayList != null) {
                arrayList.remove(dVar);
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(w0 w0Var) {
        this.presenter.dispatchApplyWindowInsets(w0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, Ints.MAX_POWER_OF_TWO);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), Ints.MAX_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.setCheckedItem((h) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(a.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(b bVar) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(b bVar) {
        this.sideContainerBackHelper.updateBackProgress(bVar, ((DrawerLayout.e) requireDrawerLayoutParent().second).a);
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
