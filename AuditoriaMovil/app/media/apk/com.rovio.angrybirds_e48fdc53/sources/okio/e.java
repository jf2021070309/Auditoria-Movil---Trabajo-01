package okio;
/* loaded from: classes4.dex */
final class e {
    static d a;
    static long b;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a() {
        synchronized (e.class) {
            if (a != null) {
                d dVar = a;
                a = dVar.f;
                dVar.f = null;
                b -= 8192;
                return dVar;
            }
            return new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d dVar) {
        if (dVar.f != null || dVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (!dVar.d) {
            synchronized (e.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    dVar.f = a;
                    dVar.c = 0;
                    dVar.b = 0;
                    a = dVar;
                }
            }
        }
    }
}
