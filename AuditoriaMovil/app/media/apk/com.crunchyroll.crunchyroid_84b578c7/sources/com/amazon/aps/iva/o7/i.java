package com.amazon.aps.iva.o7;

import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: PsshAtomUtil.java */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: PsshAtomUtil.java */
    /* loaded from: classes.dex */
    public static class a {
        public final UUID a;
        public final int b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a b(byte[] bArr) {
        v vVar = new v(bArr);
        if (vVar.c < 32) {
            return null;
        }
        vVar.F(0);
        if (vVar.e() != (vVar.c - vVar.b) + 4 || vVar.e() != 1886614376) {
            return null;
        }
        int e = (vVar.e() >> 24) & 255;
        if (e > 1) {
            p.g();
            return null;
        }
        UUID uuid = new UUID(vVar.n(), vVar.n());
        if (e == 1) {
            vVar.G(vVar.x() * 16);
        }
        int x = vVar.x();
        if (x != vVar.c - vVar.b) {
            return null;
        }
        byte[] bArr2 = new byte[x];
        vVar.d(0, bArr2, x);
        return new a(uuid, e, bArr2);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = b.a;
        if (!uuid.equals(uuid2)) {
            uuid.toString();
            Objects.toString(uuid2);
            p.g();
            return null;
        }
        return b.c;
    }
}
