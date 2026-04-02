package j.i0.f;

import j.g;
import j.i;
import j.w;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
/* loaded from: classes2.dex */
public final class b {
    public final List<i> a;

    /* renamed from: b  reason: collision with root package name */
    public int f9284b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9285c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9286d;

    public b(List<i> list) {
        this.a = list;
    }

    public i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        boolean z;
        int i2 = this.f9284b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = this.a.get(i2);
            if (iVar.a(sSLSocket)) {
                this.f9284b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar == null) {
            StringBuilder y = e.a.d.a.a.y("Unable to find acceptable protocols. isFallback=");
            y.append(this.f9286d);
            y.append(", modes=");
            y.append(this.a);
            y.append(", supported protocols=");
            y.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(y.toString());
        }
        int i3 = this.f9284b;
        while (true) {
            if (i3 >= this.a.size()) {
                z = false;
                break;
            } else if (this.a.get(i3).a(sSLSocket)) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        this.f9285c = z;
        j.i0.a aVar = j.i0.a.a;
        boolean z2 = this.f9286d;
        Objects.requireNonNull((w.a) aVar);
        String[] r = iVar.f9264h != null ? j.i0.c.r(j.g.a, sSLSocket.getEnabledCipherSuites(), iVar.f9264h) : sSLSocket.getEnabledCipherSuites();
        String[] r2 = iVar.f9265i != null ? j.i0.c.r(j.i0.c.o, sSLSocket.getEnabledProtocols(), iVar.f9265i) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator<String> comparator = j.g.a;
        byte[] bArr = j.i0.c.a;
        int length = supportedCipherSuites.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (((g.a) comparator).compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z2 && i4 != -1) {
            String str = supportedCipherSuites[i4];
            int length2 = r.length + 1;
            String[] strArr = new String[length2];
            System.arraycopy(r, 0, strArr, 0, r.length);
            strArr[length2 - 1] = str;
            r = strArr;
        }
        boolean z3 = iVar.f9262f;
        if (z3) {
            if (r.length != 0) {
                String[] strArr2 = (String[]) r.clone();
                if (z3) {
                    if (r2.length != 0) {
                        sSLSocket.setEnabledProtocols((String[]) r2.clone());
                        sSLSocket.setEnabledCipherSuites(strArr2);
                        return iVar;
                    }
                    throw new IllegalArgumentException("At least one TLS version is required");
                }
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }
}
