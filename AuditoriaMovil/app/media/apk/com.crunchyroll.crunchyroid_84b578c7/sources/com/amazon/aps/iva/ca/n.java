package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.ca.a;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class n extends a<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final a<Float, Float> k;
    public final a<Float, Float> l;
    public com.amazon.aps.iva.na.c<Float> m;
    public com.amazon.aps.iva.na.c<Float> n;

    public n(d dVar, d dVar2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = dVar;
        this.l = dVar2;
        j(this.d);
    }

    @Override // com.amazon.aps.iva.ca.a
    public final PointF f() {
        return l(0.0f);
    }

    @Override // com.amazon.aps.iva.ca.a
    public final /* bridge */ /* synthetic */ PointF g(com.amazon.aps.iva.na.a<PointF> aVar, float f) {
        return l(f);
    }

    @Override // com.amazon.aps.iva.ca.a
    public final void j(float f) {
        a<Float, Float> aVar = this.k;
        aVar.j(f);
        a<Float, Float> aVar2 = this.l;
        aVar2.j(f);
        this.i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ((a.InterfaceC0165a) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f) {
        Float f2;
        a<Float, Float> aVar;
        com.amazon.aps.iva.na.a<Float> b;
        float floatValue;
        a<Float, Float> aVar2;
        com.amazon.aps.iva.na.a<Float> b2;
        float floatValue2;
        Float f3 = null;
        if (this.m != null && (b2 = (aVar2 = this.k).b()) != null) {
            float d = aVar2.d();
            Float f4 = b2.h;
            com.amazon.aps.iva.na.c<Float> cVar = this.m;
            float f5 = b2.g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = cVar.b(f5, floatValue2, b2.b, b2.c, f, f, d);
        } else {
            f2 = null;
        }
        if (this.n != null && (b = (aVar = this.l).b()) != null) {
            float d2 = aVar.d();
            Float f6 = b.h;
            com.amazon.aps.iva.na.c<Float> cVar2 = this.n;
            float f7 = b.g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = cVar2.b(f7, floatValue, b.b, b.c, f, f, d2);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return pointF2;
    }
}
