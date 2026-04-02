package com.amazon.aps.iva.m2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.amazon.aps.iva.h1.f;
import com.amazon.aps.iva.h1.h;
import com.amazon.aps.iva.h1.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DrawStyleSpan.android.kt */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final f a;

    public a(f fVar) {
        this.a = fVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        boolean z2;
        boolean z3;
        Paint.Join join;
        boolean z4;
        boolean z5;
        Paint.Cap cap;
        if (textPaint != null) {
            h hVar = h.a;
            f fVar = this.a;
            if (j.a(fVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (fVar instanceof i) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((i) fVar).a);
                textPaint.setStrokeMiter(((i) fVar).b);
                int i = ((i) fVar).d;
                boolean z6 = true;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    join = Paint.Join.MITER;
                } else {
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        join = Paint.Join.ROUND;
                    } else {
                        if (i == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            join = Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.MITER;
                        }
                    }
                }
                textPaint.setStrokeJoin(join);
                int i2 = ((i) fVar).c;
                if (i2 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    cap = Paint.Cap.BUTT;
                } else {
                    if (i2 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        cap = Paint.Cap.ROUND;
                    } else {
                        if (i2 != 2) {
                            z6 = false;
                        }
                        if (z6) {
                            cap = Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.BUTT;
                        }
                    }
                }
                textPaint.setStrokeCap(cap);
                ((i) fVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
