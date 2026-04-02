package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p {
    static o a;
    static long b;

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o a() {
        synchronized (p.class) {
            o oVar = a;
            if (oVar != null) {
                a = oVar.f;
                oVar.f = null;
                b -= 8192;
                return oVar;
            }
            return new o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(o oVar) {
        if (oVar.f != null || oVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.d) {
            return;
        }
        synchronized (p.class) {
            long j = b;
            if (j + 8192 <= 65536) {
                b = j + 8192;
                oVar.f = a;
                oVar.c = 0;
                oVar.b = 0;
                a = oVar;
            }
        }
    }
}
