package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class NavigationMenuPresenter implements j {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private j.a callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    f menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            h itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    /* loaded from: classes3.dex */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes3.dex */
    public class NavigationMenuAdapter extends RecyclerView.h<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private h checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((NavigationMenuTextItem) this.items.get(i)).needsEmptyIcon = true;
                i++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            boolean z = true;
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int i3 = 0;
            while (i2 < size) {
                h hVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i2);
                if (hVar.isChecked()) {
                    setCheckedItem(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.f(false);
                }
                if (hVar.hasSubMenu()) {
                    m mVar = hVar.o;
                    if (mVar.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(hVar));
                        int size2 = this.items.size();
                        int size3 = mVar.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 < size3) {
                            h hVar2 = (h) mVar.getItem(i4);
                            if (hVar2.isVisible()) {
                                if (!z3 && hVar2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.f(false);
                                }
                                if (hVar.isChecked()) {
                                    setCheckedItem(hVar);
                                }
                                this.items.add(new NavigationMenuTextItem(hVar2));
                            }
                            i4++;
                            z = true;
                        }
                        if (z3) {
                            appendTransparentIconIfMissing(size2, this.items.size());
                        }
                    }
                } else {
                    int i5 = hVar.b;
                    if (i5 != i) {
                        i3 = this.items.size();
                        if (hVar.getIcon() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 != 0) {
                            i3++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i6 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i6, i6));
                        }
                    } else if (!z2 && hVar.getIcon() != null) {
                        appendTransparentIconIfMissing(i3, this.items.size());
                        z2 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(hVar);
                    navigationMenuTextItem.needsEmptyIcon = z2;
                    this.items.add(navigationMenuTextItem);
                    i = i5;
                }
                i2++;
                z = true;
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i, final boolean z) {
            g0.n(view, new com.amazon.aps.iva.p3.a() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // com.amazon.aps.iva.p3.a
                public void onInitializeAccessibilityNodeInfo(View view2, l lVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, lVar);
                    lVar.j(l.g.a(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i), 1, 1, 1, z, view2.isSelected()));
                }
            });
        }

        public Bundle createInstanceState() {
            View view;
            Bundle bundle = new Bundle();
            h hVar = this.checkedItem;
            if (hVar != null) {
                bundle.putInt(STATE_CHECKED_ITEM, hVar.a);
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    h menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    if (menuItem != null) {
                        view = menuItem.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.a, parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public h getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = this.items.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                if (((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i = 0;
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.adapter.getItemCount(); i2++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        public void restoreInstanceState(Bundle bundle) {
            h menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            h menuItem2;
            int i = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i2);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.a == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i2++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i3);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.a)) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(h hVar) {
            if (this.checkedItem != hVar && hVar.isCheckable()) {
                h hVar2 = this.checkedItem;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.checkedItem = hVar;
                hVar.setChecked(true);
            }
        }

        public void setUpdateSuspended(boolean z) {
            this.updateSuspended = z;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i);
                    viewHolder.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i)).getMenuItem().e);
                textView.setTextAppearance(NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.q(navigationMenuItemView, newDrawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i2 = navigationMenuPresenter.itemHorizontalPadding;
            int i3 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
                }
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            } else {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    /* loaded from: classes3.dex */
    public interface NavigationMenuItem {
    }

    /* loaded from: classes3.dex */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.paddingTop = i;
            this.paddingBottom = i2;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    /* loaded from: classes3.dex */
    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final h menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(h hVar) {
            this.menuItem = hVar;
        }

        public h getMenuItem() {
            return this.menuItem;
        }
    }

    /* loaded from: classes3.dex */
    public class NavigationMenuViewAccessibilityDelegate extends c0 {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.c0, com.amazon.aps.iva.p3.a
        public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
            super.onInitializeAccessibilityNodeInfo(view, lVar);
            AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false);
            lVar.getClass();
            lVar.a.setCollectionInfo(obtain);
        }
    }

    /* loaded from: classes3.dex */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes3.dex */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* loaded from: classes3.dex */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ViewHolder extends RecyclerView.f0 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private boolean hasHeader() {
        if (getHeaderCount() > 0) {
            return true;
        }
        return false;
    }

    private void updateTopPadding() {
        int i;
        if (!hasHeader() && this.isBehindStatusBar) {
            i = this.paddingTopDefault;
        } else {
            i = 0;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean collapseItemActionView(f fVar, h hVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(w0 w0Var) {
        int e = w0Var.e();
        if (this.paddingTopDefault != e) {
            this.paddingTopDefault = e;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, w0Var.b());
        g0.b(this.headerLayout, w0Var);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean expandItemActionView(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean flagActionItems() {
        return false;
    }

    public h getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.headerLayout.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public k getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                this.adapter = new NavigationMenuAdapter();
            }
            int i = this.overScrollMode;
            if (i != -1) {
                this.menuView.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.s(linearLayout, 2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(int i) {
        View inflate = this.layoutInflater.inflate(i, (ViewGroup) this.headerLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.j
    public void initForMenu(Context context, f fVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = fVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void onCloseMenu(f fVar, boolean z) {
        j.a aVar = this.callback;
        if (aVar != null) {
            aVar.onCloseMenu(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean onSubMenuSelected(m mVar) {
        return false;
    }

    public void removeHeaderView(View view) {
        this.headerLayout.removeView(view);
        if (!hasHeader()) {
            NavigationMenuView navigationMenuView = this.menuView;
            navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.isBehindStatusBar != z) {
            this.isBehindStatusBar = z;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void setCallback(j.a aVar) {
        this.callback = aVar;
    }

    public void setCheckedItem(h hVar) {
        this.adapter.setCheckedItem(hVar);
    }

    public void setDividerInsetEnd(int i) {
        this.dividerInsetEnd = i;
        updateMenuView(false);
    }

    public void setDividerInsetStart(int i) {
        this.dividerInsetStart = i;
        updateMenuView(false);
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i) {
        this.itemHorizontalPadding = i;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        this.itemIconPadding = i;
        updateMenuView(false);
    }

    public void setItemIconSize(int i) {
        if (this.itemIconSize != i) {
            this.itemIconSize = i;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.itemMaxLines = i;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i) {
        this.textAppearance = i;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.textAppearanceActiveBoldEnabled = z;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(int i) {
        this.itemVerticalPadding = i;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i) {
        this.overScrollMode = i;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(int i) {
        this.subheaderInsetEnd = i;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(int i) {
        this.subheaderInsetStart = i;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int i) {
        this.subheaderTextAppearance = i;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
