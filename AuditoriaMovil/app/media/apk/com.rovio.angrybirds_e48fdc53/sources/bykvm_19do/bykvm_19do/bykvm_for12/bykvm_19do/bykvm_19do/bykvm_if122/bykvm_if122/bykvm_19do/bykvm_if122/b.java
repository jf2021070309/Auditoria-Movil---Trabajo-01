package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class b {
    private final List<k> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public b(List<k> list) {
        this.a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (this.a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public k a(SSLSocket sSLSocket) throws IOException {
        k kVar;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.a.get(i);
            i++;
            if (kVar.a(sSLSocket)) {
                this.b = i;
                break;
            }
        }
        if (kVar != null) {
            this.c = b(sSLSocket);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(kVar, sSLSocket, this.d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        boolean z;
        this.d = true;
        return (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || (((z = iOException instanceof SSLHandshakeException)) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || (!z && !(iOException instanceof SSLProtocolException))) ? false : true;
    }
}
