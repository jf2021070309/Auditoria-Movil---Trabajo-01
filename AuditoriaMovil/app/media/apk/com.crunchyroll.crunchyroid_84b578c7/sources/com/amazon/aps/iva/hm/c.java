package com.amazon.aps.iva.hm;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
/* compiled from: AssetSelectionResult.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ui.a {
    public final String b;
    public final AssetType c;

    public c(String str, AssetType assetType) {
        j.f(str, "selectedAssetId");
        j.f(assetType, "selectedAssetType");
        this.b = str;
        this.c = assetType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.b, cVar.b) && this.c == cVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AssetSelectionResult(selectedAssetId=" + this.b + ", selectedAssetType=" + this.c + ")";
    }
}
