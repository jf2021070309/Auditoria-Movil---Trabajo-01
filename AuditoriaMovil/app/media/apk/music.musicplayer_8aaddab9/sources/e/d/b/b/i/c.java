package e.d.b.b.i;

import c.t.m;
import e.d.b.b.j.l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class c implements l {
    public static final String a = m.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: b  reason: collision with root package name */
    public static final String f6042b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f6043c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<e.d.b.b.b> f6044d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f6045e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6046f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6047g;

    static {
        String z = m.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6042b = z;
        String z2 = m.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6043c = z2;
        f6044d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.d.b.b.b("proto"), new e.d.b.b.b("json"))));
        f6045e = new c(z, z2);
    }

    public c(String str, String str2) {
        this.f6046f = str;
        this.f6047g = str2;
    }

    public static c a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                return new c(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String str = this.f6047g;
        if (str == null && this.f6046f == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f6046f;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
