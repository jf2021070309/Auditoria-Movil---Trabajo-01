package com.amazon.aps.iva.v1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import com.amazon.aps.iva.c2.b;
import com.google.common.base.Ascii;
import java.util.List;
/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class l implements b1 {
    public final ClipboardManager a;

    public l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.SpannableString] */
    @Override // com.amazon.aps.iva.v1.b1
    public final void a(com.amazon.aps.iva.c2.b bVar) {
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b;
        boolean z5;
        List list2 = com.amazon.aps.iva.lb0.z.b;
        List list3 = bVar.c;
        if (list3 == null) {
            list = list2;
        } else {
            list = list3;
        }
        boolean isEmpty = list.isEmpty();
        String str = bVar.b;
        if (!isEmpty) {
            ?? spannableString = new SpannableString(str);
            m1 m1Var = new m1();
            if (list3 != null) {
                list2 = list3;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                b.C0158b c0158b = (b.C0158b) list2.get(i);
                com.amazon.aps.iva.c2.u uVar = (com.amazon.aps.iva.c2.u) c0158b.a;
                m1Var.a.recycle();
                Parcel obtain = Parcel.obtain();
                com.amazon.aps.iva.yb0.j.e(obtain, "obtain()");
                m1Var.a = obtain;
                com.amazon.aps.iva.yb0.j.f(uVar, "spanStyle");
                long b2 = uVar.b();
                long j = com.amazon.aps.iva.f1.x.g;
                byte b3 = 1;
                if (!com.amazon.aps.iva.f1.x.c(b2, j)) {
                    m1Var.a((byte) 1);
                    m1Var.a.writeLong(uVar.b());
                }
                long j2 = com.amazon.aps.iva.o2.m.c;
                long j3 = uVar.b;
                if (!com.amazon.aps.iva.o2.m.a(j3, j2)) {
                    m1Var.a((byte) 2);
                    m1Var.c(j3);
                }
                com.amazon.aps.iva.h2.y yVar = uVar.c;
                if (yVar != null) {
                    m1Var.a((byte) 3);
                    m1Var.a.writeInt(yVar.b);
                }
                com.amazon.aps.iva.h2.t tVar = uVar.d;
                if (tVar != null) {
                    m1Var.a((byte) 4);
                    int i2 = tVar.a;
                    if (i2 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if (i2 == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            b = 1;
                            m1Var.a(b);
                        }
                    }
                    b = 0;
                    m1Var.a(b);
                }
                com.amazon.aps.iva.h2.u uVar2 = uVar.e;
                if (uVar2 != null) {
                    m1Var.a((byte) 5);
                    int i3 = uVar2.a;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (i3 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (i3 == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                b3 = 2;
                            } else {
                                if (i3 != 3) {
                                    b3 = 0;
                                }
                                if (b3 != 0) {
                                    b3 = 3;
                                }
                            }
                        }
                        m1Var.a(b3);
                    }
                    b3 = 0;
                    m1Var.a(b3);
                }
                String str2 = uVar.g;
                if (str2 != null) {
                    m1Var.a((byte) 6);
                    m1Var.a.writeString(str2);
                }
                long j4 = uVar.h;
                if (!com.amazon.aps.iva.o2.m.a(j4, j2)) {
                    m1Var.a((byte) 7);
                    m1Var.c(j4);
                }
                com.amazon.aps.iva.n2.a aVar = uVar.i;
                if (aVar != null) {
                    m1Var.a((byte) 8);
                    m1Var.b(aVar.a);
                }
                com.amazon.aps.iva.n2.l lVar = uVar.j;
                if (lVar != null) {
                    m1Var.a((byte) 9);
                    m1Var.b(lVar.a);
                    m1Var.b(lVar.b);
                }
                long j5 = uVar.l;
                if (!com.amazon.aps.iva.f1.x.c(j5, j)) {
                    m1Var.a((byte) 10);
                    m1Var.a.writeLong(j5);
                }
                com.amazon.aps.iva.n2.i iVar = uVar.m;
                if (iVar != null) {
                    m1Var.a(Ascii.VT);
                    m1Var.a.writeInt(iVar.a);
                }
                com.amazon.aps.iva.f1.t0 t0Var = uVar.n;
                if (t0Var != null) {
                    m1Var.a(Ascii.FF);
                    m1Var.a.writeLong(t0Var.a);
                    long j6 = t0Var.b;
                    m1Var.b(com.amazon.aps.iva.e1.c.c(j6));
                    m1Var.b(com.amazon.aps.iva.e1.c.d(j6));
                    m1Var.b(t0Var.c);
                }
                String encodeToString = Base64.encodeToString(m1Var.a.marshall(), 0);
                com.amazon.aps.iva.yb0.j.e(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeToString), c0158b.b, c0158b.c, 33);
            }
            str = spannableString;
        }
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }

    @Override // com.amazon.aps.iva.v1.b1
    public final boolean b() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (r5 == 2) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.v1.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.c2.b getText() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.l.getText():com.amazon.aps.iva.c2.b");
    }
}
