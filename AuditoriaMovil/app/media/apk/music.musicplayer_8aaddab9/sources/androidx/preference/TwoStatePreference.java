package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import c.t.l;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean O;
    public CharSequence P;
    public CharSequence U;
    public boolean V;
    public boolean W;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean a;

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
            this.a = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public void A(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        O(e(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public boolean L() {
        return (this.W ? this.O : !this.O) || super.L();
    }

    public void O(boolean z) {
        boolean z2 = this.O != z;
        if (z2 || !this.V) {
            this.O = z;
            this.V = true;
            if (M() && z != e(!z)) {
                i();
                SharedPreferences.Editor b2 = this.f474b.b();
                b2.putBoolean(this.f484l, z);
                if (!this.f474b.f2555e) {
                    b2.apply();
                }
            }
            if (z2) {
                n(L());
                m();
            }
        }
    }

    public void P(CharSequence charSequence) {
        this.U = charSequence;
        if (this.O) {
            return;
        }
        m();
    }

    public void Q(CharSequence charSequence) {
        this.P = charSequence;
        if (this.O) {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.O
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.P
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.P
            r5.setText(r0)
        L1a:
            r0 = 0
            goto L2e
        L1c:
            boolean r1 = r4.O
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.U
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.U
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.j()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = 0
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L45
        L43:
            r2 = 8
        L45:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4e
            r5.setVisibility(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.R(android.view.View):void");
    }

    public void S(l lVar) {
        R(lVar.y(16908304));
    }

    @Override // androidx.preference.Preference
    public void s() {
        boolean z = !this.O;
        if (a(Boolean.valueOf(z))) {
            O(z);
        }
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
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
        savedState.a = this.O;
        return savedState;
    }
}
