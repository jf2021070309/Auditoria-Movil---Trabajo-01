package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.i.k.d0;
import c.i.k.k0.b;
import com.google.android.material.button.MaterialButton;
import e.d.b.d.r.k;
import e.d.b.d.w.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String a = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f4591b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4592c;

    /* renamed from: d  reason: collision with root package name */
    public final f f4593d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<e> f4594e;

    /* renamed from: f  reason: collision with root package name */
    public final Comparator<MaterialButton> f4595f;

    /* renamed from: g  reason: collision with root package name */
    public Integer[] f4596g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4597h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4598i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4599j;

    /* renamed from: k  reason: collision with root package name */
    public int f4600k;

    /* loaded from: classes2.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c.i.k.e {
        public b() {
        }

        @Override // c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.a;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.d(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                }
            }
            bVar.j(b.c.a(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements MaterialButton.a {
        public c(a aVar) {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.f4597h) {
                return;
            }
            if (materialButtonToggleGroup.f4598i) {
                materialButtonToggleGroup.f4600k = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.f(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.b(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public static final e.d.b.d.w.c a = new e.d.b.d.w.a(0.0f);

        /* renamed from: b  reason: collision with root package name */
        public e.d.b.d.w.c f4602b;

        /* renamed from: c  reason: collision with root package name */
        public e.d.b.d.w.c f4603c;

        /* renamed from: d  reason: collision with root package name */
        public e.d.b.d.w.c f4604d;

        /* renamed from: e  reason: collision with root package name */
        public e.d.b.d.w.c f4605e;

        public d(e.d.b.d.w.c cVar, e.d.b.d.w.c cVar2, e.d.b.d.w.c cVar3, e.d.b.d.w.c cVar4) {
            this.f4602b = cVar;
            this.f4603c = cVar3;
            this.f4604d = cVar4;
            this.f4605e = cVar2;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    /* loaded from: classes2.dex */
    public class f implements MaterialButton.b {
        public f(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131887109), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f4591b = new ArrayList();
        this.f4592c = new c(null);
        this.f4593d = new f(null);
        this.f4594e = new LinkedHashSet<>();
        this.f4595f = new a();
        this.f4597h = false;
        TypedArray d2 = k.d(getContext(), attributeSet, e.d.b.d.b.f6324m, R.attr.materialButtonToggleGroupStyle, 2131887109, new int[0]);
        setSingleSelection(d2.getBoolean(2, false));
        this.f4600k = d2.getResourceId(0, -1);
        this.f4599j = d2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d2.recycle();
        AtomicInteger atomicInteger = d0.a;
        d0.c.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setCheckedId(int i2) {
        this.f4600k = i2;
        b(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = d0.a;
            materialButton.setId(d0.d.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f4581f.add(this.f4592c);
        materialButton.setOnPressedChangeListenerInternal(this.f4593d);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton c2 = c(i2);
            int min = Math.min(c2.getStrokeWidth(), c(i2 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            c2.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        layoutParams3.setMarginEnd(0);
        layoutParams3.setMarginStart(0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(a, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            f(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f4591b.add(new d(shapeAppearanceModel.f6619e, shapeAppearanceModel.f6622h, shapeAppearanceModel.f6620f, shapeAppearanceModel.f6621g));
        d0.A(materialButton, new b());
    }

    public final void b(int i2, boolean z) {
        Iterator<e> it = this.f4594e.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2, z);
        }
    }

    public final MaterialButton c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f4595f);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(c(i2), Integer.valueOf(i2));
        }
        this.f4596g = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof MaterialButton) {
            this.f4597h = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f4597h = false;
        }
    }

    public final boolean f(int i2, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f4599j && checkedButtonIds.isEmpty()) {
            e(i2, true);
            this.f4600k = i2;
            return false;
        }
        if (z && this.f4598i) {
            checkedButtonIds.remove(Integer.valueOf(i2));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                e(intValue, false);
                b(intValue, false);
            }
        }
        return true;
    }

    public void g() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton c2 = c(i2);
            if (c2.getVisibility() != 8) {
                j shapeAppearanceModel = c2.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.b bVar = new j.b(shapeAppearanceModel);
                d dVar2 = this.f4591b.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z) {
                            e.d.b.d.w.c cVar = dVar2.f4602b;
                            e.d.b.d.w.c cVar2 = d.a;
                            dVar = new d(cVar, cVar2, dVar2.f4603c, cVar2);
                        } else if (e.d.b.d.a.N(this)) {
                            e.d.b.d.w.c cVar3 = d.a;
                            dVar = new d(cVar3, cVar3, dVar2.f4603c, dVar2.f4604d);
                        } else {
                            e.d.b.d.w.c cVar4 = dVar2.f4602b;
                            e.d.b.d.w.c cVar5 = dVar2.f4605e;
                            e.d.b.d.w.c cVar6 = d.a;
                            dVar = new d(cVar4, cVar5, cVar6, cVar6);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        e.d.b.d.w.c cVar7 = d.a;
                        dVar = new d(cVar7, dVar2.f4605e, cVar7, dVar2.f4604d);
                    } else if (e.d.b.d.a.N(this)) {
                        e.d.b.d.w.c cVar8 = dVar2.f4602b;
                        e.d.b.d.w.c cVar9 = dVar2.f4605e;
                        e.d.b.d.w.c cVar10 = d.a;
                        dVar = new d(cVar8, cVar9, cVar10, cVar10);
                    } else {
                        e.d.b.d.w.c cVar11 = d.a;
                        dVar = new d(cVar11, cVar11, dVar2.f4603c, dVar2.f4604d);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.f6630e = dVar2.f4602b;
                    bVar.f6633h = dVar2.f4605e;
                    bVar.f6631f = dVar2.f4603c;
                    bVar.f6632g = dVar2.f4604d;
                }
                c2.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f4598i) {
            return this.f4600k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton c2 = c(i2);
            if (c2.isChecked()) {
                arrayList.add(Integer.valueOf(c2.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f4596g;
        if (numArr == null || i3 >= numArr.length) {
            Log.w(a, "Child order wasn't updated");
            return i3;
        }
        return numArr[i3].intValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i2 = this.f4600k;
        if (i2 == -1 || (materialButton = (MaterialButton) findViewById(i2)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0040b.a(1, getVisibleButtonCount(), false, this.f4598i ? 1 : 2).a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        g();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f4581f.remove(this.f4592c);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f4591b.remove(indexOfChild);
        }
        g();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.f4599j = z;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f4598i != z) {
            this.f4598i = z;
            this.f4597h = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                MaterialButton c2 = c(i2);
                c2.setChecked(false);
                b(c2.getId(), false);
            }
            this.f4597h = false;
            setCheckedId(-1);
        }
    }
}
