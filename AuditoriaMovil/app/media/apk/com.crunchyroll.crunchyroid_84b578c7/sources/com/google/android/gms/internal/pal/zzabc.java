package com.google.android.gms.internal.pal;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzabc implements Closeable {
    private final Reader zzb;
    private long zzh;
    private int zzi;
    private int[] zzj;
    private String[] zzl;
    private int[] zzm;
    private final char[] zzc = new char[1024];
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    int zza = 0;
    private int zzk = 1;

    static {
        zzzi.zza = new zzabb();
    }

    public zzabc(Reader reader) {
        int[] iArr = new int[32];
        this.zzj = iArr;
        iArr[0] = 6;
        this.zzl = new String[32];
        this.zzm = new int[32];
        this.zzb = reader;
    }

    private final int zzm(boolean z) throws IOException {
        char[] cArr = this.zzc;
        int i = this.zzd;
        int i2 = this.zze;
        while (true) {
            if (i == i2) {
                this.zzd = i;
                if (!zzr(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(zzb()));
                }
                i = this.zzd;
                i2 = this.zze;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.zzf++;
                this.zzg = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zzd = i3;
                    if (i3 == i2) {
                        this.zzd = i3 - 1;
                        boolean zzr = zzr(2);
                        this.zzd++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                } else if (c != '#') {
                    this.zzd = i3;
                    return c;
                } else {
                    this.zzd = i3;
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
            i = i3;
        }
    }

    private final IOException zzn(String str) throws IOException {
        throw new zzabf(str.concat(zzb()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r5, r10.zzd, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x011c, code lost:
        if (r1 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012b, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.zzd = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzo(char r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzabc.zzo(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
        throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzp() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r5.zzd
            int r3 = r3 + r2
            int r4 = r5.zze
            if (r3 >= r4) goto L4f
            char[] r4 = r5.zzc
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5b
            r4 = 10
            if (r3 == r4) goto L5b
            r4 = 12
            if (r3 == r4) goto L5b
            r4 = 13
            if (r3 == r4) goto L5b
            r4 = 32
            if (r3 == r4) goto L5b
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L5b
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5b
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5b
            r4 = 58
            if (r3 == r4) goto L5b
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L5b;
                case 92: goto L48;
                case 93: goto L5b;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r5.zzn(r0)
            throw r0
        L4f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5d
            int r3 = r2 + 1
            boolean r3 = r5.zzr(r3)
            if (r3 != 0) goto L3
        L5b:
            r1 = r2
            goto L7d
        L5d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6a:
            char[] r3 = r5.zzc
            int r4 = r5.zzd
            r0.append(r3, r4, r2)
            int r3 = r5.zzd
            int r3 = r3 + r2
            r5.zzd = r3
            r2 = 1
            boolean r2 = r5.zzr(r2)
            if (r2 != 0) goto L2
        L7d:
            if (r0 != 0) goto L89
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.zzc
            int r3 = r5.zzd
            r0.<init>(r2, r3, r1)
            goto L94
        L89:
            char[] r2 = r5.zzc
            int r3 = r5.zzd
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L94:
            int r2 = r5.zzd
            int r2 = r2 + r1
            r5.zzd = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzabc.zzp():java.lang.String");
    }

    private final void zzq(int i) {
        int i2 = this.zzk;
        int[] iArr = this.zzj;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzj = Arrays.copyOf(iArr, i3);
            this.zzm = Arrays.copyOf(this.zzm, i3);
            this.zzl = (String[]) Arrays.copyOf(this.zzl, i3);
        }
        int[] iArr2 = this.zzj;
        int i4 = this.zzk;
        this.zzk = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzr(int i) throws IOException {
        int i2;
        char[] cArr = this.zzc;
        int i3 = this.zzg;
        int i4 = this.zzd;
        this.zzg = i3 - i4;
        int i5 = this.zze;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zze = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zze = 0;
        }
        this.zzd = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zze;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zze + read;
            this.zze = i2;
            if (this.zzf == 0 && this.zzg == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zzd++;
                this.zzg = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean zzs(char c) throws IOException {
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
            throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzj[0] = 8;
        this.zzk = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzabc".concat(zzb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01bc, code lost:
        if (zzs(r14) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c0, code lost:
        if (r9 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c2, code lost:
        if (r17 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c8, code lost:
        if (r12 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
        if (r18 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cc, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ce, code lost:
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01d2, code lost:
        if (r12 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d4, code lost:
        if (r3 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d7, code lost:
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01da, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01db, code lost:
        r22.zzh = r12;
        r22.zzd += r8;
        r22.zza = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e9, code lost:
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ea, code lost:
        if (r9 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ed, code lost:
        if (r9 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f0, code lost:
        if (r9 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01f2, code lost:
        r22.zzi = r8;
        r6 = 16;
        r22.zza = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzabc.zza():int");
    }

    public final String zzb() {
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzg;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        for (int i4 = 0; i4 < this.zzk; i4++) {
            int i5 = this.zzj[i4];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3 || i5 == 4 || i5 == 5) {
                    sb2.append('.');
                    String str = this.zzl[i4];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                int i6 = this.zzm[i4];
                sb2.append('[');
                sb2.append(i6);
                sb2.append(']');
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final String zzc() throws IOException {
        String zzo;
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 14) {
            zzo = zzp();
        } else if (i == 12) {
            zzo = zzo('\'');
        } else if (i == 13) {
            zzo = zzo('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        this.zza = 0;
        this.zzl[this.zzk - 1] = zzo;
        return zzo;
    }

    public final String zzd() throws IOException {
        String str;
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 10) {
            str = zzp();
        } else if (i == 8) {
            str = zzo('\'');
        } else if (i == 9) {
            str = zzo('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.zzh);
        } else if (i == 16) {
            str = new String(this.zzc, this.zzd, this.zzi);
            this.zzd += this.zzi;
        } else {
            throw new IllegalStateException("Expected a string but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        this.zza = 0;
        int[] iArr = this.zzm;
        int i2 = this.zzk - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void zze() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 3) {
            zzq(1);
            this.zzm[this.zzk - 1] = 0;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) zzabd.zza(zzl())) + zzb());
    }

    public final void zzf() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 1) {
            zzq(3);
            this.zza = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) zzabd.zza(zzl())) + zzb());
    }

    public final void zzg() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 4) {
            int i2 = this.zzk - 1;
            this.zzk = i2;
            int[] iArr = this.zzm;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) zzabd.zza(zzl())) + zzb());
    }

    public final void zzh() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 2) {
            int i2 = this.zzk - 1;
            this.zzk = i2;
            this.zzl[i2] = null;
            int[] iArr = this.zzm;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zza = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) zzabd.zza(zzl())) + zzb());
    }

    public final void zzi() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 7) {
            this.zza = 0;
            int[] iArr = this.zzm;
            int i2 = this.zzk - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) zzabd.zza(zzl())) + zzb());
    }

    public final boolean zzj() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean zzk() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzm;
            int i2 = this.zzk - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.zza = 0;
            int[] iArr2 = this.zzm;
            int i3 = this.zzk - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
    }

    public final int zzl() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zza();
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
