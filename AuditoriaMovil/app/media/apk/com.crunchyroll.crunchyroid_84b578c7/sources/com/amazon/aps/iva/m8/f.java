package com.amazon.aps.iva.m8;

import com.amazon.aps.iva.q.c0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public final class f {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(a[] aVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (a aVar : aVarArr) {
            i2 += (((((aVar.g * 2) + 8) - 1) & (-8)) / 8) + (aVar.e * 2) + b(aVar.a, aVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, g.c)) {
            int length = aVarArr.length;
            while (i < length) {
                a aVar2 = aVarArr[i];
                l(byteArrayOutputStream, aVar2, b(aVar2.a, aVar2.b, bArr));
                n(byteArrayOutputStream, aVar2);
                k(byteArrayOutputStream, aVar2);
                m(byteArrayOutputStream, aVar2);
                i++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                l(byteArrayOutputStream, aVar3, b(aVar3.a, aVar3.b, bArr));
            }
            int length2 = aVarArr.length;
            while (i < length2) {
                a aVar4 = aVarArr[i];
                n(byteArrayOutputStream, aVar4);
                k(byteArrayOutputStream, aVar4);
                m(byteArrayOutputStream, aVar4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static String b(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = g.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g.d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                return defpackage.b.c(defpackage.c.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    str2 = str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static int c(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(c0.a("Unexpected flag: ", i));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static int[] d(int i, ByteArrayInputStream byteArrayInputStream) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += b.e(byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static a[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = g.f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(g.a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int d = (int) b.d(1, fileInputStream);
                    byte[] c = b.c(fileInputStream, (int) b.d(4, fileInputStream), (int) b.d(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                        try {
                            a[] f = f(byteArrayInputStream, d, aVarArr);
                            byteArrayInputStream.close();
                            return f;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, g.g)) {
            int e = b.e(fileInputStream);
            byte[] c2 = b.c(fileInputStream, (int) b.d(4, fileInputStream), (int) b.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
                try {
                    a[] g = g(byteArrayInputStream2, bArr2, e, aVarArr);
                    byteArrayInputStream2.close();
                    return g;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static a[] f(ByteArrayInputStream byteArrayInputStream, int i, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i == aVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int e = b.e(byteArrayInputStream);
                iArr[i2] = b.e(byteArrayInputStream);
                strArr[i2] = new String(b.b(e, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                a aVar = aVarArr[i3];
                if (aVar.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    aVar.e = i4;
                    aVar.h = d(i4, byteArrayInputStream);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, a[] aVarArr) throws IOException {
        a aVar;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i == aVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                b.e(byteArrayInputStream);
                String str2 = new String(b.b(b.e(byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long d = b.d(4, byteArrayInputStream);
                int e = b.e(byteArrayInputStream);
                if (aVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < aVarArr.length; i3++) {
                        if (aVarArr[i3].b.equals(str)) {
                            aVar = aVarArr[i3];
                            break;
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                    aVar.d = d;
                    int[] d2 = d(e, byteArrayInputStream);
                    if (Arrays.equals(bArr, g.e)) {
                        aVar.e = e;
                        aVar.h = d2;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] h(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, g.b)) {
            int d = (int) b.d(1, fileInputStream);
            byte[] c = b.c(fileInputStream, (int) b.d(4, fileInputStream), (int) b.d(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
                try {
                    a[] i = i(byteArrayInputStream, str, d);
                    byteArrayInputStream.close();
                    return i;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static a[] i(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i];
        for (int i2 = 0; i2 < i; i2++) {
            int e = b.e(byteArrayInputStream);
            int e2 = b.e(byteArrayInputStream);
            aVarArr[i2] = new a(str, new String(b.b(e, byteArrayInputStream), StandardCharsets.UTF_8), b.d(4, byteArrayInputStream), e2, (int) b.d(4, byteArrayInputStream), (int) b.d(4, byteArrayInputStream), new int[e2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            a aVar = aVarArr[i3];
            int available = byteArrayInputStream.available() - aVar.f;
            int i4 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = aVar.i;
                if (available2 <= available) {
                    break;
                }
                i4 += b.e(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i4), 1);
                for (int e3 = b.e(byteArrayInputStream); e3 > 0; e3--) {
                    b.e(byteArrayInputStream);
                    int d = (int) b.d(1, byteArrayInputStream);
                    if (d != 6 && d != 7) {
                        while (d > 0) {
                            b.d(1, byteArrayInputStream);
                            for (int d2 = (int) b.d(1, byteArrayInputStream); d2 > 0; d2--) {
                                b.e(byteArrayInputStream);
                            }
                            d--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                aVar.h = d(aVar.e, byteArrayInputStream);
                int i5 = aVar.g;
                BitSet valueOf = BitSet.valueOf(b.b(((((i5 * 2) + 8) - 1) & (-8)) / 8, byteArrayInputStream));
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = 2;
                    if (!valueOf.get(c(2, i6, i5))) {
                        i7 = 0;
                    }
                    if (valueOf.get(c(4, i6, i5))) {
                        i7 |= 4;
                    }
                    if (i7 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i6));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return aVarArr;
    }

    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = g.a;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                b.g(byteArrayOutputStream2, aVarArr.length);
                int i2 = 2;
                int i3 = 2;
                for (a aVar : aVarArr) {
                    b.f(byteArrayOutputStream2, aVar.c, 4);
                    b.f(byteArrayOutputStream2, aVar.d, 4);
                    b.f(byteArrayOutputStream2, aVar.g, 4);
                    String b2 = b(aVar.a, aVar.b, bArr2);
                    int length2 = b2.getBytes(StandardCharsets.UTF_8).length;
                    b.g(byteArrayOutputStream2, length2);
                    i3 = i3 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(b2.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    h hVar = new h(c.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(hVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    for (int i5 = 0; i5 < aVarArr.length; i5++) {
                        try {
                            a aVar2 = aVarArr[i5];
                            b.g(byteArrayOutputStream3, i5);
                            b.g(byteArrayOutputStream3, aVar2.e);
                            i4 = i4 + 2 + 2 + (aVar2.e * 2);
                            k(byteArrayOutputStream3, aVar2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i4 == byteArray2.length) {
                        h hVar2 = new h(c.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(hVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < aVarArr.length) {
                            try {
                                a aVar3 = aVarArr[i6];
                                int i8 = i;
                                for (Map.Entry<Integer, Integer> entry : aVar3.i.entrySet()) {
                                    i8 |= entry.getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream4, aVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream5, aVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                b.g(byteArrayOutputStream2, i6);
                                int length3 = byteArray3.length + i2 + byteArray4.length;
                                int i9 = i7 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                b.f(byteArrayOutputStream2, length3, 4);
                                b.g(byteArrayOutputStream2, i8);
                                byteArrayOutputStream2.write(byteArray3);
                                byteArrayOutputStream2.write(byteArray4);
                                i7 = i9 + length3;
                                i6++;
                                arrayList3 = arrayList4;
                                i = 0;
                                i2 = 2;
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i7 == byteArray5.length) {
                            h hVar3 = new h(c.METHODS, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(hVar3);
                            long j = 4;
                            long size = j + j + 4 + (arrayList2.size() * 16);
                            b.f(byteArrayOutputStream, arrayList2.size(), 4);
                            int i10 = 0;
                            while (i10 < arrayList2.size()) {
                                h hVar4 = (h) arrayList2.get(i10);
                                b.f(byteArrayOutputStream, hVar4.a.getValue(), 4);
                                b.f(byteArrayOutputStream, size, 4);
                                boolean z = hVar4.c;
                                byte[] bArr3 = hVar4.b;
                                if (z) {
                                    byte[] a2 = b.a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    b.f(byteArrayOutputStream, a2.length, 4);
                                    b.f(byteArrayOutputStream, bArr3.length, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    b.f(byteArrayOutputStream, bArr3.length, 4);
                                    b.f(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i10++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i11));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = g.b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a3 = a(aVarArr, bArr4);
            b.f(byteArrayOutputStream, aVarArr.length, 1);
            b.f(byteArrayOutputStream, a3.length, 4);
            byte[] a4 = b.a(a3);
            b.f(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = g.d;
        if (Arrays.equals(bArr, bArr5)) {
            b.f(byteArrayOutputStream, aVarArr.length, 1);
            for (a aVar4 : aVarArr) {
                String b3 = b(aVar4.a, aVar4.b, bArr5);
                b.g(byteArrayOutputStream, b3.getBytes(StandardCharsets.UTF_8).length);
                b.g(byteArrayOutputStream, aVar4.h.length);
                b.f(byteArrayOutputStream, aVar4.i.size() * 4, 4);
                b.f(byteArrayOutputStream, aVar4.c, 4);
                byteArrayOutputStream.write(b3.getBytes(StandardCharsets.UTF_8));
                for (Integer num : aVar4.i.keySet()) {
                    b.g(byteArrayOutputStream, num.intValue());
                    b.g(byteArrayOutputStream, 0);
                }
                for (int i12 : aVar4.h) {
                    b.g(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        byte[] bArr6 = g.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a5 = a(aVarArr, bArr6);
            b.f(byteArrayOutputStream, aVarArr.length, 1);
            b.f(byteArrayOutputStream, a5.length, 4);
            byte[] a6 = b.a(a5);
            b.f(byteArrayOutputStream, a6.length, 4);
            byteArrayOutputStream.write(a6);
            return true;
        }
        byte[] bArr7 = g.e;
        if (Arrays.equals(bArr, bArr7)) {
            b.g(byteArrayOutputStream, aVarArr.length);
            for (a aVar5 : aVarArr) {
                String b4 = b(aVar5.a, aVar5.b, bArr7);
                b.g(byteArrayOutputStream, b4.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = aVar5.i;
                b.g(byteArrayOutputStream, treeMap.size());
                b.g(byteArrayOutputStream, aVar5.h.length);
                b.f(byteArrayOutputStream, aVar5.c, 4);
                byteArrayOutputStream.write(b4.getBytes(StandardCharsets.UTF_8));
                for (Integer num2 : treeMap.keySet()) {
                    b.g(byteArrayOutputStream, num2.intValue());
                }
                for (int i13 : aVar5.h) {
                    b.g(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        return false;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i = 0;
        for (int i2 : aVar.h) {
            Integer valueOf = Integer.valueOf(i2);
            b.g(byteArrayOutputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        b.g(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        b.g(byteArrayOutputStream, aVar.e);
        b.f(byteArrayOutputStream, aVar.f, 4);
        b.f(byteArrayOutputStream, aVar.c, 4);
        b.f(byteArrayOutputStream, aVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        byte[] bArr = new byte[((((aVar.g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i = intValue2 & 2;
            int i2 = aVar.g;
            if (i != 0) {
                int c = c(2, intValue, i2);
                int i3 = c / 8;
                bArr[i3] = (byte) ((1 << (c % 8)) | bArr[i3]);
            }
            if ((intValue2 & 4) != 0) {
                int c2 = c(4, intValue, i2);
                int i4 = c2 / 8;
                bArr[i4] = (byte) ((1 << (c2 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : aVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                b.g(byteArrayOutputStream, intValue - i);
                b.g(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
