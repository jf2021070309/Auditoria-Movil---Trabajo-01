package com.amazon.aps.iva.ma0;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.da0.k;
import com.amazon.aps.iva.da0.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.ga0.g;
import com.amazon.aps.iva.ga0.h;
import com.amazon.aps.iva.ga0.i;
import com.amazon.aps.iva.ga0.n;
import com.amazon.aps.iva.ga0.o;
import com.amazon.aps.iva.ia0.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.ka0.a0;
import com.amazon.aps.iva.ka0.t;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SessionDataBinding.kt */
/* loaded from: classes4.dex */
public final class d implements t.a<m> {
    public static final /* synthetic */ l<Object>[] b = {e.b(d.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Landroidx/media3/exoplayer/analytics/AnalyticsListener;", 0)};
    public final com.amazon.aps.iva.ba0.a a = new com.amazon.aps.iva.ba0.a(null);

    /* compiled from: SessionDataBinding.kt */
    /* loaded from: classes4.dex */
    public static final class a implements com.amazon.aps.iva.b6.b {
        public final y a;
        public final com.amazon.aps.iva.ba0.a b;
        public static final /* synthetic */ l<Object>[] d = {q.a(a.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0)};
        public static final c c = new c();
        public static final com.amazon.aps.iva.kb0.m e = f.b(C0506a.h);
        public static final com.amazon.aps.iva.kb0.m f = f.b(b.h);

        /* compiled from: SessionDataBinding.kt */
        /* renamed from: com.amazon.aps.iva.ma0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0506a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Pattern> {
            public static final C0506a h = new C0506a();

            public C0506a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Pattern invoke() {
                return Pattern.compile("DATA-ID=\"(.*)\",");
            }
        }

        /* compiled from: SessionDataBinding.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Pattern> {
            public static final b h = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Pattern invoke() {
                return Pattern.compile("VALUE=\"(.*)\"");
            }
        }

        /* compiled from: SessionDataBinding.kt */
        /* loaded from: classes4.dex */
        public static final class c {
        }

        public a(m mVar, y yVar) {
            j.f(mVar, "player");
            j.f(yVar, "collector");
            this.a = yVar;
            this.b = new com.amazon.aps.iva.ba0.a(mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.b6.b
        public final void u(b.a aVar, int i) {
            Class<? extends com.amazon.aps.iva.ga0.c> cls;
            o oVar;
            String str;
            boolean z;
            j.f(aVar, "eventTime");
            m mVar = (m) this.b.getValue(this, d[0]);
            if (mVar != null) {
                Object M = mVar.M();
                if (M instanceof com.amazon.aps.iva.h6.j) {
                    List<String> list = ((com.amazon.aps.iva.h6.j) M).a.b;
                    j.e(list, "manifest.multivariantPlaylist.tags");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        String substring = ((String) obj).substring(1);
                        j.e(substring, "this as java.lang.String).substring(startIndex)");
                        if (com.amazon.aps.iva.oe0.m.h0(substring, "EXT-X-SESSION-DATA", false)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        String str2 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        c.getClass();
                        Object value = e.getValue();
                        j.e(value, "<get-RX_SESSION_TAG_DATA_ID>(...)");
                        Matcher matcher = ((Pattern) value).matcher(str3);
                        j.e(matcher, "RX_SESSION_TAG_DATA_ID.matcher(line)");
                        Object value2 = f.getValue();
                        j.e(value2, "<get-RX_SESSION_TAG_VALUES>(...)");
                        Matcher matcher2 = ((Pattern) value2).matcher(str3);
                        j.e(matcher2, "RX_SESSION_TAG_VALUES.matcher(line)");
                        String str4 = "";
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                str2 = com.amazon.aps.iva.oe0.m.f0(group, "io.litix.data.", "");
                            }
                        } else {
                            com.amazon.aps.iva.ia0.b.a("SessionDataListener", "Data-ID not found in session data: " + str3);
                            str2 = "";
                        }
                        if (matcher2.find()) {
                            str4 = matcher2.group(1);
                        } else {
                            com.amazon.aps.iva.ia0.b.a("SessionDataListener", "Value not found in session data: " + str3);
                        }
                        arrayList2.add(new com.amazon.aps.iva.ga0.l(str2, str4));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str5 = ((com.amazon.aps.iva.ga0.l) next).a;
                        if (str5 != null && com.amazon.aps.iva.oe0.q.i0(str5, "io.litix.data.", false)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(next);
                        }
                    }
                    y yVar = this.a;
                    yVar.getClass();
                    if (!j.a(yVar.s, arrayList3)) {
                        yVar.s = arrayList3;
                        a0 a0Var = yVar.a;
                        a0Var.getClass();
                        com.amazon.aps.iva.da0.q qVar = new com.amazon.aps.iva.da0.q();
                        qVar.c = null;
                        qVar.d = null;
                        qVar.f = null;
                        qVar.g = null;
                        qVar.e = null;
                        qVar.i = null;
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            com.amazon.aps.iva.ga0.l lVar = (com.amazon.aps.iva.ga0.l) it3.next();
                            String str6 = lVar.a;
                            ImmutableMap<String, c.a> immutableMap = com.amazon.aps.iva.ia0.c.a;
                            if (immutableMap.containsKey(str6)) {
                                cls = immutableMap.get(str6).b;
                            } else {
                                cls = null;
                            }
                            StringBuilder sb = new StringBuilder("Data key is ");
                            String str7 = lVar.a;
                            sb.append(str7);
                            sb.append(" Data is ");
                            sb.append(lVar);
                            com.amazon.aps.iva.ia0.b.b("SessionDataEvent", sb.toString());
                            if (cls == null) {
                                com.amazon.aps.iva.ia0.b.b("SessionDataEvent", "Unknown experiment value ignored: " + str7);
                            } else {
                                com.amazon.aps.iva.ia0.b.a("SessionDataEvent", "Obtained class ".concat(cls.getSimpleName()));
                                if (cls.equals(o.class)) {
                                    o oVar2 = (o) f1.I(qVar.c, new com.amazon.aps.iva.da0.j());
                                    qVar.c = oVar2;
                                    oVar = oVar2;
                                } else if (cls.equals(n.class)) {
                                    n nVar = (n) f1.I(qVar.d, new k());
                                    qVar.d = nVar;
                                    oVar = nVar;
                                } else if (cls.equals(g.class)) {
                                    g gVar = (g) f1.I(qVar.e, new com.amazon.aps.iva.da0.l());
                                    qVar.e = gVar;
                                    oVar = gVar;
                                } else if (cls.equals(com.amazon.aps.iva.ga0.f.class)) {
                                    com.amazon.aps.iva.ga0.f fVar = (com.amazon.aps.iva.ga0.f) f1.I(qVar.f, new com.amazon.aps.iva.da0.m());
                                    qVar.f = fVar;
                                    oVar = fVar;
                                } else if (cls.equals(h.class)) {
                                    h hVar = (h) f1.I(qVar.g, new com.amazon.aps.iva.da0.n());
                                    qVar.g = hVar;
                                    oVar = hVar;
                                } else if (cls.equals(i.class)) {
                                    i iVar = (i) f1.I(qVar.h, new com.amazon.aps.iva.da0.o());
                                    qVar.h = iVar;
                                    oVar = iVar;
                                } else if (cls.equals(com.amazon.aps.iva.ga0.d.class)) {
                                    com.amazon.aps.iva.ga0.d dVar = (com.amazon.aps.iva.ga0.d) f1.I(qVar.i, new p());
                                    qVar.i = dVar;
                                    oVar = dVar;
                                } else {
                                    com.amazon.aps.iva.ia0.b.a("SessionDataEvent", "Unknown session data with key [" + str7 + "] was ignored");
                                }
                                if (immutableMap.containsKey(str7)) {
                                    str = immutableMap.get(str7).a;
                                } else {
                                    str = null;
                                }
                                oVar.b(str, lVar.b);
                            }
                        }
                        com.amazon.aps.iva.ca0.a.a(a0Var.d, qVar);
                    }
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void a(m mVar, y yVar) {
        m mVar2 = mVar;
        j.f(mVar2, "player");
        j.f(yVar, "collector");
        if (((Boolean) c.a.getValue()).booleanValue()) {
            a aVar = new a(mVar2, yVar);
            mVar2.b0(aVar);
            l<Object> lVar = b[0];
            com.amazon.aps.iva.ba0.a aVar2 = this.a;
            aVar2.getClass();
            j.f(lVar, "property");
            aVar2.a = new WeakReference<>(aVar);
        }
    }

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void b(m mVar, y yVar) {
        m mVar2 = mVar;
        j.f(yVar, "collector");
        com.amazon.aps.iva.b6.b bVar = (com.amazon.aps.iva.b6.b) this.a.getValue(this, b[0]);
        if (bVar != null) {
            mVar2.D0(bVar);
        }
    }
}
