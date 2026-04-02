package com.amazon.aps.iva.ol;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.jh.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ChromecastAudioProvider.kt */
/* loaded from: classes2.dex */
public final class a extends RemoteMediaClient.Callback {
    public final Context a;
    public final com.amazon.aps.iva.ye.f b;
    public final com.amazon.aps.iva.ze.c c;
    public final com.amazon.aps.iva.jh.i d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final v<List<com.amazon.aps.iva.nl.a>> f = new v<>(z.b);

    /* compiled from: ChromecastAudioProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.audio.chromecast.ChromecastAudioProviderImpl$init$1", f = "ChromecastAudioProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.ol.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0577a extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.ye.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        /* compiled from: ChromecastAudioProvider.kt */
        /* renamed from: com.amazon.aps.iva.ol.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0578a {
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

        public C0577a(com.amazon.aps.iva.ob0.d<? super C0577a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0577a c0577a = new C0577a(dVar);
            c0577a.h = obj;
            return c0577a;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ye.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0577a) create(cVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ye.b castSession;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            int i = C0578a.a[((com.amazon.aps.iva.ye.c) this.h).ordinal()];
            a aVar2 = a.this;
            if (i != 1 && i != 2) {
                if (i == 3 && (castSession = aVar2.b.getCastSession()) != null) {
                    castSession.removeCallback(aVar2);
                }
            } else {
                com.amazon.aps.iva.ye.b castSession2 = aVar2.b.getCastSession();
                if (castSession2 != null) {
                    castSession2.addCallback(aVar2);
                }
            }
            return q.a;
        }
    }

    public a(androidx.fragment.app.h hVar, com.amazon.aps.iva.ye.f fVar, com.amazon.aps.iva.ze.c cVar, com.amazon.aps.iva.jh.i iVar, com.amazon.aps.iva.xb0.a aVar) {
        this.a = hVar;
        this.b = fVar;
        this.c = cVar;
        this.d = iVar;
        this.e = aVar;
    }

    public final void a(g0 g0Var) {
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(this.b.getCastStateFlow(), new C0577a(null)));
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void b() {
        ?? r3;
        List<com.amazon.aps.iva.ze.a> b;
        Object obj;
        String a;
        boolean z;
        LiveData liveData = this.f;
        com.amazon.aps.iva.ze.c cVar = this.c;
        com.amazon.aps.iva.ze.b audioVersions = cVar.getAudioVersions();
        if (audioVersions != null && (b = audioVersions.b()) != null) {
            List<com.amazon.aps.iva.ze.a> list = b;
            r3 = new ArrayList(r.Y(list));
            for (com.amazon.aps.iva.ze.a aVar : list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : this.d.read()) {
                    if (obj2 instanceof l) {
                        arrayList.add(obj2);
                    }
                }
                String b2 = aVar.b();
                if (com.amazon.aps.iva.yb0.j.a(aVar.a(), Locale.JAPAN.toLanguageTag())) {
                    a = this.a.getString(R.string.japanese);
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (com.amazon.aps.iva.yb0.j.a(((l) obj).c, aVar.a())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    l lVar = (l) obj;
                    if (lVar == null || (a = lVar.d) == null) {
                        a = aVar.a();
                    }
                }
                String str = a;
                com.amazon.aps.iva.yb0.j.e(str, "if (audio.audioLocale ==…oLocale\n                }");
                if (aVar.d() && !this.e.invoke().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = z;
                String b3 = aVar.b();
                com.amazon.aps.iva.ze.b audioVersions2 = cVar.getAudioVersions();
                com.amazon.aps.iva.yb0.j.c(audioVersions2);
                r3.add(new com.amazon.aps.iva.nl.a(b2, str, z2, com.amazon.aps.iva.yb0.j.a(b3, audioVersions2.a()), aVar.c()));
            }
        } else {
            r3 = z.b;
        }
        liveData.k(r3);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
    public final void onMetadataUpdated() {
        b();
    }
}
