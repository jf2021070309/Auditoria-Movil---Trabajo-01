package com.amazon.aps.iva.ha;

import android.graphics.Paint;
import com.amazon.aps.iva.ba.s;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public final class q implements com.amazon.aps.iva.ha.b {
    public final String a;
    public final com.amazon.aps.iva.ga.b b;
    public final List<com.amazon.aps.iva.ga.b> c;
    public final com.amazon.aps.iva.ga.a d;
    public final com.amazon.aps.iva.ga.d e;
    public final com.amazon.aps.iva.ga.b f;
    public final b g;
    public final c h;
    public final float i;
    public final boolean j;

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public q(String str, com.amazon.aps.iva.ga.b bVar, ArrayList arrayList, com.amazon.aps.iva.ga.a aVar, com.amazon.aps.iva.ga.d dVar, com.amazon.aps.iva.ga.b bVar2, b bVar3, c cVar, float f, boolean z) {
        this.a = str;
        this.b = bVar;
        this.c = arrayList;
        this.d = aVar;
        this.e = dVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new s(d0Var, bVar, this);
    }
}
