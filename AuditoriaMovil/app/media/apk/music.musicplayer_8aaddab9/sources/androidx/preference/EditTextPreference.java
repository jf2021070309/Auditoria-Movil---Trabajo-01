package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.Preference;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String Y;

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
    public static final class a implements Preference.f<EditTextPreference> {
        public static a a;

        @Override // androidx.preference.Preference.f
        public CharSequence a(EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            return TextUtils.isEmpty(editTextPreference2.Y) ? editTextPreference2.a.getString(R.string.not_set) : editTextPreference2.Y;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968953(0x7f040179, float:1.7546574E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = c.i.a.t(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = c.t.n.f2569d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = c.i.a.u(r4, r1, r1, r1)
            if (r5 == 0) goto L2c
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.a
            if (r5 != 0) goto L25
            androidx.preference.EditTextPreference$a r5 = new androidx.preference.EditTextPreference$a
            r5.<init>()
            androidx.preference.EditTextPreference.a.a = r5
        L25:
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.a
            r3.M = r5
            r3.m()
        L2c:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void A(Object obj) {
        O(g((String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean L() {
        return TextUtils.isEmpty(this.Y) || super.L();
    }

    public void O(String str) {
        boolean L = L();
        this.Y = str;
        D(str);
        boolean L2 = L();
        if (L2 != L) {
            n(L2);
        }
        m();
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
        O(savedState.a);
    }

    @Override // androidx.preference.Preference
    public Parcelable z() {
        Parcelable z = super.z();
        if (this.s) {
            return z;
        }
        SavedState savedState = new SavedState(z);
        savedState.a = this.Y;
        return savedState;
    }
}
