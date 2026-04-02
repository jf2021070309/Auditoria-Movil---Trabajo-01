package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.id0.h;
import com.amazon.aps.iva.oc0.c1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes4.dex */
public class q0 extends com.amazon.aps.iva.yb0.f0 {
    public static s k(com.amazon.aps.iva.yb0.b bVar) {
        com.amazon.aps.iva.fc0.f owner = bVar.getOwner();
        if (owner instanceof s) {
            return (s) owner;
        }
        return e.c;
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.g a(com.amazon.aps.iva.yb0.h hVar) {
        s k = k(hVar);
        String name = hVar.getName();
        String signature = hVar.getSignature();
        Object boundReceiver = hVar.getBoundReceiver();
        com.amazon.aps.iva.yb0.j.f(k, "container");
        com.amazon.aps.iva.yb0.j.f(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(signature, "signature");
        return new w(k, name, signature, null, boundReceiver);
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.d b(Class cls) {
        return b.a(cls);
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.f c(Class cls, String str) {
        Object putIfAbsent;
        c cVar = b.a;
        com.amazon.aps.iva.yb0.j.f(cls, "jClass");
        c cVar2 = b.b;
        cVar2.getClass();
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = cVar2.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = cVar2.a.invoke(cls)))) != null) {
            obj = putIfAbsent;
        }
        return (com.amazon.aps.iva.fc0.f) obj;
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.i d(com.amazon.aps.iva.yb0.m mVar) {
        return new x(k(mVar), mVar.getName(), mVar.getSignature(), mVar.getBoundReceiver());
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.j e(com.amazon.aps.iva.yb0.o oVar) {
        return new y(k(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.m f(com.amazon.aps.iva.yb0.s sVar) {
        return new e0(k(sVar), sVar.getName(), sVar.getSignature(), sVar.getBoundReceiver());
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.n g(com.amazon.aps.iva.yb0.u uVar) {
        return new f0(k(uVar), uVar.getName(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final com.amazon.aps.iva.fc0.o h(com.amazon.aps.iva.yb0.w wVar) {
        return new g0(k(wVar), wVar.getName(), wVar.getSignature());
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final String i(com.amazon.aps.iva.yb0.g gVar) {
        w b;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(gVar, "<this>");
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        w wVar = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            boolean z2 = false;
            if (d1.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.d2();
                com.amazon.aps.iva.od0.f fVar = com.amazon.aps.iva.md0.h.a;
                com.amazon.aps.iva.yb0.j.f(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(com.amazon.aps.iva.md0.a.b(d1));
                com.amazon.aps.iva.md0.f g = com.amazon.aps.iva.md0.h.g(byteArrayInputStream, d2);
                h.a aVar = com.amazon.aps.iva.id0.h.w;
                com.amazon.aps.iva.od0.f fVar2 = com.amazon.aps.iva.md0.h.a;
                aVar.getClass();
                com.amazon.aps.iva.od0.d dVar = new com.amazon.aps.iva.od0.d(byteArrayInputStream);
                com.amazon.aps.iva.od0.p pVar = (com.amazon.aps.iva.od0.p) aVar.a(dVar, fVar2);
                try {
                    dVar.a(0);
                    com.amazon.aps.iva.od0.b.b(pVar);
                    com.amazon.aps.iva.id0.h hVar = (com.amazon.aps.iva.id0.h) pVar;
                    int[] mv = metadata.mv();
                    if ((metadata.xi() & 8) != 0) {
                        z2 = true;
                    }
                    com.amazon.aps.iva.md0.e eVar = new com.amazon.aps.iva.md0.e(z2, mv);
                    Class<?> cls = gVar.getClass();
                    com.amazon.aps.iva.id0.s sVar = hVar.q;
                    com.amazon.aps.iva.yb0.j.e(sVar, "proto.typeTable");
                    wVar = new w(e.c, (com.amazon.aps.iva.oc0.s0) v0.f(cls, hVar, g, new com.amazon.aps.iva.kd0.g(sVar), eVar, com.amazon.aps.iva.hc0.c.b));
                } catch (com.amazon.aps.iva.od0.j e) {
                    e.b = pVar;
                    throw e;
                }
            }
        }
        if (wVar != null && (b = v0.b(wVar)) != null) {
            com.amazon.aps.iva.pd0.d dVar2 = r0.a;
            com.amazon.aps.iva.oc0.v o = b.o();
            StringBuilder sb = new StringBuilder();
            r0.a(sb, o);
            List<c1> f = o.f();
            com.amazon.aps.iva.yb0.j.e(f, "invoke.valueParameters");
            com.amazon.aps.iva.lb0.x.A0(f, sb, ", ", "(", ")", s0.h, 48);
            sb.append(" -> ");
            com.amazon.aps.iva.ee0.e0 returnType = o.getReturnType();
            com.amazon.aps.iva.yb0.j.c(returnType);
            sb.append(r0.d(returnType));
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        return super.i(gVar);
    }

    @Override // com.amazon.aps.iva.yb0.f0
    public final String j(com.amazon.aps.iva.yb0.l lVar) {
        return i(lVar);
    }
}
