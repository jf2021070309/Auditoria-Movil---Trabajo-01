package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c.t.l;
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a X;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z))) {
                CheckBoxPreference.this.O(z);
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
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968737(0x7f0400a1, float:1.7546136E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = c.i.a.t(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.CheckBoxPreference$a r2 = new androidx.preference.CheckBoxPreference$a
            r2.<init>()
            r3.X = r2
            int[] r2 = c.t.n.f2567b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = c.i.a.F(r4, r5, r1)
            r3.Q(r5)
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.P(r5)
            r5 = 3
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.W = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(16908289));
            R(view.findViewById(16908304));
        }
    }

    public final void T(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.X);
        }
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        super.r(lVar);
        T(lVar.y(16908289));
        S(lVar);
    }
}
