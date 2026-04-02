package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.i.k.d0;
import c.i.k.k0.b;
import e.d.b.d.r.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class ChipGroup extends e.d.b.d.r.e {

    /* renamed from: e  reason: collision with root package name */
    public int f4617e;

    /* renamed from: f  reason: collision with root package name */
    public int f4618f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4619g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4620h;

    /* renamed from: i  reason: collision with root package name */
    public d f4621i;

    /* renamed from: j  reason: collision with root package name */
    public final b f4622j;

    /* renamed from: k  reason: collision with root package name */
    public e f4623k;

    /* renamed from: l  reason: collision with root package name */
    public int f4624l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4625m;

    /* loaded from: classes2.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b(a aVar) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.f4625m) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f4620h) {
                    chipGroup2.d(compoundButton.getId(), true);
                    ChipGroup chipGroup3 = ChipGroup.this;
                    chipGroup3.f4624l = compoundButton.getId();
                    d dVar = chipGroup3.f4621i;
                    return;
                }
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.f4624l == id) {
                    chipGroup4.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup5 = ChipGroup.this;
            int i2 = chipGroup5.f4624l;
            if (i2 != -1 && i2 != id && chipGroup5.f4619g) {
                chipGroup5.d(i2, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    /* loaded from: classes2.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener a;

        public e(a aVar) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    AtomicInteger atomicInteger = d0.a;
                    view2.setId(d0.d.a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f4622j);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131887095), attributeSet, R.attr.chipGroupStyle);
        this.f4622j = new b(null);
        this.f4623k = new e(null);
        this.f4624l = -1;
        this.f4625m = false;
        TypedArray d2 = k.d(getContext(), attributeSet, e.d.b.d.b.f6315d, R.attr.chipGroupStyle, 2131887095, new int[0]);
        int dimensionPixelOffset = d2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d2.getBoolean(5, false));
        setSingleSelection(d2.getBoolean(6, false));
        setSelectionRequired(d2.getBoolean(4, false));
        int resourceId = d2.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f4624l = resourceId;
        }
        d2.recycle();
        super.setOnHierarchyChangeListener(this.f4623k);
        AtomicInteger atomicInteger = d0.a;
        d0.c.s(this, 1);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.f4624l = i2;
        d dVar = this.f4621i;
        if (dVar == null || !this.f4619g) {
            return;
        }
        dVar.a(this, i2);
    }

    @Override // e.d.b.d.r.e
    public boolean a() {
        return this.f6525c;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.f4624l;
                if (i3 != -1 && this.f4619g) {
                    d(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public void c(int i2) {
        int i3 = this.f4624l;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1 && this.f4619g) {
            d(i3, false);
        }
        if (i2 != -1) {
            d(i2, true);
        }
        setCheckedId(i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public final void d(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.f4625m = true;
            ((Chip) findViewById).setChecked(z);
            this.f4625m = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f4619g) {
            return this.f4624l;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f4619g) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f4617e;
    }

    public int getChipSpacingVertical() {
        return this.f4618f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f4624l;
        if (i2 != -1) {
            d(i2, true);
            setCheckedId(this.f4624l);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0040b.a(getRowCount(), this.f6525c ? getChipCount() : -1, false, this.f4619g ? 1 : 2).a);
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f4617e != i2) {
            this.f4617e = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f4618f != i2) {
            this.f4618f = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f4621i = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4623k.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f4620h = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    @Override // e.d.b.d.r.e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f4619g != z) {
            this.f4619g = z;
            this.f4625m = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f4625m = false;
            setCheckedId(-1);
        }
    }
}
