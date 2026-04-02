package com.bytedance.sdk.openadsdk.api.plugin.dr;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* loaded from: classes.dex */
public final class dr implements HostnameVerifier {
    public static final dr dr = new dr();
    private static final Pattern ge = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private dr() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return dr(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException e) {
            return false;
        }
    }

    private boolean dr(String str, X509Certificate x509Certificate) {
        if (dr(str)) {
            return ge(str, x509Certificate);
        }
        return o(str, x509Certificate);
    }

    private boolean ge(String str, X509Certificate x509Certificate) {
        List<String> dr2 = dr(x509Certificate, 7);
        int size = dr2.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(dr2.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean o(String str, X509Certificate x509Certificate) {
        String dr2;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> dr3 = dr(x509Certificate, 2);
        int size = dr3.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (dr(lowerCase, dr3.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (dr2 = new ge(x509Certificate.getSubjectX500Principal()).dr("cn")) == null) {
            return false;
        }
        return dr(lowerCase, dr2);
    }

    private static boolean dr(String str) {
        return ge.matcher(str).matches();
    }

    private static List<String> dr(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    private boolean dr(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str + '.';
        }
        if (!str2.endsWith(".")) {
            str2 = str2 + '.';
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }
}
