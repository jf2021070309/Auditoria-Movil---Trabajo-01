package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.o0;
import com.amazon.aps.iva.q.s;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends com.amazon.aps.iva.q.c {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final AccessibilityManager accessibilityManager;
    private ColorStateList dropDownBackgroundTint;
    private final o0 modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private ColorStateList simpleItemSelectedRippleColor;
    private final Rect tempRect;

    /* loaded from: classes3.dex */
    public class MaterialArrayAdapter<T> extends ArrayAdapter<String> {
        private ColorStateList pressedRippleColor;
        private ColorStateList selectedItemRippleOverlaidColor;

        public MaterialArrayAdapter(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            updateSelectedItemColorStateList();
        }

        private ColorStateList createItemSelectedColorStateList() {
            if (hasSelectedColor() && hasSelectedRippleColor()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr2, 0)), MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.simpleItemSelectedColor});
            }
            return null;
        }

        private Drawable getSelectedItemDrawable() {
            if (!hasSelectedColor()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.simpleItemSelectedColor);
            if (this.pressedRippleColor != null) {
                a.b.h(colorDrawable, this.selectedItemRippleOverlaidColor);
                return new RippleDrawable(this.pressedRippleColor, colorDrawable, null);
            }
            return colorDrawable;
        }

        private boolean hasSelectedColor() {
            if (MaterialAutoCompleteTextView.this.simpleItemSelectedColor != 0) {
                return true;
            }
            return false;
        }

        private boolean hasSelectedRippleColor() {
            if (MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor != null) {
                return true;
            }
            return false;
        }

        private ColorStateList sanitizeDropdownItemSelectedRippleColor() {
            if (!hasSelectedRippleColor()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = getSelectedItemDrawable();
                } else {
                    drawable = null;
                }
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.d.q(textView, drawable);
            }
            return view2;
        }

        public void updateSelectedItemColorStateList() {
            this.pressedRippleColor = sanitizeDropdownItemSelectedRippleColor();
            this.selectedItemRippleOverlaidColor = createItemSelectedColorStateList();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean isTouchExplorationEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    private int measureContentWidth() {
        int selectedItemPosition;
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        o0 o0Var = this.modalListPopup;
        if (!o0Var.a()) {
            selectedItemPosition = -1;
        } else {
            selectedItemPosition = o0Var.d.getSelectedItemPosition();
        }
        int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable b = this.modalListPopup.b();
        if (b != null) {
            b.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            i2 += rect.left + rect.right;
        }
        return findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth() + i2;
    }

    private void onInputTypeChanged() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null) {
            findTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.dropDownBackgroundTint;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint()) {
            return findTextInputLayoutAncestor.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.modalListPopup.k(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o0 o0Var = this.modalListPopup;
        if (o0Var != null) {
            o0Var.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.dropDownBackgroundTint = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.dropDownBackgroundTint);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.simpleItemSelectedColor = i;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.simpleItemLayout, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_android_inputType) && obtainStyledAttributes.getInt(R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialAutoCompleteTextView_android_popupElevation, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.dropDownBackgroundTint = ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.simpleItemSelectedColor = obtainStyledAttributes.getColor(R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.simpleItemSelectedRippleColor = MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        o0 o0Var = new o0(context2, null, com.crunchyroll.crunchyroid.R.attr.listPopupWindowStyle, 0);
        this.modalListPopup = o0Var;
        o0Var.z = true;
        s sVar = o0Var.A;
        sVar.setFocusable(true);
        o0Var.p = this;
        sVar.setInputMethodMode(2);
        o0Var.k(getAdapter());
        o0Var.q = new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                Object item;
                int selectedItemPosition;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (i2 < 0) {
                    o0 o0Var2 = materialAutoCompleteTextView.modalListPopup;
                    if (!o0Var2.a()) {
                        item = null;
                    } else {
                        item = o0Var2.d.getSelectedItem();
                    }
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i2);
                }
                MaterialAutoCompleteTextView.this.updateText(item);
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        o0 o0Var3 = MaterialAutoCompleteTextView.this.modalListPopup;
                        if (!o0Var3.a()) {
                            view = null;
                        } else {
                            view = o0Var3.d.getSelectedView();
                        }
                        o0 o0Var4 = MaterialAutoCompleteTextView.this.modalListPopup;
                        if (!o0Var4.a()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = o0Var4.d.getSelectedItemPosition();
                        }
                        i2 = selectedItemPosition;
                        o0 o0Var5 = MaterialAutoCompleteTextView.this.modalListPopup;
                        if (!o0Var5.a()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = o0Var5.d.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.d, view, i2, j);
                }
                MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
            }
        };
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
