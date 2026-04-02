package com.amazon.aps.iva.f1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class j0 extends s0 {
    public final List<x> c;
    public final List<Float> d;
    public final long e;
    public final long f;
    public final int g;

    public j0(List list, ArrayList arrayList, long j, long j2, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // com.amazon.aps.iva.f1.s0
    public final Shader b(long j) {
        boolean z;
        float c;
        boolean z2;
        float d;
        boolean z3;
        float c2;
        boolean z4;
        float d2;
        float[] fArr;
        boolean z5;
        boolean z6;
        boolean z7;
        Shader.TileMode tileMode;
        long j2 = this.e;
        boolean z8 = false;
        if (com.amazon.aps.iva.e1.c.c(j2) == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = com.amazon.aps.iva.e1.g.d(j);
        } else {
            c = com.amazon.aps.iva.e1.c.c(j2);
        }
        if (com.amazon.aps.iva.e1.c.d(j2) == Float.POSITIVE_INFINITY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            d = com.amazon.aps.iva.e1.g.b(j);
        } else {
            d = com.amazon.aps.iva.e1.c.d(j2);
        }
        long j3 = this.f;
        if (com.amazon.aps.iva.e1.c.c(j3) == Float.POSITIVE_INFINITY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c2 = com.amazon.aps.iva.e1.g.d(j);
        } else {
            c2 = com.amazon.aps.iva.e1.c.c(j3);
        }
        if (com.amazon.aps.iva.e1.c.d(j3) == Float.POSITIVE_INFINITY) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            d2 = com.amazon.aps.iva.e1.g.b(j);
        } else {
            d2 = com.amazon.aps.iva.e1.c.d(j3);
        }
        long d3 = com.amazon.aps.iva.e1.d.d(c, d);
        long d4 = com.amazon.aps.iva.e1.d.d(c2, d2);
        List<x> list = this.c;
        com.amazon.aps.iva.yb0.j.f(list, "colors");
        List<Float> list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        float c3 = com.amazon.aps.iva.e1.c.c(d3);
        float d5 = com.amazon.aps.iva.e1.c.d(d3);
        float c4 = com.amazon.aps.iva.e1.c.c(d4);
        float d6 = com.amazon.aps.iva.e1.c.d(d4);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = defpackage.i.G(list.get(i).a);
        }
        if (list2 != null) {
            List<Float> list3 = list2;
            fArr = new float[list3.size()];
            int i2 = 0;
            for (Float f : list3) {
                fArr[i2] = f.floatValue();
                i2++;
            }
        } else {
            fArr = null;
        }
        float[] fArr2 = fArr;
        int i3 = this.g;
        if (i3 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            tileMode = Shader.TileMode.CLAMP;
        } else {
            if (i3 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                tileMode = Shader.TileMode.REPEAT;
            } else {
                if (i3 == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    tileMode = Shader.TileMode.MIRROR;
                } else {
                    if (i3 == 3) {
                        z8 = true;
                    }
                    if (z8) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            tileMode = a1.a.b();
                        } else {
                            tileMode = Shader.TileMode.CLAMP;
                        }
                    } else {
                        tileMode = Shader.TileMode.CLAMP;
                    }
                }
            }
        }
        return new LinearGradient(c3, d5, c4, d6, iArr, fArr2, tileMode);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.c, j0Var.c) || !com.amazon.aps.iva.yb0.j.a(this.d, j0Var.d) || !com.amazon.aps.iva.e1.c.a(this.e, j0Var.e) || !com.amazon.aps.iva.e1.c.a(this.f, j0Var.f)) {
            return false;
        }
        if (this.g == j0Var.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List<Float> list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i2 = com.amazon.aps.iva.e1.c.e;
        return Integer.hashCode(this.g) + com.amazon.aps.iva.b8.i.a(this.f, com.amazon.aps.iva.b8.i.a(this.e, (hashCode + i) * 31, 31), 31);
    }

    public final String toString() {
        long j;
        String str;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        String str3 = "";
        if (!com.amazon.aps.iva.e1.d.g(this.e)) {
            str = "";
        } else {
            str = "start=" + ((Object) com.amazon.aps.iva.e1.c.h(j)) + ", ";
        }
        if (com.amazon.aps.iva.e1.d.g(this.f)) {
            str3 = "end=" + ((Object) com.amazon.aps.iva.e1.c.h(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        sb.append(str);
        sb.append(str3);
        sb.append("tileMode=");
        int i = this.g;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = "Clamp";
        } else {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str2 = "Repeated";
            } else {
                if (i == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str2 = "Mirror";
                } else {
                    if (i == 3) {
                        z4 = true;
                    }
                    if (z4) {
                        str2 = "Decal";
                    } else {
                        str2 = "Unknown";
                    }
                }
            }
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
