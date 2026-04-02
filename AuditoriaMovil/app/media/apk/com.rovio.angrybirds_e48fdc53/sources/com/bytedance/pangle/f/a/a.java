package com.bytedance.pangle.f.a;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
final class a {
    int a;
    b b;
    int[] c;
    private boolean i;
    private f k;
    private boolean j = false;
    private final c l = new c();
    int d = 0;
    int e = 1;
    int f = 2;
    int g = 3;
    int h = 4;

    public a() {
        c();
    }

    public final void a() {
        if (this.j) {
            this.j = false;
            b bVar = this.b;
            if (bVar.a != null) {
                try {
                    bVar.a.close();
                } catch (IOException e) {
                }
                bVar.a((InputStream) null);
            }
            this.k = null;
            this.b = null;
            c cVar = this.l;
            cVar.b = 0;
            cVar.c = 0;
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0238, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.f.a.a.b():int");
    }

    public final String a(int i) {
        int i2 = this.c[e(i) + 1];
        return i2 == -1 ? "" : this.k.a(i2);
    }

    public final int b(int i) {
        return this.c[e(i) + 3];
    }

    public final int c(int i) {
        return this.c[e(i) + 4];
    }

    public final String d(int i) {
        int e = e(i);
        int[] iArr = this.c;
        if (iArr[e + 3] == 3) {
            return this.k.a(iArr[e + 2]);
        }
        return "";
    }

    private int e(int i) {
        if (this.a != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 >= this.c.length) {
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
        }
        return i2;
    }

    private void c() {
        this.c = null;
        this.a = -1;
    }
}
