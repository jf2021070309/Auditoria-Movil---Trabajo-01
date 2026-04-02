package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import c.t.l;
import c.t.n;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a X;
    public CharSequence Y;
    public CharSequence Z;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.O(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.X = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2578m, R.attr.switchPreferenceCompatStyle, 0);
        Q(c.i.a.F(obtainStyledAttributes, 7, 0));
        String string = obtainStyledAttributes.getString(6);
        P(string == null ? obtainStyledAttributes.getString(1) : string);
        String string2 = obtainStyledAttributes.getString(9);
        this.Y = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        m();
        String string3 = obtainStyledAttributes.getString(8);
        this.Z = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        m();
        this.W = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(R.id.switchWidget));
            R(view.findViewById(16908304));
        }
    }

    public final void T(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.Y);
            switchCompat.setTextOff(this.Z);
            switchCompat.setOnCheckedChangeListener(this.X);
        }
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        super.r(lVar);
        T(lVar.y(R.id.switchWidget));
        S(lVar);
    }
}
