package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] U;
    public final CharSequence[] V;
    public final HashSet W;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0047a();
        public HashSet b;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0047a implements Parcelable.Creator<a> {
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
            int readInt = parcel.readInt();
            this.b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.b, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b.size());
            HashSet hashSet = this.b;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }
    }

    public MultiSelectListPreference() {
        throw null;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.W = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.U = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.V = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    public final void B(Set<String> set) {
        HashSet hashSet = this.W;
        hashSet.clear();
        hashSet.addAll(set);
        if (A()) {
            boolean A = A();
            String str = this.m;
            Set<String> set2 = null;
            if (A) {
                set2 = this.c.c().getStringSet(str, null);
            }
            if (!set.equals(set2)) {
                SharedPreferences.Editor b = this.c.b();
                b.putStringSet(str, set);
                if (!this.c.e) {
                    b.apply();
                }
            }
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        aVar.b = this.W;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        Set<String> set = (Set) obj;
        if (A()) {
            set = this.c.c().getStringSet(this.m, set);
        }
        B(set);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
