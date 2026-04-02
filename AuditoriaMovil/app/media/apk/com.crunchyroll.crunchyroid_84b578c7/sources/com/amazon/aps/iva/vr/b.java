package com.amazon.aps.iva.vr;
/* compiled from: DBTypeDecorator.java */
@Deprecated
/* loaded from: classes2.dex */
public final class b extends a {
    public b() {
        this.a = "db.type";
        this.b = "service.name";
    }

    @Override // com.amazon.aps.iva.vr.a
    public final boolean a(com.amazon.aps.iva.ur.b bVar, String str, Object obj) {
        super.a(bVar, str, obj);
        if (!"couchbase".equals(obj) && !"elasticsearch".equals(obj)) {
            if (!"mongo".equals(obj) && !"cassandra".equals(obj)) {
                "memcached".equals(obj);
            }
            bVar.j = String.valueOf(obj).concat(".query");
            return true;
        }
        return true;
    }
}
