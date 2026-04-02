package l.c.a.x;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import l.c.a.q;
/* loaded from: classes2.dex */
public final class a implements Externalizable {
    public byte a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9818b;

    public a() {
    }

    public a(byte b2, Object obj) {
        this.a = b2;
        this.f9818b = obj;
    }

    public static long a(DataInput dataInput) throws IOException {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static Object b(byte b2, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 == 3) {
                    return e.a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long a = a(dataInput);
            q f2 = f(dataInput);
            q f3 = f(dataInput);
            if (f2.equals(f3)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            return new d(a, f2, f3);
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a(dataInput);
        }
        int i3 = readInt + 1;
        q[] qVarArr = new q[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            qVarArr[i4] = f(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr2[i5] = a(dataInput);
        }
        int i6 = readInt2 + 1;
        q[] qVarArr2 = new q[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            qVarArr2[i7] = f(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i8 = 0; i8 < readByte; i8++) {
            eVarArr[i8] = e.a(dataInput);
        }
        return new b(jArr, qVarArr, jArr2, qVarArr2, eVarArr);
    }

    public static q f(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? q.K(dataInput.readInt()) : q.K(readByte * 900);
    }

    public static void h(long j2, DataOutput dataOutput) throws IOException {
        if (j2 < -4575744000L || j2 >= 10413792000L || j2 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j2);
            return;
        }
        int i2 = (int) ((j2 + 4575744000L) / 900);
        dataOutput.writeByte((i2 >>> 16) & 255);
        dataOutput.writeByte((i2 >>> 8) & 255);
        dataOutput.writeByte(i2 & 255);
    }

    public static void i(q qVar, DataOutput dataOutput) throws IOException {
        int i2 = qVar.f9708g;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    private Object readResolve() {
        return this.f9818b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.f9818b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.a;
        Object obj = this.f9818b;
        objectOutput.writeByte(b2);
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((e) obj).b(objectOutput);
                return;
            }
            d dVar = (d) obj;
            h(dVar.a.B(dVar.f9830b), objectOutput);
            i(dVar.f9830b, objectOutput);
            i(dVar.f9831c, objectOutput);
            return;
        }
        b bVar = (b) obj;
        objectOutput.writeInt(bVar.a.length);
        for (long j2 : bVar.a) {
            h(j2, objectOutput);
        }
        for (q qVar : bVar.f9819b) {
            i(qVar, objectOutput);
        }
        objectOutput.writeInt(bVar.f9820c.length);
        for (long j3 : bVar.f9820c) {
            h(j3, objectOutput);
        }
        for (q qVar2 : bVar.f9822e) {
            i(qVar2, objectOutput);
        }
        objectOutput.writeByte(bVar.f9823f.length);
        for (e eVar : bVar.f9823f) {
            eVar.b(objectOutput);
        }
    }
}
