package com.amazon.aps.iva.h6;

import android.text.TextUtils;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.b0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.c0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: WebvttExtractor.java */
/* loaded from: classes.dex */
public final class s implements com.amazon.aps.iva.x6.n {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final b0 b;
    public com.amazon.aps.iva.x6.p d;
    public int f;
    public final v c = new v();
    public byte[] e = new byte[1024];

    public s(String str, b0 b0Var) {
        this.a = str;
        this.b = b0Var;
    }

    public final f0 a(long j) {
        f0 r = this.d.r(0, 3);
        v.a aVar = new v.a();
        aVar.k = "text/vtt";
        aVar.c = this.a;
        aVar.o = j;
        r.c(aVar.a());
        this.d.o();
        return r;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        com.amazon.aps.iva.x6.i iVar = (com.amazon.aps.iva.x6.i) oVar;
        iVar.c(this.e, 0, 6, false);
        byte[] bArr = this.e;
        com.amazon.aps.iva.t5.v vVar = this.c;
        vVar.D(6, bArr);
        if (com.amazon.aps.iva.y7.h.a(vVar)) {
            return true;
        }
        iVar.c(this.e, 6, 3, false);
        vVar.D(9, this.e);
        return com.amazon.aps.iva.y7.h.a(vVar);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(com.amazon.aps.iva.x6.p pVar) {
        this.d = pVar;
        pVar.m(new d0.b(-9223372036854775807L));
    }

    @Override // com.amazon.aps.iva.x6.n
    public final int h(com.amazon.aps.iva.x6.o oVar, c0 c0Var) throws IOException {
        String f;
        int length;
        this.d.getClass();
        com.amazon.aps.iva.x6.i iVar = (com.amazon.aps.iva.x6.i) oVar;
        int i = (int) iVar.c;
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            if (i != -1) {
                length = i;
            } else {
                length = bArr.length;
            }
            this.e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int l = iVar.l(bArr2, i3, bArr2.length - i3);
        if (l != -1) {
            int i4 = this.f + l;
            this.f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(this.e);
        com.amazon.aps.iva.y7.h.d(vVar);
        String f2 = vVar.f();
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(f2)) {
                if (f2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = g.matcher(f2);
                    if (matcher2.find()) {
                        Matcher matcher3 = h.matcher(f2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j2 = com.amazon.aps.iva.y7.h.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw h0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(f2), null);
                        }
                    } else {
                        throw h0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(f2), null);
                    }
                }
                f2 = vVar.f();
            } else {
                while (true) {
                    String f3 = vVar.f();
                    if (f3 == null) {
                        break;
                    } else if (com.amazon.aps.iva.y7.h.a.matcher(f3).matches()) {
                        do {
                            f = vVar.f();
                            if (f != null) {
                            }
                        } while (!f.isEmpty());
                    } else {
                        Matcher matcher4 = com.amazon.aps.iva.y7.f.a.matcher(f3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c = com.amazon.aps.iva.y7.h.c(group3);
                long b = this.b.b(((((j + c) - j2) * 90000) / 1000000) % 8589934592L);
                f0 a = a(b - c);
                byte[] bArr3 = this.e;
                int i5 = this.f;
                com.amazon.aps.iva.t5.v vVar2 = this.c;
                vVar2.D(i5, bArr3);
                a.a(this.f, vVar2);
                a.d(b, 1, this.f, 0, null);
                return -1;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
