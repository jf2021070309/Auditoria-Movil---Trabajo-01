package okhttp3;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.yb0.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
/* compiled from: CertificatePinner.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003'&(B#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lcom/amazon/aps/iva/kb0/q;", "check", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lcom/amazon/aps/iva/xb0/a;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$Pin;", "findMatchingPins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "", "hashCode", "", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Companion", "Builder", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            j.f(str, "pattern");
            j.f(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(x.c1(this.pins), null, 2, null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Ljava/security/cert/X509Certificate;", "Lcom/amazon/aps/iva/ef0/i;", "sha1Hash", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            j.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final i sha1Hash(X509Certificate x509Certificate) {
            j.f(x509Certificate, "<this>");
            i iVar = i.e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j.e(encoded, "publicKey.encoded");
            return i.a.d(encoded).b("SHA-1");
        }

        public final i sha256Hash(X509Certificate x509Certificate) {
            j.f(x509Certificate, "<this>");
            i iVar = i.e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j.e(encoded, "publicKey.encoded");
            return i.a.d(encoded).b("SHA-256");
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "hostname", "", "matchesHostname", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "toString", "other", "equals", "", "hashCode", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "hashAlgorithm", "getHashAlgorithm", "Lcom/amazon/aps/iva/ef0/i;", "hash", "Lcom/amazon/aps/iva/ef0/i;", "getHash", "()Lcom/amazon/aps/iva/ef0/i;", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Pin {
        private final i hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            j.f(str, "pattern");
            j.f(str2, "pin");
            boolean z = true;
            if ((!m.h0(str, "*.", false) || q.r0(str, "*", 1, false, 4) != -1) && ((!m.h0(str, "**.", false) || q.r0(str, "*", 2, false, 4) != -1) && q.r0(str, "*", 0, false, 6) != -1)) {
                z = false;
            }
            if (z) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (m.h0(str2, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        i iVar = i.e;
                        String substring = str2.substring(5);
                        j.e(substring, "this as java.lang.String).substring(startIndex)");
                        i a = i.a.a(substring);
                        if (a != null) {
                            this.hash = a;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
                    } else if (m.h0(str2, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        i iVar2 = i.e;
                        String substring2 = str2.substring(7);
                        j.e(substring2, "this as java.lang.String).substring(startIndex)");
                        i a2 = i.a.a(substring2);
                        if (a2 != null) {
                            this.hash = a2;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                    }
                }
                throw new IllegalArgumentException("Invalid pattern: ".concat(str));
            }
            throw new IllegalArgumentException("Unexpected pattern: ".concat(str).toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (j.a(this.pattern, pin.pattern) && j.a(this.hashAlgorithm, pin.hashAlgorithm) && j.a(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final i getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + a.b(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            j.f(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (j.a(str, "sha256")) {
                return j.a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (j.a(str, "sha1")) {
                return j.a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            j.f(str, "hostname");
            if (m.h0(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!m.c0(str.length() - length, 3, length, str, this.pattern, false)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (m.h0(this.pattern, "*.", false)) {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!m.c0(str.length() - length3, 1, length3, str, this.pattern, false) || q.t0(str, '.', length4 - 1, 4) != -1) {
                    return false;
                }
            } else {
                return j.a(str, this.pattern);
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        j.f(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final i sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final i sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        j.f(str, "hostname");
        j.f(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, com.amazon.aps.iva.xb0.a<? extends List<? extends X509Certificate>> aVar) {
        j.f(str, "hostname");
        j.f(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            i iVar = null;
            i iVar2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (j.a(hashAlgorithm, "sha256")) {
                    if (iVar == null) {
                        iVar = Companion.sha256Hash(x509Certificate);
                    }
                    if (j.a(pin.getHash(), iVar)) {
                        return;
                    }
                } else if (j.a(hashAlgorithm, "sha1")) {
                    if (iVar2 == null) {
                        iVar2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (j.a(pin.getHash(), iVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (j.a(certificatePinner.pins, this.pins) && j.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        j.f(str, "hostname");
        List list = z.b;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                h0.b(list).add(obj);
            }
        }
        return list;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i = certificateChainCleaner.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        j.f(certificateChainCleaner, "certificateChainCleaner");
        if (j.a(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        j.f(str, "hostname");
        j.f(certificateArr, "peerCertificates");
        check(str, o.b0(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, e eVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
