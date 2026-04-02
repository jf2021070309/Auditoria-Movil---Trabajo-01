package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.preference.b;
import androidx.preference.e;
import com.amazon.aps.iva.f3.j;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean U;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, j.a(context, R.attr.preferenceScreenStyle, 16842891));
        this.U = true;
    }

    @Override // androidx.preference.Preference
    public final void o() {
        e.b bVar;
        if (this.n == null && this.o == null && D() != 0 && (bVar = this.c.j) != null) {
            b bVar2 = (b) bVar;
            boolean z = false;
            for (Fragment fragment = bVar2; !z && fragment != null; fragment = fragment.getParentFragment()) {
                if (fragment instanceof b.f) {
                    z = ((b.f) fragment).a();
                }
            }
            if (!z && (bVar2.getContext() instanceof b.f)) {
                z = ((b.f) bVar2.getContext()).a();
            }
            if (!z && (bVar2.getActivity() instanceof b.f)) {
                ((b.f) bVar2.getActivity()).a();
            }
        }
    }
}
