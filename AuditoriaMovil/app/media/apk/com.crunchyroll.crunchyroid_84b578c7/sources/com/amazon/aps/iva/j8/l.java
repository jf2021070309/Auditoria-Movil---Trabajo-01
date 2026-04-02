package com.amazon.aps.iva.j8;
/* compiled from: PagedStorageDiffHelper.java */
/* loaded from: classes.dex */
public final class l implements com.amazon.aps.iva.o8.b {
    public final int a;
    public final com.amazon.aps.iva.o8.b b;

    public l(int i, androidx.recyclerview.widget.b bVar) {
        this.a = i;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void a(int i, int i2) {
        this.b.a(i + this.a, i2);
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void b(int i, int i2) {
        this.b.b(i + this.a, i2);
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void c(int i, int i2, Object obj) {
        this.b.c(i + this.a, i2, obj);
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void d(int i, int i2) {
        int i3 = this.a;
        this.b.d(i + i3, i2 + i3);
    }
}
