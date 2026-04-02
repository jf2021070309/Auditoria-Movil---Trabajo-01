package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.f;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.u;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.v;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.z;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.d;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public class c extends b {
    z e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f {
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a a;

        a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a aVar) {
            this.a = aVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.f
        public void a(e eVar, a0 a0Var) throws IOException {
            if (this.a != null) {
                HashMap hashMap = new HashMap();
                if (a0Var != null) {
                    r m = a0Var.m();
                    if (m != null) {
                        for (int i = 0; i < m.b(); i++) {
                            hashMap.put(m.a(i), m.b(i));
                        }
                    }
                    this.a.a(c.this, new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b(a0Var.n(), a0Var.k(), a0Var.o(), hashMap, a0Var.i().l(), a0Var.t(), a0Var.r()));
                }
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.f
        public void a(e eVar, IOException iOException) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a aVar = this.a;
            if (aVar != null) {
                aVar.a(c.this, iOException);
            }
        }
    }

    public c(v vVar) {
        super(vVar);
        this.e = null;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a aVar) {
        IOException iOException;
        y.a aVar2 = new y.a();
        if (TextUtils.isEmpty(this.d)) {
            iOException = new IOException("Url is Empty");
        } else {
            try {
                aVar2.b(this.d);
                if (this.e != null) {
                    a(aVar2);
                    aVar2.a((Object) a());
                    this.a.a(aVar2.a(this.e).a()).a(new a(aVar));
                    return;
                } else if (aVar == null) {
                    return;
                } else {
                    iOException = new IOException("RequestBody is null, content type is not support!!");
                }
            } catch (IllegalArgumentException e) {
                iOException = new IOException("Url is not a valid HTTP or HTTPS URL");
            }
        }
        aVar.a(this, iOException);
    }

    public void a(String str, byte[] bArr) {
        this.e = z.a(u.a(str), bArr);
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b b() {
        String str;
        y.a aVar = new y.a();
        if (TextUtils.isEmpty(this.d)) {
            str = "execute: Url is Empty";
        } else {
            try {
                aVar.b(this.d);
                if (this.e != null) {
                    a(aVar);
                    aVar.a((Object) a());
                    try {
                        a0 i = this.a.a(aVar.a(this.e).a()).i();
                        if (i != null) {
                            HashMap hashMap = new HashMap();
                            r m = i.m();
                            if (m != null) {
                                for (int i2 = 0; i2 < m.b(); i2++) {
                                    hashMap.put(m.a(i2), m.b(i2));
                                }
                                return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b(i.n(), i.k(), i.o(), hashMap, i.i().l(), i.t(), i.r());
                            }
                            return null;
                        }
                        return null;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                str = "RequestBody is null, content type is not support!!";
            } catch (IllegalArgumentException e2) {
                str = "execute: Url is not a valid HTTP or HTTPS URL";
            }
        }
        d.a("PostExecutor", str);
        return null;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.e = z.a(u.a("application/json; charset=utf-8"), str);
    }
}
