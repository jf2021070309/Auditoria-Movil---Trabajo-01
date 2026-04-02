package j;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g0 {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f9250b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f9251c;

    public g0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.a = aVar;
        this.f9250b = proxy;
        this.f9251c = inetSocketAddress;
    }

    public boolean a() {
        return this.a.f9188i != null && this.f9250b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (g0Var.a.equals(this.a) && g0Var.f9250b.equals(this.f9250b) && g0Var.f9251c.equals(this.f9251c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9250b.hashCode();
        return this.f9251c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Route{");
        y.append(this.f9251c);
        y.append("}");
        return y.toString();
    }
}
