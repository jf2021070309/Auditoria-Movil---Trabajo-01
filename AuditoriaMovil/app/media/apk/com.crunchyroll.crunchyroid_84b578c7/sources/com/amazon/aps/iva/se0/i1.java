package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class i1 extends n1 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ i1(Object obj, int i) {
        this.f = i;
        this.g = obj;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        switch (this.f) {
            case 0:
                q(th);
                return com.amazon.aps.iva.kb0.q.a;
            default:
                q(th);
                return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.se0.y
    public final void q(Throwable th) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((com.amazon.aps.iva.xb0.l) obj).invoke(th);
                return;
            default:
                Object b0 = r().b0();
                if (b0 instanceof w) {
                    ((n) obj).resumeWith(com.amazon.aps.iva.ab.x.H(((w) b0).a));
                    return;
                } else {
                    ((n) obj).resumeWith(com.amazon.aps.iva.ab.t.w(b0));
                    return;
                }
        }
    }
}
