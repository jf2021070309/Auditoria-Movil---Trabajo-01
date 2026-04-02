package com.amazon.aps.iva.xl;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jh.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ChromecastSubtitlesProvider.kt */
/* loaded from: classes2.dex */
public final class e extends RemoteMediaClient.Callback {
    public final Context a;
    public final com.amazon.aps.iva.ye.f b;
    public final f c;
    public final com.amazon.aps.iva.jh.i d;
    public final com.amazon.aps.iva.lh.a e;
    public final v0 f = x.e(z.b);
    public final v0 g = x.e(com.amazon.aps.iva.jh.d.c);

    /* compiled from: ChromecastSubtitlesProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.chromecast.ChromecastSubtitlesProviderImpl$init$1", f = "ChromecastSubtitlesProvider.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.ye.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        /* compiled from: ChromecastSubtitlesProvider.kt */
        /* renamed from: com.amazon.aps.iva.xl.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0863a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.ye.c.values().length];
                try {
                    iArr[com.amazon.aps.iva.ye.c.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.amazon.aps.iva.ye.c.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.amazon.aps.iva.ye.c.DISCONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ye.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ye.b castSession;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            int i = C0863a.a[((com.amazon.aps.iva.ye.c) this.h).ordinal()];
            e eVar = e.this;
            if (i != 1 && i != 2) {
                if (i == 3 && (castSession = eVar.b.getCastSession()) != null) {
                    castSession.removeCallback(eVar);
                }
            } else {
                com.amazon.aps.iva.ye.b castSession2 = eVar.b.getCastSession();
                if (castSession2 != null) {
                    castSession2.addCallback(eVar);
                }
            }
            return q.a;
        }
    }

    public e(Context context, com.amazon.aps.iva.ye.f fVar, g gVar, com.amazon.aps.iva.jh.i iVar, com.amazon.aps.iva.lh.b bVar) {
        this.a = context;
        this.b = fVar;
        this.c = gVar;
        this.d = iVar;
        this.e = bVar;
    }

    public final List<com.amazon.aps.iva.jh.f> a() {
        List<c> a2;
        Object obj;
        String c;
        Object cVar;
        d a3 = this.c.a();
        Object obj2 = com.amazon.aps.iva.jh.d.c;
        if (a3 != null && (a2 = a3.a()) != null) {
            List<c> list = a2;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (c cVar2 : list) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : this.d.read()) {
                    if (obj3 instanceof n) {
                        arrayList2.add(obj3);
                    }
                }
                if (com.amazon.aps.iva.yb0.j.a(cVar2.b(), "off")) {
                    cVar = obj2;
                } else {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (com.amazon.aps.iva.yb0.j.a(cVar2.b(), ((n) obj).c)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    n nVar = (n) obj;
                    if (nVar == null || (c = nVar.d) == null) {
                        c = cVar2.c();
                    }
                    if (cVar2.d()) {
                        String string = this.a.getString(R.string.closed_caption_language_title, c);
                        com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …                        )");
                        cVar = new com.amazon.aps.iva.jh.b(string, cVar2.b(), cVar2.a());
                    } else {
                        cVar = new com.amazon.aps.iva.jh.c(c, cVar2.b(), cVar2.a());
                    }
                }
                arrayList.add(cVar);
            }
            ArrayList j0 = u.j0(arrayList, com.amazon.aps.iva.jh.b.class);
            com.amazon.aps.iva.lh.a aVar = this.e;
            return com.amazon.aps.iva.lb0.x.M0(com.amazon.aps.iva.lb0.x.L0(aVar.c(u.j0(arrayList, com.amazon.aps.iva.jh.c.class)), aVar.c(j0)), obj2);
        }
        return f1.J(obj2);
    }

    public final void b(g0 g0Var) {
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(this.b.getCastStateFlow(), new a(null)));
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            java.util.List r0 = r7.a()
            com.amazon.aps.iva.ve0.v0 r1 = r7.f
            r1.setValue(r0)
            java.util.List r0 = r7.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.amazon.aps.iva.jh.f r3 = (com.amazon.aps.iva.jh.f) r3
            boolean r4 = r3 instanceof com.amazon.aps.iva.jh.b
            if (r4 == 0) goto L29
            r4 = r3
            com.amazon.aps.iva.jh.b r4 = (com.amazon.aps.iva.jh.b) r4
            goto L2a
        L29:
            r4 = r2
        L2a:
            if (r4 == 0) goto L2f
            java.lang.String r4 = r4.e
            goto L30
        L2f:
            r4 = r2
        L30:
            com.amazon.aps.iva.xl.f r5 = r7.c
            com.amazon.aps.iva.xl.d r6 = r5.a()
            if (r6 == 0) goto L3d
            java.lang.String r6 = r6.b()
            goto L3e
        L3d:
            r6 = r2
        L3e:
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r6)
            if (r4 != 0) goto L65
            boolean r4 = r3 instanceof com.amazon.aps.iva.jh.c
            if (r4 == 0) goto L4b
            com.amazon.aps.iva.jh.c r3 = (com.amazon.aps.iva.jh.c) r3
            goto L4c
        L4b:
            r3 = r2
        L4c:
            if (r3 == 0) goto L51
            java.lang.String r3 = r3.e
            goto L52
        L51:
            r3 = r2
        L52:
            com.amazon.aps.iva.xl.d r4 = r5.a()
            if (r4 == 0) goto L5c
            java.lang.String r2 = r4.b()
        L5c:
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r3, r2)
            if (r2 == 0) goto L63
            goto L65
        L63:
            r2 = 0
            goto L66
        L65:
            r2 = 1
        L66:
            if (r2 == 0) goto L13
            r2 = r1
        L69:
            com.amazon.aps.iva.jh.f r2 = (com.amazon.aps.iva.jh.f) r2
            if (r2 != 0) goto L6f
            com.amazon.aps.iva.jh.d r2 = com.amazon.aps.iva.jh.d.c
        L6f:
            com.amazon.aps.iva.ve0.v0 r0 = r7.g
            r0.setValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xl.e.c():void");
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void onMetadataUpdated() {
        c();
    }
}
