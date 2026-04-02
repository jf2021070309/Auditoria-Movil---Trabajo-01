package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.c0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class f {
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a a;
    private final d b;
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e c;
    private final p d;
    private int f;
    private List<Proxy> e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<c0> h = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {
        private final List<c0> a;
        private int b = 0;

        a(List<c0> list) {
            this.a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.a;
                int i = this.b;
                this.b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public f(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a aVar, d dVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar) throws IOException {
        this.a = aVar;
        this.b = dVar;
        this.c = eVar;
        this.d = pVar;
        a(aVar.k(), aVar.f());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private void a(s sVar, Proxy proxy) throws IOException {
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            try {
                List<Proxy> select = this.a.h().select(sVar.n());
                this.e = (select == null || select.isEmpty()) ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(Proxy.NO_PROXY) : bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(select);
            } catch (IllegalArgumentException e) {
                throw new IOException();
            }
        }
        this.f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String g;
        int j;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            g = this.a.k().g();
            j = this.a.k().j();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            g = a(inetSocketAddress);
            j = inetSocketAddress.getPort();
        }
        if (j < 1 || j > 65535) {
            throw new SocketException("No route to " + g + ":" + j + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(g, j));
        } else {
            this.d.a(this.c, g);
            List<InetAddress> a2 = this.a.c().a(g);
            if (a2.isEmpty()) {
                throw new UnknownHostException(this.a.c() + " returned no addresses for " + g);
            }
            this.d.a(this.c, g, a2);
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                this.g.add(new InetSocketAddress(a2.get(i), j));
            }
        }
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private Proxy d() throws IOException {
        if (c()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.k().g() + "; exhausted proxy configurations: " + this.e);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.a.h() != null) {
            this.a.h().connectFailed(this.a.k().n(), c0Var.b().address(), iOException);
        }
        this.b.b(c0Var);
    }

    public boolean a() {
        return c() || !this.h.isEmpty();
    }

    public a b() throws IOException {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy d = d();
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    c0 c0Var = new c0(this.a, d, this.g.get(i));
                    if (this.b.c(c0Var)) {
                        this.h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
