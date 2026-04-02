package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;
/* loaded from: classes2.dex */
final class h extends g {
    private final boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(c cVar, boolean z) {
        super(cVar);
        this.a = z;
    }

    private void f() {
        d[] b;
        for (d dVar : b()) {
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        int i;
        int i2;
        int i3;
        d[] b = b();
        f();
        a(b, aVar);
        c a = a();
        ResultPoint e = this.a ? a.e() : a.f();
        ResultPoint g = this.a ? a.g() : a.h();
        int b2 = b((int) e.getY());
        int b3 = b((int) g.getY());
        int i4 = -1;
        int i5 = b2;
        int i6 = 0;
        int i7 = 1;
        while (i5 < b3) {
            if (b[i5] != null) {
                d dVar = b[i5];
                int h = dVar.h() - i4;
                if (h == 0) {
                    i = i6 + 1;
                    i2 = i7;
                    i3 = i4;
                } else if (h == 1) {
                    int max = Math.max(i7, i6);
                    i3 = dVar.h();
                    i2 = max;
                    i = 1;
                } else if (h < 0 || dVar.h() >= aVar.c() || h > i5) {
                    b[i5] = null;
                    i = i6;
                    i2 = i7;
                    i3 = i4;
                } else {
                    int i8 = i7 > 2 ? h * (i7 - 2) : h;
                    boolean z = i8 >= i5;
                    for (int i9 = 1; i9 <= i8 && !z; i9++) {
                        z = b[i5 - i9] != null;
                    }
                    if (z) {
                        b[i5] = null;
                        i = i6;
                        i2 = i7;
                        i3 = i4;
                    } else {
                        i2 = i7;
                        i3 = dVar.h();
                        i = 1;
                    }
                }
            } else {
                i = i6;
                i2 = i7;
                i3 = i4;
            }
            i5++;
            i4 = i3;
            i7 = i2;
            i6 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] c() {
        d[] b;
        int h;
        a d = d();
        if (d == null) {
            return null;
        }
        b(d);
        int[] iArr = new int[d.c()];
        for (d dVar : b()) {
            if (dVar != null && (h = dVar.h()) < iArr.length) {
                iArr[h] = iArr[h] + 1;
            }
        }
        return iArr;
    }

    private void b(a aVar) {
        c a = a();
        ResultPoint e = this.a ? a.e() : a.f();
        ResultPoint g = this.a ? a.g() : a.h();
        int b = b((int) e.getY());
        int b2 = b((int) g.getY());
        d[] b3 = b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int i4 = b; i4 < b2; i4++) {
            if (b3[i4] != null) {
                d dVar = b3[i4];
                dVar.b();
                int h = dVar.h() - i;
                if (h == 0) {
                    i2++;
                } else if (h == 1) {
                    int max = Math.max(i3, i2);
                    i = dVar.h();
                    i3 = max;
                    i2 = 1;
                } else if (dVar.h() >= aVar.c()) {
                    b3[i4] = null;
                } else {
                    i = dVar.h();
                    i2 = 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a d() {
        d[] b = b();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : b) {
            if (dVar != null) {
                dVar.b();
                int g = dVar.g() % 30;
                int h = dVar.h();
                if (!this.a) {
                    h += 2;
                }
                switch (h % 3) {
                    case 0:
                        bVar2.a((g * 3) + 1);
                        continue;
                    case 1:
                        bVar4.a(g / 3);
                        bVar3.a(g % 3);
                        continue;
                    case 2:
                        bVar.a(g + 1);
                        continue;
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        a(b, aVar);
        return aVar;
    }

    private void a(d[] dVarArr, a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int g = dVar.g() % 30;
                int h = dVar.h();
                if (h > aVar.c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.a) {
                        h += 2;
                    }
                    switch (h % 3) {
                        case 0:
                            if ((g * 3) + 1 != aVar.d()) {
                                dVarArr[i] = null;
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (g / 3 != aVar.b() || g % 3 != aVar.e()) {
                                dVarArr[i] = null;
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (g + 1 != aVar.a()) {
                                dVarArr[i] = null;
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.a;
    }

    @Override // com.google.zxing.pdf417.decoder.g
    public String toString() {
        return "IsLeft: " + this.a + '\n' + super.toString();
    }
}
