package com.amazon.aps.iva.us;
/* compiled from: ScreenAnalytics.kt */
/* loaded from: classes2.dex */
public abstract class b implements r {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> a;
    public boolean b;
    public boolean c;
    public com.amazon.aps.iva.fs.c d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "createTimer");
        this.a = aVar;
        this.b = true;
        this.c = true;
        this.d = (com.amazon.aps.iva.fs.c) aVar.invoke();
    }

    public abstract void O(float f);

    @Override // com.amazon.aps.iva.us.r
    public final void b() {
        this.d = this.a.invoke();
    }

    @Override // com.amazon.aps.iva.us.r
    public void c() {
        if (this.c) {
            this.c = false;
            O(this.d.a());
        }
    }

    @Override // com.amazon.aps.iva.us.r
    public final void p(boolean z) {
        if (!this.b && z && !this.c) {
            O(0.0f);
        }
        this.b = z;
    }
}
