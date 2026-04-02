package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import c.t.l;
import c.t.n;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int O;
    public int P;
    public int U;
    public int V;
    public boolean W;
    public SeekBar X;
    public TextView Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public final SeekBar.OnSeekBarChangeListener c0;
    public final View.OnKeyListener d0;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f487b;

        /* renamed from: c  reason: collision with root package name */
        public int f488c;

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
            this.f487b = parcel.readInt();
            this.f488c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.a);
            parcel.writeInt(this.f487b);
            parcel.writeInt(this.f488c);
        }
    }

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.b0 || !seekBarPreference.W) {
                    seekBarPreference.P(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.Q(i2 + seekBarPreference2.P);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.W = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.W = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.P != seekBarPreference.O) {
                seekBarPreference.P(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.Z && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.X;
            if (seekBar == null) {
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i2, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.c0 = new a();
        this.d0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2576k, R.attr.seekBarPreferenceStyle, 0);
        this.P = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.P;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.U) {
            this.U = i2;
            m();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.V) {
            this.V = Math.min(this.U - this.P, Math.abs(i4));
            m();
        }
        this.Z = obtainStyledAttributes.getBoolean(2, true);
        this.a0 = obtainStyledAttributes.getBoolean(5, false);
        this.b0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        O(f(((Integer) obj).intValue()), true);
    }

    public final void O(int i2, boolean z) {
        int i3 = this.P;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.U;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.O) {
            this.O = i2;
            Q(i2);
            if (M() && i2 != f(i2 ^ (-1))) {
                i();
                SharedPreferences.Editor b2 = this.f474b.b();
                b2.putInt(this.f484l, i2);
                if (!this.f474b.f2555e) {
                    b2.apply();
                }
            }
            if (z) {
                m();
            }
        }
    }

    public void P(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.P;
        if (progress != this.O) {
            if (a(Integer.valueOf(progress))) {
                O(progress, false);
                return;
            }
            seekBar.setProgress(this.O - this.P);
            Q(this.O);
        }
    }

    public void Q(int i2) {
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        super.r(lVar);
        lVar.f527b.setOnKeyListener(this.d0);
        this.X = (SeekBar) lVar.y(R.id.seekbar);
        TextView textView = (TextView) lVar.y(R.id.seekbar_value);
        this.Y = textView;
        if (this.a0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.Y = null;
        }
        SeekBar seekBar = this.X;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.c0);
        this.X.setMax(this.U - this.P);
        int i2 = this.V;
        if (i2 != 0) {
            this.X.setKeyProgressIncrement(i2);
        } else {
            this.V = this.X.getKeyProgressIncrement();
        }
        this.X.setProgress(this.O - this.P);
        Q(this.O);
        this.X.setEnabled(l());
    }

    @Override // androidx.preference.Preference
    public Object v(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    @Override // androidx.preference.Preference
    public void y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.y(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.y(savedState.getSuperState());
        this.O = savedState.a;
        this.P = savedState.f487b;
        this.U = savedState.f488c;
        m();
    }

    @Override // androidx.preference.Preference
    public Parcelable z() {
        Parcelable z = super.z();
        if (this.s) {
            return z;
        }
        SavedState savedState = new SavedState(z);
        savedState.a = this.O;
        savedState.f487b = this.P;
        savedState.f488c = this.U;
        return savedState;
    }
}
