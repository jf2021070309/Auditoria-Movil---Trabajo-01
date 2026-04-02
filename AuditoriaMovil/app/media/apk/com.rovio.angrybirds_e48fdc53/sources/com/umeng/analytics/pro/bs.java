package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ci;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: TDeserializer.java */
/* loaded from: classes3.dex */
public class bs {
    private final co a;
    private final db b;

    public bs() {
        this(new ci.a());
    }

    public bs(cq cqVar) {
        db dbVar = new db();
        this.b = dbVar;
        this.a = cqVar.a(dbVar);
    }

    public void a(bp bpVar, byte[] bArr) throws bv {
        try {
            this.b.a(bArr);
            bpVar.read(this.a);
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public void a(bp bpVar, String str, String str2) throws bv {
        try {
            try {
                a(bpVar, str.getBytes(str2));
            } catch (UnsupportedEncodingException e) {
                throw new bv("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.a.B();
        }
    }

    public void a(bp bpVar, byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        try {
            try {
                if (j(bArr, bwVar, bwVarArr) != null) {
                    bpVar.read(this.a);
                }
            } catch (Exception e) {
                throw new bv(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public Boolean a(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Boolean) a((byte) 2, bArr, bwVar, bwVarArr);
    }

    public Byte b(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Byte) a((byte) 3, bArr, bwVar, bwVarArr);
    }

    public Double c(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Double) a((byte) 4, bArr, bwVar, bwVarArr);
    }

    public Short d(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Short) a((byte) 6, bArr, bwVar, bwVarArr);
    }

    public Integer e(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Integer) a((byte) 8, bArr, bwVar, bwVarArr);
    }

    public Long f(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (Long) a((byte) 10, bArr, bwVar, bwVarArr);
    }

    public String g(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (String) a((byte) 11, bArr, bwVar, bwVarArr);
    }

    public ByteBuffer h(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        return (ByteBuffer) a((byte) 100, bArr, bwVar, bwVarArr);
    }

    public Short i(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        try {
            try {
                if (j(bArr, bwVar, bwVarArr) == null) {
                    return null;
                }
                this.a.j();
                return Short.valueOf(this.a.l().c);
            } catch (Exception e) {
                throw new bv(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    private Object a(byte b, byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        try {
            try {
                cj j = j(bArr, bwVar, bwVarArr);
                if (j != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && j.b == 11) {
                                                    return this.a.z();
                                                }
                                            } else if (j.b == 10) {
                                                return Long.valueOf(this.a.x());
                                            }
                                        } else if (j.b == 11) {
                                            return this.a.A();
                                        }
                                    } else if (j.b == 8) {
                                        return Integer.valueOf(this.a.w());
                                    }
                                } else if (j.b == 6) {
                                    return Short.valueOf(this.a.v());
                                }
                            } else if (j.b == 4) {
                                return Double.valueOf(this.a.y());
                            }
                        } else if (j.b == 3) {
                            return Byte.valueOf(this.a.u());
                        }
                    } else if (j.b == 2) {
                        return Boolean.valueOf(this.a.t());
                    }
                }
                return null;
            } catch (Exception e) {
                throw new bv(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    private cj j(byte[] bArr, bw bwVar, bw... bwVarArr) throws bv {
        this.b.a(bArr);
        int length = bwVarArr.length + 1;
        bw[] bwVarArr2 = new bw[length];
        int i = 0;
        bwVarArr2[0] = bwVar;
        int i2 = 0;
        while (i2 < bwVarArr.length) {
            int i3 = i2 + 1;
            bwVarArr2[i3] = bwVarArr[i2];
            i2 = i3;
        }
        this.a.j();
        cj cjVar = null;
        while (i < length) {
            cjVar = this.a.l();
            if (cjVar.b == 0 || cjVar.c > bwVarArr2[i].a()) {
                return null;
            }
            if (cjVar.c != bwVarArr2[i].a()) {
                cr.a(this.a, cjVar.b);
                this.a.m();
            } else {
                i++;
                if (i < length) {
                    this.a.j();
                }
            }
        }
        return cjVar;
    }

    public void a(bp bpVar, String str) throws bv {
        a(bpVar, str.getBytes());
    }
}
