package com.amazon.aps.iva.p1;

import android.view.MotionEvent;
import com.amazon.aps.iva.ee0.f1;
import java.util.List;
/* compiled from: PointerEvent.android.kt */
/* loaded from: classes.dex */
public final class m {
    public final List<y> a;
    public final h b;
    public int c;

    public m(List<y> list, h hVar) {
        this.a = list;
        this.b = hVar;
        MotionEvent motionEvent = hVar != null ? hVar.b.b : null;
        int i = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = hVar != null ? hVar.b.b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = hVar != null ? hVar.b.b : null;
        int i2 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                        i2 = i;
                    }
                    i = 3;
                    i2 = i;
                }
                i = 2;
                i2 = i;
            }
            i = 1;
            i2 = i;
        } else {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    i2 = 3;
                    break;
                }
                y yVar = list.get(i);
                if (f1.p(yVar)) {
                    i2 = 2;
                    break;
                } else if (f1.o(yVar)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.c = i2;
    }

    public m(List<y> list) {
        this(list, null);
    }
}
