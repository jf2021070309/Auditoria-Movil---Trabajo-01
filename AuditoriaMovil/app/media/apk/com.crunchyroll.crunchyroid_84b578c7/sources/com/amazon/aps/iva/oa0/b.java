package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.a;
/* compiled from: ApiCustomUserId.java */
/* loaded from: classes4.dex */
public final class b extends i {
    public static final /* synthetic */ int b = 0;

    /* compiled from: ApiCustomUserId.java */
    /* loaded from: classes4.dex */
    public class a implements a.InterfaceC0561a {
        @Override // com.amazon.aps.iva.oa0.a.InterfaceC0561a
        public final boolean a(u0 u0Var, int i, String str) {
            if (i != 200) {
                return false;
            }
            try {
                if (!new com.amazon.aps.iva.if0.c(str).optString("status", "").equalsIgnoreCase("ok")) {
                    return false;
                }
                return true;
            } catch (com.amazon.aps.iva.if0.b unused) {
                int i2 = b.b;
                return false;
            }
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(b.class.getSimpleName());
    }

    public b(long j) {
        super("CUSTOM_USER_ID", j);
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final String b() {
        return "/set_device_for_custom_id";
    }

    @Override // com.amazon.aps.iva.oa0.a
    public final a.InterfaceC0561a c() {
        return new a();
    }
}
