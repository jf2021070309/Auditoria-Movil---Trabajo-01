package okhttp3.internal.tls;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
/* compiled from: OkHostnameVerifier.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        z zVar = z.b;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return zVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && j.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return zVar;
        }
    }

    private final boolean isAscii(String str) {
        boolean z;
        boolean z2;
        int i;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (length2 <= str.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long j = 0;
                int i2 = 0;
                while (i2 < length2) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i3 = i2 + 1;
                            if (i3 < length2) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j += 4;
                                i2 += 2;
                            } else {
                                j++;
                                i2 = i3;
                            }
                        } else {
                            i = 3;
                        }
                        j += i;
                    }
                    i2++;
                }
                if (length != ((int) j)) {
                    return false;
                }
                return true;
            }
            StringBuilder d = e.d("endIndex > string.length: ", length2, " > ");
            d.append(str.length());
            throw new IllegalArgumentException(d.toString().toString());
        }
        throw new IllegalArgumentException(j0.e("endIndex < beginIndex: ", length2, " < ", 0).toString());
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (j.a(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        j.f(x509Certificate, "certificate");
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        return x.L0(getSubjectAltNames(x509Certificate, 2), subjectAltNames);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        j.f(str, "host");
        j.f(sSLSession, "session");
        if (isAscii(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                j.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(str, (X509Certificate) certificate);
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        j.f(str, "host");
        j.f(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !m.h0(str, ".", false) && !m.Y(str, "..", false)) {
            if (!(str2 == null || str2.length() == 0) && !m.h0(str2, ".", false) && !m.Y(str2, "..", false)) {
                if (!m.Y(str, ".", false)) {
                    str = str.concat(".");
                }
                if (!m.Y(str2, ".", false)) {
                    str2 = str2.concat(".");
                }
                String asciiToLowercase = asciiToLowercase(str2);
                if (!q.i0(asciiToLowercase, "*", false)) {
                    return j.a(str, asciiToLowercase);
                }
                if (!m.h0(asciiToLowercase, "*.", false) || q.q0(asciiToLowercase, '*', 1, false, 4) != -1 || str.length() < asciiToLowercase.length() || j.a("*.", asciiToLowercase)) {
                    return false;
                }
                String substring = asciiToLowercase.substring(1);
                j.e(substring, "this as java.lang.String).substring(startIndex)");
                if (m.Y(str, substring, false)) {
                    int length = str.length() - substring.length();
                    return length <= 0 || q.t0(str, '.', length + (-1), 4) == -1;
                }
                return false;
            }
        }
        return false;
    }
}
