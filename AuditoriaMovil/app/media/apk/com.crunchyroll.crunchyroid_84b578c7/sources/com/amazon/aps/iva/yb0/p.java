package com.amazon.aps.iva.yb0;
/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes4.dex */
public final class p extends o {
    public p(com.amazon.aps.iva.fc0.d dVar, String str, String str2) {
        super(b.NO_RECEIVER, ((c) dVar).h(), str, str2, !(dVar instanceof com.amazon.aps.iva.fc0.d) ? 1 : 0);
    }

    @Override // com.amazon.aps.iva.fc0.n
    public final Object get(Object obj) {
        return getGetter().call(obj);
    }

    public p(Class cls, String str, String str2, int i) {
        super(b.NO_RECEIVER, cls, str, str2, i);
    }
}
