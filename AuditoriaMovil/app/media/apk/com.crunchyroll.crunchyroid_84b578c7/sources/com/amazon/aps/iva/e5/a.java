package com.amazon.aps.iva.e5;

import android.animation.ValueAnimator;
import android.util.Property;
import com.amazon.aps.iva.f5.q;
import com.amazon.aps.iva.f5.r;
import com.amazon.aps.iva.f5.s;
import java.util.ArrayList;
/* compiled from: ParallaxTransition.java */
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ q a;

    public a(q qVar) {
        this.a = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            q qVar = this.a;
            ArrayList arrayList = qVar.d;
            if (i < arrayList.size()) {
                r rVar = (r) arrayList.get(i);
                if (rVar.a.size() >= 2) {
                    ArrayList arrayList2 = qVar.a;
                    if (arrayList2.size() >= 2) {
                        float[] fArr = qVar.c;
                        float f = fArr[0];
                        int i2 = 1;
                        while (i2 < arrayList2.size()) {
                            float f2 = fArr[i2];
                            if (f2 >= f) {
                                if (f == -3.4028235E38f && f2 == Float.MAX_VALUE) {
                                    int i3 = i2 - 1;
                                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i3), ((Property) arrayList2.get(i3)).getName(), Integer.valueOf(i2), ((Property) arrayList2.get(i2)).getName()));
                                } else {
                                    i2++;
                                    f = f2;
                                }
                            } else {
                                int i4 = i2 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", Integer.valueOf(i2), ((Property) arrayList2.get(i2)).getName(), Integer.valueOf(i4), ((Property) arrayList2.get(i4)).getName()));
                            }
                        }
                    }
                    int i5 = 0;
                    boolean z = false;
                    while (true) {
                        ArrayList arrayList3 = rVar.b;
                        if (i5 < arrayList3.size()) {
                            ((s) arrayList3.get(i5)).getClass();
                            if (!z) {
                                rVar.a();
                                z = true;
                            }
                            i5++;
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
