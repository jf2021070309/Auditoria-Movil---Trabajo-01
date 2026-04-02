package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import c.t.c;
import c.t.d;
import c.t.f;
import c.t.j;
import c.t.n;
import ch.qos.logback.core.joran.action.Action;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence O;
    public CharSequence P;
    public Drawable U;
    public CharSequence V;
    public CharSequence W;
    public int X;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T a(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.i.a.t(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2568c, i2, i3);
        String F = c.i.a.F(obtainStyledAttributes, 9, 0);
        this.O = F;
        if (F == null) {
            this.O = this.f480h;
        }
        String string = obtainStyledAttributes.getString(8);
        this.P = string == null ? obtainStyledAttributes.getString(1) : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.U = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = obtainStyledAttributes.getString(11);
        this.V = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        String string3 = obtainStyledAttributes.getString(10);
        this.W = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        this.X = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void s() {
        c.m.b.n dVar;
        j.a aVar = this.f474b.f2559i;
        if (aVar != null) {
            f fVar = (f) aVar;
            boolean z = false;
            for (Fragment fragment = fVar; !z && fragment != null; fragment = fragment.getParentFragment()) {
                if (fragment instanceof f.d) {
                    z = ((f.d) fragment).a(fVar, this);
                }
            }
            if (!z && (fVar.getContext() instanceof f.d)) {
                z = ((f.d) fVar.getContext()).a(fVar, this);
            }
            if (!z && (fVar.getActivity() instanceof f.d)) {
                z = ((f.d) fVar.getActivity()).a(fVar, this);
            }
            if (!z && fVar.getParentFragmentManager().F("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f484l;
                    dVar = new c.t.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString(Action.KEY_ATTRIBUTE, str);
                    dVar.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f484l;
                    dVar = new c();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString(Action.KEY_ATTRIBUTE, str2);
                    dVar.setArguments(bundle2);
                } else if (!(this instanceof MultiSelectListPreference)) {
                    StringBuilder y = e.a.d.a.a.y("Cannot display dialog for an unknown Preference type: ");
                    y.append(getClass().getSimpleName());
                    y.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(y.toString());
                } else {
                    String str3 = this.f484l;
                    dVar = new d();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString(Action.KEY_ATTRIBUTE, str3);
                    dVar.setArguments(bundle3);
                }
                dVar.setTargetFragment(fVar, 0);
                dVar.show(fVar.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }
}
