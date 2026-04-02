package okhttp3.internal.publicsuffix;

import com.amazon.aps.iva.a60.b;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ef0.o;
import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.ef0.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "splitDomain", "domainLabels", "findMatchingRule", "Lcom/amazon/aps/iva/kb0/q;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = f1.J("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: PublicSuffixDatabase.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                j.e(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r0 <= 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
        r12 = (byte[][]) r3.clone();
        r7 = r12.length - 1;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r8 >= r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        r12[r8] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL;
        r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion;
        r10 = r11.publicSuffixListBytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r10 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r9 = r9.binarySearch(r10, r12, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
        com.amazon.aps.iva.yb0.j.m("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (r9 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
        r0 = r0 - 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        if (r12 >= r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion;
        r7 = r11.publicSuffixExceptionListBytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
        if (r7 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
        r5 = r5.binarySearch(r7, r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        com.amazon.aps.iva.yb0.j.m("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b0, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
        return com.amazon.aps.iva.oe0.q.D0("!".concat(r4), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
        if (r9 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
        return okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
        r0 = com.amazon.aps.iva.lb0.z.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:
        r3 = com.amazon.aps.iva.oe0.q.D0(r6, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
        if (r9 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d8, code lost:
        r0 = com.amazon.aps.iva.oe0.q.D0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
        if (r3.size() <= r0.size()) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.findMatchingRule(java.util.List):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void readTheList() throws IOException {
        try {
            d0 d0Var = new d0();
            d0 d0Var2 = new d0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                x b = r.b(new o(r.f(resourceAsStream)));
                long readInt = b.readInt();
                b.P(readInt);
                d0Var.b = b.c.x(readInt);
                long readInt2 = b.readInt();
                b.P(readInt2);
                d0Var2.b = b.c.x(readInt2);
                q qVar = q.a;
                b.k(b, null);
                synchronized (this) {
                    T t = d0Var.b;
                    j.c(t);
                    this.publicSuffixListBytes = (byte[]) t;
                    T t2 = d0Var2.b;
                    j.c(t2);
                    this.publicSuffixExceptionListBytes = (byte[]) t2;
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> D0 = com.amazon.aps.iva.oe0.q.D0(str, new char[]{'.'});
        if (j.a(com.amazon.aps.iva.lb0.x.D0(D0), "")) {
            return com.amazon.aps.iva.lb0.x.p0(D0);
        }
        return D0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        j.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        j.e(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        return s.Z(s.U(com.amazon.aps.iva.lb0.x.k0(splitDomain(str)), size - size2), ".");
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        j.f(bArr, "publicSuffixListBytes");
        j.f(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
