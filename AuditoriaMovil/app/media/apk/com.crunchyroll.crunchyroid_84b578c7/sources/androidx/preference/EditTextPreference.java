package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String U;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0045a();
        public String b;

        /* renamed from: androidx.preference.EditTextPreference$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0045a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.f<EditTextPreference> {
        public static b a;

        @Override // androidx.preference.Preference.f
        public final CharSequence a(EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            if (TextUtils.isEmpty(editTextPreference2.U)) {
                return editTextPreference2.b.getString(R.string.not_set);
            }
            return editTextPreference2.U;
        }
    }

    public EditTextPreference() {
        throw null;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.d, i, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (b.a == null) {
                b.a = new b();
            }
            this.M = b.a;
            j();
        }
        obtainStyledAttributes.recycle();
    }

    public final void B(String str) {
        boolean z = z();
        this.U = str;
        v(str);
        boolean z2 = z();
        if (z2 != z) {
            k(z2);
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.r(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.r(aVar.getSuperState());
        B(aVar.b);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.K = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.s) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.b = this.U;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        B(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean z() {
        if (!TextUtils.isEmpty(this.U) && !super.z()) {
            return false;
        }
        return true;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.editTextPreferenceStyle, 16842898));
    }
}
