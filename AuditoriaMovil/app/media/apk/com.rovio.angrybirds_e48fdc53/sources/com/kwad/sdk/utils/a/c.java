package com.kwad.sdk.utils.a;

import android.text.TextUtils;
import com.flurry.android.Constants;
import com.kuaishou.weapon.p0.bh;
import com.kwad.sdk.utils.a.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final class c {
    private static final int PAGE_SIZE;
    private static final int[] aKP = {0, 1, 4, 4, 8, 8};
    private static final byte[] aKQ = new byte[0];
    private static final int aKR;
    private static final int aKS;
    private static final int aKT;
    private final String Tv;
    private final Map<String, b> aKU;
    private FileChannel aKW;
    private FileChannel aKX;
    private RandomAccessFile aKY;
    private RandomAccessFile aKZ;
    private MappedByteBuffer aLa;
    private MappedByteBuffer aLb;
    private com.kwad.sdk.utils.a.b aLc;
    private int aLd;
    private long aLe;
    private int aLh;
    private int aLi;
    private int aLj;
    private boolean aLk;
    private String aLl;
    private int aLm;
    private int aLo;
    private final String name;
    private final d aKV = com.kwad.sdk.utils.a.d.aLz;
    private final Map<String, a.b> aLf = new HashMap();
    private boolean aLg = false;
    private final ArrayList<e> aLn = new ArrayList<>();
    private boolean aLp = true;
    private final Executor aLq = new f();

    /* loaded from: classes3.dex */
    public static class a {
        static int aLs = 11;
        static final C0274c aLt = new C0274c(11);
        private final String Tv;
        private int aLo = 0;
        private b[] aLu;
        private final String name;

        public a(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            }
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            if (!str.endsWith("/")) {
                str = str + '/';
            }
            this.Tv = str;
            this.name = str2;
        }

        public final c Kx() {
            String str = this.Tv + this.name;
            c fY = C0274c.fY(str);
            if (fY == null) {
                synchronized (a.class) {
                    fY = C0274c.fY(str);
                    if (fY == null) {
                        fY = new c(this.Tv, this.name, this.aLu, this.aLo);
                        C0274c.b(str, fY);
                    }
                }
            }
            Integer num = C0274c.aLy.get(str);
            if (num != null) {
                C0274c.aLy.put(str, Integer.valueOf(num.intValue() + 1));
            } else {
                C0274c.aLy.put(str, 1);
            }
            return fY;
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T> {
        String Ky();

        T g(byte[] bArr, int i, int i2);

        byte[] o(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.utils.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0274c {
        private static Map<String, c> aLv;
        private static List<String> aLw;
        private static int aLx;
        public static Map<String, Integer> aLy;

        public C0274c(int i) {
            int size = getSize(i);
            aLv = new ConcurrentHashMap(size);
            aLy = new HashMap(size);
            aLw = new CopyOnWriteArrayList();
            aLx = i;
        }

        public static void b(String str, c cVar) {
            if (aLv == null) {
                aLv = new ConcurrentHashMap(getSize(aLx));
            }
            if (aLw == null) {
                aLw = new CopyOnWriteArrayList();
            }
            if (aLv.containsKey(str)) {
                aLw.remove(str);
            }
            aLw.add(str);
            aLv.put(str, cVar);
            if (aLv.size() > aLx) {
                Integer num = aLy.get(aLw.get(0));
                if (num != null && num.intValue() != 2) {
                    dq(aLx + 1);
                    return;
                }
                c cVar2 = aLv.get(aLw.get(0));
                if (cVar2 != null) {
                    cVar2.release();
                }
                aLv.remove(aLw.get(0));
                aLw.remove(0);
            }
        }

        private static void dq(int i) {
            d dVar = com.kwad.sdk.utils.a.d.aLz;
            dVar.i("Ks_UnionKv", "reSize:" + i);
            aLx = i;
        }

        public static c fY(String str) {
            if (aLv == null) {
                aLv = new ConcurrentHashMap(getSize(aLx));
            }
            if (aLw == null) {
                aLw = new CopyOnWriteArrayList();
            }
            c cVar = aLv.get(str);
            if (cVar != null) {
                aLw.remove(str);
                aLw.add(str);
                return cVar;
            }
            return null;
        }

        private static int getSize(int i) {
            return (int) ((i / 0.75f) + 1.0f);
        }

        public static void remove(String str) {
            List<String> list = aLw;
            if (list != null) {
                list.remove(str);
            }
            Map<String, c> map = aLv;
            if (map != null) {
                map.remove(str);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(String str, Exception exc);

        void e(String str, Throwable th);

        void i(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class e implements Comparable<e> {
        int end;
        int start;

        e(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.start - eVar.start;
        }
    }

    static {
        int KB = h.KB();
        PAGE_SIZE = KB;
        aKR = KB - 192;
        int max = Math.max(KB << 1, 16384);
        aKS = max;
        aKT = max << 1;
    }

    c(String str, String str2, b[] bVarArr, int i) {
        this.Tv = str;
        this.name = str2;
        this.aLo = i;
        HashMap hashMap = new HashMap();
        g gVar = g.aLH;
        hashMap.put(gVar.Ky(), gVar);
        if (bVarArr != null && bVarArr.length > 0) {
            for (b bVar : bVarArr) {
                String Ky = bVar.Ky();
                if (hashMap.containsKey(Ky)) {
                    fX("duplicate encoder tag:" + Ky);
                } else {
                    hashMap.put(Ky, bVar);
                }
            }
        }
        this.aKU = hashMap;
        synchronized (this.aLf) {
            com.kwad.sdk.utils.a.d.getExecutor().execute(new Runnable() { // from class: com.kwad.sdk.utils.a.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.Kf();
                }
            });
            while (!this.aLg) {
                try {
                    this.aLf.wait();
                } catch (InterruptedException e2) {
                }
            }
        }
    }

    private int B(int i, int i2) {
        if (i2 > 536870912) {
            IllegalStateException illegalStateException = new IllegalStateException("data size out of limit");
            if (com.kwad.library.a.a.mp.booleanValue()) {
                throw illegalStateException;
            }
            r(illegalStateException);
        }
        int i3 = PAGE_SIZE;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            int i4 = aKS;
            i = i <= i4 ? i << 1 : i + i4;
        }
        return i;
    }

    private void C(int i, int i2) {
        this.aLm += i2 - i;
        ArrayList<e> arrayList = this.aLn;
        if (arrayList != null) {
            arrayList.add(new e(i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Kf() {
        synchronized (this.aLf) {
            this.aLg = true;
            this.aLf.notify();
        }
        long nanoTime = System.nanoTime();
        if (!Ki() && this.aLo == 0) {
            Kg();
        }
        if (this.aLc == null) {
            this.aLc = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
        }
        if (this.aKV != null) {
            info("loading finish, data len:" + this.aLd + ", get keys:" + this.aLf.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0 A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:3:0x0038, B:5:0x003e, B:8:0x0046, B:9:0x0070, B:13:0x0081, B:17:0x009e, B:18:0x00ab, B:21:0x00be, B:22:0x00c2, B:24:0x00e1, B:26:0x00e8, B:28:0x0108, B:30:0x010e, B:35:0x0119, B:37:0x011f, B:39:0x0136, B:41:0x013e, B:43:0x0157, B:44:0x0164, B:46:0x0180, B:48:0x0186, B:51:0x01a0, B:16:0x0099, B:12:0x007e, B:54:0x01aa, B:56:0x01b4), top: B:63:0x0038, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Kg() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.a.c.Kg():void");
    }

    private boolean Kh() {
        com.kwad.sdk.utils.a.b bVar = new com.kwad.sdk.utils.a.b(this.aLd);
        MappedByteBuffer mappedByteBuffer = this.aLb;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.rewind();
            this.aLb.get(bVar.aKO, 0, this.aLd);
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aLc;
        if (bVar2 != null) {
            byte[] bArr = bVar2.aKO;
            byte[] bArr2 = bVar.aKO;
            for (int i = 0; i < this.aLd; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private boolean Ki() {
        File file = new File(this.Tv, this.name + ".kvc");
        File file2 = new File(this.Tv, this.name + bh.k);
        boolean z = true;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!ac(file)) {
                    Kq();
                    Kn();
                } else if (this.aLo == 0) {
                    if (a(this.aLc)) {
                        info("recover from c file");
                        try {
                            Kn();
                            return true;
                        } catch (Exception e2) {
                            e = e2;
                            r(e);
                            return z;
                        }
                    }
                    this.aLo = 1;
                }
            } else if (this.aLo != 0) {
                File file3 = new File(this.Tv, this.name + ".kva");
                File file4 = new File(this.Tv, this.name + ".kvb");
                if (file3.exists() && file4.exists()) {
                    h(file3, file4);
                }
            }
            return false;
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
        throw new java.lang.Exception("parse dara failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Kj() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.a.c.Kj():int");
    }

    private void Kk() {
        if (this.aLo == 0 || !this.aLp) {
            return;
        }
        Kl();
    }

    private boolean Kl() {
        int i = this.aLo;
        if (i == 1) {
            Executor executor = this.aLq;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: com.kwad.sdk.utils.a.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.Km();
                    }
                });
            }
        } else if (i == 2) {
            return Km();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean Km() {
        try {
            String str = this.Tv;
            File file = new File(str, this.name + bh.k);
            if (h.ad(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(this.aLd);
                randomAccessFile.write(this.aLc.aKO, 0, this.aLd);
                randomAccessFile.close();
                String str2 = this.Tv;
                File file2 = new File(str2, this.name + ".kvc");
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    g(new Exception("rename failed"));
                }
            }
        } catch (Exception e2) {
            r(e2);
        }
        return false;
    }

    private void Kn() {
        try {
            String str = this.Tv;
            h.h(new File(str, this.name + ".kvc"));
            String str2 = this.Tv;
            h.h(new File(str2, this.name + bh.k));
        } catch (Exception e2) {
            r(e2);
        }
    }

    private void Ko() {
        this.aLo = 1;
        h.closeQuietly(this.aKW);
        h.closeQuietly(this.aKX);
        this.aKW = null;
        this.aKX = null;
        this.aLa = null;
        this.aLb = null;
    }

    private void Kp() {
        if (this.aLo == 0) {
            try {
                a(this.aLa);
                a(this.aLb);
            } catch (Throwable th) {
                Ko();
            }
        }
        Kq();
        h.h(new File(this.Tv + this.name));
    }

    private void Kq() {
        this.aLd = 12;
        this.aLe = 0L;
        Kw();
        this.aLf.clear();
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar == null || bVar.aKO.length != PAGE_SIZE) {
            this.aLc = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
            return;
        }
        this.aLc.y(0, 0);
        this.aLc.g(4, 0L);
    }

    private void Kr() {
        com.kwad.sdk.utils.a.b bVar;
        com.kwad.sdk.utils.a.b bVar2 = this.aLc;
        if (bVar2 != null) {
            this.aLe ^= bVar2.A(this.aLh, this.aLi);
        }
        if (this.aLo == 0) {
            MappedByteBuffer mappedByteBuffer = this.aLa;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putInt(0, -1);
                b(this.aLa);
                this.aLa.putInt(0, this.aLd - 12);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aLb;
            if (mappedByteBuffer2 != null) {
                b(mappedByteBuffer2);
            }
        } else {
            if (this.aLk && (bVar = this.aLc) != null) {
                bVar.y(0, this.aLd - 12);
            }
            com.kwad.sdk.utils.a.b bVar3 = this.aLc;
            if (bVar3 != null) {
                bVar3.g(4, this.aLe);
            }
        }
        this.aLk = false;
        this.aLj = 0;
        this.aLi = 0;
    }

    private int Ks() {
        int i = this.aLd;
        if (i <= 16384) {
            return 4096;
        }
        return i <= 65536 ? 8192 : 16384;
    }

    private void Kt() {
        dn(this.aLi);
        int i = this.aLd;
        this.aLh = i;
        this.aLd = this.aLi + i;
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            bVar.position = i;
        }
        this.aLk = true;
    }

    private void Ku() {
        if (this.aLm < (Ks() << 1)) {
            if (this.aLn.size() < (this.aLd < 16384 ? 80 : 160)) {
                return;
            }
        }
        m21do(0);
    }

    private void Kv() {
        ArrayList<e> arrayList = this.aLn;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size() - 1;
        e eVar = this.aLn.get(size);
        while (size > 0) {
            size--;
            e eVar2 = this.aLn.get(size);
            if (eVar.start == eVar2.end) {
                eVar2.end = eVar.end;
                this.aLn.remove(size + 1);
            }
            eVar = eVar2;
        }
    }

    private void Kw() {
        this.aLm = 0;
        ArrayList<e> arrayList = this.aLn;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    private int a(String str, byte[] bArr, byte b2) {
        this.aLl = null;
        if (bArr.length < 2048) {
            return b(str, bArr, b2);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String KA = h.KA();
        if (!h.a(new File(this.Tv + this.name, KA), bArr)) {
            fX("save large value failed");
            return 0;
        }
        this.aLl = KA;
        byte[] bArr2 = new byte[32];
        KA.getBytes(0, 32, bArr2, 0);
        return b(str, bArr2, (byte) (b2 | 64));
    }

    private Object a(a.h hVar) {
        Exception exc;
        try {
            byte[] ae = h.ae(new File(this.Tv + this.name, (String) hVar.value));
            if (ae != null) {
                int i = ae[0] & Constants.UNKNOWN;
                String str = new String(ae, 1, i, com.kwad.sdk.utils.a.b.UTF_8);
                b bVar = this.aKU.get(str);
                if (bVar != null) {
                    int i2 = i + 1;
                    return bVar.g(ae, i2, ae.length - i2);
                }
                exc = new Exception("No encoder for tag:" + str);
            } else {
                exc = new Exception("Read object data failed");
            }
            g(exc);
            return null;
        } catch (Exception e2) {
            r(e2);
            return null;
        }
    }

    private String a(a.i iVar) {
        byte[] bytes;
        try {
            byte[] ae = h.ae(new File(this.Tv + this.name, (String) iVar.value));
            String str = new String(ae);
            return (ae == null || TextUtils.isEmpty(str) || (bytes = com.kwad.sdk.utils.a.b.j(ae, com.kwad.sdk.utils.a.b.fT(str)).getBytes()) == null || bytes.length == 0) ? "" : new String(bytes, com.kwad.sdk.utils.a.b.UTF_8);
        } catch (Exception e2) {
            r(e2);
        }
        return "";
    }

    private void a(byte b2, int i) {
        long d2 = this.aLe ^ d(1L, i);
        this.aLe = d2;
        if (this.aLo == 0) {
            MappedByteBuffer mappedByteBuffer = this.aLa;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, d2);
                this.aLa.put(i, b2);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aLb;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aLe);
                this.aLb.put(i, b2);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aLc;
            if (bVar != null) {
                bVar.g(4, d2);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aLc;
        if (bVar2 != null) {
            bVar2.aKO[i] = b2;
        }
    }

    private void a(byte b2, int i, int i2) {
        C(i, i2);
        byte b3 = (byte) (b2 | Byte.MIN_VALUE);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null && bVar.aKO != null) {
            this.aLe ^= ((this.aLc.aKO[i] ^ b3) & 255) << ((i & 7) << 3);
            this.aLc.aKO[i] = b3;
        }
        this.aLj = i;
    }

    private void a(int i, long j, int i2) {
        long d2 = d(j, i2) ^ this.aLe;
        this.aLe = d2;
        if (this.aLo == 0) {
            MappedByteBuffer mappedByteBuffer = this.aLa;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, d2);
                this.aLa.putInt(i2, i);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aLb;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aLe);
                this.aLb.putInt(i2, i);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aLc;
            if (bVar != null) {
                bVar.g(4, d2);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aLc;
        if (bVar2 != null) {
            bVar2.y(i2, i);
        }
    }

    private void a(int i, int[] iArr) {
        Map<String, a.b> map = this.aLf;
        if (map == null) {
            return;
        }
        for (a.b bVar : map.values()) {
            if (bVar.offset > i) {
                int i2 = iArr[(h.binarySearch(iArr, bVar.offset) << 1) + 1];
                bVar.offset -= i2;
                if (bVar.Kd() >= 6) {
                    ((a.j) bVar).start -= i2;
                }
            }
        }
    }

    private void a(String str, byte b2) {
        a(str, b2, aKP[b2]);
    }

    private void a(String str, byte b2, int i) {
        int fT = com.kwad.sdk.utils.a.b.fT(str);
        dm(fT);
        this.aLi = fT + 2 + i;
        Kt();
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            bVar.e(b2);
        }
        q(str, fT);
    }

    private static void a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4;
        if (i2 <= str.length() && i2 >= 0) {
            int i5 = 0;
            while (i5 < i2) {
                int i6 = i5 + 1;
                char charAt = str.charAt(i5);
                if (charAt < 128) {
                    i4 = i3 + 1;
                    bArr[i3] = (byte) (((byte) charAt) ^ 1);
                } else {
                    i4 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                }
                i5 = i6;
                i3 = i4;
            }
        }
    }

    private synchronized <T> void a(String str, T t, b<T> bVar) {
        fW(str);
        if (bVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Encoder is null");
            if (com.kwad.library.a.a.mp.booleanValue()) {
                throw illegalArgumentException;
            }
            r(illegalArgumentException);
            return;
        }
        String Ky = bVar.Ky();
        if (!Ky.isEmpty() && Ky.length() <= 50) {
            if (!this.aKU.containsKey(Ky)) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Encoder hasn't been registered");
                if (com.kwad.library.a.a.mp.booleanValue()) {
                    throw illegalArgumentException2;
                }
                r(illegalArgumentException2);
                return;
            } else if (t == null) {
                remove(str);
                return;
            } else {
                byte[] bArr = null;
                try {
                    bArr = bVar.o(t);
                } catch (Exception e2) {
                    r(e2);
                }
                if (bArr == null) {
                    remove(str);
                    return;
                }
                int fT = com.kwad.sdk.utils.a.b.fT(Ky);
                com.kwad.sdk.utils.a.b bVar2 = new com.kwad.sdk.utils.a.b(fT + 1 + bArr.length);
                bVar2.e((byte) fT);
                bVar2.fS(Ky);
                bVar2.n(bArr);
                a(str, t, bVar2.aKO, (a.h) this.aLf.get(str), (byte) 8);
                return;
            }
        }
        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Invalid encoder tag:" + Ky);
        if (com.kwad.library.a.a.mp.booleanValue()) {
            throw illegalArgumentException3;
        }
        r(illegalArgumentException3);
    }

    private void a(String str, Object obj, byte[] bArr, byte b2) {
        String str2;
        int length;
        int a2 = a(str, bArr, b2);
        if (a2 != 0) {
            String str3 = this.aLl;
            boolean z = str3 != null;
            if (z) {
                this.aLl = null;
                length = 32;
                str2 = str3;
            } else {
                str2 = obj;
                length = bArr.length;
            }
            this.aLf.put(str, b2 == 6 ? new a.i(this.aLh, a2, (String) str2, length, z) : b2 == 7 ? new a.C0273a(this.aLh, a2, str2, length, z) : new a.h(this.aLh, a2, str2, length, z));
            Kr();
        }
    }

    private void a(String str, Object obj, byte[] bArr, a.j jVar) {
        int a2 = a(str, bArr, jVar.Kd());
        if (a2 != 0) {
            String str2 = jVar.aKM ? (String) jVar.value : null;
            a(jVar.Kd(), jVar.start, jVar.offset + jVar.aKL);
            boolean z = this.aLl != null;
            jVar.start = this.aLh;
            jVar.offset = a2;
            jVar.aKM = z;
            if (z) {
                jVar.value = this.aLl;
                jVar.aKL = 32;
                this.aLl = null;
            } else {
                jVar.value = obj;
                jVar.aKL = bArr.length;
            }
            Kr();
            Ku();
            if (str2 != null) {
                h.h(new File(this.Tv + this.name, str2));
            }
        }
    }

    private void a(String str, Object obj, byte[] bArr, a.j jVar, byte b2) {
        if (jVar == null) {
            a(str, obj, bArr, b2);
        } else if (jVar.aKM || jVar.aKL != bArr.length) {
            a(str, obj, bArr, jVar);
        } else {
            updateBytes(jVar.offset, bArr);
            jVar.value = obj;
        }
        Kk();
    }

    private void a(String str, String str2, a.i iVar) {
        int fT = com.kwad.sdk.utils.a.b.fT(str2);
        if (iVar == null) {
            int fT2 = com.kwad.sdk.utils.a.b.fT(str);
            dm(fT2);
            int i = fT2 + 4;
            this.aLi = i + fT;
            Kt();
            com.kwad.sdk.utils.a.b bVar = this.aLc;
            if (bVar != null) {
                bVar.e((byte) 6);
            }
            q(str, fT2);
            r(str2, fT);
            Map<String, a.b> map = this.aLf;
            int i2 = this.aLh;
            map.put(str, new a.i(i2, i2 + i, str2, fT, false));
            Kr();
        } else {
            int i3 = iVar.offset - iVar.start;
            boolean z = true;
            if (iVar.aKL == fT) {
                this.aLe ^= this.aLc.A(iVar.offset, iVar.aKL);
                if (fT == str2.length()) {
                    a(str2, 0, fT, this.aLc.aKO, iVar.offset);
                } else {
                    com.kwad.sdk.utils.a.b bVar2 = this.aLc;
                    if (bVar2 != null) {
                        bVar2.position = iVar.offset;
                        this.aLc.fS(str2);
                    }
                }
                this.aLh = iVar.offset;
                this.aLi = fT;
                z = false;
            } else {
                this.aLi = i3 + fT;
                Kt();
                com.kwad.sdk.utils.a.b bVar3 = this.aLc;
                if (bVar3 != null) {
                    bVar3.e((byte) 6);
                }
                int i4 = i3 - 3;
                com.kwad.sdk.utils.a.b bVar4 = this.aLc;
                if (bVar4 != null) {
                    System.arraycopy(bVar4.aKO, iVar.start + 1, this.aLc.aKO, this.aLc.position, i4);
                }
                com.kwad.sdk.utils.a.b bVar5 = this.aLc;
                if (bVar5 != null) {
                    bVar5.position += i4;
                }
                r(str2, fT);
                a((byte) 6, iVar.start, iVar.offset + iVar.aKL);
                r11 = iVar.aKM ? (String) iVar.value : null;
                iVar.aKM = false;
                iVar.start = this.aLh;
                iVar.offset = this.aLh + i3;
                iVar.aKL = fT;
            }
            iVar.value = str2;
            Kr();
            if (z) {
                Ku();
            }
            if (r11 != null) {
                h.h(new File(this.Tv + this.name, r11));
            }
        }
        Kk();
    }

    private void a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        int capacity = mappedByteBuffer.capacity();
        int i = PAGE_SIZE;
        if (capacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.aLa ? this.aKW : this.aKX;
            if (fileChannel == null) {
                return;
            }
            fileChannel.truncate(i);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aLa) {
                this.aLa = map;
            } else {
                this.aLb = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.aLb ? this.aKX : this.aKW).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.aLb) {
                    this.aLb = map;
                } else {
                    this.aLa = map;
                }
                mappedByteBuffer2 = map;
            } catch (Exception e2) {
                r(e2);
                Ko();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private synchronized void a(Map<String, Object> map, Map<Class, b> map2) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    b(key, (byte[]) value);
                } else {
                    g(new Exception("missing encoders"));
                }
            }
        }
    }

    private boolean a(com.kwad.sdk.utils.a.b bVar) {
        int length = bVar.aKO.length;
        File file = new File(this.Tv, this.name + ".kva");
        File file2 = new File(this.Tv, this.name + ".kvb");
        try {
            if (h.ad(file) && h.ad(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long j = length;
                randomAccessFile.setLength(j);
                randomAccessFile2.setLength(j);
                this.aKW = randomAccessFile.getChannel();
                this.aKX = randomAccessFile2.getChannel();
                MappedByteBuffer map = this.aKW.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aLa = map;
                map.order(ByteOrder.LITTLE_ENDIAN);
                MappedByteBuffer map2 = this.aKX.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aLb = map2;
                map2.order(ByteOrder.LITTLE_ENDIAN);
                this.aLa.put(bVar.aKO, 0, this.aLd);
                this.aLb.put(bVar.aKO, 0, this.aLd);
                return true;
            }
            throw new Exception("open file failed");
        } catch (Exception e2) {
            r(e2);
            return false;
        }
    }

    private byte[] a(a.C0273a c0273a) {
        try {
            byte[] ae = h.ae(new File(this.Tv + this.name, (String) c0273a.value));
            return ae != null ? ae : aKQ;
        } catch (Exception e2) {
            r(e2);
            return aKQ;
        }
    }

    private boolean ac(File file) {
        com.kwad.sdk.utils.a.b bVar;
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i = (int) length;
            int B = B(PAGE_SIZE, i);
            com.kwad.sdk.utils.a.b bVar2 = this.aLc;
            if (bVar2 == null || bVar2.aKO.length != B) {
                com.kwad.sdk.utils.a.b bVar3 = new com.kwad.sdk.utils.a.b(new byte[B]);
                this.aLc = bVar3;
                bVar = bVar3;
            } else {
                bVar = this.aLc;
                bVar.position = 0;
            }
            h.a(file, bVar.aKO, i);
            int i2 = bVar.getInt();
            long j = bVar.getLong();
            this.aLd = i2 + 12;
            if (i2 >= 0 && i2 <= i - 12 && j == bVar.A(12, i2) && Kj() == 0) {
                this.aLe = j;
                return true;
            }
        }
        return false;
    }

    private int b(String str, byte[] bArr, byte b2) {
        a(str, b2, bArr.length + 2);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            bVar.a((short) bArr.length);
            int i = this.aLc.position;
            this.aLc.n(bArr);
            return i;
        }
        return 0;
    }

    private void b(long j, long j2, int i) {
        long d2 = d(j2, i) ^ this.aLe;
        this.aLe = d2;
        if (this.aLo == 0) {
            MappedByteBuffer mappedByteBuffer = this.aLa;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, d2);
                this.aLa.putLong(i, j);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aLb;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aLe);
                this.aLb.putLong(i, j);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aLc;
            if (bVar != null) {
                bVar.g(4, d2);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aLc;
        if (bVar2 != null) {
            bVar2.g(i, j);
        }
    }

    private synchronized void b(String str, byte[] bArr) {
        fW(str);
        if (bArr == null) {
            remove(str);
        } else {
            a(str, bArr, bArr, (a.C0273a) this.aLf.get(str), (byte) 7);
        }
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        if (this.aLk && mappedByteBuffer != this.aLa) {
            mappedByteBuffer.putInt(0, this.aLd - 12);
        }
        mappedByteBuffer.putLong(4, this.aLe);
        int i = this.aLj;
        if (i != 0) {
            mappedByteBuffer.put(i, this.aLc.aKO[this.aLj]);
        }
        if (this.aLi != 0) {
            mappedByteBuffer.position(this.aLh);
            mappedByteBuffer.put(this.aLc.aKO, this.aLh, this.aLi);
        }
    }

    private static long d(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    private static void d(int i, boolean z) {
        if (z) {
            if (i != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i < 0 || i >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private static void dm(int i) {
        if (i > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void dn(int i) {
        if (this.aLc == null) {
            this.aLc = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
        }
        int length = this.aLc.aKO.length;
        int i2 = this.aLd + i;
        if (i2 >= length) {
            int i3 = this.aLm;
            if (i3 > i && i3 > Ks()) {
                m21do(i);
                return;
            }
            int B = B(length, i2);
            byte[] bArr = new byte[B];
            System.arraycopy(this.aLc.aKO, 0, bArr, 0, this.aLd);
            this.aLc.aKO = bArr;
            if (this.aLo == 0) {
                try {
                    long j = B;
                    MappedByteBuffer map = this.aKW.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aLa = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    MappedByteBuffer map2 = this.aKX.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aLb = map2;
                    map2.order(ByteOrder.LITTLE_ENDIAN);
                } catch (Throwable th) {
                    r(new Exception("map failed", th));
                    this.aLc.y(0, this.aLd - 12);
                    this.aLc.g(4, this.aLe);
                    Ko();
                }
            }
        }
    }

    /* renamed from: do  reason: not valid java name */
    private void m21do(int i) {
        int i2;
        ArrayList<e> arrayList = this.aLn;
        if (arrayList == null || this.aLc == null) {
            return;
        }
        Collections.sort(arrayList);
        Kv();
        e eVar = this.aLn.get(0);
        int i3 = eVar.start;
        int i4 = this.aLd;
        int i5 = i4 - this.aLm;
        int i6 = i5 - 12;
        int i7 = i5 - i3;
        int i8 = i4 - i3;
        boolean z = i6 < i8 + i7;
        if (!z) {
            this.aLe ^= this.aLc.A(i3, i8);
        }
        int size = this.aLn.size();
        int i9 = size - 1;
        int i10 = this.aLd - this.aLn.get(i9).end;
        int[] iArr = new int[(i10 > 0 ? size : i9) << 1];
        int i11 = eVar.start;
        int i12 = eVar.end;
        int i13 = 1;
        while (i13 < size) {
            e eVar2 = this.aLn.get(i13);
            int i14 = eVar2.start - i12;
            int i15 = size;
            System.arraycopy(this.aLc.aKO, i12, this.aLc.aKO, i11, i14);
            int i16 = (i13 - 1) << 1;
            iArr[i16] = i12;
            iArr[i16 + 1] = i12 - i11;
            i11 += i14;
            i12 = eVar2.end;
            i13++;
            size = i15;
        }
        if (i10 > 0) {
            System.arraycopy(this.aLc.aKO, i12, this.aLc.aKO, i11, i10);
            int i17 = i9 << 1;
            iArr[i17] = i12;
            iArr[i17 + 1] = i12 - i11;
        }
        Kw();
        this.aLe = z ? this.aLc.A(12, i6) : this.aLe ^ this.aLc.A(i3, i7);
        this.aLd = i5;
        if (this.aLo == 0) {
            MappedByteBuffer mappedByteBuffer = this.aLa;
            if (mappedByteBuffer != null) {
                i2 = 0;
                mappedByteBuffer.putInt(0, -1);
                this.aLa.putLong(4, this.aLe);
                this.aLa.position(i3);
                this.aLa.put(this.aLc.aKO, i3, i7);
                this.aLa.putInt(0, i6);
            } else {
                i2 = 0;
            }
            MappedByteBuffer mappedByteBuffer2 = this.aLb;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putInt(i2, i6);
                this.aLb.putLong(4, this.aLe);
                this.aLb.position(i3);
                this.aLb.put(this.aLc.aKO, i3, i7);
            }
        } else {
            this.aLc.y(0, i6);
            this.aLc.g(4, this.aLe);
        }
        a(i3, iArr);
        int i18 = i5 + i;
        if (this.aLc.aKO.length - i18 > aKT) {
            dp(i18);
        }
        info("gc finish");
    }

    private void dp(int i) {
        int i2 = PAGE_SIZE;
        int B = B(i2, i + i2);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            if (B >= bVar.aKO.length) {
                return;
            }
            byte[] bArr = new byte[B];
            System.arraycopy(this.aLc.aKO, 0, bArr, 0, this.aLd);
            this.aLc.aKO = bArr;
        }
        if (this.aLo == 0) {
            try {
                long j = B;
                this.aKW.truncate(j);
                MappedByteBuffer map = this.aKW.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aLa = map;
                map.order(ByteOrder.LITTLE_ENDIAN);
                this.aKX.truncate(j);
                MappedByteBuffer map2 = this.aKX.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aLb = map2;
                map2.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                r(new Exception("map failed", th));
                Ko();
            }
        }
        info("truncate finish");
    }

    private static void fW(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void fX(String str) {
        d dVar = this.aKV;
        if (dVar != null) {
            dVar.e(this.name, new Exception(str));
        }
    }

    private void g(Exception exc) {
        d dVar = this.aKV;
        if (dVar != null) {
            dVar.a(this.name, exc);
        }
    }

    private void h(File file, File file2) {
        try {
            if (ac(file)) {
                return;
            }
        } catch (IOException e2) {
            g(e2);
        }
        Kq();
        try {
            if (ac(file2)) {
                return;
            }
        } catch (Exception e3) {
            g(e3);
        }
        Kq();
    }

    private void info(String str) {
        d dVar = this.aKV;
        if (dVar != null) {
            dVar.i(this.name, str);
        }
    }

    private synchronized void putDouble(String str, double d2) {
        fW(str);
        a.d dVar = (a.d) this.aLf.get(str);
        if (dVar != null) {
            if (dVar.value != d2) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
                dVar.value = d2;
                b(doubleToRawLongBits, Double.doubleToRawLongBits(dVar.value) ^ doubleToRawLongBits, dVar.offset);
                Kk();
            }
            return;
        }
        a(str, (byte) 5);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            int i = bVar.position;
            this.aLc.au(Double.doubleToRawLongBits(d2));
            Kr();
            Map<String, a.b> map = this.aLf;
            if (map != null) {
                map.put(str, new a.d(i, d2));
            }
        }
        Kk();
    }

    private synchronized void putFloat(String str, float f) {
        fW(str);
        a.e eVar = (a.e) this.aLf.get(str);
        if (eVar != null) {
            if (eVar.value != f) {
                int floatToRawIntBits = Float.floatToRawIntBits(f);
                eVar.value = f;
                a(floatToRawIntBits, (Float.floatToRawIntBits(eVar.value) ^ floatToRawIntBits) & 4294967295L, eVar.offset);
                Kk();
            }
            return;
        }
        a(str, (byte) 3);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            int i = bVar.position;
            this.aLc.df(Float.floatToRawIntBits(f));
            Kr();
            Map<String, a.b> map = this.aLf;
            if (map != null) {
                map.put(str, new a.e(i, f));
            }
        }
        Kk();
    }

    private synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            a(str, (String) set, (b<String>) g.aLH);
        }
    }

    private void q(String str, int i) {
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar == null) {
            return;
        }
        bVar.e((byte) i);
        if (i != str.length()) {
            this.aLc.fS(str);
            return;
        }
        a(str, 0, i, this.aLc.aKO, this.aLc.position);
        this.aLc.position += i;
    }

    private void r(String str, int i) {
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar == null) {
            return;
        }
        bVar.a((short) i);
        if (i == str.length()) {
            a(str, 0, i, this.aLc.aKO, this.aLc.position);
        } else {
            this.aLc.fS(str);
        }
    }

    private void r(Throwable th) {
        d dVar = this.aKV;
        if (dVar != null) {
            dVar.e(this.name, th);
        }
    }

    private void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            this.aLe ^= bVar.A(i, length);
            this.aLc.position = i;
            this.aLc.n(bArr);
            this.aLe ^= this.aLc.A(i, length);
        }
        if (this.aLo != 0) {
            com.kwad.sdk.utils.a.b bVar2 = this.aLc;
            if (bVar2 != null) {
                bVar2.g(4, this.aLe);
                return;
            }
            return;
        }
        MappedByteBuffer mappedByteBuffer = this.aLa;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.putInt(0, -1);
            this.aLa.putLong(4, this.aLe);
            this.aLa.position(i);
            this.aLa.put(bArr);
            this.aLa.putInt(0, this.aLd - 12);
        }
        MappedByteBuffer mappedByteBuffer2 = this.aLb;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.putLong(4, this.aLe);
            this.aLb.position(i);
            this.aLb.put(bArr);
        }
    }

    public final synchronized boolean contains(String str) {
        return this.aLf.containsKey(str);
    }

    public final synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.aLf.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, a.b> entry : this.aLf.entrySet()) {
            String key = entry.getKey();
            a.b value = entry.getValue();
            Object obj = null;
            switch (value.Kd()) {
                case 1:
                    valueOf = Boolean.valueOf(((a.c) value).value);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((a.f) value).value);
                    break;
                case 3:
                    valueOf = Float.valueOf(((a.e) value).value);
                    break;
                case 4:
                    valueOf = Long.valueOf(((a.g) value).value);
                    break;
                case 5:
                    valueOf = Double.valueOf(((a.d) value).value);
                    break;
                case 6:
                    a.i iVar = (a.i) value;
                    if (iVar.aKM) {
                        valueOf = a(iVar);
                        break;
                    } else {
                        valueOf = iVar.value;
                        break;
                    }
                case 7:
                    a.C0273a c0273a = (a.C0273a) value;
                    if (c0273a.aKM) {
                        valueOf = a(c0273a);
                        break;
                    } else {
                        valueOf = c0273a.value;
                        break;
                    }
                case 8:
                    a.h hVar = (a.h) value;
                    if (hVar.aKM) {
                        valueOf = a(hVar);
                        break;
                    } else {
                        valueOf = ((a.h) value).value;
                        break;
                    }
                default:
                    continue;
                    hashMap.put(key, obj);
            }
            obj = valueOf;
            hashMap.put(key, obj);
        }
        return hashMap;
    }

    public final synchronized boolean getBoolean(String str, boolean z) {
        a.c cVar = (a.c) this.aLf.get(str);
        if (cVar == null) {
            return z;
        }
        return cVar.value;
    }

    public final synchronized int getInt(String str, int i) {
        a.f fVar = (a.f) this.aLf.get(str);
        if (fVar == null) {
            return i;
        }
        return fVar.value;
    }

    public final synchronized long getLong(String str, long j) {
        a.g gVar = (a.g) this.aLf.get(str);
        if (gVar == null) {
            return j;
        }
        return gVar.value;
    }

    public final synchronized String getString(String str, String str2) {
        a.i iVar = (a.i) this.aLf.get(str);
        if (iVar != null) {
            if (iVar.aKM) {
                return a(iVar);
            }
            return (String) iVar.value;
        }
        return str2;
    }

    public final void putAll(Map<String, Object> map) {
        a(map, (Map<Class, b>) null);
    }

    public final synchronized void putBoolean(String str, boolean z) {
        fW(str);
        a.c cVar = (a.c) this.aLf.get(str);
        if (cVar != null) {
            if (cVar.value != z) {
                cVar.value = z;
                a((byte) (z ? 1 : 0), cVar.offset);
                Kk();
            }
            return;
        }
        a(str, (byte) 1);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            int i = bVar.position;
            this.aLc.e((byte) (z ? 1 : 0));
            Kr();
            Map<String, a.b> map = this.aLf;
            if (map != null) {
                map.put(str, new a.c(i, z));
            }
        }
        Kk();
    }

    public final synchronized void putInt(String str, int i) {
        fW(str);
        a.f fVar = (a.f) this.aLf.get(str);
        if (fVar != null) {
            if (fVar.value != i) {
                fVar.value = i;
                a(i, (fVar.value ^ i) & 4294967295L, fVar.offset);
                Kk();
            }
            return;
        }
        a(str, (byte) 2);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            int i2 = bVar.position;
            this.aLc.df(i);
            Kr();
            Map<String, a.b> map = this.aLf;
            if (map != null) {
                map.put(str, new a.f(i2, i));
            }
        }
        Kk();
    }

    public final synchronized void putLong(String str, long j) {
        fW(str);
        a.g gVar = (a.g) this.aLf.get(str);
        if (gVar != null) {
            if (gVar.value != j) {
                gVar.value = j;
                b(j, j ^ gVar.value, gVar.offset);
                Kk();
            }
            return;
        }
        a(str, (byte) 4);
        com.kwad.sdk.utils.a.b bVar = this.aLc;
        if (bVar != null) {
            int i = bVar.position;
            this.aLc.au(j);
            Kr();
            Map<String, a.b> map = this.aLf;
            if (map != null) {
                map.put(str, new a.g(i, j));
            }
        }
        Kk();
    }

    public final synchronized void putString(String str, String str2) {
        byte[] bArr;
        byte[] fV;
        byte[] bArr2;
        fW(str);
        if (str2 == null) {
            remove(str);
            return;
        }
        a.i iVar = (a.i) this.aLf.get(str);
        if (str2.length() * 3 < 2048) {
            a(str, str2, iVar);
            return;
        }
        if (str2.isEmpty()) {
            fV = aKQ;
        } else if (iVar != null || str2.length() >= 2048) {
            if (iVar != null && !iVar.aKM) {
                int fT = com.kwad.sdk.utils.a.b.fT(str2);
                bArr = new byte[fT];
                if (fT == str2.length()) {
                    a(str2, 0, fT, bArr, 0);
                    bArr2 = bArr;
                    a(str, str2, bArr2, iVar, (byte) 6);
                }
            }
            fV = com.kwad.sdk.utils.a.b.fV(str2);
        } else {
            int fT2 = com.kwad.sdk.utils.a.b.fT(str2);
            bArr = new byte[fT2];
            if (fT2 == str2.length()) {
                a(str2, 0, fT2, bArr, 0);
                bArr2 = bArr;
                a(str, str2, bArr2, iVar, (byte) 6);
            }
            fV = com.kwad.sdk.utils.a.b.fV(str2);
        }
        bArr2 = fV;
        a(str, str2, bArr2, iVar, (byte) 6);
    }

    public final void release() {
        h.closeQuietly(this.aKY);
        h.closeQuietly(this.aKZ);
        h.closeQuietly(this.aKW);
        h.closeQuietly(this.aKX);
        this.aKW = null;
        this.aKX = null;
        this.aLa = null;
        this.aLb = null;
        C0274c c0274c = a.aLt;
        C0274c.remove(this.Tv + this.name);
    }

    public final synchronized void remove(String str) {
        a.b bVar = this.aLf.get(str);
        if (bVar != null) {
            this.aLf.remove(str);
            byte Kd = bVar.Kd();
            String str2 = null;
            if (Kd <= 5) {
                a(Kd, bVar.offset - (com.kwad.sdk.utils.a.b.fT(str) + 2), bVar.offset + aKP[Kd]);
            } else {
                a.j jVar = (a.j) bVar;
                a(Kd, jVar.start, jVar.offset + jVar.aKL);
                if (jVar.aKM) {
                    str2 = (String) jVar.value;
                }
            }
            byte b2 = (byte) (Kd | Byte.MIN_VALUE);
            if (this.aLo == 0) {
                MappedByteBuffer mappedByteBuffer = this.aLa;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.putLong(4, this.aLe);
                    this.aLa.put(this.aLj, b2);
                }
                MappedByteBuffer mappedByteBuffer2 = this.aLb;
                if (mappedByteBuffer2 != null) {
                    mappedByteBuffer2.putLong(4, this.aLe);
                    this.aLb.put(this.aLj, b2);
                }
            } else {
                com.kwad.sdk.utils.a.b bVar2 = this.aLc;
                if (bVar2 != null) {
                    bVar2.g(4, this.aLe);
                }
            }
            this.aLj = 0;
            if (str2 != null) {
                h.h(new File(this.Tv + this.name, str2));
            }
            Ku();
            Kk();
        }
    }

    public final synchronized String toString() {
        return "FastKV: path:" + this.Tv + " name:" + this.name;
    }
}
