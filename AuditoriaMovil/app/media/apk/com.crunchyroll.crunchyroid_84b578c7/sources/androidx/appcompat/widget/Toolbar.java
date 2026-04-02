package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import androidx.lifecycle.g;
import com.amazon.aps.iva.k.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.l;
import com.amazon.aps.iva.p3.n;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.d1;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q.i0;
import com.amazon.aps.iva.q.m1;
import com.amazon.aps.iva.q.o;
import com.amazon.aps.iva.q.q;
import com.amazon.aps.iva.q.w0;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements com.amazon.aps.iva.p3.i {
    private static final String TAG = "Toolbar";
    private j.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private w0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    f.a mMenuBuilderCallback;
    final l mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private androidx.appcompat.widget.a mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private androidx.appcompat.widget.c mWrapper;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* loaded from: classes.dex */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null && aVar.onMenuItemSelected(fVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
            boolean z;
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.a aVar = toolbar.mMenuView.f;
            if (aVar != null && aVar.c()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<n> it = toolbar.mMenuHostHelper.b.iterator();
                while (it.hasNext()) {
                    it.next().b(fVar);
                }
            }
            f.a aVar2 = toolbar.mMenuBuilderCallback;
            if (aVar2 != null) {
                aVar2.onMenuModeChange(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: com.amazon.aps.iva.q.f1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public int b;
        public boolean c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new i[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.b = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i2) {
        boolean z;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.e.d(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, g0.e.d(this));
        list.clear();
        if (z) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(gVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(gVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.b = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(gVar);
            this.mHiddenViews.add(view);
            return;
        }
        addView(view, gVar);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new w0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new q(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.b == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            fVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            j.a aVar = this.mActionMenuPresenterCallback;
            c cVar = new c();
            actionMenuView2.g = aVar;
            actionMenuView2.h = cVar;
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i2) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int d2 = g0.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d2) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (d2 != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    private int getChildTop(View view, int i2) {
        int i3;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int childVerticalGravity = getChildVerticalGravity(gVar.a);
        if (childVerticalGravity != 48) {
            if (childVerticalGravity != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    private int getChildVerticalGravity(int i2) {
        int i3 = i2 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            return this.mGravity & 112;
        }
        return i3;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return com.amazon.aps.iva.p3.h.b(marginLayoutParams) + com.amazon.aps.iva.p3.h.c(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new com.amazon.aps.iva.o.f(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            g gVar = (g) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += view.getMeasuredWidth() + max + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() != this && !this.mHiddenViews.contains(view)) {
            return false;
        }
        return true;
    }

    private int layoutChildLeft(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    private int layoutChildRight(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, Ints.MAX_POWER_OF_TWO);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        l lVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<n> it = lVar.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // com.amazon.aps.iva.p3.i
    public void addMenuProvider(n nVar) {
        l lVar = this.mMenuHostHelper;
        lVar.b.add(nVar);
        lVar.a.run();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.e) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public void collapseActionView() {
        androidx.appcompat.view.menu.h hVar;
        f fVar = this.mExpandedMenuPresenter;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.c;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && (aVar = actionMenuView.f) != null) {
            aVar.b();
            a.C0007a c0007a = aVar.v;
            if (c0007a != null && c0007a.b()) {
                c0007a.j.dismiss();
            }
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            o oVar = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = oVar;
            oVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = (this.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        w0 w0Var = this.mContentInsets;
        if (w0Var != null) {
            if (w0Var.g) {
                return w0Var.a;
            }
            return w0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.mContentInsetEndWithActions;
        if (i2 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i2;
    }

    public int getContentInsetLeft() {
        w0 w0Var = this.mContentInsets;
        if (w0Var != null) {
            return w0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        w0 w0Var = this.mContentInsets;
        if (w0Var != null) {
            return w0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        w0 w0Var = this.mContentInsets;
        if (w0Var != null) {
            if (w0Var.g) {
                return w0Var.b;
            }
            return w0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.mContentInsetStartWithNavigation;
        if (i2 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i2;
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && (fVar = actionMenuView.b) != null && fVar.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public i0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new androidx.appcompat.widget.c(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && fVar.c != null) {
            return true;
        }
        return false;
    }

    public boolean hideOverflowMenu() {
        boolean z;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null) {
            return false;
        }
        androidx.appcompat.widget.a aVar = actionMenuView.f;
        if (aVar != null && aVar.b()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public void inflateMenu(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isOverflowMenuShowPending() {
        /*
            r4 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r4.mMenuView
            r1 = 0
            if (r0 == 0) goto L20
            androidx.appcompat.widget.a r0 = r0.f
            r2 = 1
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.a$c r3 = r0.w
            if (r3 != 0) goto L17
            boolean r0 = r0.c()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L20
            r1 = r2
        L20:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.isOverflowMenuShowPending():boolean");
    }

    public boolean isOverflowMenuShowing() {
        boolean z;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null) {
            return false;
        }
        androidx.appcompat.widget.a aVar = actionMenuView.f;
        if (aVar != null && aVar.c()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a1 A[LOOP:0: B:104:0x029f->B:105:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3 A[LOOP:1: B:107:0x02c1->B:108:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc A[LOOP:2: B:116:0x02fa->B:117:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.mTempMargins;
        boolean a2 = m1.a(this);
        int i11 = 0;
        int i12 = !a2 ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i2, 0, i3, 0, this.mMaxButtonHeight);
            i4 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i5 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i6 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i2, 0, i3, 0, this.mMaxButtonHeight);
            i4 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i5 = Math.max(i5, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i6 = View.combineMeasuredStates(i6, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4) + 0;
        iArr[a2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i4);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i2, max, i3, 0, this.mMaxButtonHeight);
            i7 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i5 = Math.max(i5, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i6 = View.combineMeasuredStates(i6, this.mMenuView.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[i12] = Math.max(0, currentContentInsetEnd - i7);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i6 = View.combineMeasuredStates(i6, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i6 = View.combineMeasuredStates(i6, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).b == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i15 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i2, max2 + i15, i3, i14, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i8 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i9 = View.combineMeasuredStates(i6, this.mTitleTextView.getMeasuredState());
            i10 = measuredWidth;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i10 = Math.max(i10, measureChildCollapseMargins(this.mSubtitleTextView, i2, max2 + i15, i3, i8 + i14, iArr));
            i8 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i9 = View.combineMeasuredStates(i9, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i10, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (!shouldCollapse()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            fVar = actionMenuView.b;
        } else {
            fVar = null;
        }
        int i2 = iVar.b;
        if (i2 != 0 && this.mExpandedMenuPresenter != null && fVar != null && (findItem = fVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (iVar.c) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        ensureContentInsets();
        w0 w0Var = this.mContentInsets;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z != w0Var.g) {
            w0Var.g = z;
            if (w0Var.h) {
                if (z) {
                    int i3 = w0Var.d;
                    if (i3 == Integer.MIN_VALUE) {
                        i3 = w0Var.e;
                    }
                    w0Var.a = i3;
                    int i4 = w0Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        i4 = w0Var.f;
                    }
                    w0Var.b = i4;
                    return;
                }
                int i5 = w0Var.c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = w0Var.e;
                }
                w0Var.a = i5;
                int i6 = w0Var.d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = w0Var.f;
                }
                w0Var.b = i6;
                return;
            }
            w0Var.a = w0Var.e;
            w0Var.b = w0Var.f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (hVar = fVar.c) != null) {
            iVar.b = hVar.a;
        }
        iVar.c = isOverflowMenuShowing();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.i
    public void removeMenuProvider(n nVar) {
        this.mMenuHostHelper.c(nVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(com.amazon.aps.iva.l.a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i2, int i3) {
        ensureContentInsets();
        w0 w0Var = this.mContentInsets;
        w0Var.h = false;
        if (i2 != Integer.MIN_VALUE) {
            w0Var.e = i2;
            w0Var.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            w0Var.f = i3;
            w0Var.b = i3;
        }
    }

    public void setContentInsetsRelative(int i2, int i3) {
        ensureContentInsets();
        this.mContentInsets.a(i2, i3);
    }

    public void setLogo(int i2) {
        setLogo(com.amazon.aps.iva.l.a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setMenu(androidx.appcompat.view.menu.f fVar, androidx.appcompat.widget.a aVar) {
        if (fVar == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.f fVar2 = this.mMenuView.b;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            fVar2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        aVar.s = true;
        if (fVar != null) {
            fVar.addMenuPresenter(aVar, this.mPopupContext);
            fVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            aVar.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            aVar.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(aVar);
        this.mOuterActionMenuPresenter = aVar;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(j.a aVar, f.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.g = aVar;
            actionMenuView.h = aVar2;
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(com.amazon.aps.iva.l.a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.mPopupTheme != i2) {
            this.mPopupTheme = i2;
            if (i2 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextAppearance(Context context, int i2) {
        this.mSubtitleTextAppearance = i2;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMargin(int i2, int i3, int i4, int i5) {
        this.mTitleMarginStart = i2;
        this.mTitleMarginTop = i3;
        this.mTitleMarginEnd = i4;
        this.mTitleMarginBottom = i5;
        requestLayout();
    }

    public void setTitleMarginBottom(int i2) {
        this.mTitleMarginBottom = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.mTitleMarginEnd = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.mTitleMarginStart = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.mTitleMarginTop = i2;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i2) {
        this.mTitleTextAppearance = i2;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public boolean showOverflowMenu() {
        boolean z;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null) {
            return false;
        }
        androidx.appcompat.widget.a aVar = actionMenuView.f;
        if (aVar != null && aVar.e()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    void updateBackInvokedCallbackState() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = e.a(this);
            if (hasExpandedActionView() && a2 != null) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                if (g0.g.b(this) && this.mBackInvokedCallbackEnabled) {
                    z = true;
                    if (!z && this.mBackInvokedDispatcher == null) {
                        if (this.mBackInvokedCallback == null) {
                            this.mBackInvokedCallback = e.b(new com.amazon.aps.iva.e.d(this, 1));
                        }
                        e.c(a2, this.mBackInvokedCallback);
                        this.mBackInvokedDispatcher = a2;
                        return;
                    } else if (z && (onBackInvokedDispatcher = this.mBackInvokedDispatcher) != null) {
                        e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
                        this.mBackInvokedDispatcher = null;
                        return;
                    }
                }
            }
            z = false;
            if (!z) {
            }
            if (z) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0427a {
        public int b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public g() {
            this.b = 0;
            this.a = 8388627;
        }

        public g(g gVar) {
            super((a.C0427a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(a.C0427a c0427a) {
            super(c0427a);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.mCollapseIcon);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            h1.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.mSubtitleTextAppearance;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.mTitleTextAppearance;
                if (i2 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new l(new e1(this, 0));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Context context2 = getContext();
        int[] iArr = com.amazon.aps.iva.j.a.z;
        d1 m = d1.m(context2, attributeSet, iArr, i2);
        g0.m(this, context, iArr, attributeSet, m.b, i2);
        this.mTitleTextAppearance = m.i(28, 0);
        this.mSubtitleTextAppearance = m.i(19, 0);
        int i3 = this.mGravity;
        TypedArray typedArray = m.b;
        this.mGravity = typedArray.getInteger(0, i3);
        this.mButtonGravity = typedArray.getInteger(2, 48);
        int c2 = m.c(22, 0);
        c2 = m.l(27) ? m.c(27, c2) : c2;
        this.mTitleMarginBottom = c2;
        this.mTitleMarginTop = c2;
        this.mTitleMarginEnd = c2;
        this.mTitleMarginStart = c2;
        int c3 = m.c(25, -1);
        if (c3 >= 0) {
            this.mTitleMarginStart = c3;
        }
        int c4 = m.c(24, -1);
        if (c4 >= 0) {
            this.mTitleMarginEnd = c4;
        }
        int c5 = m.c(26, -1);
        if (c5 >= 0) {
            this.mTitleMarginTop = c5;
        }
        int c6 = m.c(23, -1);
        if (c6 >= 0) {
            this.mTitleMarginBottom = c6;
        }
        this.mMaxButtonHeight = m.d(13, -1);
        int c7 = m.c(9, Integer.MIN_VALUE);
        int c8 = m.c(5, Integer.MIN_VALUE);
        int d2 = m.d(7, 0);
        int d3 = m.d(8, 0);
        ensureContentInsets();
        w0 w0Var = this.mContentInsets;
        w0Var.h = false;
        if (d2 != Integer.MIN_VALUE) {
            w0Var.e = d2;
            w0Var.a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            w0Var.f = d3;
            w0Var.b = d3;
        }
        if (c7 != Integer.MIN_VALUE || c8 != Integer.MIN_VALUE) {
            w0Var.a(c7, c8);
        }
        this.mContentInsetStartWithNavigation = m.c(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = m.c(6, Integer.MIN_VALUE);
        this.mCollapseIcon = m.e(4);
        this.mCollapseDescription = m.k(3);
        CharSequence k = m.k(21);
        if (!TextUtils.isEmpty(k)) {
            setTitle(k);
        }
        CharSequence k2 = m.k(18);
        if (!TextUtils.isEmpty(k2)) {
            setSubtitle(k2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(m.i(17, 0));
        Drawable e2 = m.e(16);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence k3 = m.k(15);
        if (!TextUtils.isEmpty(k3)) {
            setNavigationContentDescription(k3);
        }
        Drawable e3 = m.e(11);
        if (e3 != null) {
            setLogo(e3);
        }
        CharSequence k4 = m.k(12);
        if (!TextUtils.isEmpty(k4)) {
            setLogoDescription(k4);
        }
        if (m.l(29)) {
            setTitleTextColor(m.b(29));
        }
        if (m.l(20)) {
            setSubtitleTextColor(m.b(20));
        }
        if (m.l(14)) {
            inflateMenu(m.i(14, 0));
        }
        m.n();
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0427a) {
            return new g((a.C0427a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    public void addMenuProvider(n nVar, com.amazon.aps.iva.i5.o oVar) {
        this.mMenuHostHelper.a(nVar, oVar);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(n nVar, com.amazon.aps.iva.i5.o oVar, g.b bVar) {
        this.mMenuHostHelper.b(nVar, oVar, bVar);
    }

    /* loaded from: classes.dex */
    public class f implements j {
        public androidx.appcompat.view.menu.f b;
        public androidx.appcompat.view.menu.h c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean collapseItemActionView(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.mExpandedActionView;
            if (view instanceof com.amazon.aps.iva.o.b) {
                ((com.amazon.aps.iva.o.b) view).c();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.c = null;
            toolbar.requestLayout();
            hVar.C = false;
            hVar.n.onItemsChanged(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean expandItemActionView(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = hVar.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.c = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                g generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                generateDefaultLayoutParams.a = (toolbar.mButtonGravity & 112) | 8388611;
                generateDefaultLayoutParams.b = 2;
                toolbar.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            toolbar.removeChildrenForExpandedActionView();
            toolbar.requestLayout();
            hVar.C = true;
            hVar.n.onItemsChanged(false);
            View view = toolbar.mExpandedActionView;
            if (view instanceof com.amazon.aps.iva.o.b) {
                ((com.amazon.aps.iva.o.b) view).a();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void initForMenu(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.b;
            if (fVar2 != null && (hVar = this.c) != null) {
                fVar2.collapseItemActionView(hVar);
            }
            this.b = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean onSubMenuSelected(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void updateMenuView(boolean z) {
            if (this.c != null) {
                androidx.appcompat.view.menu.f fVar = this.b;
                boolean z2 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.b.getItem(i) == this.c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    collapseItemActionView(this.b, this.c);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
        }
    }
}
