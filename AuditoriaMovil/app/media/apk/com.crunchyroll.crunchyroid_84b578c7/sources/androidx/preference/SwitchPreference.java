package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a T;
    public CharSequence U;
    public CharSequence V;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreference switchPreference = SwitchPreference.this;
            switchPreference.getClass();
            switchPreference.B(z);
        }
    }

    public SwitchPreference() {
        throw null;
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.l, i, 0);
        this.P = j.g(obtainStyledAttributes, 7, 0);
        if (this.O) {
            j();
        }
        this.Q = j.g(obtainStyledAttributes, 6, 1);
        if (!this.O) {
            j();
        }
        this.U = j.g(obtainStyledAttributes, 9, 3);
        j();
        this.V = j.g(obtainStyledAttributes, 8, 4);
        j();
        this.S = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void D(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.U);
            r4.setTextOff(this.V);
            r4.setOnCheckedChangeListener(this.T);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        D(gVar.b1(16908352));
        C(gVar.b1(16908304));
    }

    @Override // androidx.preference.Preference
    public final void u(View view) {
        super.u(view);
        if (((AccessibilityManager) this.b.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(16908352));
            C(view.findViewById(16908304));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.switchPreferenceStyle, 16843629));
    }
}
