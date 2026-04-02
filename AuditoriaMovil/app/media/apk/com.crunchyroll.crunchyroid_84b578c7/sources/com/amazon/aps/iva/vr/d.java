package com.amazon.aps.iva.vr;
/* compiled from: ForceManualKeepDecorator.java */
/* loaded from: classes2.dex */
public final class d extends a {
    public d() {
        this.a = "manual.keep";
    }

    @Override // com.amazon.aps.iva.vr.a
    public final boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            bVar.g(2);
            return false;
        } else if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
            bVar.g(2);
            return false;
        } else {
            return false;
        }
    }
}
