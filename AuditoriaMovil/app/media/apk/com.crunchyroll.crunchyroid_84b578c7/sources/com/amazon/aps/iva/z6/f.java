package com.amazon.aps.iva.z6;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
/* compiled from: ListChunk.java */
/* loaded from: classes.dex */
public final class f implements a {
    public final ImmutableList<a> a;
    public final int b;

    public f(ImmutableList immutableList, int i) {
        this.b = i;
        this.a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i, v vVar) {
        a aVar;
        String str;
        String str2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = vVar.c;
        int i3 = -2;
        while (vVar.c - vVar.b > 8) {
            int h = vVar.h();
            int h2 = vVar.b + vVar.h();
            vVar.E(h2);
            if (h == 1414744396) {
                aVar = b(vVar.h(), vVar);
            } else {
                switch (h) {
                    case 1718776947:
                        if (i3 == 2) {
                            vVar.G(4);
                            int h3 = vVar.h();
                            int h4 = vVar.h();
                            vVar.G(4);
                            switch (vVar.h()) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                p.g();
                                aVar = null;
                                break;
                            } else {
                                v.a aVar2 = new v.a();
                                aVar2.p = h3;
                                aVar2.q = h4;
                                aVar2.k = str2;
                                aVar = new g(new com.amazon.aps.iva.q5.v(aVar2));
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int m = vVar.m();
                                if (m == 1) {
                                    str = "audio/raw";
                                } else if (m != 85) {
                                    if (m == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (m != 8192) {
                                        if (m != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    p.g();
                                } else {
                                    int m2 = vVar.m();
                                    int h5 = vVar.h();
                                    vVar.G(6);
                                    int z = g0.z(vVar.z());
                                    int m3 = vVar.m();
                                    byte[] bArr = new byte[m3];
                                    vVar.d(0, bArr, m3);
                                    v.a aVar3 = new v.a();
                                    aVar3.k = str;
                                    aVar3.x = m2;
                                    aVar3.y = h5;
                                    if ("audio/raw".equals(str) && z != 0) {
                                        aVar3.z = z;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && m3 > 0) {
                                        aVar3.m = ImmutableList.of(bArr);
                                    }
                                    aVar = new g(new com.amazon.aps.iva.q5.v(aVar3));
                                    break;
                                }
                            } else {
                                g0.G(i3);
                                p.g();
                            }
                            aVar = null;
                        }
                    case 1751742049:
                        int h6 = vVar.h();
                        vVar.G(8);
                        int h7 = vVar.h();
                        int h8 = vVar.h();
                        vVar.G(4);
                        vVar.h();
                        vVar.G(12);
                        aVar = new c(h6, h7, h8);
                        break;
                    case 1752331379:
                        int h9 = vVar.h();
                        vVar.G(12);
                        vVar.h();
                        int h10 = vVar.h();
                        int h11 = vVar.h();
                        vVar.G(4);
                        int h12 = vVar.h();
                        int h13 = vVar.h();
                        vVar.G(8);
                        aVar = new d(h9, h10, h11, h12, h13);
                        break;
                    case 1852994675:
                        aVar = new h(vVar.r(vVar.c - vVar.b));
                        break;
                    default:
                        aVar = null;
                        break;
                }
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    int i4 = ((d) aVar).a;
                    if (i4 != 1935960438) {
                        if (i4 != 1935963489) {
                            if (i4 != 1937012852) {
                                Integer.toHexString(i4);
                                p.g();
                                i3 = -1;
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 1;
                        }
                    } else {
                        i3 = 2;
                    }
                }
                builder.add((ImmutableList.Builder) aVar);
            }
            vVar.F(h2);
            vVar.E(i2);
        }
        return new f(builder.build(), i);
    }

    public final <T extends a> T a(Class<T> cls) {
        UnmodifiableIterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.z6.a
    public final int getType() {
        return this.b;
    }
}
