package j;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes.dex */
public final class f {
    public static final f a = new f(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: b  reason: collision with root package name */
    public final Set<a> f9232b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final j.i0.l.c f9233c;

    /* loaded from: classes2.dex */
    public static final class a {
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                Objects.requireNonNull((a) obj);
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public f(Set<a> set, @Nullable j.i0.l.c cVar) {
        this.f9232b = set;
        this.f9233c = cVar;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder y = e.a.d.a.a.y("sha256/");
            y.append(k.h.y(((X509Certificate) certificate).getPublicKey().getEncoded()).f("SHA-256").a());
            return y.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f9232b.iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        } else if (!emptyList.isEmpty()) {
            j.i0.l.c cVar = this.f9233c;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                if (emptyList.size() > 0) {
                    Objects.requireNonNull((a) emptyList.get(0));
                    throw null;
                }
            }
            StringBuilder A = e.a.d.a.a.A("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                A.append("\n    ");
                A.append(b(x509Certificate2));
                A.append(": ");
                A.append(x509Certificate2.getSubjectDN().getName());
            }
            A.append("\n  Pinned certificates for ");
            A.append(str);
            A.append(":");
            int size3 = emptyList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                A.append("\n    ");
                A.append((a) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(A.toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (j.i0.c.l(this.f9233c, fVar.f9233c) && this.f9232b.equals(fVar.f9232b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        j.i0.l.c cVar = this.f9233c;
        return this.f9232b.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }
}
