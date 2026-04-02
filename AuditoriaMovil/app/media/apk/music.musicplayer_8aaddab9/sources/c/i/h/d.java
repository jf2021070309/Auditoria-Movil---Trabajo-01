package c.i.h;

import java.util.Comparator;
/* loaded from: classes.dex */
public class d {
    public static final Comparator<byte[]> a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    if (bArr3[i4] != bArr4[i4]) {
                        i2 = bArr3[i4];
                        i3 = bArr4[i4];
                    }
                }
                return 0;
            }
            i2 = bArr3.length;
            i3 = bArr4.length;
            return i2 - i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[LOOP:1: B:15:0x004b->B:30:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[EDGE_INSN: B:80:0x0094->B:32:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.i.h.k a(android.content.Context r20, c.i.h.e r21, android.os.CancellationSignal r22) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.h.d.a(android.content.Context, c.i.h.e, android.os.CancellationSignal):c.i.h.k");
    }
}
