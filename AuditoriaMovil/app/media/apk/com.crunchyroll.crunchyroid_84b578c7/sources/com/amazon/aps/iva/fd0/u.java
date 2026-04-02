package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.gd0.z;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.d0;
import com.amazon.aps.iva.lb0.e0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes4.dex */
public final class u {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* loaded from: classes4.dex */
    public final class a {
        public final String a;
        public final /* synthetic */ u b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: com.amazon.aps.iva.fd0.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0250a {
            public final String a;
            public final ArrayList b = new ArrayList();
            public com.amazon.aps.iva.kb0.j<String, x> c = new com.amazon.aps.iva.kb0.j<>("V", null);

            public C0250a(a aVar, String str) {
                this.a = str;
            }

            public final void a(String str, h... hVarArr) {
                boolean z;
                x xVar;
                com.amazon.aps.iva.yb0.j.f(str, "type");
                ArrayList arrayList = this.b;
                if (hVarArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    xVar = null;
                } else {
                    d0 d0Var = new d0(new com.amazon.aps.iva.lb0.p(hVarArr));
                    int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(d0Var));
                    if (w < 16) {
                        w = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(w);
                    Iterator it = d0Var.iterator();
                    while (true) {
                        e0 e0Var = (e0) it;
                        if (!e0Var.hasNext()) {
                            break;
                        }
                        c0 c0Var = (c0) e0Var.next();
                        linkedHashMap.put(Integer.valueOf(c0Var.a), (h) c0Var.b);
                    }
                    xVar = new x(linkedHashMap);
                }
                arrayList.add(new com.amazon.aps.iva.kb0.j(str, xVar));
            }

            public final void b(com.amazon.aps.iva.vd0.c cVar) {
                com.amazon.aps.iva.yb0.j.f(cVar, "type");
                String desc = cVar.getDesc();
                com.amazon.aps.iva.yb0.j.e(desc, "type.desc");
                this.c = new com.amazon.aps.iva.kb0.j<>(desc, null);
            }

            public final void c(String str, h... hVarArr) {
                com.amazon.aps.iva.yb0.j.f(str, "type");
                d0 d0Var = new d0(new com.amazon.aps.iva.lb0.p(hVarArr));
                int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(d0Var));
                if (w < 16) {
                    w = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(w);
                Iterator it = d0Var.iterator();
                while (true) {
                    e0 e0Var = (e0) it;
                    if (e0Var.hasNext()) {
                        c0 c0Var = (c0) e0Var.next();
                        linkedHashMap.put(Integer.valueOf(c0Var.a), (h) c0Var.b);
                    } else {
                        this.c = new com.amazon.aps.iva.kb0.j<>(str, new x(linkedHashMap));
                        return;
                    }
                }
            }
        }

        public a(u uVar, String str) {
            com.amazon.aps.iva.yb0.j.f(str, "className");
            this.b = uVar;
            this.a = str;
        }

        public final void a(String str, com.amazon.aps.iva.xb0.l<? super C0250a, com.amazon.aps.iva.kb0.q> lVar) {
            LinkedHashMap linkedHashMap = this.b.a;
            C0250a c0250a = new C0250a(this, str);
            lVar.invoke(c0250a);
            ArrayList arrayList = c0250a.b;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((com.amazon.aps.iva.kb0.j) it.next()).b);
            }
            String str2 = c0250a.c.b;
            String str3 = c0250a.a;
            com.amazon.aps.iva.yb0.j.f(str3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(str2, "ret");
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append('(');
            sb.append(com.amazon.aps.iva.lb0.x.B0(arrayList2, "", null, null, z.h, 30));
            sb.append(')');
            if (str2.length() > 1) {
                str2 = "L" + str2 + ';';
            }
            sb.append(str2);
            String sb2 = sb.toString();
            String str4 = this.a;
            com.amazon.aps.iva.yb0.j.f(str4, "internalName");
            com.amazon.aps.iva.yb0.j.f(sb2, "jvmDescriptor");
            String str5 = str4 + '.' + sb2;
            x xVar = c0250a.c.c;
            ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((x) ((com.amazon.aps.iva.kb0.j) it2.next()).c);
            }
            linkedHashMap.put(str5, new n(xVar, arrayList3));
        }
    }
}
