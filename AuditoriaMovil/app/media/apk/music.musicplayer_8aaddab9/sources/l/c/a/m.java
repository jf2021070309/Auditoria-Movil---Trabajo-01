package l.c.a;

import e.j.d.w;
import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class m implements Externalizable {
    public byte a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9699b;

    public m() {
    }

    public m(byte b2, Object obj) {
        this.a = b2;
        this.f9699b = obj;
    }

    public static Object a(byte b2, DataInput dataInput) throws IOException {
        r rVar;
        r rVar2;
        if (b2 == 64) {
            int i2 = i.a;
            return i.t(dataInput.readByte(), dataInput.readByte());
        }
        switch (b2) {
            case 1:
                c cVar = c.a;
                return c.h(dataInput.readLong(), dataInput.readInt());
            case 2:
                d dVar = d.a;
                return d.B(dataInput.readLong(), dataInput.readInt());
            case 3:
                e eVar = e.a;
                return e.j0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
            case 4:
                return f.i0(dataInput);
            case 5:
                return g.P(dataInput);
            case 6:
                f i0 = f.i0(dataInput);
                q P = q.P(dataInput);
                p pVar = (p) a(dataInput.readByte(), dataInput);
                w.k0(i0, "localDateTime");
                w.k0(P, "offset");
                w.k0(pVar, "zone");
                if (!(pVar instanceof q) || P.equals(pVar)) {
                    return new s(i0, P, pVar);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                Pattern pattern = r.f9710b;
                String readUTF = dataInput.readUTF();
                if (readUTF.equals("Z") || readUTF.startsWith(Marker.ANY_NON_NULL_MARKER) || readUTF.startsWith("-")) {
                    throw new a(e.a.d.a.a.k("Invalid ID for region-based ZoneId, invalid format: ", readUTF));
                }
                if (readUTF.equals("UTC") || readUTF.equals("GMT") || readUTF.equals("UT")) {
                    return new r(readUTF, q.f9705d.v());
                }
                if (readUTF.startsWith("UTC+") || readUTF.startsWith("GMT+") || readUTF.startsWith("UTC-") || readUTF.startsWith("GMT-")) {
                    q G = q.G(readUTF.substring(3));
                    if (G.f9708g == 0) {
                        rVar = new r(readUTF.substring(0, 3), G.v());
                    } else {
                        rVar = new r(readUTF.substring(0, 3) + G.f9709h, G.v());
                    }
                    return rVar;
                } else if (readUTF.startsWith("UT+") || readUTF.startsWith("UT-")) {
                    q G2 = q.G(readUTF.substring(2));
                    if (G2.f9708g == 0) {
                        rVar2 = new r("UT", G2.v());
                    } else {
                        StringBuilder y = e.a.d.a.a.y("UT");
                        y.append(G2.f9709h);
                        rVar2 = new r(y.toString(), G2.v());
                    }
                    return rVar2;
                } else {
                    return r.B(readUTF, false);
                }
            case 8:
                return q.P(dataInput);
            default:
                switch (b2) {
                    case 66:
                        int i3 = k.a;
                        return new k(g.P(dataInput), q.P(dataInput));
                    case 67:
                        int i4 = n.a;
                        return n.u(dataInput.readInt());
                    case 68:
                        int i5 = o.a;
                        int readInt = dataInput.readInt();
                        byte readByte = dataInput.readByte();
                        l.c.a.w.a.YEAR.checkValidValue(readInt);
                        l.c.a.w.a.MONTH_OF_YEAR.checkValidValue(readByte);
                        return new o(readInt, readByte);
                    case 69:
                        int i6 = j.a;
                        return new j(f.i0(dataInput), q.P(dataInput));
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f9699b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.f9699b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.a;
        Object obj = this.f9699b;
        objectOutput.writeByte(b2);
        if (b2 == 64) {
            i iVar = (i) obj;
            objectOutput.writeByte(iVar.f9689b);
            objectOutput.writeByte(iVar.f9690c);
            return;
        }
        switch (b2) {
            case 1:
                c cVar = (c) obj;
                objectOutput.writeLong(cVar.f9672b);
                objectOutput.writeInt(cVar.f9673c);
                return;
            case 2:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f9674b);
                objectOutput.writeInt(dVar.f9675c);
                return;
            case 3:
                e eVar = (e) obj;
                objectOutput.writeInt(eVar.f9677c);
                objectOutput.writeByte(eVar.f9678d);
                objectOutput.writeByte(eVar.f9679e);
                return;
            case 4:
                ((f) obj).m0(objectOutput);
                return;
            case 5:
                ((g) obj).c0(objectOutput);
                return;
            case 6:
                s sVar = (s) obj;
                sVar.a.m0(objectOutput);
                sVar.f9713b.Q(objectOutput);
                sVar.f9714c.z(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((r) obj).f9711c);
                return;
            case 8:
                ((q) obj).Q(objectOutput);
                return;
            default:
                switch (b2) {
                    case 66:
                        k kVar = (k) obj;
                        kVar.f9693b.c0(objectOutput);
                        kVar.f9694c.Q(objectOutput);
                        return;
                    case 67:
                        objectOutput.writeInt(((n) obj).f9700b);
                        return;
                    case 68:
                        o oVar = (o) obj;
                        objectOutput.writeInt(oVar.f9701b);
                        objectOutput.writeByte(oVar.f9702c);
                        return;
                    case 69:
                        j jVar = (j) obj;
                        jVar.f9691b.m0(objectOutput);
                        jVar.f9692c.Q(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }
}
