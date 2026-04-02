package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
/* loaded from: assets/audience_network.dex */
public interface RA {
    boolean AAj(R8 r8);

    HttpURLConnection ACw(String str, Proxy proxy) throws IOException;

    InputStream ACx(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ACy(HttpURLConnection httpURLConnection) throws IOException;

    void ADF(HttpURLConnection httpURLConnection, R6 r6, String str) throws IOException;

    byte[] ADb(InputStream inputStream) throws IOException;

    void AFo(OutputStream outputStream, byte[] bArr) throws IOException;
}
