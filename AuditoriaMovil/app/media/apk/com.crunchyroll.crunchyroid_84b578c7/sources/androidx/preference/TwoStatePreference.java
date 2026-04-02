package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean O;
    public CharSequence P;
    public CharSequence Q;
    public boolean R;
    public boolean S;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0049a();
        public boolean b;

        /* renamed from: androidx.preference.TwoStatePreference$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0049a implements Parcelable.Creator<a> {
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
            this.b = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void B(boolean z) {
        boolean z2;
        if (this.O != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.R) {
            this.O = z;
            this.R = true;
            if (A()) {
                boolean z3 = !z;
                boolean A = A();
                String str = this.m;
                if (A) {
                    z3 = this.c.c().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor b = this.c.b();
                    b.putBoolean(str, z);
                    if (!this.c.e) {
                        b.apply();
                    }
                }
            }
            if (z2) {
                k(z());
                j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.O
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.P
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.O
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.Q
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.h()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.C(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public final void o() {
        B(!this.O);
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        aVar.b = this.O;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (A()) {
            booleanValue = this.c.c().getBoolean(this.m, booleanValue);
        }
        B(booleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean z() {
        boolean z;
        if (this.S) {
            z = this.O;
        } else if (!this.O) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.z()) {
            return true;
        }
        return false;
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context) {
        this(context, null);
    }
}
