package com.amazon.aps.iva.gy;

import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
/* compiled from: HomeFeedItemType.kt */
/* loaded from: classes2.dex */
public final class m {
    public final HomeFeedItemResourceType a;
    public final HomeFeedItemResponseType b;

    public m(HomeFeedItemResourceType homeFeedItemResourceType, HomeFeedItemResponseType homeFeedItemResponseType) {
        com.amazon.aps.iva.yb0.j.f(homeFeedItemResourceType, "type");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemResponseType, "responseType");
        this.a = homeFeedItemResourceType;
        this.b = homeFeedItemResponseType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.a && this.b == mVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeFeedItemType(type=" + this.a + ", responseType=" + this.b + ")";
    }
}
