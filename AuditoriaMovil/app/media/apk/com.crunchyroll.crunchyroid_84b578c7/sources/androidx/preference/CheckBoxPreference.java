package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a T;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            checkBoxPreference.getClass();
            checkBoxPreference.B(z);
        }
    }

    public CheckBoxPreference() {
        throw null;
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.b, i, 0);
        this.P = j.g(obtainStyledAttributes, 5, 0);
        if (this.O) {
            j();
        }
        this.Q = j.g(obtainStyledAttributes, 4, 1);
        if (!this.O) {
            j();
        }
        this.S = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void D(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.T);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        D(gVar.b1(16908289));
        C(gVar.b1(16908304));
    }

    @Override // androidx.preference.Preference
    public final void u(View view) {
        super.u(view);
        if (((AccessibilityManager) this.b.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(16908289));
            C(view.findViewById(16908304));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }
}
