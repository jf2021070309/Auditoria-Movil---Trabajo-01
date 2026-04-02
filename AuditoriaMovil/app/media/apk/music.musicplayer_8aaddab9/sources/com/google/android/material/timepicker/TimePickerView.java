package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.c.d;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import e.d.b.d.a0.d;
import e.d.b.d.a0.e;
import e.d.b.d.a0.f;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final Chip v;
    public final Chip w;
    public final MaterialButtonToggleGroup x;
    public final View.OnClickListener y;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.u;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.y = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.x = materialButtonToggleGroup;
        materialButtonToggleGroup.f4594e.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.v = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.w = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        AtomicInteger atomicInteger = d0.a;
        d0.f.f(chip, 2);
        d0.f.f(chip2, 2);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            s();
        }
    }

    public final void s() {
        d.a aVar;
        if (this.x.getVisibility() == 0) {
            c.g.c.d dVar = new c.g.c.d();
            dVar.c(this);
            AtomicInteger atomicInteger = d0.a;
            char c2 = d0.d.d(this) == 0 ? (char) 2 : (char) 1;
            if (dVar.f1846f.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (aVar = dVar.f1846f.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c2) {
                    case 1:
                        d.b bVar = aVar.f1849d;
                        bVar.f1873k = -1;
                        bVar.f1872j = -1;
                        bVar.H = -1;
                        bVar.O = Level.ALL_INT;
                        break;
                    case 2:
                        d.b bVar2 = aVar.f1849d;
                        bVar2.f1875m = -1;
                        bVar2.f1874l = -1;
                        bVar2.I = -1;
                        bVar2.Q = Level.ALL_INT;
                        break;
                    case 3:
                        d.b bVar3 = aVar.f1849d;
                        bVar3.o = -1;
                        bVar3.f1876n = -1;
                        bVar3.J = 0;
                        bVar3.P = Level.ALL_INT;
                        break;
                    case 4:
                        d.b bVar4 = aVar.f1849d;
                        bVar4.p = -1;
                        bVar4.q = -1;
                        bVar4.K = 0;
                        bVar4.R = Level.ALL_INT;
                        break;
                    case 5:
                        d.b bVar5 = aVar.f1849d;
                        bVar5.r = -1;
                        bVar5.s = -1;
                        bVar5.t = -1;
                        bVar5.N = 0;
                        bVar5.U = Level.ALL_INT;
                        break;
                    case 6:
                        d.b bVar6 = aVar.f1849d;
                        bVar6.u = -1;
                        bVar6.v = -1;
                        bVar6.M = 0;
                        bVar6.T = Level.ALL_INT;
                        break;
                    case 7:
                        d.b bVar7 = aVar.f1849d;
                        bVar7.w = -1;
                        bVar7.x = -1;
                        bVar7.L = 0;
                        bVar7.S = Level.ALL_INT;
                        break;
                    case '\b':
                        d.b bVar8 = aVar.f1849d;
                        bVar8.D = -1.0f;
                        bVar8.C = -1;
                        bVar8.B = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            dVar.b(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }
}
