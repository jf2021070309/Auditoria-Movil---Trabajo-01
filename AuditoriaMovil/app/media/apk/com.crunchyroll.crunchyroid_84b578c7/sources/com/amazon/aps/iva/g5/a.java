package com.amazon.aps.iva.g5;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import java.util.ArrayList;
/* compiled from: DatePicker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ DatePicker c;

    public a(DatePicker datePicker) {
        this.c = datePicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        boolean z;
        boolean z2;
        boolean z3;
        DatePicker datePicker = this.c;
        int[] iArr = {datePicker.v, datePicker.u, datePicker.w};
        boolean z4 = true;
        boolean z5 = true;
        for (int i = 2; i >= 0; i--) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                int i3 = DatePicker.D[i];
                ArrayList<c> arrayList = datePicker.d;
                if (arrayList == null) {
                    cVar = null;
                } else {
                    cVar = arrayList.get(i2);
                }
                boolean z6 = false;
                if (z4) {
                    int i4 = datePicker.z.get(i3);
                    if (i4 != cVar.b) {
                        cVar.b = i4;
                        z = true;
                    }
                    z = false;
                } else {
                    int actualMinimum = datePicker.B.getActualMinimum(i3);
                    if (actualMinimum != cVar.b) {
                        cVar.b = actualMinimum;
                        z = true;
                    }
                    z = false;
                }
                boolean z7 = z | false;
                if (z5) {
                    int i5 = datePicker.A.get(i3);
                    if (i5 != cVar.c) {
                        cVar.c = i5;
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    int actualMaximum = datePicker.B.getActualMaximum(i3);
                    if (actualMaximum != cVar.c) {
                        cVar.c = actualMaximum;
                        z2 = true;
                    }
                    z2 = false;
                }
                boolean z8 = z7 | z2;
                if (datePicker.B.get(i3) == datePicker.z.get(i3)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 &= z3;
                if (datePicker.B.get(i3) == datePicker.A.get(i3)) {
                    z6 = true;
                }
                z5 &= z6;
                if (z8) {
                    datePicker.b(iArr[i], cVar);
                }
                int i6 = iArr[i];
                int i7 = datePicker.B.get(i3);
                c cVar2 = datePicker.d.get(i6);
                if (cVar2.a != i7) {
                    cVar2.a = i7;
                    VerticalGridView verticalGridView = (VerticalGridView) datePicker.c.get(i6);
                    if (verticalGridView != null) {
                        int i8 = i7 - datePicker.d.get(i6).b;
                        if (this.b) {
                            verticalGridView.setSelectedPositionSmooth(i8);
                        } else {
                            verticalGridView.setSelectedPosition(i8);
                        }
                    }
                }
            }
        }
    }
}
