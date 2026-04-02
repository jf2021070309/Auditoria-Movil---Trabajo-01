package c.i.h;

import android.util.Base64;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2079b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2080c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2081d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2082e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = str;
        this.f2079b = str2;
        this.f2080c = str3;
        Objects.requireNonNull(list);
        this.f2081d = list;
        this.f2082e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder y = e.a.d.a.a.y("FontRequest {mProviderAuthority: ");
        y.append(this.a);
        y.append(", mProviderPackage: ");
        y.append(this.f2079b);
        y.append(", mQuery: ");
        y.append(this.f2080c);
        y.append(", mCertificates:");
        sb.append(y.toString());
        for (int i2 = 0; i2 < this.f2081d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2081d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return e.a.d.a.a.r(sb, "}", "mCertificatesArray: 0");
    }
}
