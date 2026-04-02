package l.c.a.t;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class u implements Externalizable {
    public byte a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9754b;

    public u() {
    }

    public u(byte b2, Object obj) {
        this.a = b2;
        this.f9754b = obj;
    }

    private Object readResolve() {
        return this.f9754b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        Object pVar;
        Object v;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                l.c.a.e eVar = p.a;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                Objects.requireNonNull(o.f9738d);
                pVar = new p(l.c.a.e.j0(readInt, readByte2, readByte3));
                v = pVar;
                break;
            case 2:
                q qVar = q.a;
                v = q.v(objectInput.readByte());
                break;
            case 3:
                int[] iArr = k.a;
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                j jVar = j.f9719c;
                v = k.i0(readInt2, readByte4, readByte5);
                break;
            case 4:
                v = l.readExternal(objectInput);
                break;
            case 5:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                r rVar = r.f9753c;
                pVar = new s(l.c.a.e.j0(readInt3 + 1911, readByte6, readByte7));
                v = pVar;
                break;
            case 6:
                v = t.readExternal(objectInput);
                break;
            case 7:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                v vVar = v.f9755c;
                pVar = new w(l.c.a.e.j0(readInt4 - 543, readByte8, readByte9));
                v = pVar;
                break;
            case 8:
                v = x.readExternal(objectInput);
                break;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                ConcurrentHashMap<String, h> concurrentHashMap = h.a;
                String readUTF = objectInput.readUTF();
                ConcurrentHashMap<String, h> concurrentHashMap2 = h.a;
                if (concurrentHashMap2.isEmpty()) {
                    h.B(m.f9736c);
                    h.B(v.f9755c);
                    h.B(r.f9753c);
                    h.B(o.f9738d);
                    j jVar2 = j.f9719c;
                    h.B(jVar2);
                    concurrentHashMap2.putIfAbsent("Hijrah", jVar2);
                    h.f9718b.putIfAbsent("islamic", jVar2);
                    Iterator it = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
                    while (it.hasNext()) {
                        h hVar = (h) it.next();
                        h.a.putIfAbsent(hVar.y(), hVar);
                        String v2 = hVar.v();
                        if (v2 != null) {
                            h.f9718b.putIfAbsent(v2, hVar);
                        }
                    }
                }
                h hVar2 = h.a.get(readUTF);
                if (hVar2 != null || (hVar2 = h.f9718b.get(readUTF)) != null) {
                    v = hVar2;
                    break;
                } else {
                    throw new l.c.a.a(e.a.d.a.a.k("Unknown chronology: ", readUTF));
                }
                break;
            case 12:
                v = ((b) objectInput.readObject()).t((l.c.a.g) objectInput.readObject());
                break;
            case 13:
                v = ((c) objectInput.readObject()).t((l.c.a.q) objectInput.readObject()).T((l.c.a.p) objectInput.readObject());
                break;
        }
        this.f9754b = v;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.a;
        Object obj = this.f9754b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                p pVar = (p) obj;
                Objects.requireNonNull(pVar);
                objectOutput.writeInt(pVar.get(l.c.a.w.a.YEAR));
                objectOutput.writeByte(pVar.get(l.c.a.w.a.MONTH_OF_YEAR));
                objectOutput.writeByte(pVar.get(l.c.a.w.a.DAY_OF_MONTH));
                return;
            case 2:
                objectOutput.writeByte(((q) obj).f9750g);
                return;
            case 3:
                k kVar = (k) obj;
                Objects.requireNonNull(kVar);
                objectOutput.writeInt(kVar.get(l.c.a.w.a.YEAR));
                objectOutput.writeByte(kVar.get(l.c.a.w.a.MONTH_OF_YEAR));
                objectOutput.writeByte(kVar.get(l.c.a.w.a.DAY_OF_MONTH));
                return;
            case 4:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 5:
                s sVar = (s) obj;
                Objects.requireNonNull(sVar);
                objectOutput.writeInt(sVar.get(l.c.a.w.a.YEAR));
                objectOutput.writeByte(sVar.get(l.c.a.w.a.MONTH_OF_YEAR));
                objectOutput.writeByte(sVar.get(l.c.a.w.a.DAY_OF_MONTH));
                return;
            case 6:
                ((t) obj).writeExternal(objectOutput);
                return;
            case 7:
                w wVar = (w) obj;
                Objects.requireNonNull(wVar);
                objectOutput.writeInt(wVar.get(l.c.a.w.a.YEAR));
                objectOutput.writeByte(wVar.get(l.c.a.w.a.MONTH_OF_YEAR));
                objectOutput.writeByte(wVar.get(l.c.a.w.a.DAY_OF_MONTH));
                return;
            case 8:
                ((x) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((h) obj).y());
                return;
            case 12:
                d dVar = (d) obj;
                objectOutput.writeObject(dVar.a);
                objectOutput.writeObject(dVar.f9715b);
                return;
            case 13:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.a);
                objectOutput.writeObject(gVar.f9716b);
                objectOutput.writeObject(gVar.f9717c);
                return;
        }
    }
}
