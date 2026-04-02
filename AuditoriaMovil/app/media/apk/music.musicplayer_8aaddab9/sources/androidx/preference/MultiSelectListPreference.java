package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] Y;
    public CharSequence[] Z;
    public Set<String> a0;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Set<String> a;

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
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.a.size());
            Set<String> set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968916(0x7f040154, float:1.75465E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = c.i.a.t(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.a0 = r2
            int[] r2 = c.t.n.f2571f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            java.lang.CharSequence[] r5 = c.i.a.H(r4, r5, r1)
            r3.Y = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L2e
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L2e:
            r3.Z = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void A(Object obj) {
        O(h((Set) obj));
    }

    public void O(Set<String> set) {
        this.a0.clear();
        this.a0.addAll(set);
        if (M() && !set.equals(h(null))) {
            i();
            SharedPreferences.Editor b2 = this.f474b.b();
            b2.putStringSet(this.f484l, set);
            if (!this.f474b.f2555e) {
                b2.apply();
            }
        }
        m();
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        savedState.a = this.a0;
        return savedState;
    }
}
