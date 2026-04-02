package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.z7.e0;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes.dex */
public final class g implements e0.c {
    public final int a;
    public final List<com.amazon.aps.iva.q5.v> b;

    public g(int i, List<com.amazon.aps.iva.q5.v> list) {
        this.a = i;
        this.b = list;
    }

    @Override // com.amazon.aps.iva.z7.e0.c
    public final e0 a(int i, e0.b bVar) {
        if (i != 2) {
            String str = bVar.a;
            if (i != 3 && i != 4) {
                if (i != 21) {
                    if (i != 27) {
                        if (i != 36) {
                            if (i != 89) {
                                if (i != 138) {
                                    if (i != 172) {
                                        if (i != 257) {
                                            if (i != 134) {
                                                if (i != 135) {
                                                    switch (i) {
                                                        case 15:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new f(str, false));
                                                        case 16:
                                                            return new t(new l(new f0(b(bVar))));
                                                        case 17:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new p(str));
                                                        default:
                                                            switch (i) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!c(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new t(new b(str));
                                            } else if (c(16)) {
                                                return null;
                                            } else {
                                                return new z(new s("application/x-scte35"));
                                            }
                                        }
                                        return new z(new s("application/vnd.dvb.ait"));
                                    }
                                    return new t(new d(str));
                                }
                                return new t(new h(str));
                            }
                            return new t(new i(bVar.b));
                        }
                        return new t(new n(new a0(b(bVar))));
                    } else if (c(4)) {
                        return null;
                    } else {
                        return new t(new m(new a0(b(bVar)), c(1), c(8)));
                    }
                }
                return new t(new o());
            }
            return new t(new q(str));
        }
        return new t(new k(new f0(b(bVar))));
    }

    public final List<com.amazon.aps.iva.q5.v> b(e0.b bVar) {
        boolean z;
        String str;
        int i;
        List<byte[]> list;
        boolean z2;
        boolean c = c(32);
        List<com.amazon.aps.iva.q5.v> list2 = this.b;
        if (c) {
            return list2;
        }
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(bVar.c);
        while (vVar.c - vVar.b > 0) {
            int u = vVar.u();
            int u2 = vVar.b + vVar.u();
            if (u == 134) {
                ArrayList arrayList = new ArrayList();
                int u3 = vVar.u() & 31;
                for (int i2 = 0; i2 < u3; i2++) {
                    String r = vVar.r(3);
                    int u4 = vVar.u();
                    if ((u4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte u5 = (byte) vVar.u();
                    vVar.G(1);
                    if (z) {
                        if ((u5 & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    v.a aVar = new v.a();
                    aVar.k = str;
                    aVar.c = r;
                    aVar.C = i;
                    aVar.m = list;
                    arrayList.add(new com.amazon.aps.iva.q5.v(aVar));
                }
                list2 = arrayList;
            }
            vVar.F(u2);
        }
        return list2;
    }

    public final boolean c(int i) {
        if ((i & this.a) != 0) {
            return true;
        }
        return false;
    }
}
