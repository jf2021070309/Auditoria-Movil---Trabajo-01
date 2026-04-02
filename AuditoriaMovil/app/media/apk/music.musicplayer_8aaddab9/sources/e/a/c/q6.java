package e.a.c;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.music.MediaPlaybackActivity;
import e.h.g.j0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class q6 extends DialogFragment {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f5164b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f5165c = 30;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5166d = false;

    /* renamed from: e  reason: collision with root package name */
    public TextView f5167e;

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            q6 q6Var = q6.this;
            q6Var.f5164b = i2;
            q6Var.a();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            q6 q6Var = q6.this;
            q6Var.f5165c = i2;
            q6Var.a();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public final void a() {
        int i2 = this.f5164b;
        if (i2 <= 0 || !e.h.g.m0.a) {
            if (e.h.g.m0.a) {
                this.f5167e.setText(e.h.g.q1.c(R.plurals.nnn_minutes_left, this.f5165c));
                return;
            }
            this.f5167e.setText(e.h.g.q1.c(R.plurals.nnn_minutes_left, (i2 * 60) + this.f5165c));
            return;
        }
        TextView textView = this.f5167e;
        textView.setText(this.f5164b + " hours " + this.f5165c + " minutes left");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        setStyle(1, 2131886728);
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sleep_timer2, viewGroup, false);
        Bundle arguments = getArguments();
        this.f5165c = 30;
        this.f5164b = 0;
        this.f5166d = false;
        if (arguments != null) {
            this.f5165c = arguments.getInt("m");
            this.f5164b = arguments.getInt("h");
            this.f5166d = arguments.getBoolean("r");
        }
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekbar_hour);
        seekBar.setProgress(this.f5164b);
        SeekBar seekBar2 = (SeekBar) inflate.findViewById(R.id.seekbar_minute);
        seekBar2.setProgress(this.f5165c);
        this.f5167e = (TextView) inflate.findViewById(R.id.tv_title);
        TextView textView = (TextView) inflate.findViewById(R.id.cancel);
        textView.setText(z6.E(R.string.cancel));
        TextView textView2 = (TextView) inflate.findViewById(R.id.create);
        textView2.setText(z6.E(R.string.ok));
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.play_rest_of_song);
        checkBox.setText(z6.E(R.string.playing_last_song));
        ((TextView) inflate.findViewById(R.id.tv_hour)).setText(z6.E(R.string.hours));
        ((TextView) inflate.findViewById(R.id.tv_minute)).setText(z6.E(R.string.minute));
        checkBox.setChecked(this.f5166d);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e.a.c.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                q6.this.f5166d = z;
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q6.this.dismiss();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q6 q6Var = q6.this;
                Activity activity = q6Var.getActivity();
                if (activity != null && !activity.isFinishing() && (activity instanceof MediaPlaybackActivity)) {
                    final MediaPlaybackActivity mediaPlaybackActivity = (MediaPlaybackActivity) activity;
                    final int i2 = q6Var.f5164b;
                    final int i3 = q6Var.f5165c;
                    final boolean z = q6Var.f5166d;
                    e.h.g.j0.f(new j0.b() { // from class: e.a.c.d1
                        @Override // e.h.g.j0.b
                        public final void a() {
                            MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                            int i4 = i3;
                            int i5 = i2;
                            boolean z2 = z;
                            s6 s6Var = mediaPlaybackActivity2.V;
                            if (s6Var != null) {
                                try {
                                    s6Var.f5177b.v0(i4, i5, z2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    });
                }
                q6Var.dismiss();
            }
        });
        seekBar.setOnSeekBarChangeListener(new a());
        seekBar2.setOnSeekBarChangeListener(new b());
        a();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("test", true);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        getDialog().setCanceledOnTouchOutside(true);
        Activity activity = getActivity();
        Display defaultDisplay = getDialog().getWindow().getWindowManager().getDefaultDisplay();
        double[] dArr = new double[2];
        int b2 = e.h.g.v0.b(activity, false);
        float f2 = 0.6f;
        if (Math.max(b2, e.h.g.v0.a(activity, false)) < 400 || b2 < 400) {
            f2 = 0.9f;
        } else if (b2 < 500) {
            f2 = 0.82f;
        } else if (b2 < 600) {
            f2 = 0.78f;
        } else if (b2 < 700) {
            f2 = 0.73f;
        } else if (b2 < 800) {
            f2 = 0.66f;
        }
        dArr[0] = f2 * defaultDisplay.getWidth();
        dArr[1] = -2.0d;
        getDialog().getWindow().setLayout((int) dArr[0], -2);
    }
}
