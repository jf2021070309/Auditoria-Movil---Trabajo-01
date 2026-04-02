package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import c.i.a;
import c.t.f;
import c.t.j;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean a0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.t(context, R.attr.preferenceScreenStyle, 16842891), 0);
        this.a0 = true;
    }

    @Override // androidx.preference.Preference
    public void s() {
        j.b bVar;
        if (this.f485m != null || this.f486n != null || R() == 0 || (bVar = this.f474b.f2560j) == null) {
            return;
        }
        f fVar = (f) bVar;
        boolean z = false;
        for (Fragment fragment = fVar; !z && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof f.InterfaceC0053f) {
                z = ((f.InterfaceC0053f) fragment).a(fVar, this);
            }
        }
        if (!z && (fVar.getContext() instanceof f.InterfaceC0053f)) {
            z = ((f.InterfaceC0053f) fVar.getContext()).a(fVar, this);
        }
        if (z || !(fVar.getActivity() instanceof f.InterfaceC0053f)) {
            return;
        }
        ((f.InterfaceC0053f) fVar.getActivity()).a(fVar, this);
    }
}
