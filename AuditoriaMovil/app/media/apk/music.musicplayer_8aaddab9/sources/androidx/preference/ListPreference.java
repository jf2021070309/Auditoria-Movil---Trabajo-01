package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import c.t.n;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] Y;
    public CharSequence[] Z;
    public String a0;
    public String b0;
    public boolean c0;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements Preference.f<ListPreference> {
        public static a a;

        @Override // androidx.preference.Preference.f
        public CharSequence a(ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.Q()) ? listPreference2.a.getString(R.string.not_set) : listPreference2.Q();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.i.a.t(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2570e, i2, i3);
        this.Y = c.i.a.H(obtainStyledAttributes, 2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(3);
        this.Z = textArray == null ? obtainStyledAttributes.getTextArray(1) : textArray;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (a.a == null) {
                a.a = new a();
            }
            this.M = a.a;
            m();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n.f2572g, i2, i3);
        this.b0 = c.i.a.F(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public void A(Object obj) {
        S(g((String) obj));
    }

    @Override // androidx.preference.Preference
    public void H(CharSequence charSequence) {
        super.H(charSequence);
        if (charSequence == null) {
            this.b0 = null;
        } else {
            this.b0 = charSequence.toString();
        }
    }

    public int O(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.Z) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.Z[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] P() {
        return this.Y;
    }

    public CharSequence Q() {
        CharSequence[] charSequenceArr;
        int O = O(this.a0);
        if (O < 0 || (charSequenceArr = this.Y) == null) {
            return null;
        }
        return charSequenceArr[O];
    }

    public void R(CharSequence[] charSequenceArr) {
        this.Y = charSequenceArr;
    }

    public void S(String str) {
        boolean z = !TextUtils.equals(this.a0, str);
        if (z || !this.c0) {
            this.a0 = str;
            this.c0 = true;
            D(str);
            if (z) {
                m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence j() {
        Preference.f fVar = this.M;
        if (fVar != null) {
            return fVar.a(this);
        }
        CharSequence Q = Q();
        CharSequence j2 = super.j();
        String str = this.b0;
        if (str == null) {
            return j2;
        }
        Object[] objArr = new Object[1];
        if (Q == null) {
            Q = "";
        }
        objArr[0] = Q;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, j2)) {
            return j2;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    public void y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.y(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.y(savedState.getSuperState());
        S(savedState.a);
    }

    @Override // androidx.preference.Preference
    public Parcelable z() {
        Parcelable z = super.z();
        if (this.s) {
            return z;
        }
        SavedState savedState = new SavedState(z);
        savedState.a = this.a0;
        return savedState;
    }
}
