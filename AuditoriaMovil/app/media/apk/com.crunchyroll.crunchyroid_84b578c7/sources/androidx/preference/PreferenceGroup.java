package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.amazon.aps.iva.x.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final h<String, Long> O;
    public final ArrayList P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.O = new h<>();
        new Handler(Looper.getMainLooper());
        this.Q = true;
        this.R = 0;
        this.S = false;
        this.T = Integer.MAX_VALUE;
        this.P = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.l8.h.i, i, i2);
        this.Q = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.m);
            }
            this.T = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public final <T extends Preference> T B(CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(this.m, charSequence)) {
                return this;
            }
            int D = D();
            for (int i = 0; i < D; i++) {
                T t2 = (T) C(i);
                if (TextUtils.equals(t2.m, charSequence)) {
                    return t2;
                }
                if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).B(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public final Preference C(int i) {
        return (Preference) this.P.get(i);
    }

    public final int D() {
        return this.P.size();
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int D = D();
        for (int i = 0; i < D; i++) {
            C(i).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int D = D();
        for (int i = 0; i < D; i++) {
            C(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(boolean z) {
        super.k(z);
        int D = D();
        for (int i = 0; i < D; i++) {
            Preference C = C(i);
            if (C.w == z) {
                C.w = !z;
                C.k(C.z());
                C.j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l() {
        super.l();
        this.S = true;
        int D = D();
        for (int i = 0; i < D; i++) {
            C(i).l();
        }
    }

    @Override // androidx.preference.Preference
    public final void p() {
        super.p();
        this.S = false;
        int D = D();
        for (int i = 0; i < D; i++) {
            C(i).p();
        }
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.r(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        this.T = aVar.b;
        super.r(aVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.K = true;
        return new a(AbsSavedState.EMPTY_STATE, this.T);
    }

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0048a();
        public final int b;

        /* renamed from: androidx.preference.PreferenceGroup$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0048a implements Parcelable.Creator<a> {
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
            this.b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public a(AbsSavedState absSavedState, int i) {
            super(absSavedState);
            this.b = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
