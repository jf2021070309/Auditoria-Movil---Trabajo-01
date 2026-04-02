package com.flurry.sdk;

import com.flurry.sdk.iq;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class iu {
    private static final String e = iv.class.getName();
    public long a;
    int b;
    public String c;
    Map<Long, iq> d;
    private long f = System.currentTimeMillis();
    private long g;
    private iy h;
    private boolean i;
    private int j;
    private AtomicInteger k;

    public iu(String str, boolean z, long j, long j2, iy iyVar, Map<Long, iq> map) {
        this.c = str;
        this.i = z;
        this.a = j;
        this.g = j2;
        this.h = iyVar;
        this.d = map;
        if (map != null) {
            for (Long l : map.keySet()) {
                map.get(l).g = this;
            }
            this.j = map.size();
        } else {
            this.j = 0;
        }
        this.k = new AtomicInteger(0);
    }

    public final List<iq> a() {
        return this.d != null ? new ArrayList(this.d.values()) : Collections.emptyList();
    }

    public final synchronized boolean b() {
        return this.k.intValue() >= this.j;
    }

    public final synchronized void c() {
        this.k.incrementAndGet();
    }

    public final byte[] d() {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.writeShort(this.h.e);
            dataOutputStream.writeLong(this.a);
            dataOutputStream.writeLong(this.g);
            dataOutputStream.writeBoolean(this.i);
            if (this.i) {
                dataOutputStream.writeShort(this.b);
                dataOutputStream.writeUTF(this.c);
            }
            dataOutputStream.writeShort(this.d.size());
            if (this.d != null) {
                for (Map.Entry<Long, iq> entry : this.d.entrySet()) {
                    iq value = entry.getValue();
                    dataOutputStream.writeLong(entry.getKey().longValue());
                    dataOutputStream.writeUTF(value.r);
                    dataOutputStream.writeShort(value.f.size());
                    Iterator<ir> it = value.f.iterator();
                    while (it.hasNext()) {
                        ir next = it.next();
                        dataOutputStream.writeShort(next.a);
                        dataOutputStream.writeLong(next.b);
                        dataOutputStream.writeLong(next.c);
                        dataOutputStream.writeBoolean(next.d);
                        dataOutputStream.writeShort(next.e);
                        dataOutputStream.writeShort(next.f.e);
                        if ((next.e < 200 || next.e >= 400) && next.g != null) {
                            byte[] bytes = next.g.getBytes();
                            dataOutputStream.writeShort(bytes.length);
                            dataOutputStream.write(bytes);
                        }
                        dataOutputStream.writeShort(next.h);
                        dataOutputStream.writeInt((int) next.k);
                    }
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ma.a(dataOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            dataOutputStream2 = dataOutputStream;
            try {
                ko.a(6, e, "Error when generating report", e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                ma.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma.a(dataOutputStream);
            throw th;
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements li<iu> {
        lh<iq> a = new lh<>(new iq.a());

        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, iu iuVar) {
            iu iuVar2 = iuVar;
            if (outputStream == null || iuVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.iu.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeLong(iuVar2.a);
            dataOutputStream.writeLong(iuVar2.f);
            dataOutputStream.writeLong(iuVar2.g);
            dataOutputStream.writeInt(iuVar2.h.e);
            dataOutputStream.writeBoolean(iuVar2.i);
            dataOutputStream.writeInt(iuVar2.b);
            if (iuVar2.c != null) {
                dataOutputStream.writeUTF(iuVar2.c);
            } else {
                dataOutputStream.writeUTF("");
            }
            dataOutputStream.writeInt(iuVar2.j);
            dataOutputStream.writeInt(iuVar2.k.intValue());
            dataOutputStream.flush();
            this.a.a(outputStream, iuVar2.a());
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ iu a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.iu.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            long readLong3 = dataInputStream.readLong();
            iy a = iy.a(dataInputStream.readInt());
            boolean readBoolean = dataInputStream.readBoolean();
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            int readInt3 = dataInputStream.readInt();
            iu iuVar = new iu(readUTF, readBoolean, readLong, readLong3, a, null);
            iuVar.f = readLong2;
            iuVar.b = readInt;
            iuVar.j = readInt2;
            iuVar.k = new AtomicInteger(readInt3);
            List<iq> a2 = this.a.a(inputStream);
            if (a2 != null) {
                iuVar.d = new HashMap();
                for (iq iqVar : a2) {
                    iqVar.g = iuVar;
                    iuVar.d.put(Long.valueOf(iqVar.a), iqVar);
                }
            }
            return iuVar;
        }
    }
}
