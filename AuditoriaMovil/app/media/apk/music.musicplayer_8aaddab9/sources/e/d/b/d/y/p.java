package e.d.b.d.y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import c.b.i.k0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class p extends c.b.i.d {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f6723d;

    /* renamed from: e  reason: collision with root package name */
    public final AccessibilityManager f6724e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f6725f;

    public p(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f6725f = new Rect();
        Context context2 = getContext();
        TypedArray d2 = e.d.b.d.r.k.d(context2, attributeSet, e.d.b.d.b.f6322k, R.attr.autoCompleteTextViewStyle, 2131886845, new int[0]);
        if (d2.hasValue(0) && d2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f6724e = (AccessibilityManager) context2.getSystemService("accessibility");
        k0 k0Var = new k0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f6723d = k0Var;
        k0Var.r(true);
        k0Var.s = this;
        k0Var.C.setInputMethodMode(2);
        k0Var.p(getAdapter());
        k0Var.t = new o(this);
        d2.recycle();
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.E) ? super.getHint() : b2.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i4 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                k0 k0Var = this.f6723d;
                int min = Math.min(adapter.getCount(), Math.max(0, !k0Var.a() ? -1 : k0Var.f1197f.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable i6 = this.f6723d.i();
                if (i6 != null) {
                    i6.getPadding(this.f6725f);
                    Rect rect = this.f6725f;
                    i5 += rect.left + rect.right;
                }
                i4 = b2.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f6723d.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f6724e;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f6723d.show();
        }
    }
}
