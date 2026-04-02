package com.facebook.ads.internal.p.b;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e extends k {
    private final h a;
    private final com.facebook.ads.internal.p.b.a.b b;
    private b c;

    public e(h hVar, com.facebook.ads.internal.p.b.a.b bVar) {
        super(hVar, bVar);
        this.b = bVar;
        this.a = hVar;
    }

    private void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = a(bArr, j, bArr.length);
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
        int a = this.a.a();
        boolean z = a > 0;
        int a2 = this.b.a();
        if (z && dVar.c) {
            if (((float) dVar.b) > (a * 0.2f) + a2) {
                return false;
            }
        }
        return true;
    }

    private String b(d dVar) {
        String c = this.a.c();
        boolean z = !TextUtils.isEmpty(c);
        int a = this.b.d() ? this.b.a() : this.a.a();
        boolean z2 = a >= 0;
        return (dVar.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n") + "Accept-Ranges: bytes\n" + (z2 ? String.format("Content-Length: %d\n", Long.valueOf(dVar.c ? a - dVar.b : a)) : "") + (z2 && dVar.c ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.b), Integer.valueOf(a - 1), Integer.valueOf(a)) : "") + (z ? String.format("Content-Type: %s\n", c) : "") + "\n";
    }

    private void b(OutputStream outputStream, long j) {
        try {
            h hVar = new h(this.a);
            hVar.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = hVar.a(bArr);
                if (a == -1) {
                    outputStream.flush();
                    return;
                } else {
                    outputStream.write(bArr, 0, a);
                    j += a;
                }
            }
        } finally {
            this.a.b();
        }
    }

    @Override // com.facebook.ads.internal.p.b.k
    protected void a(int i) {
        if (this.c != null) {
            this.c.a(this.b.a, this.a.a, i);
        }
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(d dVar, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(dVar).getBytes("UTF-8"));
        long j = dVar.b;
        if (a(dVar)) {
            a(bufferedOutputStream, j);
        } else {
            b(bufferedOutputStream, j);
        }
    }
}
