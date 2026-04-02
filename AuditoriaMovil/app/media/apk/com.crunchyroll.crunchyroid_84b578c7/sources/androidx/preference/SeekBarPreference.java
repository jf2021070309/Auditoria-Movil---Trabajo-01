package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public SeekBar T;
    public TextView U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final a Y;
    public final b Z;

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (z && (seekBarPreference.X || !seekBarPreference.S)) {
                int progress = seekBar.getProgress() + seekBarPreference.P;
                if (progress != seekBarPreference.O) {
                    seekBarPreference.B(progress, false);
                    return;
                }
                return;
            }
            int i2 = i + seekBarPreference.P;
            TextView textView = seekBarPreference.U;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.S = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.S = false;
            int progress2 = seekBar.getProgress();
            int i = seekBarPreference.P;
            if (progress2 + i != seekBarPreference.O && (progress = seekBar.getProgress() + i) != seekBarPreference.O) {
                seekBarPreference.B(progress, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.V && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.T) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public int b;
        public int c;
        public int d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
        }
    }

    public SeekBarPreference() {
        throw null;
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.Y = new a();
        this.Z = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.k, R.attr.seekBarPreferenceStyle, 0);
        this.P = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.P;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.Q) {
            this.Q = i2;
            j();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.R) {
            this.R = Math.min(this.Q - this.P, Math.abs(i4));
            j();
        }
        this.V = obtainStyledAttributes.getBoolean(2, true);
        this.W = obtainStyledAttributes.getBoolean(5, false);
        this.X = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void B(int i, boolean z) {
        int i2 = this.P;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.Q;
        if (i > i3) {
            i = i3;
        }
        if (i != this.O) {
            this.O = i;
            TextView textView = this.U;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (A()) {
                int i4 = ~i;
                boolean A = A();
                String str = this.m;
                if (A) {
                    i4 = this.c.c().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor b2 = this.c.b();
                    b2.putInt(str, i);
                    if (!this.c.e) {
                        b2.apply();
                    }
                }
            }
            if (z) {
                j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        super.n(gVar);
        gVar.itemView.setOnKeyListener(this.Z);
        this.T = (SeekBar) gVar.b1(R.id.seekbar);
        TextView textView = (TextView) gVar.b1(R.id.seekbar_value);
        this.U = textView;
        if (this.W) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.U = null;
        }
        SeekBar seekBar = this.T;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.Y);
        this.T.setMax(this.Q - this.P);
        int i = this.R;
        if (i != 0) {
            this.T.setKeyProgressIncrement(i);
        } else {
            this.R = this.T.getKeyProgressIncrement();
        }
        this.T.setProgress(this.O - this.P);
        int i2 = this.O;
        TextView textView2 = this.U;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.T.setEnabled(i());
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.r(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.r(cVar.getSuperState());
        this.O = cVar.b;
        this.P = cVar.c;
        this.Q = cVar.d;
        j();
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.K = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.s) {
            return absSavedState;
        }
        c cVar = new c(absSavedState);
        cVar.b = this.O;
        cVar.c = this.P;
        cVar.d = this.Q;
        return cVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (A()) {
            intValue = this.c.c().getInt(this.m, intValue);
        }
        B(intValue, true);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
