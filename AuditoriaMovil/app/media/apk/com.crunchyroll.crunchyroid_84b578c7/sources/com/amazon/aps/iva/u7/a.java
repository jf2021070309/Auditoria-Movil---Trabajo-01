package com.amazon.aps.iva.u7;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.u7.c;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SsaDecoder.java */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.q7.c {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final b n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public a(List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.m = true;
            String p = g0.p(list.get(0));
            com.amazon.aps.iva.cq.b.t(p.startsWith("Format:"));
            b a = b.a(p);
            a.getClass();
            this.n = a;
            i(new v(list.get(1)), Charsets.UTF_8);
            return;
        }
        this.m = false;
        this.n = null;
    }

    public static int h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long j(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = g0.a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    @Override // com.amazon.aps.iva.q7.c
    public final com.amazon.aps.iva.q7.d g(int i, byte[] bArr, boolean z) {
        b bVar;
        v vVar;
        Charset charset;
        b bVar2;
        c cVar;
        long j;
        Layout.Alignment alignment;
        int i2;
        float f;
        int i3;
        int i4;
        Integer num;
        int i5;
        int i6;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar2 = new v(bArr, i);
        Charset B = vVar2.B();
        if (B == null) {
            B = Charsets.UTF_8;
        }
        boolean z2 = aVar.m;
        if (!z2) {
            aVar.i(vVar2, B);
        }
        if (z2) {
            bVar = aVar.n;
        } else {
            bVar = null;
        }
        while (true) {
            String g = vVar2.g(B);
            if (g != null) {
                if (g.startsWith("Format:")) {
                    bVar = b.a(g);
                } else {
                    if (g.startsWith("Dialogue:")) {
                        if (bVar == null) {
                            "Skipping dialogue line before complete format: ".concat(g);
                            p.g();
                        } else {
                            com.amazon.aps.iva.cq.b.t(g.startsWith("Dialogue:"));
                            String substring = g.substring(9);
                            int i7 = bVar.e;
                            String[] split = substring.split(",", i7);
                            if (split.length != i7) {
                                "Skipping dialogue line with fewer columns than format: ".concat(g);
                                p.g();
                            } else {
                                long j2 = j(split[bVar.a]);
                                if (j2 == -9223372036854775807L) {
                                    "Skipping invalid timing: ".concat(g);
                                    p.g();
                                } else {
                                    long j3 = j(split[bVar.b]);
                                    if (j3 == -9223372036854775807L) {
                                        "Skipping invalid timing: ".concat(g);
                                        p.g();
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.o;
                                        if (linkedHashMap != null && (i6 = bVar.c) != -1) {
                                            cVar = (c) linkedHashMap.get(split[i6].trim());
                                        } else {
                                            cVar = null;
                                        }
                                        String str = split[bVar.d];
                                        Matcher matcher = c.b.a.matcher(str);
                                        int i8 = -1;
                                        PointF pointF = null;
                                        while (matcher.find()) {
                                            v vVar3 = vVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a = c.b.a(group);
                                                if (a != null) {
                                                    pointF = a;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.b.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i5 = c.a(group2);
                                                } else {
                                                    i5 = -1;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            if (i5 != -1) {
                                                i8 = i5;
                                                vVar2 = vVar3;
                                            } else {
                                                vVar2 = vVar3;
                                            }
                                        }
                                        vVar = vVar2;
                                        String replace = c.b.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f2 = aVar.p;
                                        float f3 = aVar.q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        a.C0695a c0695a = new a.C0695a();
                                        c0695a.a = spannableString;
                                        if (cVar != null) {
                                            Integer num2 = cVar.c;
                                            if (num2 != null) {
                                                charset = B;
                                                bVar2 = bVar;
                                                j = j3;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                charset = B;
                                                bVar2 = bVar;
                                                j = j3;
                                            }
                                            if (cVar.j == 3 && (num = cVar.d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f4 = cVar.e;
                                            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                c0695a.k = f4 / f3;
                                                c0695a.j = 1;
                                            }
                                            boolean z3 = cVar.g;
                                            boolean z4 = cVar.f;
                                            if (z4 && z3) {
                                                i3 = 33;
                                                i4 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i3 = 33;
                                                i4 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z3) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (cVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i3);
                                            }
                                            if (cVar.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i3);
                                            }
                                        } else {
                                            charset = B;
                                            bVar2 = bVar;
                                            j = j3;
                                        }
                                        int i9 = -1;
                                        if (i8 != -1) {
                                            i9 = i8;
                                        } else if (cVar != null) {
                                            i9 = cVar.b;
                                        }
                                        switch (i9) {
                                            case 0:
                                            default:
                                                p.g();
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        c0695a.c = alignment;
                                        int i10 = Integer.MIN_VALUE;
                                        switch (i9) {
                                            case 0:
                                            default:
                                                p.g();
                                            case -1:
                                                i2 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i2 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i2 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i2 = 2;
                                                break;
                                        }
                                        c0695a.i = i2;
                                        switch (i9) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                p.g();
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i10 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i10 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i10 = 0;
                                                break;
                                        }
                                        c0695a.g = i10;
                                        if (pointF != null && f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            c0695a.h = pointF.x / f2;
                                            c0695a.e = pointF.y / f3;
                                            c0695a.f = 0;
                                        } else {
                                            int i11 = c0695a.i;
                                            float f5 = 0.95f;
                                            if (i11 != 0) {
                                                if (i11 != 1) {
                                                    if (i11 != 2) {
                                                        f = -3.4028235E38f;
                                                    } else {
                                                        f = 0.95f;
                                                    }
                                                } else {
                                                    f = 0.5f;
                                                }
                                            } else {
                                                f = 0.05f;
                                            }
                                            c0695a.h = f;
                                            if (i10 != 0) {
                                                if (i10 != 1) {
                                                    if (i10 != 2) {
                                                        f5 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f5 = 0.5f;
                                                }
                                            } else {
                                                f5 = 0.05f;
                                            }
                                            c0695a.e = f5;
                                            c0695a.f = 0;
                                        }
                                        com.amazon.aps.iva.s5.a a2 = c0695a.a();
                                        int h = h(j, arrayList2, arrayList);
                                        for (int h2 = h(j2, arrayList2, arrayList); h2 < h; h2++) {
                                            ((List) arrayList.get(h2)).add(a2);
                                        }
                                        aVar = this;
                                        vVar2 = vVar;
                                        B = charset;
                                        bVar = bVar2;
                                    }
                                }
                            }
                        }
                    }
                    vVar = vVar2;
                    charset = B;
                    bVar2 = bVar;
                    aVar = this;
                    vVar2 = vVar;
                    B = charset;
                    bVar = bVar2;
                }
            } else {
                return new d(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0281 A[Catch: RuntimeException -> 0x02a6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x02a6, blocks: (B:105:0x01bc, B:107:0x01ca, B:109:0x01d9, B:111:0x01dd, B:113:0x01ec, B:115:0x01f0, B:117:0x01ff, B:119:0x0203, B:120:0x0209, B:126:0x0227, B:128:0x022d, B:132:0x023e, B:134:0x0242, B:138:0x0253, B:140:0x0257, B:144:0x0268, B:146:0x026c, B:150:0x027d, B:152:0x0281, B:153:0x0287, B:162:0x02a0, B:160:0x029b, B:124:0x0210), top: B:179:0x01bc, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.amazon.aps.iva.t5.v r28, java.nio.charset.Charset r29) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u7.a.i(com.amazon.aps.iva.t5.v, java.nio.charset.Charset):void");
    }
}
