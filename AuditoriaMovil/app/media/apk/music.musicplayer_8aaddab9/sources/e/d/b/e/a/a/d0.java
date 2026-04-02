package e.d.b.e.a.a;
/* loaded from: classes2.dex */
public final class d0 extends b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6753b;

    public d0(int i2, String str, String str2) {
        this.a = str;
        this.f6753b = str2;
    }

    @Override // e.d.b.e.a.a.b
    public final String a() {
        return this.f6753b;
    }

    @Override // e.d.b.e.a.a.b
    public final int b() {
        return 0;
    }

    @Override // e.d.b.e.a.a.b
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == 0 && ((str = this.a) != null ? str.equals(bVar.c()) : bVar.c() == null)) {
                String str2 = this.f6753b;
                String a = bVar.a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ (-721379959)) * 1000003;
        String str2 = this.f6753b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f6753b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        return e.a.d.a.a.s(sb, ", assetsPath=", str2, "}");
    }
}
