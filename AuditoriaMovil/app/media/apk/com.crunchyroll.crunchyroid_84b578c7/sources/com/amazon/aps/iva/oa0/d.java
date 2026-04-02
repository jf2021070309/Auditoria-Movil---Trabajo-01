package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.a;
/* compiled from: ApiGDPRUnder13.java */
/* loaded from: classes4.dex */
public final class d extends i {

    /* compiled from: ApiGDPRUnder13.java */
    /* loaded from: classes4.dex */
    public class a implements a.InterfaceC0561a {
        @Override // com.amazon.aps.iva.oa0.a.InterfaceC0561a
        public final boolean a(u0 u0Var, int i, String str) {
            if (i != 200) {
                return false;
            }
            return true;
        }
    }

    public d(long j) {
        super("GDPR_UNDER_13", j);
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final String b() {
        return "/opengdpr";
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final a.InterfaceC0561a c() {
        return new a();
    }
}
