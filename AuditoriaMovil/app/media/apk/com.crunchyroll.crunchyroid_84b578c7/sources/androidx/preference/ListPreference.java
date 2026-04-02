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
public class ListPreference extends DialogPreference {
    public final CharSequence[] U;
    public final CharSequence[] V;
    public String W;
    public String X;
    public boolean Y;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0046a();
        public String b;

        /* renamed from: androidx.preference.ListPreference$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0046a implements Parcelable.Creator<a> {
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
    public static final class b implements Preference.f<ListPreference> {
        public static b a;

        @Override // androidx.preference.Preference.f
        public final CharSequence a(ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            if (TextUtils.isEmpty(listPreference2.C())) {
                return listPreference2.b.getString(R.string.not_set);
            }
            return listPreference2.C();
        }
    }

    public ListPreference() {
        throw null;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.U = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.V = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (b.a == null) {
                b.a = new b();
            }
            this.M = b.a;
            j();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.g, i, 0);
        this.X = j.g(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public final int B(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.V) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public final CharSequence C() {
        CharSequence[] charSequenceArr;
        int B = B(this.W);
        if (B >= 0 && (charSequenceArr = this.U) != null) {
            return charSequenceArr[B];
        }
        return null;
    }

    public final void D(String str) {
        boolean z = !TextUtils.equals(this.W, str);
        if (z || !this.Y) {
            this.W = str;
            this.Y = true;
            v(str);
            if (z) {
                j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence h() {
        Preference.f fVar = this.M;
        if (fVar != null) {
            return fVar.a(this);
        }
        CharSequence C = C();
        CharSequence h = super.h();
        String str = this.X;
        if (str == null) {
            return h;
        }
        Object[] objArr = new Object[1];
        if (C == null) {
            C = "";
        }
        objArr[0] = C;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, h)) {
            return h;
        }
        return format;
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
        D(aVar.b);
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
        D(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void x(CharSequence charSequence) {
        super.x(charSequence);
        if (charSequence == null) {
            this.X = null;
        } else {
            this.X = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
