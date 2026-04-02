package com.ellation.crunchyroll.downloading.exoplayer;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.iva.dw.o;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.m6.m;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.t0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.s6.t;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.zv.b;
import com.ellation.crunchyroll.downloading.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
/* loaded from: classes2.dex */
public final class c implements f.a {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ ExoPlayerLocalVideosManagerImpl c;

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
        public final /* synthetic */ ExoPlayerLocalVideosManagerImpl h;
        public final /* synthetic */ String i;
        public final /* synthetic */ IOException j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl, String str, IOException iOException) {
            super(1);
            this.h = exoPlayerLocalVideosManagerImpl;
            this.i = str;
            this.j = iOException;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g0 g0Var) {
            j.f(g0Var, "$this$notify");
            ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl = this.h;
            exoPlayerLocalVideosManagerImpl.getClass();
            exoPlayerLocalVideosManagerImpl.notify(new o(this.i, this.j));
            return q.a;
        }
    }

    public c(String str, byte[] bArr, ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl) {
        this.a = str;
        this.b = bArr;
        this.c = exoPlayerLocalVideosManagerImpl;
    }

    @Override // com.amazon.aps.iva.m6.f.a
    public final void a(f fVar) {
        int length;
        m mVar;
        byte[] bArr;
        int i = 0;
        v vVar = fVar.b;
        if (vVar == null) {
            length = 0;
        } else {
            com.amazon.aps.iva.cq.b.C(fVar.g);
            length = fVar.j.length;
        }
        int i2 = 0;
        while (true) {
            int i3 = 3;
            g gVar = fVar.c;
            if (i2 < length) {
                com.amazon.aps.iva.cq.b.C(fVar.g);
                t.a aVar = fVar.k[i2];
                j.e(aVar, "getMappedTrackInfo(periodIndex)");
                int i4 = i;
                while (i4 < aVar.a) {
                    o0 o0Var = aVar.c[i4];
                    j.e(o0Var, "mappedTrackInfo.getTrackGroups(rendererIndex)");
                    int i5 = i;
                    while (i5 < o0Var.b) {
                        s0 a2 = o0Var.a(i5);
                        j.e(a2, "trackGroups[groupIndex]");
                        int i6 = a2.b;
                        if (i6 != 0) {
                            Integer[] numArr = new Integer[i3];
                            numArr[i] = 1;
                            numArr[1] = 2;
                            numArr[2] = Integer.valueOf(i3);
                            if (f1.K(numArr).contains(Integer.valueOf(a2.d))) {
                                ArrayList arrayList = new ArrayList(i6);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    arrayList.add(Integer.valueOf(i7));
                                }
                                t0 t0Var = new t0(a2, arrayList);
                                Context context = b.a.a;
                                if (context != null) {
                                    u0.a aVar2 = new u0.a(context);
                                    aVar2.y.put(t0Var.b, t0Var);
                                    u0 u0Var = new u0(aVar2);
                                    try {
                                        com.amazon.aps.iva.cq.b.C(fVar.g);
                                        gVar.U(u0Var);
                                        fVar.b(i2);
                                        UnmodifiableIterator<t0> it = u0Var.z.values().iterator();
                                        while (it.hasNext()) {
                                            u0.a aVar3 = new u0.a(u0Var);
                                            aVar3.k(it.next());
                                            gVar.U(new u0(aVar3));
                                            fVar.b(i2);
                                        }
                                    } catch (com.amazon.aps.iva.a6.l e) {
                                        throw new IllegalStateException(e);
                                    }
                                } else {
                                    j.m("internalContext");
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        }
                        i5++;
                        i = 0;
                        i3 = 3;
                    }
                    i4++;
                    i = 0;
                    i3 = 3;
                }
                i2++;
                i = 0;
            } else {
                byte[] bArr2 = null;
                String str = this.a;
                b0.g gVar2 = fVar.a;
                Uri uri = gVar2.b;
                String str2 = gVar2.c;
                b0.e eVar = gVar2.d;
                if (eVar != null && (bArr = eVar.i) != null) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
                byte[] bArr3 = bArr2;
                String str3 = gVar2.g;
                if (vVar == null) {
                    mVar = new m(str, uri, str2, ImmutableList.of(), bArr3, str3, null);
                } else {
                    com.amazon.aps.iva.cq.b.C(fVar.g);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = fVar.l.length;
                    for (int i8 = 0; i8 < length2; i8++) {
                        arrayList3.clear();
                        int length3 = fVar.l[i8].length;
                        for (int i9 = 0; i9 < length3; i9++) {
                            arrayList3.addAll(fVar.l[i8][i9]);
                        }
                        arrayList2.addAll(fVar.i.j[i8].f(arrayList3));
                    }
                    mVar = new m(str, uri, str2, arrayList2, bArr3, str3, null);
                }
                this.c.h.C(new m(mVar.b, mVar.c, mVar.d, mVar.e, this.b, mVar.g, mVar.h));
                f.e eVar2 = fVar.i;
                if (eVar2 != null && !eVar2.k) {
                    eVar2.k = true;
                    eVar2.h.sendEmptyMessage(3);
                }
                gVar.release();
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.m6.f.a
    public final void b(f fVar, IOException iOException) {
        j.f(iOException, "e");
        ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl = this.c;
        exoPlayerLocalVideosManagerImpl.notify(new a(exoPlayerLocalVideosManagerImpl, this.a, iOException));
    }
}
