package com.kwad.sdk.ip.direct;

import android.os.SystemClock;
import com.kwad.sdk.utils.bj;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes3.dex */
public final class b {
    static int aCJ = 80;
    static int port = 80;

    /* loaded from: classes3.dex */
    static class a extends Thread {
        LinkedList aCL = new LinkedList();
        volatile boolean aCM = false;
        Selector aCK = Selector.open();

        a() {
            setName("Connector");
        }

        private void FU() {
            synchronized (this.aCL) {
                while (this.aCL.size() > 0) {
                    C0269b c0269b = (C0269b) this.aCL.removeFirst();
                    c0269b.aCO.register(this.aCK, 8, c0269b);
                }
            }
        }

        private void FV() {
            Iterator<SelectionKey> it = this.aCK.selectedKeys().iterator();
            while (it.hasNext()) {
                SelectionKey next = it.next();
                it.remove();
                C0269b c0269b = (C0269b) next.attachment();
                SocketChannel socketChannel = (SocketChannel) next.channel();
                try {
                    if (socketChannel.finishConnect()) {
                        next.cancel();
                        c0269b.aCS = SystemClock.elapsedRealtime();
                        socketChannel.close();
                    }
                } catch (Throwable th) {
                    bj.c(socketChannel);
                    c0269b.aCP = th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void a(C0269b c0269b) {
            SocketChannel socketChannel;
            try {
                socketChannel = SocketChannel.open();
                try {
                    socketChannel.configureBlocking(false);
                    boolean connect = socketChannel.connect(c0269b.aCN);
                    c0269b.aCO = socketChannel;
                    c0269b.aCR = SystemClock.elapsedRealtime();
                    if (connect) {
                        c0269b.aCS = c0269b.aCR;
                        bj.c(socketChannel);
                        c0269b = c0269b;
                    } else {
                        synchronized (this.aCL) {
                            this.aCL.add(c0269b);
                        }
                        Selector selector = this.aCK;
                        if (selector == 0) {
                            return;
                        }
                        try {
                            selector.wakeup();
                            c0269b = selector;
                        } catch (Throwable th) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bj.c(socketChannel);
                    c0269b.aCP = th;
                }
            } catch (Throwable th3) {
                th = th3;
                socketChannel = null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    if (this.aCK.select() > 0) {
                        FV();
                    }
                    FU();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (this.aCM) {
                    Selector selector = this.aCK;
                    if (selector != null) {
                        try {
                            selector.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    }
                    return;
                }
                continue;
            }
        }

        final void shutdown() {
            this.aCM = true;
            Selector selector = this.aCK;
            if (selector != null) {
                try {
                    selector.wakeup();
                } catch (Throwable th) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.ip.direct.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0269b {
        InetSocketAddress aCN;
        SocketChannel aCO;
        Throwable aCP;
        private float aCQ;
        long aCR;
        long aCS = 0;
        boolean aCT = false;
        private boolean success;

        C0269b(String str) {
            try {
                this.aCN = new InetSocketAddress(InetAddress.getByName(str), b.port);
            } catch (Throwable th) {
                this.aCP = th;
            }
        }

        final void FW() {
            String str;
            if (this.aCS != 0) {
                str = Long.toString(this.aCS - this.aCR) + "ms";
                this.aCQ = (float) (this.aCS - this.aCR);
                this.success = true;
            } else {
                Throwable th = this.aCP;
                if (th != null) {
                    str = th.toString();
                    this.success = false;
                } else {
                    this.success = false;
                    str = "Timed out";
                }
            }
            com.kwad.sdk.core.e.c.d("IpDirect_Ping", this.aCN + " : " + str);
            this.aCT = true;
        }
    }

    public static c f(String str, long j) {
        a aVar;
        long j2 = j / 5;
        com.kwad.sdk.core.e.c.d("IpDirect_Ping", "ping:" + str);
        c cVar = new c(str);
        try {
            aVar = new a();
        } catch (Throwable th) {
            th.printStackTrace();
            aVar = null;
        }
        if (aVar == null) {
            return cVar;
        }
        try {
            aVar.start();
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < cVar.FX(); i++) {
                C0269b c0269b = new C0269b(str);
                linkedList.add(c0269b);
                try {
                    aVar.a(c0269b);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            try {
                Thread.sleep(j + j2);
                try {
                    aVar.shutdown();
                    aVar.join();
                    float f = 0.0f;
                    Iterator it = linkedList.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        C0269b c0269b2 = (C0269b) it.next();
                        c0269b2.FW();
                        z &= c0269b2.success;
                        cVar.bs(z);
                        f += c0269b2.aCQ;
                    }
                    com.kwad.sdk.core.e.c.d("IpDirect_Ping", "sum:" + f + "*size:" + linkedList.size());
                    cVar.i(f / ((float) linkedList.size()));
                    return cVar;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return cVar;
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
                return cVar;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
            return cVar;
        }
    }
}
