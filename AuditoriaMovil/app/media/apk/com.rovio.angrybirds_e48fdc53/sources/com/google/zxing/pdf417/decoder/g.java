package com.google.zxing.pdf417.decoder;

import java.util.Formatter;
/* loaded from: classes2.dex */
class g {
    private final c a;
    private final d[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c cVar) {
        this.a = new c(cVar);
        this.b = new d[(cVar.d() - cVar.c()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d a(int i) {
        d dVar;
        d dVar2;
        d c = c(i);
        if (c == null) {
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 < 5) {
                    int b = b(i) - i3;
                    if (b < 0 || (dVar2 = this.b[b]) == null) {
                        int b2 = b(i) + i3;
                        if (b2 >= this.b.length || (dVar = this.b[b2]) == null) {
                            i2 = i3 + 1;
                        } else {
                            return dVar;
                        }
                    } else {
                        return dVar2;
                    }
                } else {
                    return null;
                }
            }
        } else {
            return c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        return i - this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, d dVar) {
        this.b[b(i)] = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d c(int i) {
        return this.b[b(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d[] b() {
        return this.b;
    }

    public String toString() {
        int i;
        Formatter formatter = new Formatter();
        d[] dVarArr = this.b;
        int length = dVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            d dVar = dVarArr[i2];
            if (dVar == null) {
                i = i3 + 1;
                formatter.format("%3d:    |   %n", Integer.valueOf(i3));
            } else {
                i = i3 + 1;
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i3), Integer.valueOf(dVar.h()), Integer.valueOf(dVar.g()));
            }
            i2++;
            i3 = i;
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
