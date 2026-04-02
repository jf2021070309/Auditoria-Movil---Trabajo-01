package com.amazon.aps.iva.z90;

import java.net.InetAddress;
import java.net.UnknownHostException;
/* compiled from: DnsResolver.kt */
/* loaded from: classes4.dex */
public final class d implements c {
    @Override // com.amazon.aps.iva.z90.c
    public final InetAddress a(String str) throws UnknownHostException {
        com.amazon.aps.iva.yb0.j.f(str, "host");
        InetAddress byName = InetAddress.getByName(str);
        com.amazon.aps.iva.yb0.j.e(byName, "InetAddress.getByName(host)");
        return byName;
    }
}
