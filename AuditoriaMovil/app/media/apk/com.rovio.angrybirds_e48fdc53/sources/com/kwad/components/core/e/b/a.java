package com.kwad.components.core.e.b;
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.e.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0194a {
        private static final c Jt = c.a(new int[]{7, 8, 4, 2, 0, 3, 6, 9, 1, 8});
    }

    public static long ak(String str) {
        return mZ().al(str);
    }

    private static c mZ() {
        return C0194a.Jt;
    }

    public static String q(long j) {
        String r = mZ().r(j);
        return r.endsWith("=") ? r.replace("=", "") : r;
    }
}
