package com.facebook.ads.redexgen.X;

import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.4C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4C {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4B A00;

    public C4C(C4B c4b) {
        this.A00 = c4b;
    }

    private int A00(List<C03123o> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    private void A01(List<C03123o> list, int i2, int i3) {
        C03123o c03123o = list.get(i2);
        C03123o nextOp = list.get(i3);
        int i4 = nextOp.A00;
        if (i4 != 1) {
            if (i4 == 2) {
                A03(list, i2, c03123o, i3, nextOp);
                return;
            } else if (i4 == 4) {
                A04(list, i2, c03123o, i3, nextOp);
                return;
            } else {
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A02(list, i2, c03123o, i3, nextOp);
    }

    private void A02(List<C03123o> list, int i2, C03123o c03123o, int i3, C03123o c03123o2) {
        int i4 = 0;
        if (c03123o.A01 < c03123o2.A02) {
            i4 = 0 - 1;
        }
        if (c03123o.A02 < c03123o2.A02) {
            i4++;
        }
        if (c03123o2.A02 <= c03123o.A02) {
            c03123o.A02 += c03123o2.A01;
        }
        if (c03123o2.A02 <= c03123o.A01) {
            c03123o.A01 += c03123o2.A01;
        }
        c03123o2.A02 += i4;
        list.set(i2, c03123o2);
        list.set(i3, c03123o);
    }

    private final void A03(List<C03123o> list, int i2, C03123o c03123o, int i3, C03123o c03123o2) {
        boolean z;
        C03123o c03123o3 = null;
        boolean z2 = false;
        if (c03123o.A02 < c03123o.A01) {
            z = false;
            if (c03123o2.A02 == c03123o.A02 && c03123o2.A01 == c03123o.A01 - c03123o.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c03123o2.A02 == c03123o.A01 + 1 && c03123o2.A01 == c03123o.A02 - c03123o.A01) {
                z2 = true;
            }
        }
        if (c03123o.A01 < c03123o2.A02) {
            c03123o2.A02--;
        } else if (c03123o.A01 < c03123o2.A02 + c03123o2.A01) {
            c03123o2.A01--;
            c03123o.A00 = 2;
            c03123o.A01 = 1;
            int i4 = c03123o2.A01;
            if (A01[6].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
            strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
            if (i4 == 0) {
                list.remove(i3);
                this.A00.ADe(c03123o2);
                return;
            }
            return;
        }
        if (c03123o.A02 <= c03123o2.A02) {
            c03123o2.A02++;
        } else if (c03123o.A02 < c03123o2.A02 + c03123o2.A01) {
            c03123o3 = this.A00.A9l(2, c03123o.A02 + 1, (c03123o2.A02 + c03123o2.A01) - c03123o.A02, null);
            c03123o2.A01 = c03123o.A02 - c03123o2.A02;
        }
        if (z2) {
            list.set(i2, c03123o2);
            list.remove(i3);
            this.A00.ADe(c03123o);
            return;
        }
        if (z) {
            if (c03123o3 != null) {
                if (c03123o.A02 > c03123o3.A02) {
                    c03123o.A02 -= c03123o3.A01;
                }
                if (c03123o.A01 > c03123o3.A02) {
                    c03123o.A01 -= c03123o3.A01;
                }
            }
            if (c03123o.A02 > c03123o2.A02) {
                c03123o.A02 -= c03123o2.A01;
            }
            if (c03123o.A01 > c03123o2.A02) {
                c03123o.A01 -= c03123o2.A01;
            }
        } else {
            if (c03123o3 != null) {
                if (c03123o.A02 >= c03123o3.A02) {
                    c03123o.A02 -= c03123o3.A01;
                }
                if (c03123o.A01 >= c03123o3.A02) {
                    c03123o.A01 -= c03123o3.A01;
                }
            }
            if (c03123o.A02 >= c03123o2.A02) {
                c03123o.A02 -= c03123o2.A01;
            }
            if (c03123o.A01 >= c03123o2.A02) {
                c03123o.A01 -= c03123o2.A01;
            }
        }
        list.set(i2, c03123o2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c03123o.A02 != c03123o.A01) {
            list.set(i3, c03123o);
        } else {
            list.remove(i3);
        }
        if (c03123o3 != null) {
            list.add(i2, c03123o3);
        }
    }

    private final void A04(List<C03123o> list, int i2, C03123o c03123o, int i3, C03123o c03123o2) {
        C03123o c03123o3 = null;
        C03123o c03123o4 = null;
        if (c03123o.A01 < c03123o2.A02) {
            c03123o2.A02--;
        } else if (c03123o.A01 < c03123o2.A02 + c03123o2.A01) {
            c03123o2.A01--;
            c03123o3 = this.A00.A9l(4, c03123o.A02, 1, c03123o2.A03);
        }
        if (c03123o.A02 <= c03123o2.A02) {
            c03123o2.A02++;
        } else if (c03123o.A02 < c03123o2.A02 + c03123o2.A01) {
            int i4 = (c03123o2.A02 + c03123o2.A01) - c03123o.A02;
            c03123o4 = this.A00.A9l(4, c03123o.A02 + 1, i4, c03123o2.A03);
            c03123o2.A01 -= i4;
        }
        list.set(i3, c03123o);
        if (c03123o2.A01 > 0) {
            list.set(i2, c03123o2);
        } else {
            list.remove(i2);
            this.A00.ADe(c03123o2);
        }
        if (c03123o3 != null) {
            list.add(i2, c03123o3);
        }
        if (c03123o4 != null) {
            list.add(i2, c03123o4);
        }
    }

    public final void A05(List<C03123o> list) {
        while (true) {
            int A00 = A00(list);
            if (A00 != -1) {
                A01(list, A00, A00 + 1);
            } else {
                return;
            }
        }
    }
}
