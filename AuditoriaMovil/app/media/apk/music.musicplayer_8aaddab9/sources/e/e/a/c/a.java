package e.e.a.c;

import e.e.a.c.b.b;
import e.e.a.c.b.c;
import e.e.a.c.b.d;
import e.e.a.c.b.e;
import e.e.a.c.b.f;
import e.e.a.c.b.g;
import e.e.a.c.b.h;
import e.e.a.c.b.i;
import e.e.a.c.b.j;
import e.e.a.c.b.k;
import e.e.a.c.b.l;
import e.e.a.c.b.m;
import e.h.g.s1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public final e.e.a.c.b.a a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7935b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7936c;

    /* renamed from: d  reason: collision with root package name */
    public final d f7937d;

    /* renamed from: e  reason: collision with root package name */
    public final e f7938e;

    /* renamed from: f  reason: collision with root package name */
    public final f f7939f;

    /* renamed from: g  reason: collision with root package name */
    public final g f7940g;

    /* renamed from: h  reason: collision with root package name */
    public final h f7941h;

    /* renamed from: i  reason: collision with root package name */
    public final i f7942i;

    /* renamed from: j  reason: collision with root package name */
    public final j f7943j;

    /* renamed from: k  reason: collision with root package name */
    public final k f7944k;

    /* renamed from: l  reason: collision with root package name */
    public final l f7945l;

    /* renamed from: m  reason: collision with root package name */
    public final m f7946m;

    public a(e.e.a.c.b.n.b bVar) {
        e.e.a.c.b.a aVar = new e.e.a.c.b.a();
        this.a = aVar;
        c cVar = new c();
        this.f7936c = cVar;
        d dVar = new d();
        this.f7937d = dVar;
        e eVar = new e();
        this.f7938e = eVar;
        f fVar = new f();
        this.f7939f = fVar;
        h hVar = new h();
        this.f7941h = hVar;
        i iVar = new i();
        this.f7942i = iVar;
        k kVar = new k();
        this.f7944k = kVar;
        l lVar = new l();
        this.f7945l = lVar;
        this.f7946m = new m();
        b bVar2 = new b();
        this.f7935b = bVar2;
        this.f7940g = new g();
        this.f7943j = new j(aVar, cVar, bVar2, dVar, eVar, fVar, hVar, iVar, kVar, lVar, bVar);
    }

    public Object a(String str, byte[] bArr) {
        ObjectInputStream objectInputStream;
        if (bArr.length == 0) {
            throw new e.e.a.a.b(String.format("%s key's value is zero bytes for deserialize", str));
        }
        byte b2 = bArr[0];
        Objects.requireNonNull(this.a);
        if (b2 == -7) {
            Objects.requireNonNull(this.a);
            return Boolean.valueOf(bArr[1] != 0);
        }
        Objects.requireNonNull(this.f7941h);
        if (b2 == -3) {
            return Integer.valueOf(this.f7941h.a(bArr, 0));
        }
        Objects.requireNonNull(this.f7942i);
        if (b2 == -4) {
            Objects.requireNonNull(this.f7942i);
            return Long.valueOf((bArr[8] & 255) + ((bArr[7] & 255) << 8) + ((bArr[6] & 255) << 16) + ((bArr[5] & 255) << 24) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 40) + ((bArr[2] & 255) << 48) + (bArr[1] << 56));
        }
        Objects.requireNonNull(this.f7938e);
        if (b2 == -5) {
            Objects.requireNonNull(this.f7938e);
            return Double.valueOf(Double.longBitsToDouble((bArr[8] & 255) + ((bArr[7] & 255) << 8) + ((bArr[6] & 255) << 16) + ((bArr[5] & 255) << 24) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 40) + ((bArr[2] & 255) << 48) + (bArr[1] << 56)));
        }
        Objects.requireNonNull(this.f7939f);
        if (b2 == -6) {
            Objects.requireNonNull(this.f7939f);
            return Float.valueOf(Float.intBitsToFloat((bArr[4] & 255) + ((bArr[3] & 255) << 8) + ((bArr[2] & 255) << 16) + (bArr[1] << 24)));
        }
        Objects.requireNonNull(this.f7945l);
        if (b2 == -2) {
            Objects.requireNonNull(this.f7945l);
            return new String(bArr, 1, bArr.length - 1);
        }
        Objects.requireNonNull(this.f7946m);
        if (b2 == -1) {
            Objects.requireNonNull(this.f7946m);
            byte b3 = bArr[0];
            if (b3 == -1) {
                HashSet hashSet = new HashSet();
                int i2 = 1;
                while (i2 < bArr.length) {
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(bArr, i2, bArr2, 0, 4);
                    int i3 = (bArr2[3] & 255) + ((bArr2[2] & 255) << 8) + ((bArr2[1] & 255) << 16) + (bArr2[0] << 24);
                    byte[] bArr3 = new byte[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        bArr3[i4] = bArr[i2 + i4 + 4];
                    }
                    hashSet.add(new String(bArr3));
                    i2 += i3 + 4;
                }
                return Collections.unmodifiableSet(hashSet);
            }
            throw new ClassCastException(String.format("Set<String> cannot be deserialized in '%s' flag type", Byte.valueOf(b3)));
        }
        Objects.requireNonNull(this.f7943j);
        if (b2 == -11) {
            j jVar = this.f7943j;
            e.e.a.c.b.a aVar = jVar.a;
            c cVar = jVar.f7947b;
            b bVar = jVar.f7948c;
            d dVar = jVar.f7949d;
            e eVar = jVar.f7950e;
            f fVar = jVar.f7951f;
            h hVar = jVar.f7952g;
            i iVar = jVar.f7953h;
            k kVar = jVar.f7954i;
            l lVar = jVar.f7955j;
            e.e.a.c.b.n.b bVar2 = jVar.f7956k;
            e.e.a.c.b.n.c.a aVar2 = new e.e.a.c.b.n.c.a(aVar, cVar, bVar, dVar, eVar, fVar, hVar, iVar, kVar, lVar, bVar2);
            aVar2.f7958c = 0;
            aVar2.f7960e = str;
            aVar2.f7959d = bArr;
            if (bArr.length != 0) {
                aVar2.f7958c = 1;
                Objects.requireNonNull(hVar);
                int i5 = aVar2.f7958c;
                int i6 = i5 + 5;
                byte[] bArr4 = aVar2.f7959d;
                int length = bArr4.length;
                if (i6 <= length) {
                    byte b4 = bArr4[i5];
                    if (b4 == -3) {
                        hVar.a(bArr4, i5);
                        aVar2.f7958c += 5;
                        String str2 = aVar2.f7960e;
                        if (bVar2.a.containsKey(str2)) {
                            try {
                                e.e.a.c.b.n.a newInstance = bVar2.a.get(str2).newInstance();
                                newInstance.c(aVar2);
                                return newInstance;
                            } catch (Exception e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        throw new UnsupportedClassVersionError(String.format("Cannot find Persistable type for '%s' key. Please, add it through 'registerPersistable' builder method.", str2));
                    }
                    throw new ClassCastException(String.format("int cannot be deserialized in '%s' flag type", Byte.valueOf(b4)));
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Can't read out of bounds array (expected size: %s bytes > disk size: %s bytes) for %s! keyMay be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?", aVar2.f7960e, Integer.valueOf(i6), Integer.valueOf(length)));
            }
            throw new UnsupportedOperationException(String.format("Cannot deserialize empty byte array for %s key! May be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?", aVar2.f7960e));
        }
        Objects.requireNonNull(this.f7944k);
        if (b2 == -9) {
            Objects.requireNonNull(this.f7944k);
            return Short.valueOf((short) ((bArr[1] << 8) + (bArr[2] & 255)));
        }
        Objects.requireNonNull(this.f7936c);
        if (b2 == -8) {
            Objects.requireNonNull(this.f7936c);
            return Byte.valueOf(bArr[1]);
        }
        Objects.requireNonNull(this.f7935b);
        if (b2 == -12) {
            Objects.requireNonNull(this.f7935b);
            int length2 = bArr.length - 1;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArr, 1, bArr5, 0, length2);
            return bArr5;
        }
        Objects.requireNonNull(this.f7937d);
        if (b2 == -10) {
            Objects.requireNonNull(this.f7937d);
            return Character.valueOf((char) ((bArr[1] << 8) + (bArr[2] & 255)));
        }
        Objects.requireNonNull(this.f7940g);
        if (!(b2 == -13)) {
            throw new UnsupportedClassVersionError(String.format("Flag verification failed. Incorrect flag '%s'", Byte.valueOf(b2)));
        }
        Objects.requireNonNull(this.f7940g);
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Arrays.copyOfRange(bArr, 1, bArr.length)));
                try {
                    Map map = (Map) objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException unused) {
                    }
                    return map;
                } catch (Throwable th) {
                    th = th;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
        } catch (Exception e3) {
            s1.l(e3, true);
            return null;
        }
    }
}
