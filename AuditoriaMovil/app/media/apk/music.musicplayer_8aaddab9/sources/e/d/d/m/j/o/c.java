package e.d.d.m.j.o;

import e.d.b.b.e;
import e.d.b.b.f;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.d0.g;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class c {
    public static final g a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final String f7512b = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c  reason: collision with root package name */
    public static final String f7513c = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d  reason: collision with root package name */
    public static final e<a0, byte[]> f7514d = new e() { // from class: e.d.d.m.j.o.a
        @Override // e.d.b.b.e
        public final Object apply(Object obj) {
            return c.a.f((a0) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public final f<a0> f7515e;

    public c(f<a0> fVar, e<a0, byte[]> eVar) {
        this.f7515e = fVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }
}
