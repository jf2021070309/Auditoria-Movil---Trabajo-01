package com.amazon.aps.iva.oe0;
/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.lb0.c<String> {
    public final /* synthetic */ e b;

    public d(e eVar) {
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.a.groupCount() + 1;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = this.b.a.group(i);
        if (group == null) {
            return "";
        }
        return group;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }
}
