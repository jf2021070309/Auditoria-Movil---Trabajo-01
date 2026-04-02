package com.amazon.aps.iva.o8;

import android.annotation.SuppressLint;
/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public final class a implements b {
    public final b a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void a(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }

    @Override // com.amazon.aps.iva.o8.b
    @SuppressLint({"UnknownNullness"})
    public final void c(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void d(int i, int i2) {
        e();
        this.a.d(i, i2);
    }

    public final void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        b bVar = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    bVar.c(this.c, this.d, this.e);
                }
            } else {
                bVar.b(this.c, this.d);
            }
        } else {
            bVar.a(this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }
}
