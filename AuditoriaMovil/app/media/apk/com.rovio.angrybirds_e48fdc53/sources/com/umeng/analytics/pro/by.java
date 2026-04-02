package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ci;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: TSerializer.java */
/* loaded from: classes3.dex */
public class by {
    private final ByteArrayOutputStream a;
    private final da b;
    private co c;

    public by() {
        this(new ci.a());
    }

    public by(cq cqVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        da daVar = new da(byteArrayOutputStream);
        this.b = daVar;
        this.c = cqVar.a(daVar);
    }

    public byte[] a(bp bpVar) throws bv {
        this.a.reset();
        bpVar.write(this.c);
        return this.a.toByteArray();
    }

    public String a(bp bpVar, String str) throws bv {
        try {
            return new String(a(bpVar), str);
        } catch (UnsupportedEncodingException e) {
            throw new bv("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    public String b(bp bpVar) throws bv {
        return new String(a(bpVar));
    }
}
