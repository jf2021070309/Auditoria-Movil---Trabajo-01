package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.preference.b;
import androidx.preference.e;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence O;
    public final String P;
    public final Drawable Q;
    public final String R;
    public final String S;
    public final int T;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T G4(CharSequence charSequence);
    }

    public DialogPreference() {
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.c, i, 0);
        String g = j.g(obtainStyledAttributes, 9, 0);
        this.O = g;
        if (g == null) {
            this.O = this.i;
        }
        this.P = j.g(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.Q = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.R = j.g(obtainStyledAttributes, 11, 3);
        this.S = j.g(obtainStyledAttributes, 10, 4);
        this.T = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o() {
        g dVar;
        e.a aVar = this.c.i;
        if (aVar != null) {
            b bVar = (b) aVar;
            boolean z = false;
            for (Fragment fragment = bVar; !z && fragment != null; fragment = fragment.getParentFragment()) {
                if (fragment instanceof b.d) {
                    z = ((b.d) fragment).a();
                }
            }
            if (!z && (bVar.getContext() instanceof b.d)) {
                z = ((b.d) bVar.getContext()).a();
            }
            if (!z && (bVar.getActivity() instanceof b.d)) {
                z = ((b.d) bVar.getActivity()).a();
            }
            if (!z && bVar.getParentFragmentManager().C("androidx.preference.PreferenceFragment.DIALOG") == null) {
                boolean z2 = this instanceof EditTextPreference;
                String str = this.m;
                if (z2) {
                    dVar = new com.amazon.aps.iva.l8.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    dVar.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    dVar = new com.amazon.aps.iva.l8.c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str);
                    dVar.setArguments(bundle2);
                } else if (this instanceof MultiSelectListPreference) {
                    dVar = new com.amazon.aps.iva.l8.d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str);
                    dVar.setArguments(bundle3);
                } else {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dVar.setTargetFragment(bVar, 0);
                dVar.show(bVar.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
