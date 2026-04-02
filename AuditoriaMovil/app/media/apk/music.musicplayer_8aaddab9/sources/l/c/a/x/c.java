package l.c.a.x;

import e.j.d.w;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: c  reason: collision with root package name */
    public List<String> f9825c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentNavigableMap<String, a> f9826d = new ConcurrentSkipListMap();

    /* loaded from: classes2.dex */
    public static class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f9827b;

        /* renamed from: c  reason: collision with root package name */
        public final short[] f9828c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceArray<Object> f9829d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f9829d = atomicReferenceArray;
            this.a = str;
            this.f9827b = strArr;
            this.f9828c = sArr;
        }

        public String toString() {
            return this.a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            e(inputStream);
        } catch (Exception e2) {
            throw new g("Unable to load TZDB time-zone rules", e2);
        }
    }

    @Override // l.c.a.x.i
    public f b(String str, boolean z) {
        f fVar;
        w.k0(str, "zoneId");
        a value = this.f9826d.lastEntry().getValue();
        int binarySearch = Arrays.binarySearch(value.f9827b, str);
        if (binarySearch < 0) {
            fVar = null;
        } else {
            try {
                short s = value.f9828c[binarySearch];
                Object obj = value.f9829d.get(s);
                if (obj instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    obj = l.c.a.x.a.b(dataInputStream.readByte(), dataInputStream);
                    value.f9829d.set(s, obj);
                }
                fVar = (f) obj;
            } catch (Exception e2) {
                StringBuilder B = e.a.d.a.a.B("Invalid binary time-zone data: TZDB:", str, ", version: ");
                B.append(value.a);
                throw new g(B.toString(), e2);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new g(e.a.d.a.a.k("Unknown time-zone ID: ", str));
    }

    @Override // l.c.a.x.i
    public Set<String> c() {
        return new HashSet(this.f9825c);
    }

    public final boolean e(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                int readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                boolean z = false;
                for (int i2 = 0; i2 < readShort; i2++) {
                    strArr[i2] = dataInputStream.readUTF();
                }
                int readShort2 = dataInputStream.readShort();
                String[] strArr2 = new String[readShort2];
                for (int i3 = 0; i3 < readShort2; i3++) {
                    strArr2[i3] = dataInputStream.readUTF();
                }
                this.f9825c = Arrays.asList(strArr2);
                int readShort3 = dataInputStream.readShort();
                Object[] objArr = new Object[readShort3];
                for (int i4 = 0; i4 < readShort3; i4++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[i4] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (int i5 = 0; i5 < readShort; i5++) {
                    int readShort4 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort4];
                    short[] sArr = new short[readShort4];
                    for (int i6 = 0; i6 < readShort4; i6++) {
                        strArr3[i6] = strArr2[dataInputStream.readShort()];
                        sArr[i6] = dataInputStream.readShort();
                    }
                    hashSet.add(new a(strArr[i5], strArr3, sArr, atomicReferenceArray));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    a putIfAbsent = this.f9826d.putIfAbsent(aVar.a, aVar);
                    if (putIfAbsent != null && !putIfAbsent.a.equals(aVar.a)) {
                        StringBuilder y = e.a.d.a.a.y("Data already loaded for TZDB time-zone rules version: ");
                        y.append(aVar.a);
                        throw new g(y.toString());
                    }
                    z = true;
                }
                return z;
            }
            throw new StreamCorruptedException("File format not recognised");
        }
        throw new StreamCorruptedException("File format not recognised");
    }

    public String toString() {
        return "TZDB";
    }
}
