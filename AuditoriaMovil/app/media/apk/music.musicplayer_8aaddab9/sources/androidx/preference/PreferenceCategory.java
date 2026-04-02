package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import c.i.a;
import c.t.l;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.t(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    @Override // androidx.preference.Preference
    public boolean L() {
        return !super.l();
    }

    @Override // androidx.preference.Preference
    public boolean l() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        TextView textView;
        super.r(lVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            lVar.f527b.setAccessibilityHeading(true);
        } else if (i2 < 21) {
            TypedValue typedValue = new TypedValue();
            if (this.a.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) && (textView = (TextView) lVar.y(16908310)) != null) {
                if (textView.getCurrentTextColor() != c.i.d.a.b(this.a, R.color.preference_fallback_accent_color)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }
}
