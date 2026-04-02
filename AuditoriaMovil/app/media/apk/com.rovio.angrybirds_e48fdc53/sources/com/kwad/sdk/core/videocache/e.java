package com.kwad.sdk.core.videocache;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends j {
    private b awA;
    private final h awy;
    private final com.kwad.sdk.core.videocache.a.b awz;

    public e(h hVar, com.kwad.sdk.core.videocache.a.b bVar) {
        super(hVar, bVar);
        this.awz = bVar;
        this.awy = hVar;
    }

    private void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = a(bArr, j, 8192);
            if (a == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, a);
                j += a;
            }
        }
    }

    private boolean a(d dVar) {
        long length = this.awy.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && dVar.awx && ((float) dVar.aww) > ((float) this.awz.DA()) + (((float) length) * 0.2f)) ? false : true;
    }

    private String b(d dVar) {
        String DJ = this.awy.DJ();
        boolean z = !TextUtils.isEmpty(DJ);
        long DA = this.awz.isCompleted() ? this.awz.DA() : this.awy.length();
        boolean z2 = DA >= 0;
        long j = dVar.awx ? DA - dVar.aww : DA;
        boolean z3 = z2 && dVar.awx;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.awx ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? format("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z3 ? format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.aww), Long.valueOf(DA - 1), Long.valueOf(DA)) : "");
        sb.append(z ? format("Content-Type: %s\n", DJ) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void b(OutputStream outputStream, long j) {
        h hVar = new h(this.awy);
        try {
            hVar.ah((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = hVar.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            hVar.close();
        }
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public final void a(b bVar) {
        this.awA = bVar;
    }

    public final void a(d dVar, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(dVar).getBytes("UTF-8"));
        long j = dVar.aww;
        if (a(dVar)) {
            a(bufferedOutputStream, j);
        } else {
            b(bufferedOutputStream, j);
        }
    }

    @Override // com.kwad.sdk.core.videocache.j
    protected final void cz(int i) {
        b bVar = this.awA;
        if (bVar != null) {
            bVar.a(this.awz.file, i);
        }
    }
}
