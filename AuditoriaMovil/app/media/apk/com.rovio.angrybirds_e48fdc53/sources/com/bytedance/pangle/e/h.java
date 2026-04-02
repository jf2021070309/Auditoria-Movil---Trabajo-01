package com.bytedance.pangle.e;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class h implements Closeable {
    private final FileInputStream a;
    private a b;
    private b[] c;
    private c[] d;
    private final Map<String, c> e = new HashMap();

    static /* synthetic */ void a(int i, int i2, String str) {
        if (i > 0 && i <= i2) {
            return;
        }
        throw new IOException(str);
    }

    public static boolean a(File file) {
        try {
            com.bytedance.pangle.util.g.a(new h(file));
            return true;
        } catch (IOException e) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            return false;
        } catch (Throwable th) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            throw th;
        }
    }

    private h(File file) {
        c[] cVarArr;
        this.b = null;
        this.c = null;
        this.d = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.a = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.b = new a(channel, (byte) 0);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        allocate.limit(this.b.j);
        allocate.order(this.b.a[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        channel.position(this.b.f);
        this.c = new b[this.b.k];
        for (int i = 0; i < this.c.length; i++) {
            b(channel, allocate, "failed to read phdr.");
            this.c[i] = new b(allocate, this.b.a[4], (byte) 0);
        }
        channel.position(this.b.g);
        allocate.limit(this.b.l);
        this.d = new c[this.b.m];
        for (int i2 = 0; i2 < this.d.length; i2++) {
            b(channel, allocate, "failed to read shdr.");
            this.d[i2] = new c(allocate, this.b.a[4], (byte) 0);
        }
        if (this.b.n > 0) {
            c cVar = this.d[this.b.n];
            ByteBuffer allocate2 = ByteBuffer.allocate((int) cVar.f);
            this.a.getChannel().position(cVar.e);
            b(this.a.getChannel(), allocate2, "failed to read section: " + cVar.k);
            for (c cVar2 : this.d) {
                allocate2.position(cVar2.a);
                cVar2.k = a(allocate2);
                this.e.put(cVar2.k, cVar2);
            }
        }
    }

    private static String a(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new String(array, position, (byteBuffer.position() - position) - 1, Charset.forName("ASCII"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(FileChannel fileChannel, ByteBuffer byteBuffer, String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read != byteBuffer.limit()) {
            throw new IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
        }
        byteBuffer.flip();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.e.clear();
        this.c = null;
        this.d = null;
    }

    /* loaded from: classes.dex */
    static class a {
        public final byte[] a;
        public final short b;
        public final short c;
        public final int d;
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final short i;
        public final short j;
        public final short k;
        public final short l;
        public final short m;
        public final short n;

        /* synthetic */ a(FileChannel fileChannel, byte b) {
            this(fileChannel);
        }

        private a(FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.a = bArr;
            fileChannel.position(0L);
            fileChannel.read(ByteBuffer.wrap(bArr));
            if (bArr[0] != Byte.MAX_VALUE || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
                throw new IOException(String.format("bad elf magic: %x %x %x %x.", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])));
            }
            byte b = bArr[4];
            h.a(b, 2, "bad elf class: " + ((int) bArr[4]));
            byte b2 = bArr[5];
            h.a(b2, 2, "bad elf data encoding: " + ((int) bArr[5]));
            ByteBuffer allocate = ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
            allocate.order(bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
            h.b(fileChannel, allocate, "failed to read rest part of ehdr.");
            this.b = allocate.getShort();
            this.c = allocate.getShort();
            int i = allocate.getInt();
            this.d = i;
            h.a(i, 1, "bad elf version: " + i);
            byte b3 = bArr[4];
            if (b3 == 1) {
                this.e = allocate.getInt();
                this.f = allocate.getInt();
                this.g = allocate.getInt();
            } else if (b3 == 2) {
                this.e = allocate.getLong();
                this.f = allocate.getLong();
                this.g = allocate.getLong();
            } else {
                throw new IOException("Unexpected elf class: " + ((int) bArr[4]));
            }
            this.h = allocate.getInt();
            this.i = allocate.getShort();
            this.j = allocate.getShort();
            this.k = allocate.getShort();
            this.l = allocate.getShort();
            this.m = allocate.getShort();
            this.n = allocate.getShort();
        }
    }

    /* loaded from: classes.dex */
    static class b {
        public final int a;
        public final int b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final long h;

        /* synthetic */ b(ByteBuffer byteBuffer, int i, byte b) {
            this(byteBuffer, i);
        }

        private b(ByteBuffer byteBuffer, int i) {
            if (i == 1) {
                this.a = byteBuffer.getInt();
                this.c = byteBuffer.getInt();
                this.d = byteBuffer.getInt();
                this.e = byteBuffer.getInt();
                this.f = byteBuffer.getInt();
                this.g = byteBuffer.getInt();
                this.b = byteBuffer.getInt();
                this.h = byteBuffer.getInt();
            } else if (i == 2) {
                this.a = byteBuffer.getInt();
                this.b = byteBuffer.getInt();
                this.c = byteBuffer.getLong();
                this.d = byteBuffer.getLong();
                this.e = byteBuffer.getLong();
                this.f = byteBuffer.getLong();
                this.g = byteBuffer.getLong();
                this.h = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: ".concat(String.valueOf(i)));
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        public final int a;
        public final int b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final int g;
        public final int h;
        public final long i;
        public final long j;
        public String k;

        /* synthetic */ c(ByteBuffer byteBuffer, int i, byte b) {
            this(byteBuffer, i);
        }

        private c(ByteBuffer byteBuffer, int i) {
            if (i == 1) {
                this.a = byteBuffer.getInt();
                this.b = byteBuffer.getInt();
                this.c = byteBuffer.getInt();
                this.d = byteBuffer.getInt();
                this.e = byteBuffer.getInt();
                this.f = byteBuffer.getInt();
                this.g = byteBuffer.getInt();
                this.h = byteBuffer.getInt();
                this.i = byteBuffer.getInt();
                this.j = byteBuffer.getInt();
            } else if (i == 2) {
                this.a = byteBuffer.getInt();
                this.b = byteBuffer.getInt();
                this.c = byteBuffer.getLong();
                this.d = byteBuffer.getLong();
                this.e = byteBuffer.getLong();
                this.f = byteBuffer.getLong();
                this.g = byteBuffer.getInt();
                this.h = byteBuffer.getInt();
                this.i = byteBuffer.getLong();
                this.j = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: ".concat(String.valueOf(i)));
            }
            this.k = null;
        }
    }
}
