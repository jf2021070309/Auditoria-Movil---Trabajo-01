package com.amazon.aps.iva.ec;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import com.amazon.aps.iva.ad.k;
import com.amazon.aps.iva.dd.j;
import com.amazon.aps.iva.nc.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public final class f<TranscodeType> extends com.amazon.aps.iva.dd.a<f<TranscodeType>> {
    public final Context B;
    public final g C;
    public final Class<TranscodeType> D;
    public final com.bumptech.glide.c E;
    public h<?, ? super TranscodeType> F;
    public Object G;
    public ArrayList H;
    public f<TranscodeType> I;
    public f<TranscodeType> J;
    public boolean K = true;
    public boolean L;
    public boolean M;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[c.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new com.amazon.aps.iva.dd.h().d(l.c).m(c.LOW).s(true);
    }

    @SuppressLint({"CheckResult"})
    public f(com.bumptech.glide.a aVar, g gVar, Class<TranscodeType> cls, Context context) {
        com.amazon.aps.iva.dd.h hVar;
        this.C = gVar;
        this.D = cls;
        this.B = context;
        Map<Class<?>, h<?, ?>> map = gVar.b.d.f;
        com.amazon.aps.iva.ec.a aVar2 = map.get(cls);
        if (aVar2 == null) {
            for (Map.Entry<Class<?>, h<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aVar2 = (h<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.F = (h<?, ? super TranscodeType>) (aVar2 == null ? com.bumptech.glide.c.k : aVar2);
        this.E = aVar.d;
        Iterator<com.amazon.aps.iva.dd.g<Object>> it = gVar.j.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        synchronized (gVar) {
            hVar = gVar.k;
        }
        y(hVar);
    }

    @Override // com.amazon.aps.iva.dd.a
    /* renamed from: A */
    public final f<TranscodeType> clone() {
        f<TranscodeType> fVar = (f) super.clone();
        fVar.F = (h<?, ? super TranscodeType>) fVar.F.clone();
        if (fVar.H != null) {
            fVar.H = new ArrayList(fVar.H);
        }
        f<TranscodeType> fVar2 = fVar.I;
        if (fVar2 != null) {
            fVar.I = fVar2.clone();
        }
        f<TranscodeType> fVar3 = fVar.J;
        if (fVar3 != null) {
            fVar.J = fVar3.clone();
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(android.widget.ImageView r5) {
        /*
            r4 = this;
            com.amazon.aps.iva.hd.l.a()
            defpackage.i.l(r5)
            int r0 = r4.b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = com.amazon.aps.iva.dd.a.h(r0, r1)
            if (r0 != 0) goto L6b
            boolean r0 = r4.o
            if (r0 == 0) goto L6b
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6b
            int[] r0 = com.amazon.aps.iva.ec.f.a.a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L5b;
                case 2: goto L4b;
                case 3: goto L3b;
                case 4: goto L3b;
                case 5: goto L3b;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L6b
        L2b:
            com.amazon.aps.iva.ec.f r0 = r4.clone()
            com.amazon.aps.iva.uc.m$c r2 = com.amazon.aps.iva.uc.m.b
            com.amazon.aps.iva.uc.j r3 = new com.amazon.aps.iva.uc.j
            r3.<init>()
            com.amazon.aps.iva.dd.a r0 = r0.o(r2, r3, r1)
            goto L6c
        L3b:
            com.amazon.aps.iva.ec.f r0 = r4.clone()
            com.amazon.aps.iva.uc.m$e r2 = com.amazon.aps.iva.uc.m.a
            com.amazon.aps.iva.uc.r r3 = new com.amazon.aps.iva.uc.r
            r3.<init>()
            com.amazon.aps.iva.dd.a r0 = r0.o(r2, r3, r1)
            goto L6c
        L4b:
            com.amazon.aps.iva.ec.f r0 = r4.clone()
            com.amazon.aps.iva.uc.m$c r2 = com.amazon.aps.iva.uc.m.b
            com.amazon.aps.iva.uc.j r3 = new com.amazon.aps.iva.uc.j
            r3.<init>()
            com.amazon.aps.iva.dd.a r0 = r0.o(r2, r3, r1)
            goto L6c
        L5b:
            com.amazon.aps.iva.ec.f r0 = r4.clone()
            com.amazon.aps.iva.uc.m$d r1 = com.amazon.aps.iva.uc.m.c
            com.amazon.aps.iva.uc.i r2 = new com.amazon.aps.iva.uc.i
            r2.<init>()
            com.amazon.aps.iva.dd.a r0 = r0.i(r1, r2)
            goto L6c
        L6b:
            r0 = r4
        L6c:
            com.bumptech.glide.c r1 = r4.E
            com.amazon.aps.iva.hb.e r1 = r1.c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.D
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L83
            com.amazon.aps.iva.ed.b r1 = new com.amazon.aps.iva.ed.b
            r1.<init>(r5)
            goto L90
        L83:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L97
            com.amazon.aps.iva.ed.e r1 = new com.amazon.aps.iva.ed.e
            r1.<init>(r5)
        L90:
            com.amazon.aps.iva.hd.e$a r5 = com.amazon.aps.iva.hd.e.a
            r2 = 0
            r4.C(r1, r2, r0, r5)
            return
        L97:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ec.f.B(android.widget.ImageView):void");
    }

    public final void C(com.amazon.aps.iva.ed.h hVar, com.amazon.aps.iva.dd.g gVar, com.amazon.aps.iva.dd.a aVar, Executor executor) {
        boolean z;
        i.l(hVar);
        if (this.L) {
            Object obj = new Object();
            h<?, ? super TranscodeType> hVar2 = this.F;
            com.amazon.aps.iva.dd.d z2 = z(aVar.l, aVar.k, aVar.e, hVar2, aVar, null, gVar, hVar, obj, executor);
            com.amazon.aps.iva.dd.d request = hVar.getRequest();
            if (z2.c(request)) {
                if (!aVar.j && request.f()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i.l(request);
                    if (!request.isRunning()) {
                        request.j();
                        return;
                    }
                    return;
                }
            }
            this.C.a(hVar);
            hVar.setRequest(z2);
            g gVar2 = this.C;
            synchronized (gVar2) {
                gVar2.g.b.add(hVar);
                k kVar = gVar2.e;
                kVar.a.add(z2);
                if (!kVar.c) {
                    z2.j();
                } else {
                    z2.clear();
                    Log.isLoggable("RequestTracker", 2);
                    kVar.b.add(z2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final f<TranscodeType> E(Object obj) {
        if (this.w) {
            return clone().E(obj);
        }
        this.G = obj;
        this.L = true;
        p();
        return this;
    }

    public final j F(int i, int i2, c cVar, h hVar, com.amazon.aps.iva.dd.a aVar, com.amazon.aps.iva.dd.e eVar, com.amazon.aps.iva.dd.g gVar, com.amazon.aps.iva.ed.h hVar2, Object obj, Executor executor) {
        Context context = this.B;
        Object obj2 = this.G;
        Class<TranscodeType> cls = this.D;
        ArrayList arrayList = this.H;
        com.bumptech.glide.c cVar2 = this.E;
        return new j(context, cVar2, obj, obj2, cls, aVar, i, i2, cVar, hVar2, gVar, arrayList, eVar, cVar2.g, hVar.b, executor);
    }

    public final f G(com.amazon.aps.iva.wc.g gVar) {
        if (this.w) {
            return clone().G(gVar);
        }
        this.F = gVar;
        this.K = false;
        p();
        return this;
    }

    @Override // com.amazon.aps.iva.dd.a
    public final com.amazon.aps.iva.dd.a a(com.amazon.aps.iva.dd.a aVar) {
        i.l(aVar);
        return (f) super.a(aVar);
    }

    @Override // com.amazon.aps.iva.dd.a
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (super.equals(fVar)) {
                if (Objects.equals(this.D, fVar.D) && this.F.equals(fVar.F) && Objects.equals(this.G, fVar.G) && Objects.equals(this.H, fVar.H) && Objects.equals(this.I, fVar.I) && Objects.equals(this.J, fVar.J) && this.K == fVar.K && this.L == fVar.L) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.dd.a
    public final int hashCode() {
        return com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(super.hashCode(), this.D), this.F), this.G), this.H), this.I), this.J), null), this.K), this.L);
    }

    public final f<TranscodeType> x(com.amazon.aps.iva.dd.g<TranscodeType> gVar) {
        if (this.w) {
            return clone().x(gVar);
        }
        if (gVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(gVar);
        }
        p();
        return this;
    }

    public final f<TranscodeType> y(com.amazon.aps.iva.dd.a<?> aVar) {
        i.l(aVar);
        return (f) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.amazon.aps.iva.dd.d z(int i, int i2, c cVar, h hVar, com.amazon.aps.iva.dd.a aVar, com.amazon.aps.iva.dd.e eVar, com.amazon.aps.iva.dd.g gVar, com.amazon.aps.iva.ed.h hVar2, Object obj, Executor executor) {
        com.amazon.aps.iva.dd.b bVar;
        com.amazon.aps.iva.dd.b bVar2;
        j F;
        int i3;
        h<?, ? super TranscodeType> hVar3;
        c cVar2;
        int i4;
        int i5;
        if (this.J != null) {
            com.amazon.aps.iva.dd.b bVar3 = new com.amazon.aps.iva.dd.b(obj, eVar);
            bVar = bVar3;
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        f<TranscodeType> fVar = this.I;
        if (fVar != null) {
            if (!this.M) {
                h<?, ? super TranscodeType> hVar4 = fVar.F;
                if (fVar.K) {
                    hVar3 = hVar;
                } else {
                    hVar3 = hVar4;
                }
                if (com.amazon.aps.iva.dd.a.h(fVar.b, 8)) {
                    cVar2 = this.I.e;
                } else {
                    int i6 = a.b[cVar.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3 && i6 != 4) {
                                throw new IllegalArgumentException("unknown priority: " + this.e);
                            }
                            cVar2 = c.IMMEDIATE;
                        } else {
                            cVar2 = c.HIGH;
                        }
                    } else {
                        cVar2 = c.NORMAL;
                    }
                }
                c cVar3 = cVar2;
                f<TranscodeType> fVar2 = this.I;
                int i7 = fVar2.l;
                int i8 = fVar2.k;
                if (com.amazon.aps.iva.hd.l.i(i, i2)) {
                    f<TranscodeType> fVar3 = this.I;
                    if (!com.amazon.aps.iva.hd.l.i(fVar3.l, fVar3.k)) {
                        i5 = aVar.l;
                        i4 = aVar.k;
                        com.amazon.aps.iva.dd.k kVar = new com.amazon.aps.iva.dd.k(obj, bVar2);
                        j F2 = F(i, i2, cVar, hVar, aVar, kVar, gVar, hVar2, obj, executor);
                        this.M = true;
                        f<TranscodeType> fVar4 = this.I;
                        com.amazon.aps.iva.dd.d z = fVar4.z(i5, i4, cVar3, hVar3, fVar4, kVar, gVar, hVar2, obj, executor);
                        this.M = false;
                        kVar.c = F2;
                        kVar.d = z;
                        F = kVar;
                    }
                }
                i4 = i8;
                i5 = i7;
                com.amazon.aps.iva.dd.k kVar2 = new com.amazon.aps.iva.dd.k(obj, bVar2);
                j F22 = F(i, i2, cVar, hVar, aVar, kVar2, gVar, hVar2, obj, executor);
                this.M = true;
                f<TranscodeType> fVar42 = this.I;
                com.amazon.aps.iva.dd.d z2 = fVar42.z(i5, i4, cVar3, hVar3, fVar42, kVar2, gVar, hVar2, obj, executor);
                this.M = false;
                kVar2.c = F22;
                kVar2.d = z2;
                F = kVar2;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            F = F(i, i2, cVar, hVar, aVar, bVar2, gVar, hVar2, obj, executor);
        }
        if (bVar == null) {
            return F;
        }
        f<TranscodeType> fVar5 = this.J;
        int i9 = fVar5.l;
        int i10 = fVar5.k;
        if (com.amazon.aps.iva.hd.l.i(i, i2)) {
            f<TranscodeType> fVar6 = this.J;
            if (!com.amazon.aps.iva.hd.l.i(fVar6.l, fVar6.k)) {
                int i11 = aVar.l;
                i3 = aVar.k;
                i9 = i11;
                f<TranscodeType> fVar7 = this.J;
                com.amazon.aps.iva.dd.d z3 = fVar7.z(i9, i3, fVar7.e, fVar7.F, fVar7, bVar, gVar, hVar2, obj, executor);
                bVar.c = F;
                bVar.d = z3;
                return bVar;
            }
        }
        i3 = i10;
        f<TranscodeType> fVar72 = this.J;
        com.amazon.aps.iva.dd.d z32 = fVar72.z(i9, i3, fVar72.e, fVar72.F, fVar72, bVar, gVar, hVar2, obj, executor);
        bVar.c = F;
        bVar.d = z32;
        return bVar;
    }
}
