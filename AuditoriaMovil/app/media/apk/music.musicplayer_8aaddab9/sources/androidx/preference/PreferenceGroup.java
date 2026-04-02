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
import android.util.Log;
import androidx.preference.Preference;
import c.f.h;
import c.t.n;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final h<String, Long> O;
    public final Handler P;
    public final List<Preference> U;
    public boolean V;
    public int W;
    public boolean X;
    public int Y;
    public final Runnable Z;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

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
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.a = i2;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.O.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.O = new h<>();
        this.P = new Handler(Looper.getMainLooper());
        this.V = true;
        this.W = 0;
        this.X = false;
        this.Y = Integer.MAX_VALUE;
        this.Z = new a();
        this.U = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2574i, i2, i3);
        this.V = c.i.a.u(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            T(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean O(androidx.preference.Preference r9) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.O(androidx.preference.Preference):boolean");
    }

    public <T extends Preference> T P(CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(this.f484l, charSequence)) {
                return this;
            }
            int R = R();
            for (int i2 = 0; i2 < R; i2++) {
                T t2 = (T) Q(i2);
                if (TextUtils.equals(t2.f484l, charSequence)) {
                    return t2;
                }
                if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).P(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public Preference Q(int i2) {
        return this.U.get(i2);
    }

    public int R() {
        return this.U.size();
    }

    public final boolean S(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.N();
            if (preference.J == this) {
                preference.J = null;
            }
            remove = this.U.remove(preference);
            if (remove) {
                String str = preference.f484l;
                if (str != null) {
                    this.O.put(str, Long.valueOf(preference.d()));
                    this.P.removeCallbacks(this.Z);
                    this.P.post(this.Z);
                }
                if (this.X) {
                    preference.u();
                }
            }
        }
        return remove;
    }

    public void T(int i2) {
        if (i2 != Integer.MAX_VALUE && !k()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.Y = i2;
    }

    @Override // androidx.preference.Preference
    public void b(Bundle bundle) {
        super.b(bundle);
        int R = R();
        for (int i2 = 0; i2 < R; i2++) {
            Q(i2).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void c(Bundle bundle) {
        super.c(bundle);
        int R = R();
        for (int i2 = 0; i2 < R; i2++) {
            Q(i2).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void n(boolean z) {
        super.n(z);
        int R = R();
        for (int i2 = 0; i2 < R; i2++) {
            Q(i2).x(z);
        }
    }

    @Override // androidx.preference.Preference
    public void p() {
        super.p();
        this.X = true;
        int R = R();
        for (int i2 = 0; i2 < R; i2++) {
            Q(i2).p();
        }
    }

    @Override // androidx.preference.Preference
    public void u() {
        N();
        this.X = false;
        int R = R();
        for (int i2 = 0; i2 < R; i2++) {
            Q(i2).u();
        }
    }

    @Override // androidx.preference.Preference
    public void y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.y(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.Y = savedState.a;
        super.y(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public Parcelable z() {
        return new SavedState(super.z(), this.Y);
    }
}
