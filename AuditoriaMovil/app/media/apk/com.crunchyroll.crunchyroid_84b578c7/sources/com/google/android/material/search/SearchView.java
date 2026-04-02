package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.g1.m;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.u;
import com.amazon.aps.iva.p3.w0;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, MaterialBackHandler {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;
    private final MaterialBackOrchestrator backOrchestrator;
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    /* loaded from: classes3.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
                return new SavedState(parcel);
            }
        };
        String text;
        int visibility;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes3.dex */
    public interface TransitionListener {
        void onStateChanged(SearchView searchView, TransitionState transitionState, TransitionState transitionState2);
    }

    /* loaded from: classes3.dex */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        if (!this.currentTransitionState.equals(TransitionState.HIDDEN) && !this.currentTransitionState.equals(TransitionState.HIDING)) {
            return false;
        }
        return true;
    }

    private boolean isNavigationIconDrawerArrowDrawable(Toolbar toolbar) {
        return com.amazon.aps.iva.h3.a.d(toolbar.getNavigationIcon()) instanceof com.amazon.aps.iva.m.b;
    }

    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (isAdjustNothingSoftInputMode()) {
            clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    public static /* synthetic */ w0 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, w0 w0Var) {
        marginLayoutParams.leftMargin = w0Var.c() + i;
        marginLayoutParams.rightMargin = w0Var.d() + i2;
        return w0Var;
    }

    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ w0 lambda$setUpStatusBarSpacerInsetListener$5(View view, w0 w0Var) {
        boolean z;
        int e = w0Var.e();
        setUpStatusBarSpacer(e);
        if (!this.statusBarSpacerEnabledOverride) {
            if (e > 0) {
                z = true;
            } else {
                z = false;
            }
            setStatusBarSpacerEnabledInternal(z);
        }
        return w0Var;
    }

    public /* synthetic */ w0 lambda$setUpToolbarInsetListener$4(View view, w0 w0Var, ViewUtils.RelativePadding relativePadding) {
        int i;
        int i2;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        if (isLayoutRtl) {
            i = relativePadding.end;
        } else {
            i = relativePadding.start;
        }
        if (isLayoutRtl) {
            i2 = relativePadding.start;
        } else {
            i2 = relativePadding.end;
        }
        this.toolbar.setPadding(w0Var.c() + i, relativePadding.top, w0Var.d() + i2, relativePadding.bottom);
        return w0Var;
    }

    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        int i;
        View view = this.statusBarSpacer;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setUpBackButton(boolean z, boolean z2) {
        if (z2) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.z80.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.lambda$setUpBackButton$1(view);
            }
        });
        if (z) {
            com.amazon.aps.iva.m.b bVar = new com.amazon.aps.iva.m.b(getContext());
            int color = MaterialColors.getColor(this, R.attr.colorOnSurface);
            Paint paint = bVar.a;
            if (color != paint.getColor()) {
                paint.setColor(color);
                bVar.invalidateSelf();
            }
            this.toolbar.setNavigationIcon(bVar);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 24));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            {
                SearchView.this = this;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4;
                ImageButton imageButton = SearchView.this.clearButton;
                if (charSequence.length() > 0) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageButton.setVisibility(i4);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.iva.z80.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setUpContentOnTouchListener$3;
                lambda$setUpContentOnTouchListener$3 = SearchView.this.lambda$setUpContentOnTouchListener$3(view, motionEvent);
                return lambda$setUpContentOnTouchListener$3;
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        View view = this.divider;
        u uVar = new u() { // from class: com.amazon.aps.iva.z80.e
            @Override // com.amazon.aps.iva.p3.u
            public final w0 onApplyWindowInsets(View view2, w0 w0Var) {
                w0 lambda$setUpDividerInsetListener$6;
                lambda$setUpDividerInsetListener$6 = SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i, i2, view2, w0Var);
                return lambda$setUpDividerInsetListener$6;
            }
        };
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.i.u(view, uVar);
    }

    private void setUpEditText(int i, String str, String str2) {
        if (i != -1) {
            this.editText.setTextAppearance(i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new com.amazon.aps.iva.z80.c());
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        View view = this.statusBarSpacer;
        u uVar = new u() { // from class: com.amazon.aps.iva.z80.f
            @Override // com.amazon.aps.iva.p3.u
            public final w0 onApplyWindowInsets(View view2, w0 w0Var) {
                w0 lambda$setUpStatusBarSpacerInsetListener$5;
                lambda$setUpStatusBarSpacerInsetListener$5 = SearchView.this.lambda$setUpStatusBarSpacerInsetListener$5(view2, w0Var);
                return lambda$setUpStatusBarSpacerInsetListener$5;
            }
        };
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.i.u(view, uVar);
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new m(this));
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z);
                } else if (!z) {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        int intValue = this.childImportantForAccessibilityMap.get(childAt).intValue();
                        WeakHashMap<View, r0> weakHashMap = g0.a;
                        g0.d.s(childAt, intValue);
                    }
                } else {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, r0> weakHashMap2 = g0.a;
                    g0.d.s(childAt, 4);
                }
            }
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable mutate = com.amazon.aps.iva.l.a.a(getContext(), defaultNavigationIconResource).mutate();
        if (this.toolbar.getNavigationIconTint() != null) {
            a.b.g(mutate, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), mutate));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        int i;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        if (this.rootView.getVisibility() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        Drawable d = com.amazon.aps.iva.h3.a.d(navigationIconButton.getDrawable());
        if (d instanceof com.amazon.aps.iva.m.b) {
            com.amazon.aps.iva.m.b bVar = (com.amazon.aps.iva.m.b) d;
            float f = i;
            if (bVar.i != f) {
                bVar.i = f;
                bVar.invalidateSelf();
            }
        }
        if (d instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) d).setProgress(i);
        }
    }

    public void addHeaderView(View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.cancelBackProgress();
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new com.amazon.aps.iva.e.d(this, 13));
    }

    public void clearText() {
        this.editText.setText("");
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getHint() {
        return this.editText.getHint();
    }

    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        com.amazon.aps.iva.e.b onHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT >= 34 && this.searchBar != null && onHandleBackInvoked != null) {
            this.searchViewAnimationHelper.finishBackProgress();
        } else {
            hide();
        }
    }

    public void hide() {
        if (!this.currentTransitionState.equals(TransitionState.HIDDEN) && !this.currentTransitionState.equals(TransitionState.HIDING)) {
            this.searchViewAnimationHelper.hide();
        }
    }

    public void inflateMenu(int i) {
        this.toolbar.inflateMenu(i);
    }

    public boolean isAdjustNothingSoftInputMode() {
        if (this.softInputMode == 48) {
            return true;
        }
        return false;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        if (this.searchBar != null) {
            return true;
        }
        return false;
    }

    public boolean isShowing() {
        if (!this.currentTransitionState.equals(TransitionState.SHOWN) && !this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return false;
        }
        return true;
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        if (savedState.visibility == 0) {
            z = true;
        } else {
            z = false;
        }
        setVisible(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.text = charSequence;
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new com.amazon.aps.iva.z80.g(this, 0), TALKBACK_FOCUS_CHANGE_DELAY_MS);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (!z) {
            this.childImportantForAccessibilityMap = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.toolbar.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        int i;
        this.searchPrefix.setText(charSequence);
        TextView textView = this.searchPrefix;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public void setVisible(boolean z) {
        boolean z2;
        int i;
        TransitionState transitionState;
        boolean z3 = true;
        if (this.rootView.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        updateNavigationIconProgressIfNeeded();
        if (z) {
            transitionState = TransitionState.SHOWN;
        } else {
            transitionState = TransitionState.HIDDEN;
        }
        if (z2 == z) {
            z3 = false;
        }
        setTransitionState(transitionState, z3);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.z80.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.this.lambda$setupWithSearchBar$7(view);
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new com.amazon.aps.iva.e.i(this, 7));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
    }

    public void show() {
        if (!this.currentTransitionState.equals(TransitionState.SHOWN) && !this.currentTransitionState.equals(TransitionState.SHOWING)) {
            this.searchViewAnimationHelper.show();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(com.amazon.aps.iva.e.b bVar) {
        if (!isHiddenOrHiding() && this.searchBar != null) {
            this.searchViewAnimationHelper.startBackProgress(bVar);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(com.amazon.aps.iva.e.b bVar) {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.updateBackProgress(bVar);
        }
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    private void setTransitionState(TransitionState transitionState, boolean z) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        for (TransitionListener transitionListener : new LinkedHashSet(this.transitionListeners)) {
            transitionListener.onStateChanged(this, transitionState2, transitionState);
        }
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f));
    }

    public void setHint(int i) {
        this.editText.setHint(i);
    }

    public void setText(int i) {
        this.editText.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
