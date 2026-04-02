package com.amazon.aps.iva.q;

import android.content.Context;
import android.widget.EditText;
import com.amazon.aps.iva.m6.n;
import com.ellation.crunchyroll.ui.R;
import com.ellation.widgets.input.AdjustableTextInputLayout;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((k1) this.c).b(false);
                return;
            case 1:
                com.amazon.aps.iva.n0.o.a((com.amazon.aps.iva.n0.o) this.c);
                return;
            case 2:
                ((com.amazon.aps.iva.g6.a) this.c).e(null);
                return;
            case 3:
                com.amazon.aps.iva.k6.g gVar = (com.amazon.aps.iva.k6.g) this.c;
                synchronized (gVar.a) {
                    if (!gVar.l) {
                        long j = gVar.k - 1;
                        gVar.k = j;
                        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (i <= 0) {
                            if (i < 0) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                synchronized (gVar.a) {
                                    gVar.m = illegalStateException;
                                }
                                return;
                            }
                            gVar.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 4:
                ((n.b) this.c).a();
                return;
            case 5:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j1((Context) this.c, 4));
                return;
            case 6:
                AdjustableTextInputLayout adjustableTextInputLayout = (AdjustableTextInputLayout) this.c;
                int i2 = AdjustableTextInputLayout.d;
                com.amazon.aps.iva.yb0.j.f(adjustableTextInputLayout, "this$0");
                EditText editText = adjustableTextInputLayout.c;
                if (editText != null) {
                    com.amazon.aps.iva.xw.t0.i(editText, Integer.valueOf(adjustableTextInputLayout.b1(R.dimen.input_field_padding_horizontal)), Integer.valueOf(adjustableTextInputLayout.b1(R.dimen.input_field_padding_top)), Integer.valueOf(adjustableTextInputLayout.b1(R.dimen.input_field_padding_horizontal)), Integer.valueOf(adjustableTextInputLayout.b1(R.dimen.input_field_padding_bottom)));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("inputEditText");
                    throw null;
                }
            default:
                com.amazon.aps.iva.ha0.d dVar = (com.amazon.aps.iva.ha0.d) this.c;
                dVar.o.execute(new j1(dVar, 12));
                return;
        }
    }
}
