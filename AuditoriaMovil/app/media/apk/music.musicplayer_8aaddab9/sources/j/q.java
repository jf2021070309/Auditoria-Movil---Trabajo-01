package j;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* loaded from: classes.dex */
public final class q {
    public final h0 a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9533b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f9534c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f9535d;

    public q(h0 h0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = h0Var;
        this.f9533b = gVar;
        this.f9534c = list;
        this.f9535d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            g a = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                if ("NONE".equals(protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                h0 forJavaName = h0.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List p = certificateArr != null ? j.i0.c.p(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new q(forJavaName, a, p, localCertificates != null ? j.i0.c.p(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.a.equals(qVar.a) && this.f9533b.equals(qVar.f9533b) && this.f9534c.equals(qVar.f9534c) && this.f9535d.equals(qVar.f9535d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9533b.hashCode();
        int hashCode2 = this.f9534c.hashCode();
        return this.f9535d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
