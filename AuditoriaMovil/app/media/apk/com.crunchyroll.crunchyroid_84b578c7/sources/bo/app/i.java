package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public final class i implements IPutIntoJson {
    private final String b;

    public i(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && com.amazon.aps.iva.yb0.j.a(this.b, ((i) obj).b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public String forJsonPut() {
        return this.b;
    }
}
