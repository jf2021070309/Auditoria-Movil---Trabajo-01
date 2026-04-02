package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.List;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public final class e extends h {
    public final String e;
    public final HomeFeedItemRaw f;
    public final List<d> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, HomeFeedItemRaw homeFeedItemRaw, List<d> list) {
        super(homeFeedItemRaw);
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
        this.e = str;
        this.f = homeFeedItemRaw;
        this.g = list;
    }

    @Override // com.amazon.aps.iva.xx.h, com.amazon.aps.iva.xx.l
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.e, eVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, eVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, eVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode();
        return this.g.hashCode() + ((hashCode + (this.e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BentoItem(id=");
        sb.append(this.e);
        sb.append(", raw=");
        sb.append(this.f);
        sb.append(", items=");
        return com.amazon.aps.iva.oa.a.b(sb, this.g, ")");
    }
}
