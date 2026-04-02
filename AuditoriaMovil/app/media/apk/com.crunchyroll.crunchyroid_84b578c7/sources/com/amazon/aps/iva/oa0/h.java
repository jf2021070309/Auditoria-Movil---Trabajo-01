package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.a;
/* compiled from: ApiSubmitEvent.java */
/* loaded from: classes4.dex */
public final class h extends i {
    public static final /* synthetic */ int b = 0;

    /* compiled from: ApiSubmitEvent.java */
    /* loaded from: classes4.dex */
    public class a implements a.InterfaceC0561a {
        @Override // com.amazon.aps.iva.oa0.a.InterfaceC0561a
        public final boolean a(u0 u0Var, int i, String str) {
            if (i == 413) {
                return true;
            }
            if (i != 200) {
                return false;
            }
            try {
            } catch (com.amazon.aps.iva.if0.b unused) {
                int i2 = h.b;
            }
            if (new com.amazon.aps.iva.if0.c(str).optString("status", "").equalsIgnoreCase("ok")) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiSubmitEvent.java */
    /* loaded from: classes4.dex */
    public static class b extends b1 {
        public static final /* synthetic */ int b = 0;

        @Override // com.amazon.aps.iva.oa0.b1
        public final /* bridge */ /* synthetic */ b1 g(y yVar) {
            throw null;
        }

        public final void h(y yVar) {
            super.g(yVar);
            put("av", yVar.k);
            put("sdk", u0.p.f.t);
            put("custom_user_id", yVar.E);
        }
    }

    /* compiled from: ApiSubmitEvent.java */
    /* loaded from: classes4.dex */
    public static class c {
        public final String a;
        public final String b;
        public final long c;

        public c(String str, String str2) {
            String str3;
            this.a = str.replace("\\n", "");
            if (!f1.i(str2)) {
                str3 = str2.replace("\\n", "");
            } else {
                str3 = null;
            }
            this.b = str3;
            this.c = System.currentTimeMillis();
        }

        public final String toString() {
            return "RawEvent{name='" + this.a + "', extra='" + this.b + "', timestamp=" + this.c + '}';
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(h.class.getSimpleName());
    }

    public h(long j) {
        super("EVENT", j);
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final String b() {
        return "/event";
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final a.InterfaceC0561a c() {
        return new a();
    }
}
