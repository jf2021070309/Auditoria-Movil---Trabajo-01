package com.amazon.aps.iva.oa0;

import android.content.SharedPreferences;
import android.net.Uri;
import com.amazon.aps.iva.oa0.a;
/* compiled from: ApiStartSession.java */
/* loaded from: classes4.dex */
public final class g extends i {
    public static final /* synthetic */ int c = 0;
    public int b;

    /* compiled from: ApiStartSession.java */
    /* loaded from: classes4.dex */
    public class a implements a.InterfaceC0561a {
        public a() {
        }

        @Override // com.amazon.aps.iva.oa0.a.InterfaceC0561a
        public final boolean a(u0 u0Var, int i, String str) {
            String str2;
            Uri parse;
            String a;
            if (i != 200) {
                return false;
            }
            try {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
                if (!cVar.optString("status", "").equalsIgnoreCase("ok")) {
                    return false;
                }
                String optString = cVar.optString("ddl", null);
                String optString2 = cVar.optString("deferred_passthrough", null);
                int i2 = f1.b;
                if (!u0.p.d.j && (!f1.i(optString) || !f1.i(optString2))) {
                    b(u0Var, optString);
                }
                String optString3 = cVar.optString("resolved_singular_link", null);
                boolean i3 = f1.i(optString3);
                g gVar = g.this;
                if (!i3 && (str2 = gVar.get("singular_link_resolve_required")) != null && Boolean.parseBoolean(str2) && f1.k(gVar.g()) < u0.p.d.i && (a = f1.a((parse = Uri.parse(optString3)))) != null) {
                    parse.getQueryParameter("_p");
                    f1.g(new com.amazon.aps.iva.na0.c(a));
                }
                String str3 = gVar.get("u");
                if (!f1.i(str3) && !u0Var.a.getSharedPreferences("singular-licensing-api", 0).getBoolean(str3, false)) {
                    SharedPreferences.Editor edit = u0Var.a.getSharedPreferences("singular-licensing-api", 0).edit();
                    edit.putBoolean(str3, true);
                    edit.commit();
                    int i4 = g.c;
                    new Thread(new f(this, u0Var, str3)).start();
                }
                return true;
            } catch (com.amazon.aps.iva.if0.b unused) {
                int i5 = g.c;
                return false;
            }
        }

        public final void b(u0 u0Var, String str) {
            if (u0Var.d.c == null) {
                int i = g.c;
            } else if (f1.k(g.this.g()) > 60) {
                int i2 = g.c;
            } else {
                Uri.parse(str);
                f1.g(new com.amazon.aps.iva.na0.c(str));
            }
        }
    }

    /* compiled from: ApiStartSession.java */
    /* loaded from: classes4.dex */
    public static class b extends b1 {
        @Override // com.amazon.aps.iva.oa0.b1
        public final /* bridge */ /* synthetic */ b1 g(y yVar) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
            r0 = "0";
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
            if (r1 != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
            if (r1 != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
            r0 = "1";
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.oa0.y r3) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oa0.g.b.h(com.amazon.aps.iva.oa0.y):void");
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(g.class.getSimpleName());
    }

    public g(long j) {
        super("SESSION_START", j);
        this.b = 0;
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final String b() {
        return "/start";
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final a.InterfaceC0561a c() {
        return new a();
    }
}
