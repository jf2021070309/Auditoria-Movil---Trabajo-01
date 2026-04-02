package e.j.d;

import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
/* loaded from: classes2.dex */
public final class h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8800b;

    /* renamed from: c  reason: collision with root package name */
    public final SkuDetails f8801c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8802d;

    public h(String str, String str2, SkuDetails skuDetails, String str3) {
        h.o.c.j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        this.a = str;
        this.f8800b = str2;
        this.f8801c = skuDetails;
        this.f8802d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return h.o.c.j.a(this.a, hVar.a) && h.o.c.j.a(this.f8800b, hVar.f8800b) && h.o.c.j.a(this.f8801c, hVar.f8801c) && h.o.c.j.a(this.f8802d, hVar.f8802d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f8800b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SkuDetails skuDetails = this.f8801c;
        int hashCode3 = (hashCode2 + (skuDetails == null ? 0 : skuDetails.hashCode())) * 31;
        String str2 = this.f8802d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Offer(sku=");
        y.append(this.a);
        y.append(", skuType=");
        y.append((Object) this.f8800b);
        y.append(", skuDetails=");
        y.append(this.f8801c);
        y.append(", formattedPrice=");
        y.append((Object) this.f8802d);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
