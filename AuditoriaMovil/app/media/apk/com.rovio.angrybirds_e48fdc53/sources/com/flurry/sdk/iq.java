package com.flurry.sdk;

import com.flurry.sdk.ir;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class iq extends ky {
    private static final String t = iq.class.getName();
    final long a;
    final int b;
    final int c;
    final ix d;
    final Map<String, String> e;
    public ArrayList<ir> f;
    public iu g;
    long h;
    int i;
    int j;
    String k;
    String l;
    boolean m;

    public iq(String str, long j, String str2, long j2, int i, int i2, ix ixVar, Map<String, String> map, int i3, int i4, String str3) {
        a(str2);
        this.n = j2;
        a_();
        this.l = str;
        this.a = j;
        this.s = i;
        this.b = i;
        this.c = i2;
        this.d = ixVar;
        this.e = map;
        this.i = i3;
        this.j = i4;
        this.k = str3;
        this.h = 30000L;
        this.f = new ArrayList<>();
    }

    @Override // com.flurry.sdk.ky
    public final void a_() {
        super.a_();
        if (this.p != 1) {
            this.h *= 3;
        }
    }

    public final synchronized void c() {
        this.g.c();
    }

    public final void d() {
        Iterator<ir> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().l = this;
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements li<iq> {
        lh<ir> a = new lh<>(new ir.a());

        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, iq iqVar) {
            iq iqVar2 = iqVar;
            if (outputStream == null || iqVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.iq.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            if (iqVar2.l != null) {
                dataOutputStream.writeUTF(iqVar2.l);
            } else {
                dataOutputStream.writeUTF("");
            }
            if (iqVar2.r != null) {
                dataOutputStream.writeUTF(iqVar2.r);
            } else {
                dataOutputStream.writeUTF("");
            }
            dataOutputStream.writeLong(iqVar2.n);
            dataOutputStream.writeInt(iqVar2.p);
            dataOutputStream.writeLong(iqVar2.a);
            dataOutputStream.writeInt(iqVar2.b);
            dataOutputStream.writeInt(iqVar2.c);
            dataOutputStream.writeInt(iqVar2.d.e);
            Map map = iqVar2.e;
            if (map != null) {
                dataOutputStream.writeInt(iqVar2.e.size());
                for (String str : iqVar2.e.keySet()) {
                    dataOutputStream.writeUTF(str);
                    dataOutputStream.writeUTF((String) map.get(str));
                }
            } else {
                dataOutputStream.writeInt(0);
            }
            dataOutputStream.writeLong(iqVar2.h);
            dataOutputStream.writeInt(iqVar2.i);
            dataOutputStream.writeInt(iqVar2.j);
            if (iqVar2.k != null) {
                dataOutputStream.writeUTF(iqVar2.k);
            } else {
                dataOutputStream.writeUTF("");
            }
            dataOutputStream.writeBoolean(iqVar2.m);
            dataOutputStream.flush();
            this.a.a(outputStream, (List<ir>) iqVar2.f);
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ iq a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.iq.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            String readUTF = dataInputStream.readUTF();
            if (readUTF.equals("")) {
                readUTF = null;
            }
            String readUTF2 = dataInputStream.readUTF();
            long readLong = dataInputStream.readLong();
            int readInt = dataInputStream.readInt();
            long readLong2 = dataInputStream.readLong();
            int readInt2 = dataInputStream.readInt();
            int readInt3 = dataInputStream.readInt();
            ix a = ix.a(dataInputStream.readInt());
            HashMap hashMap = null;
            int readInt4 = dataInputStream.readInt();
            if (readInt4 != 0) {
                hashMap = new HashMap();
                for (int i = 0; i < readInt4; i++) {
                    hashMap.put(dataInputStream.readUTF(), dataInputStream.readUTF());
                }
            }
            long readLong3 = dataInputStream.readLong();
            int readInt5 = dataInputStream.readInt();
            int readInt6 = dataInputStream.readInt();
            String readUTF3 = dataInputStream.readUTF();
            if (readUTF3.equals("")) {
                readUTF3 = null;
            }
            boolean readBoolean = dataInputStream.readBoolean();
            iq iqVar = new iq(readUTF, readLong2, readUTF2, readLong, readInt2, readInt3, a, hashMap, readInt5, readInt6, readUTF3);
            iqVar.h = readLong3;
            iqVar.m = readBoolean;
            iqVar.p = readInt;
            iqVar.f = (ArrayList) this.a.a(inputStream);
            iqVar.d();
            return iqVar;
        }
    }
}
