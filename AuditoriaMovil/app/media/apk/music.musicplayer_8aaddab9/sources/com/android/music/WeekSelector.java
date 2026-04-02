package com.android.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.android.music.WeekSelector;
import e.a.c.g7;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class WeekSelector extends Activity {
    public Spinner a;

    /* renamed from: b  reason: collision with root package name */
    public final View.OnClickListener f3030b = new a();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g7.l(WeekSelector.this, "numweeks", WeekSelector.this.a.getSelectedItemPosition() + 1);
            WeekSelector.this.setResult(-1);
            WeekSelector.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
        requestWindowFeature(1);
        setContentView(R.layout.weekpicker);
        getWindow().setLayout(-1, -2);
        this.a = (Spinner) findViewById(R.id.weeks);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, getResources().getStringArray(R.array.weeklist));
        arrayAdapter.setDropDownViewResource(17367049);
        int c2 = g7.c(this, "numweeks", 2);
        int i2 = bundle != null ? bundle.getInt("numweeks", c2 - 1) : c2 - 1;
        this.a.setAdapter((SpinnerAdapter) arrayAdapter);
        this.a.setSelection(i2, false);
        findViewById(R.id.set).setOnClickListener(this.f3030b);
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: e.a.c.h6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeekSelector weekSelector = WeekSelector.this;
                weekSelector.setResult(0);
                weekSelector.finish();
            }
        });
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("numweeks", this.a.getSelectedItemPosition());
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            double[] dArr = new double[2];
            float f2 = 0.6f;
            if (defaultDisplay.getWidth() >= 400 && defaultDisplay.getHeight() >= 400) {
                if (defaultDisplay.getWidth() < defaultDisplay.getHeight()) {
                    f2 = 0.82f;
                }
                dArr[0] = f2 * defaultDisplay.getWidth();
                dArr[1] = -2.0d;
                getWindow().setLayout((int) dArr[0], (int) dArr[1]);
            }
            f2 = 0.9f;
            dArr[0] = f2 * defaultDisplay.getWidth();
            dArr[1] = -2.0d;
            getWindow().setLayout((int) dArr[0], (int) dArr[1]);
        } catch (NullPointerException unused) {
        }
    }
}
