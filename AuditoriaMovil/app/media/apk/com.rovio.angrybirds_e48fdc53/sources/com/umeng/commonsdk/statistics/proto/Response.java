package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cr;
import com.umeng.analytics.pro.ct;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
public class Response implements bp<Response, e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, cb> metaDataMap;
    private static final Map<Class<? extends cw>, cx> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;
    private static final ct STRUCT_DESC = new ct("Response");
    private static final cj RESP_CODE_FIELD_DESC = new cj("resp_code", (byte) 8, 1);
    private static final cj MSG_FIELD_DESC = new cj("msg", (byte) 11, 2);
    private static final cj IMPRINT_FIELD_DESC = new cj(bg.X, (byte) 12, 3);

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.RESP_CODE, (e) new cb("resp_code", (byte) 1, new cc((byte) 8)));
        enumMap.put((EnumMap) e.MSG, (e) new cb("msg", (byte) 2, new cc((byte) 11)));
        enumMap.put((EnumMap) e.IMPRINT, (e) new cb(bg.X, (byte) 2, new cg((byte) 12, com.umeng.commonsdk.statistics.proto.d.class)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        cb.a(Response.class, unmodifiableMap);
    }

    /* loaded from: classes3.dex */
    public enum e implements bw {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, bg.X);
        
        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return IMPRINT;
                    }
                    return null;
                }
                return MSG;
            }
            return RESP_CODE;
        }

        public static e b(int i) {
            e a = a(i);
            if (a == null) {
                throw new IllegalArgumentException("Field " + i + " doesn't exist!");
            }
            return a;
        }

        public static e a(String str) {
            return d.get(str);
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        @Override // com.umeng.analytics.pro.bw
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.bw
        public String b() {
            return this.f;
        }
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }

    @Override // com.umeng.analytics.pro.bp
    public bp<Response, e> deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = bm.b(this.__isset_bitfield, 0);
    }

    public boolean isSetResp_code() {
        return bm.a(this.__isset_bitfield, 0);
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = bm.a(this.__isset_bitfield, 0, z);
    }

    public String getMsg() {
        return this.msg;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public void setMsgIsSet(boolean z) {
        if (!z) {
            this.msg = null;
        }
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public void setImprintIsSet(boolean z) {
        if (!z) {
            this.imprint = null;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    public e fieldForId(int i) {
        return e.a(i);
    }

    @Override // com.umeng.analytics.pro.bp
    public void read(co coVar) throws bv {
        schemes.get(coVar.D()).b().b(coVar, this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void write(co coVar) throws bv {
        schemes.get(coVar.D()).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
            if (dVar == null) {
                sb.append("null");
            } else {
                sb.append(dVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws bv {
        com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
        if (dVar != null) {
            dVar.l();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ci(new da(objectOutputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements cx {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends cy<Response> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, Response response) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b == 0) {
                    break;
                }
                short s = l.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s == 3) {
                            if (l.b == 12) {
                                response.imprint = new com.umeng.commonsdk.statistics.proto.d();
                                response.imprint.read(coVar);
                                response.setImprintIsSet(true);
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 11) {
                        response.msg = coVar.z();
                        response.setMsgIsSet(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                } else if (l.b == 8) {
                    response.resp_code = coVar.w();
                    response.setResp_codeIsSet(true);
                } else {
                    cr.a(coVar, l.b);
                }
                coVar.m();
            }
            coVar.k();
            if (!response.isSetResp_code()) {
                throw new cp("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
            }
            response.validate();
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, Response response) throws bv {
            response.validate();
            coVar.a(Response.STRUCT_DESC);
            coVar.a(Response.RESP_CODE_FIELD_DESC);
            coVar.a(response.resp_code);
            coVar.c();
            if (response.msg != null && response.isSetMsg()) {
                coVar.a(Response.MSG_FIELD_DESC);
                coVar.a(response.msg);
                coVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                coVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(coVar);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* loaded from: classes3.dex */
    private static class d implements cx {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends cz<Response> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, Response response) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            cuVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                cuVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(cuVar);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, Response response) throws bv {
            cu cuVar = (cu) coVar;
            response.resp_code = cuVar.w();
            response.setResp_codeIsSet(true);
            BitSet b = cuVar.b(2);
            if (b.get(0)) {
                response.msg = cuVar.z();
                response.setMsgIsSet(true);
            }
            if (b.get(1)) {
                response.imprint = new com.umeng.commonsdk.statistics.proto.d();
                response.imprint.read(cuVar);
                response.setImprintIsSet(true);
            }
        }
    }
}
