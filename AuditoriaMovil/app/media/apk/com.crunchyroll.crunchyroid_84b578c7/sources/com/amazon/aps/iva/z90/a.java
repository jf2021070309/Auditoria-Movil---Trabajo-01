package com.amazon.aps.iva.z90;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/* compiled from: DatagramFactory.kt */
/* loaded from: classes4.dex */
public interface a {
    DatagramSocket a() throws SocketException;

    DatagramPacket b(byte[] bArr, InetAddress inetAddress);

    DatagramPacket c(byte[] bArr);
}
