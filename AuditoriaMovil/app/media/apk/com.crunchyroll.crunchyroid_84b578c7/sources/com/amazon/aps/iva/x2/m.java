package com.amazon.aps.iva.x2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public final class m {
    public final float A;
    public boolean B;
    public View a;
    public boolean b;
    public int c;
    public final p d;
    public final p e;
    public final l f;
    public final l g;
    public com.amazon.aps.iva.t2.b[] h;
    public com.amazon.aps.iva.t2.a i;
    public float j;
    public int[] k;
    public double[] l;
    public double[] m;
    public String[] n;
    public int[] o;
    public final float[] p;
    public final ArrayList<p> q;
    public final ArrayList<d> r;
    public HashMap<String, com.amazon.aps.iva.w2.d> s;
    public HashMap<String, com.amazon.aps.iva.w2.c> t;
    public HashMap<String, com.amazon.aps.iva.w2.b> u;
    public k[] v;
    public final int w;
    public final int x;
    public View y;
    public final int z;

    public m(View view) {
        new Rect();
        this.b = false;
        this.c = -1;
        this.d = new p();
        this.e = new p();
        this.f = new l();
        this.g = new l();
        this.j = 1.0f;
        this.p = new float[4];
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.w = -1;
        this.x = -1;
        this.y = null;
        this.z = -1;
        this.A = Float.NaN;
        this.B = false;
        this.a = view;
        view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).getClass();
        }
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.j;
            if (f4 != 1.0d) {
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 0.0f && f < 1.0d) {
                    f = Math.min((f - 0.0f) * f4, 1.0f);
                }
            }
        }
        com.amazon.aps.iva.t2.c cVar = this.d.b;
        Iterator<p> it = this.q.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            p next = it.next();
            com.amazon.aps.iva.t2.c cVar2 = next.b;
            if (cVar2 != null) {
                float f6 = next.c;
                if (f6 < f) {
                    cVar = cVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.c;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f5)) {
                f3 = f5;
            }
            float f7 = f3 - f2;
            double d = (f - f2) / f7;
            f = (((float) cVar.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d);
            }
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(float r25, long r26, android.view.View r28, com.amazon.aps.iva.p0.e r29) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x2.m.b(float, long, android.view.View, com.amazon.aps.iva.p0.e):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        p pVar = this.d;
        sb.append(pVar.e);
        sb.append(" y: ");
        sb.append(pVar.f);
        sb.append(" end: x: ");
        p pVar2 = this.e;
        sb.append(pVar2.e);
        sb.append(" y: ");
        sb.append(pVar2.f);
        return sb.toString();
    }
}
