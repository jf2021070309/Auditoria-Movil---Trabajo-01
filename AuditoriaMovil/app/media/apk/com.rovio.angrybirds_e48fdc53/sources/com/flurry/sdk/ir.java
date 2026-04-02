package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public class ir {
    private static final String m = ir.class.getName();
    public int a;
    public long b;
    public long c;
    public boolean d;
    public String g;
    public int h;
    public long i;
    public boolean j;
    public iq l;
    public long k = 0;
    public int e = 0;
    public is f = is.PENDING_COMPLETION;

    public ir(iq iqVar, long j, long j2, int i) {
        this.l = iqVar;
        this.b = j;
        this.c = j2;
        this.a = i;
    }

    public final void a() {
        this.l.f.add(this);
        if (!this.d) {
            return;
        }
        this.l.m = true;
    }

    /* loaded from: classes2.dex */
    public static class a implements li<ir> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, ir irVar) {
            ir irVar2 = irVar;
            if (outputStream == null || irVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.ir.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeInt(irVar2.a);
            dataOutputStream.writeLong(irVar2.b);
            dataOutputStream.writeLong(irVar2.c);
            dataOutputStream.writeBoolean(irVar2.d);
            dataOutputStream.writeInt(irVar2.e);
            dataOutputStream.writeInt(irVar2.f.e);
            if (irVar2.g != null) {
                dataOutputStream.writeUTF(irVar2.g);
            } else {
                dataOutputStream.writeUTF("");
            }
            dataOutputStream.writeInt(irVar2.h);
            dataOutputStream.writeLong(irVar2.i);
            dataOutputStream.writeBoolean(irVar2.j);
            dataOutputStream.writeLong(irVar2.k);
            dataOutputStream.flush();
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ ir a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.ir.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            int readInt = dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            boolean readBoolean = dataInputStream.readBoolean();
            int readInt2 = dataInputStream.readInt();
            is a = is.a(dataInputStream.readInt());
            String readUTF = dataInputStream.readUTF();
            int readInt3 = dataInputStream.readInt();
            long readLong3 = dataInputStream.readLong();
            boolean readBoolean2 = dataInputStream.readBoolean();
            long readLong4 = dataInputStream.readLong();
            ir irVar = new ir(null, readLong, readLong2, readInt);
            irVar.d = readBoolean;
            irVar.e = readInt2;
            irVar.f = a;
            irVar.g = readUTF;
            irVar.h = readInt3;
            irVar.i = readLong3;
            irVar.j = readBoolean2;
            irVar.k = readLong4;
            return irVar;
        }
    }
}
