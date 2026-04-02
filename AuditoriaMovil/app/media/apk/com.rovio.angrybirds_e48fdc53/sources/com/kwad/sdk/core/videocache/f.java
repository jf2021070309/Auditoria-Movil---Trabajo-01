package com.kwad.sdk.core.videocache;

import android.content.Context;
import android.net.Uri;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.utils.ao;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class f {
    private final Object awB;
    private final ExecutorService awC;
    private final Map<String, g> awD;
    private final ServerSocket awE;
    private final Thread awF;
    private final com.kwad.sdk.core.videocache.c awG;
    private final int port;

    /* loaded from: classes.dex */
    public static final class a {
        private File awp;
        private com.kwad.sdk.core.videocache.d.b aws;
        private com.kwad.sdk.core.videocache.a.a awr = new com.kwad.sdk.core.videocache.a.g(536870912);
        private com.kwad.sdk.core.videocache.a.c awq = new com.kwad.sdk.core.videocache.a.f();
        private com.kwad.sdk.core.videocache.b.b awt = new com.kwad.sdk.core.videocache.b.a();

        public a(Context context) {
            this.aws = com.kwad.sdk.core.videocache.d.c.bn(context);
            this.awp = n.bk(context);
        }

        private com.kwad.sdk.core.videocache.c DE() {
            return new com.kwad.sdk.core.videocache.c(this.awp, this.awq, this.awr, this.aws, this.awt);
        }

        public final f DD() {
            return new f(DE(), (byte) 0);
        }

        public final a ag(long j) {
            this.awr = new com.kwad.sdk.core.videocache.a.g(104857600L);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements Runnable {
        private final Socket awH;

        public b(Socket socket) {
            this.awH = socket;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "schedule SocketProcessorRunnable run");
            f.this.a(this.awH);
        }
    }

    /* loaded from: classes.dex */
    final class c implements Runnable {
        private final CountDownLatch awJ;

        public c(CountDownLatch countDownLatch) {
            this.awJ = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.awJ.countDown();
                f.this.DB();
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
        }
    }

    private f(com.kwad.sdk.core.videocache.c cVar) {
        this.awB = new Object();
        this.awC = GlobalThreadPools.CW();
        this.awD = new ConcurrentHashMap();
        this.awG = (com.kwad.sdk.core.videocache.c) ao.checkNotNull(cVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.awE = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.port = localPort;
            i.install("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new c(countDownLatch));
            this.awF = thread;
            thread.start();
            countDownLatch.await();
        } catch (IOException | InterruptedException e) {
            this.awC.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* synthetic */ f(com.kwad.sdk.core.videocache.c cVar, byte b2) {
        this(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DB() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.awE.accept();
                com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "Accept new socket " + accept);
                this.awC.submit(new b(accept));
            } catch (IOException e) {
                onError(new ProxyCacheException("Error during waiting connection", e));
                return;
            }
        }
    }

    private int DC() {
        int i;
        synchronized (this.awB) {
            i = 0;
            for (g gVar : this.awD.values()) {
                i += gVar.DC();
            }
        }
        return i;
    }

    private File X(String str) {
        return new File(this.awG.awp, this.awG.awq.generate(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.kwad.sdk.core.videocache.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    public void a(Socket socket) {
        StringBuilder sb;
        ?? r0 = "Opened connections: ";
        try {
            try {
                d b2 = d.b(socket.getInputStream());
                com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "Request to cache proxy:" + b2);
                dT(k.decode(b2.uri)).a(b2, socket);
                b(socket);
                sb = new StringBuilder("Opened connections: ");
            } catch (ProxyCacheException e) {
                e = e;
                onError(new ProxyCacheException("Error processing request", e));
                b(socket);
                sb = new StringBuilder("Opened connections: ");
            } catch (SocketException e2) {
                com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "Closing socket… Socket is closed by client.");
                e2.printStackTrace();
                b(socket);
                sb = new StringBuilder("Opened connections: ");
            } catch (IOException e3) {
                e = e3;
                onError(new ProxyCacheException("Error processing request", e));
                b(socket);
                sb = new StringBuilder("Opened connections: ");
            }
            r0 = DC();
            sb.append((int) r0);
            socket = sb.toString();
            com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", socket);
        } catch (Throwable th) {
            b(socket);
            com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", ((String) r0) + DC());
            throw th;
        }
    }

    private void b(Socket socket) {
        c(socket);
        d(socket);
        e(socket);
    }

    private void c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException e) {
            com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "Releasing input stream… Socket is closed by client.");
        } catch (IOException e2) {
            onError(new ProxyCacheException("Error closing socket input stream", e2));
        }
    }

    private static void d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            com.kwad.sdk.core.e.c.w("HttpProxyCacheServer", "Failed to close socket on proxy side: {}. It seems client have already closed connection.");
        }
    }

    private boolean dO(String str) {
        ao.ar(str, "Url can't be null!");
        return X(str).exists();
    }

    private String dR(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.port), k.encode(str));
    }

    private File dS(String str) {
        File file = this.awG.awp;
        return new File(file, this.awG.awq.generate(str) + ".download");
    }

    private g dT(String str) {
        g gVar;
        synchronized (this.awB) {
            gVar = this.awD.get(str);
            if (gVar == null) {
                gVar = new g(str, this.awG);
                this.awD.put(str, gVar);
            }
        }
        return gVar;
    }

    private String e(String str, boolean z) {
        if (X(str).exists()) {
            File X = X(str);
            r(X);
            return Uri.fromFile(X).toString();
        }
        return dR(str);
    }

    private void e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            onError(new ProxyCacheException("Error closing socket", e));
        }
    }

    private static void onError(Throwable th) {
        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
    }

    private void r(File file) {
        try {
            this.awG.awr.s(file);
        } catch (IOException e) {
            com.kwad.sdk.core.e.c.e("HttpProxyCacheServer", "Error touching file " + file);
        }
    }

    public final boolean a(String str, int i, a.C0256a c0256a) {
        com.kwad.sdk.core.e.c.d("HttpProxyCacheServer", "preloadSync preloadUrl " + str);
        if (dO(str)) {
            return true;
        }
        return com.kwad.sdk.core.network.a.a.a(dR(str), null, c0256a, i);
    }

    public final String dN(String str) {
        return e(str, true);
    }

    public final boolean dP(String str) {
        ao.ar(str, "Url can't be null!");
        return dS(str).exists() || X(str).exists();
    }

    public final boolean dQ(String str) {
        g gVar = this.awD.get(str);
        if (gVar != null) {
            gVar.shutdown();
            this.awD.remove(str);
            return true;
        }
        return false;
    }
}
