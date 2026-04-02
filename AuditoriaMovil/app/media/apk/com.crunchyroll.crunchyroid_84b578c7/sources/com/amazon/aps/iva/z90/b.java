package com.amazon.aps.iva.z90;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/* compiled from: DatagramFactory.kt */
/* loaded from: classes4.dex */
public final class b implements a {
    @Override // com.amazon.aps.iva.z90.a
    public final DatagramSocket a() throws SocketException {
        return new DatagramSocket();
    }

    @Override // com.amazon.aps.iva.z90.a
    public final DatagramPacket b(byte[] bArr, InetAddress inetAddress) {
        com.amazon.aps.iva.yb0.j.f(inetAddress, "address");
        return new DatagramPacket(bArr, bArr.length, inetAddress, 123);
    }

    @Override // com.amazon.aps.iva.z90.a
    public final DatagramPacket c(byte[] bArr) {
        com.amazon.aps.iva.yb0.j.f(bArr, "buffer");
        return new DatagramPacket(bArr, bArr.length);
    }
}
