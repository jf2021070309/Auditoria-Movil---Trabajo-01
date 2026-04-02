package com.amazon.aps.iva.vr;
/* compiled from: ServletContextDecorator.java */
/* loaded from: classes2.dex */
public final class g extends a {
    public g() {
        this.a = "servlet.context";
    }

    @Override // com.amazon.aps.iva.vr.a
    public final boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        String trim = String.valueOf(obj).trim();
        if (!trim.equals("/") && (bVar.h.equals("unnamed-java-app") || bVar.h.isEmpty())) {
            if (trim.startsWith("/") && trim.length() > 1) {
                trim = trim.substring(1);
            }
            if (!trim.isEmpty()) {
                bVar.h(trim);
            }
        }
        return true;
    }
}
