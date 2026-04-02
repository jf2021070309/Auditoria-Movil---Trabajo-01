package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
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
import androidx.appcompat.app.AlertController;
import c.b.c.i;
import c.b.i.f0;
import c.b.i.g1;
import c.b.i.h0;
import c.b.i.k0;
import c.b.i.w0;
import c.i.k.d0;
import c.i.k.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements y {
    public static final int[] a = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final c.b.i.e f196b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f197c;

    /* renamed from: d  reason: collision with root package name */
    public h0 f198d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f199e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f200f;

    /* renamed from: g  reason: collision with root package name */
    public e f201g;

    /* renamed from: h  reason: collision with root package name */
    public int f202h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f203i;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements e, DialogInterface.OnClickListener {
        public i a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f204b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f205c;

        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public boolean a() {
            i iVar = this.a;
            if (iVar != null) {
                return iVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void dismiss() {
            i iVar = this.a;
            if (iVar != null) {
                iVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void e(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void g(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public CharSequence h() {
            return this.f205c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void k(CharSequence charSequence) {
            this.f205c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void n(int i2, int i3) {
            if (this.f204b == null) {
                return;
            }
            i.a aVar = new i.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f205c;
            if (charSequence != null) {
                aVar.a.f128d = charSequence;
            }
            ListAdapter listAdapter = this.f204b;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.a;
            bVar.f137m = listAdapter;
            bVar.f138n = this;
            bVar.s = selectedItemPosition;
            bVar.r = true;
            i a = aVar.a();
            this.a = a;
            ListView listView = a.f816c.f117g;
            listView.setTextDirection(i2);
            listView.setTextAlignment(i3);
            this.a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f204b.getItemId(i2));
            }
            i iVar = this.a;
            if (iVar != null) {
                iVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void p(ListAdapter listAdapter) {
            this.f204b = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f207b;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f207b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof w0) {
                    w0 w0Var = (w0) spinnerAdapter;
                    if (w0Var.getDropDownViewTheme() == null) {
                        w0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f207b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f207b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends k0 implements e {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AppCompatSpinner.this.setSelection(i2);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    AppCompatSpinner.this.performItemClick(view, i2, dVar.E.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(dVar);
                AtomicInteger atomicInteger = d0.a;
                if (!(d0.f.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(dVar.F))) {
                    d.this.dismiss();
                    return;
                }
                d.this.s();
                d.this.show();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.F = new Rect();
            this.s = AppCompatSpinner.this;
            r(true);
            this.q = 0;
            this.t = new a(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public CharSequence h() {
            return this.D;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void k(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void m(int i2) {
            this.G = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void n(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            s();
            this.C.setInputMethodMode(2);
            show();
            f0 f0Var = this.f1197f;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i2);
            f0Var.setTextAlignment(i3);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            f0 f0Var2 = this.f1197f;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (a2 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.C.setOnDismissListener(new c(bVar));
        }

        @Override // c.b.i.k0, androidx.appcompat.widget.AppCompatSpinner.e
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.E = listAdapter;
        }

        public void s() {
            Drawable i2 = i();
            int i3 = 0;
            if (i2 != null) {
                i2.getPadding(AppCompatSpinner.this.f203i);
                i3 = g1.a(AppCompatSpinner.this) ? AppCompatSpinner.this.f203i.right : -AppCompatSpinner.this.f203i.left;
            } else {
                Rect rect = AppCompatSpinner.this.f203i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f202h;
            if (i4 == -2) {
                int a2 = appCompatSpinner.a((SpinnerAdapter) this.E, i());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f203i;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                q(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                q((width - paddingLeft) - paddingRight);
            } else {
                q(i4);
            }
            this.f1200i = g1.a(AppCompatSpinner.this) ? (((width - paddingRight) - this.f1199h) - this.G) + i3 : paddingLeft + this.G + i3;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();

        void dismiss();

        void e(Drawable drawable);

        int f();

        void g(int i2);

        CharSequence h();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i2);

        void m(int i2);

        void n(int i2, int i3);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r4 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f203i = r0
            android.content.Context r0 = r9.getContext()
            c.b.i.v0.a(r9, r0)
            int[] r0 = c.b.b.u
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            c.b.i.e r2 = new c.b.i.e
            r2.<init>(r9)
            r9.f196b = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            c.b.h.c r3 = new c.b.h.c
            r3.<init>(r10, r2)
            r9.f197c = r3
            goto L30
        L2e:
            r9.f197c = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.AppCompatSpinner.a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r5 == 0) goto L52
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L52
        L43:
            r10 = move-exception
            r2 = r4
            goto L49
        L46:
            goto L50
        L48:
            r10 = move-exception
        L49:
            if (r2 == 0) goto L4e
            r2.recycle()
        L4e:
            throw r10
        L4f:
            r4 = r2
        L50:
            if (r4 == 0) goto L55
        L52:
            r4.recycle()
        L55:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L91
            if (r3 == r5) goto L5c
            goto L9f
        L5c:
            androidx.appcompat.widget.AppCompatSpinner$d r3 = new androidx.appcompat.widget.AppCompatSpinner$d
            android.content.Context r6 = r9.f197c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f197c
            int[] r7 = c.b.b.u
            c.b.i.a1 r6 = c.b.i.a1.q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.f202h = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.C
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.D = r4
            android.content.res.TypedArray r4 = r6.f1083b
            r4.recycle()
            r9.f201g = r3
            c.b.i.w r4 = new c.b.i.w
            r4.<init>(r9, r9, r3)
            r9.f198d = r4
            goto L9f
        L91:
            androidx.appcompat.widget.AppCompatSpinner$b r3 = new androidx.appcompat.widget.AppCompatSpinner$b
            r3.<init>()
            r9.f201g = r3
            java.lang.String r4 = r0.getString(r4)
            r3.k(r4)
        L9f:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lb6
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131493049(0x7f0c00b9, float:1.8609567E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lb6:
            r0.recycle()
            r9.f200f = r5
            android.widget.SpinnerAdapter r10 = r9.f199e
            if (r10 == 0) goto Lc4
            r9.setAdapter(r10)
            r9.f199e = r2
        Lc4:
            c.b.i.e r10 = r9.f196b
            r10.d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
            drawable.getPadding(this.f203i);
            Rect rect = this.f203i;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    public void b() {
        this.f201g.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        e eVar = this.f201g;
        return eVar != null ? eVar.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        e eVar = this.f201g;
        return eVar != null ? eVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f201g != null ? this.f202h : super.getDropDownWidth();
    }

    public final e getInternalPopup() {
        return this.f201g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        e eVar = this.f201g;
        return eVar != null ? eVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f197c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        e eVar = this.f201g;
        return eVar != null ? eVar.h() : super.getPrompt();
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f201g;
        if (eVar == null || !eVar.a()) {
            return;
        }
        this.f201g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f201g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        e eVar = this.f201g;
        savedState.a = eVar != null && eVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f198d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        e eVar = this.f201g;
        if (eVar != null) {
            if (eVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f200f) {
            this.f199e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f201g != null) {
            Context context = this.f197c;
            if (context == null) {
                context = getContext();
            }
            this.f201g.p(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        e eVar = this.f201g;
        if (eVar == null) {
            super.setDropDownHorizontalOffset(i2);
            return;
        }
        eVar.m(i2);
        this.f201g.g(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        e eVar = this.f201g;
        if (eVar != null) {
            eVar.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f201g != null) {
            this.f202h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        e eVar = this.f201g;
        if (eVar != null) {
            eVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(c.b.d.a.a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        e eVar = this.f201g;
        if (eVar != null) {
            eVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c.b.i.e eVar = this.f196b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
