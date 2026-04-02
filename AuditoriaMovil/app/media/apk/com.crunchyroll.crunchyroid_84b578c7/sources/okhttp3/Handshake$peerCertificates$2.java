package okhttp3;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Handshake$peerCertificates$2 extends l implements a<List<? extends Certificate>> {
    final /* synthetic */ a<List<Certificate>> $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return z.b;
        }
    }
}
