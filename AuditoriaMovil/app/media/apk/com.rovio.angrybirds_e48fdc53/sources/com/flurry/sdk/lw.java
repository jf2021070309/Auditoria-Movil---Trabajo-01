package com.flurry.sdk;
/* loaded from: classes2.dex */
public final class lw {
    long a = 1000;
    boolean b = true;
    boolean c = false;
    mc d = new mc() { // from class: com.flurry.sdk.lw.1
        @Override // com.flurry.sdk.mc
        public final void a() {
            kk.a().a(new lu());
            if (lw.this.b && lw.this.c) {
                ka.a().a(lw.this.d, lw.this.a);
            }
        }
    };

    public final synchronized void a() {
        if (!this.c) {
            ka.a().a(this.d, this.a);
            this.c = true;
        }
    }

    public final synchronized void b() {
        if (this.c) {
            ka a = ka.a();
            mc mcVar = this.d;
            if (mcVar != null) {
                a.c.removeCallbacks(mcVar);
            }
            this.c = false;
        }
    }
}
