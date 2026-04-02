package l.c.a.x;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import l.c.a.q;
/* loaded from: classes2.dex */
public final class e implements Serializable {
    public final l.c.a.h a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f9832b;

    /* renamed from: c  reason: collision with root package name */
    public final l.c.a.b f9833c;

    /* renamed from: d  reason: collision with root package name */
    public final l.c.a.g f9834d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9835e;

    /* renamed from: f  reason: collision with root package name */
    public final a f9836f;

    /* renamed from: g  reason: collision with root package name */
    public final q f9837g;

    /* renamed from: h  reason: collision with root package name */
    public final q f9838h;

    /* renamed from: i  reason: collision with root package name */
    public final q f9839i;

    /* loaded from: classes2.dex */
    public enum a {
        UTC,
        WALL,
        STANDARD;

        public l.c.a.f createDateTime(l.c.a.f fVar, q qVar, q qVar2) {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 2 ? fVar : fVar.g0(qVar2.f9708g - qVar.f9708g) : fVar.g0(qVar2.f9708g - q.f9705d.f9708g);
        }
    }

    public e(l.c.a.h hVar, int i2, l.c.a.b bVar, l.c.a.g gVar, int i3, a aVar, q qVar, q qVar2, q qVar3) {
        this.a = hVar;
        this.f9832b = (byte) i2;
        this.f9833c = bVar;
        this.f9834d = gVar;
        this.f9835e = i3;
        this.f9836f = aVar;
        this.f9837g = qVar;
        this.f9838h = qVar2;
        this.f9839i = qVar3;
    }

    public static e a(DataInput dataInput) throws IOException {
        int i2;
        int readInt = dataInput.readInt();
        l.c.a.h of = l.c.a.h.of(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        l.c.a.b of2 = i4 == 0 ? null : l.c.a.b.of(i4);
        int i5 = (507904 & readInt) >>> 14;
        a aVar = a.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        int readInt2 = i5 == 31 ? dataInput.readInt() : i5 * 3600;
        q K = q.K(i6 == 255 ? dataInput.readInt() : (i6 - 128) * 900);
        q K2 = i7 == 3 ? q.K(dataInput.readInt()) : q.K((i7 * 1800) + K.f9708g);
        q K3 = i8 == 3 ? q.K(dataInput.readInt()) : q.K((i8 * 1800) + K.f9708g);
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        long j2 = ((readInt2 % 86400) + 86400) % 86400;
        l.c.a.g gVar = l.c.a.g.a;
        l.c.a.w.a.SECOND_OF_DAY.checkValidValue(j2);
        int i9 = (int) (j2 / 3600);
        long j3 = j2 - (i9 * 3600);
        return new e(of, i3, of2, l.c.a.g.u(i9, (int) (j3 / 60), (int) (j3 - (i2 * 60)), 0), readInt2 >= 0 ? readInt2 / 86400 : ((readInt2 + 1) / 86400) - 1, aVar, K, K2, K3);
    }

    private Object writeReplace() {
        return new l.c.a.x.a((byte) 3, this);
    }

    public void b(DataOutput dataOutput) throws IOException {
        int T = (this.f9835e * 86400) + this.f9834d.T();
        int i2 = this.f9837g.f9708g;
        int i3 = this.f9838h.f9708g - i2;
        int i4 = this.f9839i.f9708g - i2;
        byte b2 = (T % 3600 != 0 || T > 86400) ? (byte) 31 : T == 86400 ? (byte) 24 : this.f9834d.f9685d;
        int i5 = i2 % 900 == 0 ? (i2 / 900) + 128 : 255;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        int i7 = (i4 == 0 || i4 == 1800 || i4 == 3600) ? i4 / 1800 : 3;
        l.c.a.b bVar = this.f9833c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.f9832b + 32) << 22) + ((bVar == null ? 0 : bVar.getValue()) << 19) + (b2 << 14) + (this.f9836f.ordinal() << 12) + (i5 << 4) + (i6 << 2) + i7);
        if (b2 == 31) {
            dataOutput.writeInt(T);
        }
        if (i5 == 255) {
            dataOutput.writeInt(i2);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.f9838h.f9708g);
        }
        if (i7 == 3) {
            dataOutput.writeInt(this.f9839i.f9708g);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.a == eVar.a && this.f9832b == eVar.f9832b && this.f9833c == eVar.f9833c && this.f9836f == eVar.f9836f && this.f9835e == eVar.f9835e && this.f9834d.equals(eVar.f9834d) && this.f9837g.equals(eVar.f9837g) && this.f9838h.equals(eVar.f9838h) && this.f9839i.equals(eVar.f9839i);
        }
        return false;
    }

    public int hashCode() {
        int T = ((this.f9834d.T() + this.f9835e) << 15) + (this.a.ordinal() << 11) + ((this.f9832b + 32) << 5);
        l.c.a.b bVar = this.f9833c;
        return ((this.f9837g.f9708g ^ (this.f9836f.ordinal() + (T + ((bVar == null ? 7 : bVar.ordinal()) << 2)))) ^ this.f9838h.f9708g) ^ this.f9839i.f9708g;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("TransitionRule[");
        q qVar = this.f9838h;
        q qVar2 = this.f9839i;
        Objects.requireNonNull(qVar);
        y.append(qVar2.f9708g - qVar.f9708g > 0 ? "Gap " : "Overlap ");
        y.append(this.f9838h);
        y.append(" to ");
        y.append(this.f9839i);
        y.append(", ");
        l.c.a.b bVar = this.f9833c;
        if (bVar != null) {
            byte b2 = this.f9832b;
            if (b2 == -1) {
                y.append(bVar.name());
                y.append(" on or before last day of ");
                y.append(this.a.name());
            } else if (b2 < 0) {
                y.append(bVar.name());
                y.append(" on or before last day minus ");
                y.append((-this.f9832b) - 1);
                y.append(" of ");
                y.append(this.a.name());
            } else {
                y.append(bVar.name());
                y.append(" on or after ");
                y.append(this.a.name());
                y.append(' ');
                y.append((int) this.f9832b);
            }
        } else {
            y.append(this.a.name());
            y.append(' ');
            y.append((int) this.f9832b);
        }
        y.append(" at ");
        if (this.f9835e == 0) {
            y.append(this.f9834d);
        } else {
            long T = (this.f9835e * 24 * 60) + (this.f9834d.T() / 60);
            long G = w.G(T, 60L);
            if (G < 10) {
                y.append(0);
            }
            y.append(G);
            y.append(CoreConstants.COLON_CHAR);
            long H = w.H(T, 60);
            if (H < 10) {
                y.append(0);
            }
            y.append(H);
        }
        y.append(" ");
        y.append(this.f9836f);
        y.append(", standard offset ");
        y.append(this.f9837g);
        y.append(']');
        return y.toString();
    }
}
