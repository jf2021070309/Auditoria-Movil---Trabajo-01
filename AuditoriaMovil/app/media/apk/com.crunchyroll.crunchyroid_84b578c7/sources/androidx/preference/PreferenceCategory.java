package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.g;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public final boolean i() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        if (Build.VERSION.SDK_INT >= 28) {
            gVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean z() {
        return !super.i();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }
}
