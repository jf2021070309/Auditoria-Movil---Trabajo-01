package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
/* renamed from: com.facebook.ads.redexgen.X.Uc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0959Uc implements I3 {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"eH4syubUz2tR66H4aXOA", "1d5DSBS1mhWRL66KnLBZBpyHNgki7Rvu", "v9uLJ4dIwyz0Tb4FaO07wTfk2F9lBV8v", "E1Se3PKWItYNl2w7Z0lUvGDZb88eKAvD", "3tvSVqejLSP4DWhBG1hRQ7meIfhtlUpf", "obkGL38LbEEikSiwJ4pDHOfB9GOmWii2", "dwvV", "8LO"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC0961Ue A02;
    public final IB A03;
    public final File A04;
    public final HashMap<String, ArrayList<I2>> A05;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, 11, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 11, 66, 69, 88, 95, 74, 69, 72, 78, 11, 94, 88, 78, 88, 11, 95, 67, 78, 11, 77, 68, 71, 79, 78, 89, 17, 11, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, 28, 30, 28, 23, 26, 27, 32, 28, 16, 17, 11, 26, 17, 11, 32, 22, 17, 27, 26, 7, 81, 26, 7, 22};
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C0959Uc(File file, InterfaceC0961Ue interfaceC0961Ue) {
        this(file, interfaceC0961Ue, null, false);
    }

    public C0959Uc(File file, InterfaceC0961Ue interfaceC0961Ue, IB ib) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC0961Ue;
            this.A03 = ib;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new IG(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public C0959Uc(File file, InterfaceC0961Ue interfaceC0961Ue, byte[] bArr, boolean z) {
        this(file, interfaceC0961Ue, new IB(file, bArr, z));
    }

    private C0958Ub A00(String str, long j2) throws I1 {
        C0958Ub A062;
        IA A092 = this.A03.A09(str);
        if (A092 == null) {
            return C0958Ub.A02(str, j2);
        }
        while (true) {
            A062 = A092.A06(j2);
            if (!A062.A05 || A062.A03.exists()) {
                break;
            }
            A05();
        }
        return A062;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I3
    /* renamed from: A01 */
    public final synchronized C0958Ub AF4(String str, long j2) throws InterruptedException, I1 {
        C0958Ub AF5;
        while (true) {
            AF5 = AF5(str, j2);
            if (AF5 == null) {
                wait();
            }
        }
        return AF5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I3
    /* renamed from: A02 */
    public final synchronized C0958Ub AF5(String str, long j2) throws I1 {
        boolean z = this.A01;
        if (A08[0].length() != 10) {
            A08[3] = "i1JHZi6uUAd1FxW2ulRZEzuIvuRnbT2M";
            IJ.A04(!z);
            C0958Ub A00 = A00(str, j2);
            if (A00.A05) {
                C0958Ub A072 = this.A03.A09(str).A07(A00);
                A0C(A00, A072);
                return A072;
            }
            IA A0A = this.A03.A0A(str);
            if (!A0A.A0D()) {
                A0A.A0B(true);
                return A00;
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C0958Ub span = file.length() > 0 ? C0958Ub.A00(file, this.A03) : null;
                if (span != null) {
                    A0A(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (I1 e2) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e2);
        }
    }

    private void A05() throws I1 {
        ArrayList arrayList = new ArrayList();
        for (IA cachedContent : this.A03.A0D()) {
            Iterator<C0958Ub> it = cachedContent.A08().iterator();
            while (it.hasNext()) {
                C0958Ub next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            A08((I7) arrayList.get(i2), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(I7 i7) {
        ArrayList<I2> arrayList = this.A05.get(i7.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACL(this, i7);
            }
        }
        this.A02.ACL(this, i7);
    }

    private void A08(I7 i7, boolean z) throws I1 {
        IA A092 = this.A03.A09(i7.A04);
        if (A092 == null || !A092.A0E(i7)) {
            return;
        }
        this.A00 -= i7.A01;
        if (z) {
            try {
                this.A03.A0H(A092.A03);
                this.A03.A0G();
            } finally {
                A07(i7);
            }
        }
    }

    private void A0A(C0958Ub c0958Ub) {
        this.A03.A0A(c0958Ub.A04).A09(c0958Ub);
        this.A00 += c0958Ub.A01;
        A0B(c0958Ub);
    }

    private void A0B(C0958Ub c0958Ub) {
        ArrayList<I2> arrayList = this.A05.get(c0958Ub.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACK(this, c0958Ub);
            }
        }
        this.A02.ACK(this, c0958Ub);
    }

    private void A0C(C0958Ub c0958Ub, I7 i7) {
        ArrayList<I2> arrayList = this.A05.get(c0958Ub.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACM(this, c0958Ub, i7);
            }
        }
        this.A02.ACM(this, c0958Ub, i7);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C0959Uc.class) {
            if (A06) {
                return true;
            }
            boolean add = A09.add(file.getAbsoluteFile());
            if (A08[3].charAt(1) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[4] = "IKpjWyjLYfQpiBWntIG6MWMycmL9Fi0T";
            strArr[1] = "4yvCWPfRVkN5zdYzJ7yblhOZllwt9yTn";
            return add;
        }
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void A3O(String str, IF r3) throws I1 {
        IJ.A04(!this.A01);
        this.A03.A0I(str, r3);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void A43(File file) throws I1 {
        IJ.A04(!this.A01);
        C0958Ub A00 = C0958Ub.A00(file, this.A03);
        IJ.A04(A00 != null);
        IA A092 = this.A03.A09(A00.A04);
        IJ.A01(A092);
        IJ.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = IE.A00(A092.A05());
            if (A002 != -1) {
                long j2 = A00.A02;
                long length = A00.A01;
                IJ.A04(j2 + length <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A5u() {
        IJ.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A5v(String str, long j2, long j3) {
        IA A092;
        IJ.A04(!this.A01);
        A092 = this.A03.A09(str);
        return A092 != null ? A092.A04(j2, j3) : -j3;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    @NonNull
    public final synchronized NavigableSet<I7> A5w(String str) {
        TreeSet treeSet;
        IJ.A04(!this.A01);
        IA A092 = this.A03.A09(str);
        if (A092 == null || A092.A0C()) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet((Collection) A092.A08());
        }
        return treeSet;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized long A67(String str) {
        return IE.A00(A68(str));
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized ID A68(String str) {
        IJ.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void ADn(I7 i7) {
        IJ.A04(!this.A01);
        IA A092 = this.A03.A09(i7.A04);
        IJ.A01(A092);
        IJ.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void ADu(I7 i7) throws I1 {
        IJ.A04(!this.A01);
        A08(i7, true);
        if (A08[0].length() == 10) {
            throw new RuntimeException();
        }
        A08[2] = "mDPrx6EC7JunlTiRZIITWuDkOY6RMx2Q";
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized void AEb(String str, long j2) throws I1 {
        IF r0 = new IF();
        IE.A05(r0, j2);
        A3O(str, r0);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final synchronized File AF2(String str, long j2, long j3) throws I1 {
        IA A092;
        IJ.A04(!this.A01);
        A092 = this.A03.A09(str);
        IJ.A01(A092);
        IJ.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACN(this, str, j2, j3);
        return C0958Ub.A04(this.A04, A092.A02, j2, System.currentTimeMillis());
    }
}
