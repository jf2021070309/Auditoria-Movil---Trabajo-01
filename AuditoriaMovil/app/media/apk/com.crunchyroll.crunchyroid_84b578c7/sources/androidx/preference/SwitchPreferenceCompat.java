package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a T;
    public CharSequence U;
    public CharSequence V;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.B(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m, i, i2);
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
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.U);
            switchCompat.setTextOff(this.V);
            switchCompat.setOnCheckedChangeListener(this.T);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        D(gVar.b1(R.id.switchWidget));
        C(gVar.b1(16908304));
    }

    @Override // androidx.preference.Preference
    public final void u(View view) {
        super.u(view);
        if (((AccessibilityManager) this.b.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(R.id.switchWidget));
            C(view.findViewById(16908304));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
