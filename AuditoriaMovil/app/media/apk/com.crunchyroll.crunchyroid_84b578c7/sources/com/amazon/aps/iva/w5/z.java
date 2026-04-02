package com.amazon.aps.iva.w5;

import android.net.Uri;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* compiled from: UdpDataSource.java */
/* loaded from: classes.dex */
public final class z extends b {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    /* compiled from: UdpDataSource.java */
    /* loaded from: classes.dex */
    public static final class a extends g {
        public a(int i, Exception exc) {
            super(i, exc);
        }
    }

    public z() {
        super(true);
        this.e = 8000;
        byte[] bArr = new byte[CastStatusCodes.AUTHENTICATION_FAILED];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, (int) CastStatusCodes.AUTHENTICATION_FAILED);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws a {
        Uri uri = iVar.a;
        this.h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.h.getPort();
        o(iVar);
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            p(iVar);
            return -1L;
        } catch (IOException e) {
            throw new a(CastStatusCodes.INVALID_REQUEST, e);
        } catch (SecurityException e2) {
            throw new a(CastStatusCodes.MESSAGE_TOO_LARGE, e2);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            n();
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.m;
        DatagramPacket datagramPacket = this.g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.m = length;
                m(length);
            } catch (SocketTimeoutException e) {
                throw new a(CastStatusCodes.CANCELED, e);
            } catch (IOException e2) {
                throw new a(CastStatusCodes.INVALID_REQUEST, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.m;
        int min = Math.min(i4, i2);
        System.arraycopy(this.f, length2 - i4, bArr, i, min);
        this.m -= min;
        return min;
    }
}
