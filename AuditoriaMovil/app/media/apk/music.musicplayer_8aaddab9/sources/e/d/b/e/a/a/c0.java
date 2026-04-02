package e.d.b.e.a.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class c0 extends e.d.b.e.a.c.s {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final File f6740b;

    /* renamed from: c  reason: collision with root package name */
    public final NavigableMap<Long, File> f6741c = new TreeMap();

    public c0(File file, File file2) throws IOException {
        this.a = file;
        this.f6740b = file2;
        ArrayList arrayList = (ArrayList) i2.a(file, file2);
        if (arrayList.isEmpty()) {
            throw new p0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            File file3 = (File) arrayList.get(i2);
            this.f6741c.put(Long.valueOf(j2), file3);
            j2 += file3.length();
        }
    }

    @Override // e.d.b.e.a.c.s
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.f6741c.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // e.d.b.e.a.c.s
    public final InputStream f(long j2, long j3) throws IOException {
        if (j2 < 0 || j3 < 0) {
            throw new p0(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2 + j3;
        if (j4 <= a()) {
            Long floorKey = this.f6741c.floorKey(Long.valueOf(j2));
            Long floorKey2 = this.f6741c.floorKey(Long.valueOf(j4));
            if (floorKey.equals(floorKey2)) {
                return new b0(h(j2, floorKey), j3);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(h(j2, floorKey));
            Collection<File> values = this.f6741c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new r1(Collections.enumeration(values)));
            }
            arrayList.add(new b0(new FileInputStream((File) this.f6741c.get(floorKey2)), j3 - (floorKey2.longValue() - j2)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new p0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j4)));
    }

    public final InputStream h(long j2, Long l2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f6741c.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new p0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l2));
    }
}
