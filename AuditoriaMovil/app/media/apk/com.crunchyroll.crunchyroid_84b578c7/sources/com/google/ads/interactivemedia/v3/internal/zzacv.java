package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.e4.e;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzacv implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private String zzk;
    private int[] zzl;
    private String[] zzn;
    private int[] zzo;
    private boolean zzc = false;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzm = 1;

    static {
        zzyp.zza = new zzacu();
    }

    public zzacv(Reader reader) {
        int[] iArr = new int[32];
        this.zzl = iArr;
        iArr[0] = 6;
        this.zzn = new String[32];
        this.zzo = new int[32];
        this.zzb = reader;
    }

    private final void zzA() throws IOException {
        if (this.zzc) {
            return;
        }
        throw zzw("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void zzB(int i) {
        int i2 = this.zzm;
        int[] iArr = this.zzl;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzl = Arrays.copyOf(iArr, i3);
            this.zzo = Arrays.copyOf(this.zzo, i3);
            this.zzn = (String[]) Arrays.copyOf(this.zzn, i3);
        }
        int[] iArr2 = this.zzl;
        int i4 = this.zzm;
        this.zzm = i4 + 1;
        iArr2[i4] = i;
    }

    private final void zzC(char c) throws IOException {
        char[] cArr = this.zzd;
        do {
            int i = this.zze;
            int i2 = this.zzf;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.zze = i3;
                    return;
                } else if (c2 == '\\') {
                    this.zze = i3;
                    zzu();
                    i = this.zze;
                    i2 = this.zzf;
                } else {
                    if (c2 == '\n') {
                        this.zzg++;
                        this.zzh = i3;
                    }
                    i = i3;
                }
            }
            this.zze = i;
        } while (zzF(1));
        throw zzw("Unterminated string");
    }

    private final void zzD() throws IOException {
        char c;
        do {
            if (this.zze < this.zzf || zzF(1)) {
                char[] cArr = this.zzd;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.zzg++;
                    this.zzh = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    private final void zzE() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.zze + i;
                if (i2 < this.zzf) {
                    char c = this.zzd[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case ModuleDescriptor.MODULE_VERSION /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.zze = i2;
                }
            }
            zzA();
            this.zze += i;
            return;
        } while (zzF(1));
    }

    private final boolean zzF(int i) throws IOException {
        int i2;
        char[] cArr = this.zzd;
        int i3 = this.zzh;
        int i4 = this.zze;
        this.zzh = i3 - i4;
        int i5 = this.zzf;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zzf = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zzf;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zzf + read;
            this.zzf = i2;
            if (this.zzg == 0 && this.zzh == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean zzG(char c) throws IOException {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case ModuleDescriptor.MODULE_VERSION /* 92 */:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            zzA();
            return false;
        }
        return false;
    }

    private final char zzu() throws IOException {
        int i;
        if (this.zze == this.zzf && !zzF(1)) {
            throw zzw("Unterminated escape sequence");
        }
        char[] cArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        this.zze = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i3 + 4 > this.zzf && !zzF(4)) {
                                        throw zzw("Unterminated escape sequence");
                                    }
                                    int i4 = this.zze;
                                    int i5 = i4 + 4;
                                    char c2 = 0;
                                    while (i4 < i5) {
                                        char[] cArr2 = this.zzd;
                                        char c3 = cArr2[i4];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i = c3 - '0';
                                        } else if (c3 >= 'a' && c3 <= 'f') {
                                            i = c3 - 'W';
                                        } else if (c3 >= 'A' && c3 <= 'F') {
                                            i = c3 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u".concat(new String(cArr2, this.zze, 4)));
                                        }
                                        c2 = (char) (i + c4);
                                        i4++;
                                    }
                                    this.zze += 4;
                                    return c2;
                                }
                                throw zzw("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.zzg++;
            this.zzh = i3;
        }
        return c;
    }

    private final int zzv(boolean z) throws IOException {
        char[] cArr = this.zzd;
        int i = this.zze;
        int i2 = this.zzf;
        while (true) {
            if (i == i2) {
                this.zze = i;
                if (!zzF(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(zzg()));
                }
                i = this.zze;
                i2 = this.zzf;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zze = i3;
                    if (i3 == i2) {
                        this.zze = i3 - 1;
                        boolean zzF = zzF(2);
                        this.zze++;
                        if (!zzF) {
                            return 47;
                        }
                    }
                    zzA();
                    int i4 = this.zze;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.zze = i4 + 1;
                        zzD();
                        i = this.zze;
                        i2 = this.zzf;
                    } else {
                        this.zze = i4 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzF(2)) {
                                throw zzw("Unterminated comment");
                            }
                            char[] cArr2 = this.zzd;
                            int i5 = this.zze;
                            if (cArr2[i5] == '\n') {
                                this.zzg++;
                                this.zzh = i5 + 1;
                            } else {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.zzd[this.zze + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                i = 2 + this.zze;
                                i2 = this.zzf;
                                break;
                            }
                            this.zze++;
                        }
                    }
                } else if (c == '#') {
                    this.zze = i3;
                    zzA();
                    zzD();
                    i = this.zze;
                    i2 = this.zzf;
                } else {
                    this.zze = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final IOException zzw(String str) throws IOException {
        throw new zzacy(str.concat(zzg()));
    }

    private final String zzx(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.zzm;
            if (i < i2) {
                int i3 = this.zzl[i];
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3 || i3 == 4 || i3 == 5) {
                        sb.append('.');
                        String str = this.zzn[i];
                        if (str != null) {
                            sb.append(str);
                        }
                    }
                } else {
                    int i4 = this.zzo[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    private final String zzy(char c) throws IOException {
        char[] cArr = this.zzd;
        StringBuilder sb = null;
        do {
            int i = this.zze;
            int i2 = this.zzf;
            int i3 = i;
            while (i < i2) {
                int i4 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.zze = i4;
                    int i5 = (i4 - i3) - 1;
                    if (sb == null) {
                        return new String(cArr, i3, i5);
                    }
                    sb.append(cArr, i3, i5);
                    return sb.toString();
                } else if (c2 == '\\') {
                    this.zze = i4;
                    int i6 = (i4 - i3) - 1;
                    if (sb == null) {
                        int i7 = i6 + 1;
                        sb = new StringBuilder(Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i3, i6);
                    sb.append(zzu());
                    i3 = this.zze;
                    i2 = this.zzf;
                    i = i3;
                } else {
                    if (c2 == '\n') {
                        this.zzg++;
                        this.zzh = i4;
                    }
                    i = i4;
                }
            }
            if (sb == null) {
                int i8 = i - i3;
                sb = new StringBuilder(Math.max(i8 + i8, 16));
            }
            sb.append(cArr, i3, i - i3);
            this.zze = i;
        } while (zzF(1));
        throw zzw("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        zzA();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzz() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.zze
            int r3 = r3 + r2
            int r4 = r5.zzf
            if (r3 >= r4) goto L4c
            char[] r4 = r5.zzd
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.zzA()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.zzF(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.zzd
            int r4 = r5.zze
            r1.append(r3, r4, r2)
            int r3 = r5.zze
            int r3 = r3 + r2
            r5.zze = r3
            r2 = 1
            boolean r2 = r5.zzF(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.<init>(r2, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L92:
            int r2 = r5.zze
            int r2 = r2 + r0
            r5.zze = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacv.zzz():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzl[0] = 8;
        this.zzm = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzacv".concat(zzg());
    }

    public final double zza() throws IOException {
        char c;
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i2 = this.zzm - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.zzi;
        }
        if (i == 16) {
            char[] cArr = this.zzd;
            int i3 = this.zze;
            int i4 = this.zzj;
            this.zzk = new String(cArr, i3, i4);
            this.zze = i3 + i4;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.zzk = zzz();
            } else if (i != 11) {
                throw new IllegalStateException(zzacw.zzb(this, "Expected a double but was "));
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.zzk = zzy(c);
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        if (!this.zzc && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new zzacy("JSON forbids NaN and infinities: " + parseDouble + zzg());
        }
        this.zzk = null;
        this.zza = 0;
        int[] iArr2 = this.zzo;
        int i5 = this.zzm - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0219, code lost:
        if (zzG(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x021d, code lost:
        if (r9 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021f, code lost:
        if (r15 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0225, code lost:
        if (r11 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0227, code lost:
        if (r16 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x022a, code lost:
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0230, code lost:
        if (r11 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0232, code lost:
        if (r14 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0235, code lost:
        if (r14 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0238, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0239, code lost:
        r21.zzi = r11;
        r21.zze += r10;
        r21.zza = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0247, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0249, code lost:
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x024c, code lost:
        if (r9 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x024f, code lost:
        if (r9 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0251, code lost:
        r21.zzj = r10;
        r21.zza = 16;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacv.zzb():int");
    }

    public final int zzc() throws IOException {
        char c;
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 15) {
            long j = this.zzi;
            int i2 = (int) j;
            if (j == i2) {
                this.zza = 0;
                int[] iArr = this.zzo;
                int i3 = this.zzm - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + j + zzg());
        }
        if (i == 16) {
            char[] cArr = this.zzd;
            int i4 = this.zze;
            int i5 = this.zzj;
            this.zzk = new String(cArr, i4, i5);
            this.zze = i4 + i5;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected an int but was "));
        } else {
            if (i == 10) {
                this.zzk = zzz();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.zzk = zzy(c);
            }
            try {
                int parseInt = Integer.parseInt(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i6 = this.zzm - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        int i7 = (int) parseDouble;
        if (i7 == parseDouble) {
            this.zzk = null;
            this.zza = 0;
            int[] iArr3 = this.zzo;
            int i8 = this.zzm - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException(e.e("Expected an int but was ", this.zzk, zzg()));
    }

    public final long zzd() throws IOException {
        char c;
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i2 = this.zzm - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.zzi;
        }
        if (i == 16) {
            char[] cArr = this.zzd;
            int i3 = this.zze;
            int i4 = this.zzj;
            this.zzk = new String(cArr, i3, i4);
            this.zze = i3 + i4;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a long but was "));
        } else {
            if (i == 10) {
                this.zzk = zzz();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.zzk = zzy(c);
            }
            try {
                long parseLong = Long.parseLong(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i5 = this.zzm - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.zzk = null;
            this.zza = 0;
            int[] iArr3 = this.zzo;
            int i6 = this.zzm - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j;
        }
        throw new NumberFormatException(e.e("Expected a long but was ", this.zzk, zzg()));
    }

    public final String zze() {
        return zzx(false);
    }

    public final String zzf() {
        return zzx(true);
    }

    public final String zzg() {
        int i = this.zze - this.zzh;
        String zzx = zzx(false);
        StringBuilder d = e.d(" at line ", this.zzg + 1, " column ");
        d.append(i + 1);
        d.append(" path ");
        d.append(zzx);
        return d.toString();
    }

    public final String zzh() throws IOException {
        String zzy;
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 14) {
            zzy = zzz();
        } else if (i == 12) {
            zzy = zzy('\'');
        } else if (i == 13) {
            zzy = zzy('\"');
        } else {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a name but was "));
        }
        this.zza = 0;
        this.zzn[this.zzm - 1] = zzy;
        return zzy;
    }

    public final String zzi() throws IOException {
        String str;
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 10) {
            str = zzz();
        } else if (i == 8) {
            str = zzy('\'');
        } else if (i == 9) {
            str = zzy('\"');
        } else if (i == 11) {
            str = this.zzk;
            this.zzk = null;
        } else if (i == 15) {
            str = Long.toString(this.zzi);
        } else if (i == 16) {
            str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
        } else {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a string but was "));
        }
        this.zza = 0;
        int[] iArr = this.zzo;
        int i2 = this.zzm - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void zzj() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 3) {
            zzB(1);
            this.zzo[this.zzm - 1] = 0;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException(zzacw.zzb(this, "Expected BEGIN_ARRAY but was "));
    }

    public final void zzk() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 1) {
            zzB(3);
            this.zza = 0;
            return;
        }
        throw new IllegalStateException(zzacw.zzb(this, "Expected BEGIN_OBJECT but was "));
    }

    public final void zzl() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 4) {
            int i2 = this.zzm - 1;
            this.zzm = i2;
            int[] iArr = this.zzo;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException(zzacw.zzb(this, "Expected END_ARRAY but was "));
    }

    public final void zzm() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 2) {
            int i2 = this.zzm - 1;
            this.zzm = i2;
            this.zzn[i2] = null;
            int[] iArr = this.zzo;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException(zzacw.zzb(this, "Expected END_OBJECT but was "));
    }

    public final void zzn() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 7) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i2 = this.zzm - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException(zzacw.zzb(this, "Expected null but was "));
    }

    public final void zzo(boolean z) {
        this.zzc = z;
    }

    public final void zzp() throws IOException {
        int i = 0;
        do {
            int i2 = this.zza;
            if (i2 == 0) {
                i2 = zzb();
            }
            switch (i2) {
                case 1:
                    zzB(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.zzn[this.zzm - 1] = null;
                        i = 0;
                    }
                    this.zzm--;
                    i--;
                    break;
                case 3:
                    zzB(1);
                    i++;
                    break;
                case 4:
                    this.zzm--;
                    i--;
                    break;
                case 8:
                    zzC('\'');
                    break;
                case 9:
                    zzC('\"');
                    break;
                case 10:
                    zzE();
                    break;
                case 12:
                    zzC('\'');
                    if (i == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i = 0;
                        break;
                    }
                    break;
                case 13:
                    zzC('\"');
                    if (i == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i = 0;
                        break;
                    }
                    break;
                case 14:
                    zzE();
                    if (i == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i = 0;
                        break;
                    }
                    break;
                case 16:
                    this.zze += this.zzj;
                    break;
                case 17:
                    return;
            }
            this.zza = 0;
        } while (i > 0);
        int[] iArr = this.zzo;
        int i3 = this.zzm - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final boolean zzq() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean zzr() {
        return this.zzc;
    }

    public final boolean zzs() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i2 = this.zzm - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.zza = 0;
            int[] iArr2 = this.zzo;
            int i3 = this.zzm - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a boolean but was "));
        }
    }

    public final int zzt() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzb();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
