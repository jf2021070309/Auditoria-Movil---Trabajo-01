package com.amazon.aps.iva.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.e;
import com.amazon.aps.iva.p3.g0;
import java.util.WeakHashMap;
/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class a0 extends Spinner {
    @SuppressLint({"ResourceType"})
    public static final int[] j = {16843505};
    public final com.amazon.aps.iva.q.d b;
    public final Context c;
    public final z d;
    public SpinnerAdapter e;
    public final boolean f;
    public final i g;
    public int h;
    public final Rect i;

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a0 a0Var = a0.this;
            if (!a0Var.getInternalPopup().a()) {
                a0Var.g.g1(c.b(a0Var), c.a(a0Var));
            }
            ViewTreeObserver viewTreeObserver = a0Var.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i) {
            view.setTextAlignment(i);
        }

        public static void d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!com.amazon.aps.iva.o3.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {
        public final SpinnerAdapter b;
        public final ListAdapter c;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof z0) {
                    z0 z0Var = (z0) spinnerAdapter;
                    if (z0Var.getDropDownViewTheme() == null) {
                        z0Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class g extends o0 implements i {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                g gVar = g.this;
                a0.this.setSelection(i);
                if (a0.this.getOnItemClickListener() != null) {
                    a0.this.performItemClick(view, i, gVar.E.getItemId(i));
                }
                gVar.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z;
                g gVar = g.this;
                a0 a0Var = a0.this;
                gVar.getClass();
                WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                if (g0.g.b(a0Var) && a0Var.getGlobalVisibleRect(gVar.F)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    gVar.dismiss();
                    return;
                }
                gVar.p();
                gVar.show();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

            public c(b bVar) {
                this.b = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.b);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.F = new Rect();
            this.p = a0.this;
            this.z = true;
            this.A.setFocusable(true);
            this.q = new a();
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final CharSequence f() {
            return this.D;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void g(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void g1(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            p();
            s sVar = this.A;
            sVar.setInputMethodMode(2);
            show();
            k0 k0Var = this.d;
            k0Var.setChoiceMode(1);
            c.d(k0Var, i);
            c.c(k0Var, i2);
            a0 a0Var = a0.this;
            int selectedItemPosition = a0Var.getSelectedItemPosition();
            k0 k0Var2 = this.d;
            if (a() && k0Var2 != null) {
                k0Var2.setListSelectionHidden(false);
                k0Var2.setSelection(selectedItemPosition);
                if (k0Var2.getChoiceMode() != 0) {
                    k0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a2 && (viewTreeObserver = a0Var.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                sVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void i(int i) {
            this.G = i;
        }

        @Override // com.amazon.aps.iva.q.o0, com.amazon.aps.iva.q.a0.i
        public final void k(ListAdapter listAdapter) {
            super.k(listAdapter);
            this.E = listAdapter;
        }

        public final void p() {
            int i;
            int i2;
            Drawable b2 = b();
            a0 a0Var = a0.this;
            if (b2 != null) {
                b2.getPadding(a0Var.i);
                if (m1.a(a0Var)) {
                    i = a0Var.i.right;
                } else {
                    i = -a0Var.i.left;
                }
            } else {
                Rect rect = a0Var.i;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = a0Var.getPaddingLeft();
            int paddingRight = a0Var.getPaddingRight();
            int width = a0Var.getWidth();
            int i3 = a0Var.h;
            if (i3 == -2) {
                int a2 = a0Var.a((SpinnerAdapter) this.E, b());
                int i4 = a0Var.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = a0Var.i;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                o(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                o((width - paddingLeft) - paddingRight);
            } else {
                o(i3);
            }
            if (m1.a(a0Var)) {
                i2 = (((width - paddingRight) - this.f) - this.G) + i;
            } else {
                i2 = paddingLeft + this.G + i;
            }
            this.g = i2;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public boolean b;

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public interface i {
        boolean a();

        Drawable b();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        void g(CharSequence charSequence);

        void g1(int i, int i2);

        void h(int i);

        void i(int i);

        int j();

        void k(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r5 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.i = r0
            android.content.Context r0 = r10.getContext()
            com.amazon.aps.iva.q.y0.a(r0, r10)
            int[] r0 = com.amazon.aps.iva.j.a.w
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            com.amazon.aps.iva.q.d r3 = new com.amazon.aps.iva.q.d
            r3.<init>(r10)
            r10.b = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            com.amazon.aps.iva.o.c r4 = new com.amazon.aps.iva.o.c
            r4.<init>(r11, r3)
            r10.c = r4
            goto L30
        L2e:
            r10.c = r11
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = com.amazon.aps.iva.q.a0.j     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4e
            if (r6 == 0) goto L50
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4e
            goto L50
        L43:
            r11 = move-exception
            r4 = r5
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r4 == 0) goto L4c
            r4.recycle()
        L4c:
            throw r11
        L4d:
            r5 = r4
        L4e:
            if (r5 == 0) goto L53
        L50:
            r5.recycle()
        L53:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L8b
            if (r3 == r6) goto L5a
            goto L98
        L5a:
            com.amazon.aps.iva.q.a0$g r3 = new com.amazon.aps.iva.q.a0$g
            android.content.Context r7 = r10.c
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.c
            com.amazon.aps.iva.q.d1 r0 = com.amazon.aps.iva.q.d1.m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.h = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.setBackgroundDrawable(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.D = r5
            r0.n()
            r10.g = r3
            com.amazon.aps.iva.q.z r0 = new com.amazon.aps.iva.q.z
            r0.<init>(r10, r10, r3)
            r10.d = r0
            goto L98
        L8b:
            com.amazon.aps.iva.q.a0$e r0 = new com.amazon.aps.iva.q.a0$e
            r0.<init>()
            r10.g = r0
            java.lang.String r3 = r2.getString(r5)
            r0.d = r3
        L98:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Laf
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131625623(0x7f0e0697, float:1.887846E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter(r1)
        Laf:
            r2.recycle()
            r10.f = r6
            android.widget.SpinnerAdapter r11 = r10.e
            if (r11 == 0) goto Lbd
            r10.setAdapter(r11)
            r10.e = r4
        Lbd:
            com.amazon.aps.iva.q.d r11 = r10.b
            r11.d(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.a0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.i;
            drawable.getPadding(rect);
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.g;
        if (iVar != null) {
            return iVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.g;
        if (iVar != null) {
            return iVar.j();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.g;
        if (iVar != null) {
            return iVar.b();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.g;
        if (iVar != null) {
            return iVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.g;
        if (iVar != null && iVar.a()) {
            iVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.g;
        if (iVar != null && iVar.a()) {
            z = true;
        } else {
            z = false;
        }
        hVar.b = z;
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z zVar = this.d;
        if (zVar != null && zVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.g;
        if (iVar != null) {
            if (!iVar.a()) {
                iVar.g1(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        i iVar = this.g;
        if (iVar != null) {
            iVar.i(i2);
            iVar.e(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        i iVar = this.g;
        if (iVar != null) {
            iVar.h(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.g;
        if (iVar != null) {
            iVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(com.amazon.aps.iva.l.a.a(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.g;
        if (iVar != null) {
            iVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.amazon.aps.iva.q.d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.g;
        if (iVar != null) {
            Context context = this.c;
            if (context == null) {
                context = getContext();
            }
            iVar.k(new f(spinnerAdapter, context.getTheme()));
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {
        public androidx.appcompat.app.e b;
        public ListAdapter c;
        public CharSequence d;

        public e() {
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final boolean a() {
            androidx.appcompat.app.e eVar = this.b;
            if (eVar != null) {
                return eVar.isShowing();
            }
            return false;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final Drawable b() {
            return null;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final int c() {
            return 0;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void dismiss() {
            androidx.appcompat.app.e eVar = this.b;
            if (eVar != null) {
                eVar.dismiss();
                this.b = null;
            }
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final CharSequence f() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void g(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void g1(int i, int i2) {
            if (this.c == null) {
                return;
            }
            a0 a0Var = a0.this;
            e.a aVar = new e.a(a0Var.getPopupContext());
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.e create = aVar.setSingleChoiceItems(this.c, a0Var.getSelectedItemPosition(), this).create();
            this.b = create;
            ListView listView = create.getListView();
            c.d(listView, i);
            c.c(listView, i2);
            this.b.show();
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final int j() {
            return 0;
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void k(ListAdapter listAdapter) {
            this.c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            a0 a0Var = a0.this;
            a0Var.setSelection(i);
            if (a0Var.getOnItemClickListener() != null) {
                a0Var.performItemClick(null, i, this.c.getItemId(i));
            }
            dismiss();
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void e(int i) {
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void h(int i) {
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void i(int i) {
        }

        @Override // com.amazon.aps.iva.q.a0.i
        public final void setBackgroundDrawable(Drawable drawable) {
        }
    }
}
