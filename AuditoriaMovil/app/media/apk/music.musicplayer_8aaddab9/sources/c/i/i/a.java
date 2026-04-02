package c.i.i;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c.i.i.d;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {
    public static final c a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2102b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2103c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f2104d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f2105e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2106f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2107g;

    /* renamed from: h  reason: collision with root package name */
    public final c f2108h;

    /* renamed from: c.i.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0037a {
        public static final byte[] a = new byte[1792];

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f2109b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2110c;

        /* renamed from: d  reason: collision with root package name */
        public int f2111d;

        /* renamed from: e  reason: collision with root package name */
        public char f2112e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                a[i2] = Character.getDirectionality(i2);
            }
        }

        public C0037a(CharSequence charSequence, boolean z) {
            this.f2109b = charSequence;
            this.f2110c = charSequence.length();
        }

        public byte a() {
            char charAt = this.f2109b.charAt(this.f2111d - 1);
            this.f2112e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2109b, this.f2111d);
                this.f2111d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2111d--;
            char c2 = this.f2112e;
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        c cVar = d.f2123c;
        a = cVar;
        f2102b = Character.toString((char) 8206);
        f2103c = Character.toString((char) 8207);
        f2104d = new a(false, 2, cVar);
        f2105e = new a(true, 2, cVar);
    }

    public a(boolean z, int i2, c cVar) {
        this.f2106f = z;
        this.f2107g = i2;
        this.f2108h = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.f2111d <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            c.i.i.a$a r0 = new c.i.i.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f2111d = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.f2111d
            int r7 = r0.f2110c
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f2109b
            char r6 = r7.charAt(r6)
            r0.f2112e = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f2109b
            int r7 = r0.f2111d
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f2111d
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f2111d = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f2111d
            int r6 = r6 + r2
            r0.f2111d = r6
            char r6 = r0.f2112e
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = c.i.i.a.C0037a.a
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f2111d
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = 1
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = -1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.i.a.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        C0037a c0037a = new C0037a(charSequence, false);
        c0037a.f2111d = c0037a.f2110c;
        int i2 = 0;
        int i3 = 0;
        while (c0037a.f2111d > 0) {
            byte a2 = c0037a.a();
            if (a2 != 0) {
                if (a2 == 1 || a2 == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (a2 != 9) {
                    switch (a2) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i2++;
                            break;
                        default:
                            if (i3 != 0) {
                                break;
                            } else {
                                i3 = i2;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i2 == 0) {
                return -1;
            } else {
                if (i3 == 0) {
                    i3 = i2;
                }
            }
        }
        return 0;
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = e.a;
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        c cVar = a;
        return cVar == a ? z ? f2105e : f2104d : new a(z, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f2107g & 2) != 0) && z) {
            boolean b3 = ((d.c) (b2 ? d.f2122b : d.a)).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f2106f || !(b3 || a(charSequence) == 1)) ? (!this.f2106f || (b3 && a(charSequence) != -1)) ? "" : f2103c : f2102b));
        }
        if (b2 != this.f2106f) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b4 = ((d.c) (b2 ? d.f2122b : d.a)).b(charSequence, 0, charSequence.length());
            if (!this.f2106f && (b4 || b(charSequence) == 1)) {
                str = f2102b;
            } else if (this.f2106f && (!b4 || b(charSequence) == -1)) {
                str = f2103c;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
