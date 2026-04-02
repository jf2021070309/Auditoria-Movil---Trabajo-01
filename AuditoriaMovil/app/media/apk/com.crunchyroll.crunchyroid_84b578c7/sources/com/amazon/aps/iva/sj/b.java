package com.amazon.aps.iva.sj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.p6.b;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.q5.d;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.sj.a;
import com.amazon.aps.iva.sj.c;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.w5.i;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: ImaAdsLoader.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.p6.a {
    public final c.a a;
    public final Context b;
    public final c.b c;
    public boolean i;
    public l0 j;
    public l0 l;
    public com.amazon.aps.iva.sj.a m;
    public final C0710b d = new C0710b();
    public List<String> k = ImmutableList.of();
    public final HashMap<Object, com.amazon.aps.iva.sj.a> e = new HashMap<>();
    public final HashMap<com.amazon.aps.iva.p6.b, com.amazon.aps.iva.sj.a> f = new HashMap<>();
    public final r0.b g = new r0.b();
    public final r0.d h = new r0.d();

    /* compiled from: ImaAdsLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements c.b {
    }

    /* compiled from: ImaAdsLoader.java */
    /* renamed from: com.amazon.aps.iva.sj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0710b implements l0.c {
        public C0710b() {
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void H(int i, l0.d dVar, l0.d dVar2) {
            b bVar = b.this;
            bVar.g();
            b.f(bVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void M(boolean z) {
            b.f(b.this);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void q0(r0 r0Var, int i) {
            if (r0Var.r()) {
                return;
            }
            b bVar = b.this;
            bVar.g();
            b.f(bVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void w(int i) {
            b.f(b.this);
        }
    }

    static {
        c0.a("media3.exoplayer.ima");
    }

    public b(Context context, c.a aVar, a aVar2) {
        this.b = context.getApplicationContext();
        this.a = aVar;
        this.c = aVar2;
    }

    public static void f(b bVar) {
        int e;
        com.amazon.aps.iva.sj.a aVar;
        l0 l0Var = bVar.l;
        if (l0Var != null) {
            r0 a0 = l0Var.a0();
            if (!a0.r() && (e = a0.e(l0Var.p0(), bVar.g, bVar.h, l0Var.n(), l0Var.Q0())) != -1) {
                r0.b bVar2 = bVar.g;
                a0.g(e, bVar2);
                Object obj = bVar2.h.b;
                if (obj != null && (aVar = bVar.e.get(obj)) != null && aVar != bVar.m) {
                    aVar.y0(g0.e0(((Long) a0.k(bVar.h, bVar2, bVar2.d, -9223372036854775807L).second).longValue()), g0.e0(bVar2.e));
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.p6.a
    public final void a(com.amazon.aps.iva.p6.b bVar, int i, int i2) {
        if (this.l == null) {
            return;
        }
        com.amazon.aps.iva.sj.a aVar = this.f.get(bVar);
        aVar.getClass();
        a.b bVar2 = new a.b(i, i2);
        aVar.b.getClass();
        AdMediaInfo adMediaInfo = (AdMediaInfo) aVar.m.inverse().get(bVar2);
        if (adMediaInfo != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = aVar.k;
                if (i3 < arrayList.size()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i3)).onLoaded(adMediaInfo);
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            bVar2.toString();
            p.g();
        }
    }

    @Override // com.amazon.aps.iva.p6.a
    public final void b(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i == 0) {
                arrayList.add("application/dash+xml");
            } else if (i == 2) {
                arrayList.add("application/x-mpegURL");
            } else if (i == 4) {
                arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
            }
        }
        this.k = Collections.unmodifiableList(arrayList);
    }

    @Override // com.amazon.aps.iva.p6.a
    public final void c(com.amazon.aps.iva.p6.b bVar, int i, int i2, IOException iOException) {
        if (this.l == null) {
            return;
        }
        com.amazon.aps.iva.sj.a aVar = this.f.get(bVar);
        aVar.getClass();
        if (aVar.r != null) {
            try {
                aVar.t0(i, i2);
            } catch (RuntimeException e) {
                aVar.z0("handlePrepareError", e);
            }
        }
    }

    @Override // com.amazon.aps.iva.p6.a
    public final void d(com.amazon.aps.iva.p6.b bVar, i iVar, Object obj, d dVar, b.d dVar2) {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        if (this.i) {
            HashMap<com.amazon.aps.iva.p6.b, com.amazon.aps.iva.sj.a> hashMap = this.f;
            if (hashMap.isEmpty()) {
                l0 l0Var = this.j;
                this.l = l0Var;
                if (l0Var == null) {
                    return;
                }
                l0Var.u(this.d);
            }
            HashMap<Object, com.amazon.aps.iva.sj.a> hashMap2 = this.e;
            com.amazon.aps.iva.sj.a aVar = hashMap2.get(obj);
            if (aVar == null) {
                ViewGroup adViewGroup = dVar.getAdViewGroup();
                if (!hashMap2.containsKey(obj)) {
                    hashMap2.put(obj, new com.amazon.aps.iva.sj.a(this.b, this.a, this.c, this.k, iVar, obj, adViewGroup));
                }
                aVar = hashMap2.get(obj);
            }
            aVar.getClass();
            hashMap.put(bVar, aVar);
            ArrayList arrayList = aVar.j;
            boolean z = !arrayList.isEmpty();
            arrayList.add(dVar2);
            if (z) {
                if (!com.amazon.aps.iva.q5.c.h.equals(aVar.A)) {
                    dVar2.b(aVar.A);
                }
            } else {
                aVar.u = 0;
                VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                aVar.t = videoProgressUpdate;
                aVar.s = videoProgressUpdate;
                aVar.A0();
                if (!com.amazon.aps.iva.q5.c.h.equals(aVar.A)) {
                    dVar2.b(aVar.A);
                } else if (aVar.v != null) {
                    aVar.A = new com.amazon.aps.iva.q5.c(aVar.f, c.a(aVar.v.getAdCuePoints()));
                    aVar.C0();
                }
                for (com.amazon.aps.iva.q5.a aVar2 : dVar.getAdOverlayInfos()) {
                    View view = aVar2.a;
                    int i = aVar2.b;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            } else {
                                friendlyObstructionPurpose = FriendlyObstructionPurpose.NOT_VISIBLE;
                            }
                        } else {
                            friendlyObstructionPurpose = FriendlyObstructionPurpose.CLOSE_AD;
                        }
                    } else {
                        friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
                    }
                    ((a) aVar.c).getClass();
                    aVar.n.registerFriendlyObstruction(ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, aVar2.c));
                }
            }
            g();
            return;
        }
        throw new IllegalStateException("Set player using adsLoader.setPlayer before preparing the player.");
    }

    @Override // com.amazon.aps.iva.p6.a
    public final void e(com.amazon.aps.iva.p6.b bVar, b.d dVar) {
        HashMap<com.amazon.aps.iva.p6.b, com.amazon.aps.iva.sj.a> hashMap = this.f;
        com.amazon.aps.iva.sj.a remove = hashMap.remove(bVar);
        g();
        if (remove != null) {
            ArrayList arrayList = remove.j;
            arrayList.remove(dVar);
            if (arrayList.isEmpty()) {
                remove.n.unregisterAllFriendlyObstructions();
            }
        }
        if (this.l != null && hashMap.isEmpty()) {
            this.l.t0(this.d);
            this.l = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r15.f.containsValue(r1) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sj.b.g():void");
    }
}
