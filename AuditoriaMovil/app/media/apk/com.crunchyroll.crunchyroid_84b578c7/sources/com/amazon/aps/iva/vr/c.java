package com.amazon.aps.iva.vr;
/* compiled from: ForceManualDropDecorator.java */
/* loaded from: classes2.dex */
public final class c extends a {
    public c() {
        this.a = "manual.drop";
    }

    @Override // com.amazon.aps.iva.vr.a
    public final boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            bVar.g(-1);
            return false;
        } else if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
            bVar.g(-1);
            return false;
        } else {
            return false;
        }
    }
}
