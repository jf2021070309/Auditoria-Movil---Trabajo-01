package com.amazon.aps.iva.sy;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.fragment.app.h;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.e;
import com.amazon.aps.iva.wy.c;
import com.amazon.aps.iva.wy.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.settings.SelectableTitlePreference;
import kotlin.Metadata;
/* compiled from: BasePreferenceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/sy/a;", "Lcom/amazon/aps/iva/wy/f;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class a extends f implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final void c0() {
        e.a(requireContext()).unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void d() {
        h activity = getActivity();
        j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.mvp.BasePresenterActivity");
        ((c) activity).d();
    }

    public final void d0() {
        e.a(requireContext()).registerOnSharedPreferenceChangeListener(this);
    }

    public final void hi(int i, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) G4(getString(i));
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.B(z);
        }
    }

    public final void xf(int i, boolean z) {
        SelectableTitlePreference selectableTitlePreference = (SelectableTitlePreference) G4(getString(i));
        if (selectableTitlePreference != null) {
            selectableTitlePreference.Q = z;
            TextView textView = selectableTitlePreference.O;
            if (textView != null) {
                textView.setSelected(z);
            }
        }
    }
}
