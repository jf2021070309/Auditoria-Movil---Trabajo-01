package e.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import e.c.a.m.s.k;
import e.c.a.m.s.l;
import e.c.a.n.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class h<TranscodeType> extends e.c.a.q.a<h<TranscodeType>> implements Cloneable {
    public final Context A;
    public final i B;
    public final Class<TranscodeType> C;
    public final d D;
    public j<?, ? super TranscodeType> E;
    public Object F;
    public List<e.c.a.q.d<TranscodeType>> G;
    public boolean H = true;
    public boolean I;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5477b;

        static {
            f.values();
            int[] iArr = new int[4];
            f5477b = iArr;
            try {
                iArr[f.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5477b[f.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5477b[f.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5477b[f.IMMEDIATE.ordinal()] = 4;
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
        new e.c.a.q.e().d(k.f5699c).l(f.LOW).p(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public h(b bVar, i iVar, Class<TranscodeType> cls, Context context) {
        e.c.a.q.e eVar;
        this.B = iVar;
        this.C = cls;
        this.A = context;
        d dVar = iVar.f5478b.f5439e;
        j<?, ?> jVar = dVar.f5463g.get(cls);
        if (jVar == null) {
            for (Map.Entry<Class<?>, j<?, ?>> entry : dVar.f5463g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    jVar = (j<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.E = (j<?, ? super TranscodeType>) (jVar == null ? (j<?, ? super TranscodeType>) d.a : jVar);
        this.D = bVar.f5439e;
        for (e.c.a.q.d<Object> dVar2 : iVar.f5487k) {
            if (dVar2 != null) {
                if (this.G == null) {
                    this.G = new ArrayList();
                }
                this.G.add(dVar2);
            }
        }
        synchronized (iVar) {
            eVar = iVar.f5488l;
        }
        a(eVar);
    }

    @Override // e.c.a.q.a
    public e.c.a.q.a b() {
        h hVar = (h) super.clone();
        hVar.E = (j<?, ? super TranscodeType>) hVar.E.a();
        return hVar;
    }

    @Override // e.c.a.q.a
    public Object clone() throws CloneNotSupportedException {
        h hVar = (h) super.clone();
        hVar.E = (j<?, ? super TranscodeType>) hVar.E.a();
        return hVar;
    }

    @Override // e.c.a.q.a
    /* renamed from: t */
    public h<TranscodeType> a(e.c.a.q.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (h) super.a(aVar);
    }

    public final e.c.a.q.b u(Object obj, e.c.a.q.h.h<TranscodeType> hVar, e.c.a.q.d<TranscodeType> dVar, e.c.a.q.c cVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, e.c.a.q.a<?> aVar, Executor executor) {
        return x(obj, hVar, dVar, aVar, null, jVar, fVar, i2, i3, executor);
    }

    public final <Y extends e.c.a.q.h.h<TranscodeType>> Y w(Y y, e.c.a.q.d<TranscodeType> dVar, e.c.a.q.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.I) {
            e.c.a.q.b u = u(new Object(), y, dVar, null, this.E, aVar.f5984d, aVar.f5991k, aVar.f5990j, aVar, executor);
            e.c.a.q.b f2 = y.f();
            e.c.a.q.g gVar = (e.c.a.q.g) u;
            if (gVar.i(f2)) {
                if (!(!aVar.f5989i && f2.d())) {
                    Objects.requireNonNull(f2, "Argument must not be null");
                    if (!f2.isRunning()) {
                        f2.c();
                    }
                    return y;
                }
            }
            this.B.i(y);
            y.c(u);
            i iVar = this.B;
            synchronized (iVar) {
                iVar.f5483g.a.add(y);
                n nVar = iVar.f5481e;
                nVar.a.add(u);
                if (nVar.f5968c) {
                    gVar.clear();
                    Log.isLoggable("RequestTracker", 2);
                    nVar.f5967b.add(u);
                } else {
                    gVar.c();
                }
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final e.c.a.q.b x(Object obj, e.c.a.q.h.h<TranscodeType> hVar, e.c.a.q.d<TranscodeType> dVar, e.c.a.q.a<?> aVar, e.c.a.q.c cVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, Executor executor) {
        Context context = this.A;
        d dVar2 = this.D;
        Object obj2 = this.F;
        Class<TranscodeType> cls = this.C;
        List<e.c.a.q.d<TranscodeType>> list = this.G;
        l lVar = dVar2.f5464h;
        Objects.requireNonNull(jVar);
        return new e.c.a.q.g(context, dVar2, obj, obj2, cls, aVar, i2, i3, fVar, hVar, dVar, list, cVar, lVar, e.c.a.q.i.a.f6015b, executor);
    }
}
