package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.t3.k;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final com.amazon.aps.iva.p3.a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    boolean isBold;
    private h itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.actionArea.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.actionArea.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        h hVar = this.itemData;
        if (hVar.e == null && hVar.getIcon() == null && this.itemData.getActionView() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void initialize(h hVar, int i) {
        this.itemData = hVar;
        int i2 = hVar.a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable createDefaultBackground = createDefaultBackground();
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.q(this, createDefaultBackground);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.q);
        h1.a(this, hVar.r);
        adjustAppearance();
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

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        this.textView.setChecked(z);
        CheckedTextView checkedTextView = this.textView;
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.isBold) {
            i = 1;
        } else {
            i = 0;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Resources resources = getResources();
                int i2 = com.google.android.material.R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.a;
                Drawable a = f.a.a(resources, i2, theme);
                this.emptyDrawable = a;
                if (a != null) {
                    int i3 = this.iconSize;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.emptyDrawable;
        }
        k.b.e(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.iconSize = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.iconTintList = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.hasIconTintList = z;
        h hVar = this.itemData;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setTextAppearance(int i) {
        this.textView.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBold = true;
        com.amazon.aps.iva.p3.a aVar = new com.amazon.aps.iva.p3.a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // com.amazon.aps.iva.p3.a
            public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
                super.onInitializeAccessibilityNodeInfo(view, lVar);
                lVar.a.setCheckable(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        g0.n(checkedTextView, aVar);
    }

    public void initialize(h hVar, boolean z) {
        this.isBold = z;
        initialize(hVar, 0);
    }

    public void setShortcut(boolean z, char c) {
    }
}
