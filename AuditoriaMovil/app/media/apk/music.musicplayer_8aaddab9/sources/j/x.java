package j;

import java.io.IOException;
/* loaded from: classes2.dex */
public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    x(String str) {
        this.protocol = str;
    }

    public static x get(String str) throws IOException {
        x xVar = HTTP_1_0;
        if (str.equals(xVar.protocol)) {
            return xVar;
        }
        x xVar2 = HTTP_1_1;
        if (str.equals(xVar2.protocol)) {
            return xVar2;
        }
        x xVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(xVar3.protocol)) {
            return xVar3;
        }
        x xVar4 = HTTP_2;
        if (str.equals(xVar4.protocol)) {
            return xVar4;
        }
        x xVar5 = SPDY_3;
        if (str.equals(xVar5.protocol)) {
            return xVar5;
        }
        x xVar6 = QUIC;
        if (str.equals(xVar6.protocol)) {
            return xVar6;
        }
        throw new IOException(e.a.d.a.a.k("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
