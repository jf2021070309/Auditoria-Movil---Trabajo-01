package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do;

import android.content.Context;
/* loaded from: classes.dex */
public class d {
    private volatile Context a;
    private volatile String b;
    private volatile int c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.c f;

    private a b() {
        a a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.a(this.a, this.b, this.e);
        return a == null ? c() : a;
    }

    private a c() {
        return this.e ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do.a.b(this.b) : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_if122.b.a(this.b, this.a);
    }

    public a a() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.b c = this.c != 2 ? c() : b();
        if (this.d) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.b bVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.b(c);
            bVar.a(new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.a());
            c = bVar;
        }
        if (this.f != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.b bVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.b(c);
            bVar2.a(this.f);
            return bVar2;
        }
        return c;
    }

    public d a(int i) {
        this.c = i;
        return this;
    }

    public d a(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
            c.a(this.a);
        }
        return this;
    }

    public d a(String str) {
        this.b = str;
        return this;
    }

    public d a(boolean z) {
        this.e = z;
        return this;
    }
}
