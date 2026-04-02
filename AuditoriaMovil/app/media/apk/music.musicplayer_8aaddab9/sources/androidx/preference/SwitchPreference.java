package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import c.t.l;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a X;
    public CharSequence Y;
    public CharSequence Z;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.a(Boolean.valueOf(z))) {
                SwitchPreference.this.O(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969597(0x7f0403fd, float:1.754788E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = c.i.a.t(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$a r2 = new androidx.preference.SwitchPreference$a
            r2.<init>()
            r3.X = r2
            int[] r2 = c.t.n.f2577l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = c.i.a.F(r4, r5, r1)
            r3.Q(r5)
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.P(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3f
            java.lang.String r5 = r4.getString(r0)
        L3f:
            r3.Y = r5
            r3.m()
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L51
            java.lang.String r5 = r4.getString(r0)
        L51:
            r3.Z = r5
            r3.m()
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.W = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(16908352));
            R(view.findViewById(16908304));
        }
    }

    public final void T(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.Y);
            r4.setTextOff(this.Z);
            r4.setOnCheckedChangeListener(this.X);
        }
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        super.r(lVar);
        T(lVar.y(16908352));
        S(lVar);
    }
}
