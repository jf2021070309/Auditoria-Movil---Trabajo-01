package okio;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class d {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    d f;
    d g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    d(d dVar) {
        this(dVar.a, dVar.b, dVar.c);
        dVar.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public d a() {
        d dVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return dVar;
    }

    public d a(d dVar) {
        dVar.g = this;
        dVar.f = this.f;
        this.f.g = dVar;
        this.f = dVar;
        return dVar;
    }

    public d a(int i) {
        d a;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            a = new d(this);
        } else {
            a = e.a();
            System.arraycopy(this.a, this.b, a.a, 0, i);
        }
        a.c = a.b + i;
        this.b += i;
        this.g.a(a);
        return a;
    }

    public void b() {
        if (this.g == this) {
            throw new IllegalStateException();
        }
        if (this.g.e) {
            int i = this.c - this.b;
            if (i <= (this.g.d ? 0 : this.g.b) + (8192 - this.g.c)) {
                a(this.g, i);
                a();
                e.a(this);
            }
        }
    }

    public void a(d dVar, int i) {
        if (!dVar.e) {
            throw new IllegalArgumentException();
        }
        if (dVar.c + i > 8192) {
            if (dVar.d) {
                throw new IllegalArgumentException();
            }
            if ((dVar.c + i) - dVar.b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(dVar.a, dVar.b, dVar.a, 0, dVar.c - dVar.b);
            dVar.c -= dVar.b;
            dVar.b = 0;
        }
        System.arraycopy(this.a, this.b, dVar.a, dVar.c, i);
        dVar.c += i;
        this.b += i;
    }
}
