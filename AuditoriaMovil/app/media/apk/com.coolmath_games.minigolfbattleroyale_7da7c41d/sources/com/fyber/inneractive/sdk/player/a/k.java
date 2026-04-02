package com.fyber.inneractive.sdk.player.a;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements Closeable {
    final Executor a;
    private final Socket b;
    private final f c;
    private InputStream d;
    private OutputStream e;
    private a f;
    private int g = 0;
    private int h = -1;
    private boolean i = false;
    private boolean j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(f fVar, Socket socket) {
        this.b = socket;
        this.c = fVar;
        this.a = fVar.g;
        try {
            this.b.setKeepAlive(false);
        } catch (SocketException unused) {
        }
        try {
            this.b.setSoTimeout(IronSourceConstants.IS_INSTANCE_NOT_FOUND);
        } catch (SocketException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.k.a():boolean");
    }

    private void a(int i, int i2) throws IOException {
        IAlog.a("StreamingHandler serveContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f.e) {
            FileInputStream fileInputStream = new FileInputStream(this.f.a());
            ByteBuffer b = com.fyber.inneractive.sdk.util.c.a().b();
            try {
                com.fyber.inneractive.sdk.util.c.a();
                byte[] b2 = com.fyber.inneractive.sdk.util.c.b(b);
                if (i > 0) {
                    fileInputStream.skip(i);
                }
                int i3 = i2 - i;
                int min = Math.min(b2.length, i3);
                int i4 = 0;
                do {
                    int read = fileInputStream.read(b2, 0, min);
                    if (read == -1) {
                        break;
                    }
                    this.e.write(b2, 0, read);
                    i4 += read;
                    i3 -= read;
                    min = Math.min(b2.length, i3);
                } while (min != 0);
                IAlog.a("StreamingHandler wrote %d to socket", Integer.valueOf(i4));
                com.fyber.inneractive.sdk.util.c.a().a(b);
                m.a(fileInputStream);
                IAlog.a("StreamingHandler servedContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
            } catch (SocketException e) {
                throw e;
            } catch (Throwable th) {
                IAlog.a("StreamingHandler Failed writing to socket file contents", th, new Object[0]);
                com.fyber.inneractive.sdk.util.c.a().a(b);
                m.a(fileInputStream);
                IAlog.a("StreamingHandler servedContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IAlog.b("StreamingHandler closing socket connection", new Object[0]);
        m.a(this.e);
        m.a(this.d);
        m.a(this.b);
        f fVar = this.c;
        if (fVar != null) {
            fVar.h.remove(this);
        }
    }

    static /* synthetic */ void a(k kVar) throws Throwable {
        if (kVar.a()) {
            String a = kVar.f.c ? kVar.f.a("http.file.length") : String.valueOf(kVar.f.a().length());
            int parseInt = a == null ? -1 : Integer.parseInt(a);
            int parseInt2 = a == null ? -1 : Integer.parseInt(a);
            if (kVar.i) {
                int length = (int) kVar.f.a().length();
                kVar.h = length;
                int i = kVar.g;
                if (i <= length) {
                    do {
                        kVar.a(kVar.g, kVar.h);
                        if (parseInt2 == -1) {
                            if (!kVar.f.c) {
                                parseInt2 = (int) kVar.f.a().length();
                            }
                        } else if (!kVar.f.c && kVar.h >= parseInt2 - 1) {
                            IAlog.a("StreamingHandler[%s] end range exceeds total, dieing", kVar);
                            kVar.e.flush();
                            kVar.close();
                            return;
                        }
                        kVar.g = kVar.h;
                        kVar.h = (int) kVar.f.a().length();
                        while (true) {
                            if (kVar.g < kVar.h) {
                                break;
                            }
                            kVar.h = (int) kVar.f.a().length();
                            try {
                                Thread.sleep(0L, 10);
                            } catch (Exception unused) {
                            }
                            int i2 = kVar.g;
                            int i3 = kVar.h;
                            if (i2 == i3 && i3 == parseInt) {
                                IAlog.b("StreamingHandler flushing, range has reached fSize", new Object[0]);
                                kVar.e.flush();
                                kVar.close();
                                break;
                            }
                        }
                    } while (kVar.b.isConnected());
                    IAlog.a("StreamingHandler[%s] socket is not connected, dieing", kVar);
                    return;
                }
                p.a(kVar.f.b, i, kVar.e);
                IAlog.b("StreamingHandler flushing, http serve", new Object[0]);
                kVar.e.flush();
                kVar.close();
                return;
            }
            kVar.a(kVar.g, parseInt2);
            IAlog.b("StreamingHandler flushing, vanilla serve", new Object[0]);
            kVar.e.flush();
            kVar.close();
        }
    }
}
