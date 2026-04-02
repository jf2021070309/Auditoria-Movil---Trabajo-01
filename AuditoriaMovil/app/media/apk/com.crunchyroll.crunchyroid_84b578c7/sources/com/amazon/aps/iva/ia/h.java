package com.amazon.aps.iva.ia;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.r;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public final class h extends b {
    public final RectF C;
    public final com.amazon.aps.iva.aa.a D;
    public final float[] E;
    public final Path F;
    public final e G;
    public r H;

    public h(d0 d0Var, e eVar) {
        super(d0Var, eVar);
        this.C = new RectF();
        com.amazon.aps.iva.aa.a aVar = new com.amazon.aps.iva.aa.a();
        this.D = aVar;
        this.E = new float[8];
        this.F = new Path();
        this.G = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.l);
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        RectF rectF2 = this.C;
        e eVar = this.G;
        rectF2.set(0.0f, 0.0f, eVar.j, eVar.k);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        if (obj == h0.K) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new r(cVar, null);
            }
        }
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void l(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        e eVar = this.G;
        int alpha = Color.alpha(eVar.l);
        if (alpha == 0) {
            return;
        }
        com.amazon.aps.iva.ca.a<Integer, Integer> aVar = this.w.j;
        if (aVar == null) {
            intValue = 100;
        } else {
            intValue = aVar.f().intValue();
        }
        int i2 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i / 255.0f) * 255.0f);
        com.amazon.aps.iva.aa.a aVar2 = this.D;
        aVar2.setAlpha(i2);
        r rVar = this.H;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.f());
        }
        if (i2 > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = eVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = eVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
