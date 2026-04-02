package com.amazon.aps.iva.g5;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f5.p;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Picker.java */
/* loaded from: classes.dex */
public class b extends FrameLayout {
    public final ViewGroup b;
    public final ArrayList c;
    public ArrayList<com.amazon.aps.iva.g5.c> d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final DecelerateInterpolator i;
    public float j;
    public float k;
    public int l;
    public final ArrayList m;
    public final int n;
    public int o;
    public final a p;

    /* compiled from: Picker.java */
    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.amazon.aps.iva.f5.p
        public final void a(com.amazon.aps.iva.f5.b bVar, RecyclerView.f0 f0Var, int i) {
            C0288b c0288b = (C0288b) bVar.getAdapter();
            b bVar2 = b.this;
            int indexOf = bVar2.c.indexOf(bVar);
            bVar2.e(indexOf);
            if (f0Var != null) {
                bVar2.a(indexOf, bVar2.d.get(indexOf).b + i);
            }
        }
    }

    /* compiled from: Picker.java */
    /* renamed from: com.amazon.aps.iva.g5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0288b extends RecyclerView.h<c> {
        public final int a;
        public final int b;
        public final int c;
        public final com.amazon.aps.iva.g5.c d;

        public C0288b(int i, int i2, int i3) {
            this.a = i;
            this.b = i3;
            this.c = i2;
            this.d = b.this.d.get(i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            com.amazon.aps.iva.g5.c cVar = this.d;
            if (cVar == null) {
                return 0;
            }
            return (cVar.c - cVar.b) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(c cVar, int i) {
            boolean z;
            com.amazon.aps.iva.g5.c cVar2;
            CharSequence charSequence;
            c cVar3 = cVar;
            TextView textView = cVar3.b;
            if (textView != null && (cVar2 = this.d) != null) {
                int i2 = cVar2.b + i;
                CharSequence[] charSequenceArr = cVar2.d;
                if (charSequenceArr == null) {
                    charSequence = String.format(cVar2.e, Integer.valueOf(i2));
                } else {
                    charSequence = charSequenceArr[i2];
                }
                textView.setText(charSequence);
            }
            View view = cVar3.itemView;
            b bVar = b.this;
            ArrayList arrayList = bVar.c;
            int i3 = this.b;
            if (((VerticalGridView) arrayList.get(i3)).getSelectedPosition() == i) {
                z = true;
            } else {
                z = false;
            }
            bVar.d(view, z, i3, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false);
            int i2 = this.c;
            if (i2 != 0) {
                textView = (TextView) inflate.findViewById(i2);
            } else {
                textView = (TextView) inflate;
            }
            return new c(textView, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onViewAttachedToWindow(c cVar) {
            cVar.itemView.setFocusable(b.this.isActivated());
        }
    }

    /* compiled from: Picker.java */
    /* loaded from: classes.dex */
    public static class c extends RecyclerView.f0 {
        public final TextView b;

        public c(TextView textView, View view) {
            super(view);
            this.b = textView;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new ArrayList();
        this.j = 3.0f;
        this.k = 1.0f;
        this.l = 0;
        this.m = new ArrayList();
        this.n = R.layout.lb_picker_item;
        this.o = 0;
        this.p = new a();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f = 1.0f;
        this.e = 1.0f;
        this.g = 0.5f;
        this.h = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
        this.i = new DecelerateInterpolator(2.5f);
        new AccelerateInterpolator(2.5f);
        this.b = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }

    public void a(int i, int i2) {
        com.amazon.aps.iva.g5.c cVar = this.d.get(i);
        if (cVar.a != i2) {
            cVar.a = i2;
        }
    }

    public final void b(int i, com.amazon.aps.iva.g5.c cVar) {
        this.d.set(i, cVar);
        VerticalGridView verticalGridView = (VerticalGridView) this.c.get(i);
        C0288b c0288b = (C0288b) verticalGridView.getAdapter();
        if (c0288b != null) {
            c0288b.notifyDataSetChanged();
        }
        verticalGridView.setSelectedPosition(cVar.a - cVar.b);
    }

    public final void c(View view, boolean z, float f, DecelerateInterpolator decelerateInterpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f);
        } else {
            view.animate().alpha(f).setDuration(this.h).setInterpolator(decelerateInterpolator).start();
        }
    }

    public final void d(View view, boolean z, int i, boolean z2) {
        boolean z3;
        if (i != this.l && hasFocus()) {
            z3 = false;
        } else {
            z3 = true;
        }
        DecelerateInterpolator decelerateInterpolator = this.i;
        if (z) {
            if (z3) {
                c(view, z2, this.f, decelerateInterpolator);
            } else {
                c(view, z2, this.e, decelerateInterpolator);
            }
        } else if (z3) {
            c(view, z2, this.g, decelerateInterpolator);
        } else {
            c(view, z2, 0.0f, decelerateInterpolator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isActivated()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 23 && keyCode != 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                performClick();
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(int i) {
        boolean z;
        VerticalGridView verticalGridView = (VerticalGridView) this.c.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        for (int i2 = 0; i2 < verticalGridView.getAdapter().getItemCount(); i2++) {
            View findViewByPosition = verticalGridView.getLayoutManager().findViewByPosition(i2);
            if (findViewByPosition != null) {
                if (selectedPosition == i2) {
                    z = true;
                } else {
                    z = false;
                }
                d(findViewByPosition, z, i, true);
            }
        }
    }

    public final void f() {
        for (int i = 0; i < getColumnsCount(); i++) {
            g((VerticalGridView) this.c.get(i));
        }
    }

    public final void g(VerticalGridView verticalGridView) {
        float visibleItemCount;
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        if (isActivated()) {
            visibleItemCount = getActivatedVisibleItemCount();
        } else {
            visibleItemCount = getVisibleItemCount();
        }
        layoutParams.height = (int) t0.a(visibleItemCount, 1.0f, verticalGridView.getVerticalSpacing(), getPickerItemHeightPixels() * visibleItemCount);
        verticalGridView.setLayoutParams(layoutParams);
    }

    public float getActivatedVisibleItemCount() {
        return this.j;
    }

    public int getColumnsCount() {
        ArrayList<com.amazon.aps.iva.g5.c> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.n;
    }

    public final int getPickerItemTextViewId() {
        return this.o;
    }

    public int getSelectedColumn() {
        return this.l;
    }

    public final CharSequence getSeparator() {
        return (CharSequence) this.m.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.m;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        ArrayList arrayList = this.c;
        if (selectedColumn < arrayList.size()) {
            return ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                if (((VerticalGridView) arrayList.get(i)).hasFocus()) {
                    setSelectedColumn(i);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        ArrayList arrayList;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && hasFocus && isFocusable()) {
            requestFocus();
        }
        int i = 0;
        while (true) {
            int columnsCount = getColumnsCount();
            arrayList = this.c;
            if (i >= columnsCount) {
                break;
            }
            ((VerticalGridView) arrayList.get(i)).setFocusable(z);
            i++;
        }
        f();
        boolean isActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(isActivated);
            }
        }
        if (z && hasFocus && selectedColumn >= 0) {
            ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f > 0.0f) {
            if (this.j != f) {
                this.j = f;
                if (isActivated()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setColumns(List<com.amazon.aps.iva.g5.c> list) {
        ArrayList arrayList = this.m;
        if (arrayList.size() != 0) {
            if (arrayList.size() == 1) {
                CharSequence charSequence = (CharSequence) arrayList.get(0);
                arrayList.clear();
                arrayList.add("");
                for (int i = 0; i < list.size() - 1; i++) {
                    arrayList.add(charSequence);
                }
                arrayList.add("");
            } else if (arrayList.size() != list.size() + 1) {
                throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
            }
            ArrayList arrayList2 = this.c;
            arrayList2.clear();
            ViewGroup viewGroup = this.b;
            viewGroup.removeAllViews();
            ArrayList<com.amazon.aps.iva.g5.c> arrayList3 = new ArrayList<>(list);
            this.d = arrayList3;
            if (this.l > arrayList3.size() - 1) {
                this.l = this.d.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
                TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, viewGroup, false);
                textView.setText((CharSequence) arrayList.get(0));
                viewGroup.addView(textView);
            }
            int i2 = 0;
            while (i2 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(R.layout.lb_picker_column, viewGroup, false);
                g(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                arrayList2.add(verticalGridView);
                viewGroup.addView(verticalGridView);
                int i3 = i2 + 1;
                if (!TextUtils.isEmpty((CharSequence) arrayList.get(i3))) {
                    TextView textView2 = (TextView) from.inflate(R.layout.lb_picker_separator, viewGroup, false);
                    textView2.setText((CharSequence) arrayList.get(i3));
                    viewGroup.addView(textView2);
                }
                getContext();
                verticalGridView.setAdapter(new C0288b(getPickerItemLayoutId(), getPickerItemTextViewId(), i2));
                verticalGridView.setOnChildViewHolderSelectedListener(this.p);
                i2 = i3;
            }
            return;
        }
        throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
    }

    public final void setPickerItemTextViewId(int i) {
        this.o = i;
    }

    public void setSelectedColumn(int i) {
        if (this.l != i) {
            this.l = i;
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                e(i2);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f > 0.0f) {
            if (this.k != f) {
                this.k = f;
                if (!isActivated()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
