package com.ellation.crunchyroll.downloading.exoplayer;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.dw.e;
import com.amazon.aps.iva.dw.f;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: ExoPlayerEventsMapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/downloading/exoplayer/ExoPlayerEventsMapperImpl;", "Lcom/ellation/crunchyroll/downloading/exoplayer/ExoPlayerEventsMapper;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "downloading_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class ExoPlayerEventsMapperImpl implements ExoPlayerEventsMapper, EventDispatcher<g0> {
    public final e b;
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<g0> c = new EventDispatcher.EventDispatcherImpl<>();

    /* compiled from: ExoPlayerEventsMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
        public final /* synthetic */ com.amazon.aps.iva.m6.c h;
        public final /* synthetic */ e0 i;
        public final /* synthetic */ Exception j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.m6.c cVar, e0 e0Var, Exception exc) {
            super(1);
            this.h = cVar;
            this.i = e0Var;
            this.j = exc;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            j.f(g0Var2, "$this$notify");
            int i = this.h.b;
            e0 e0Var = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 7) {
                                    g0Var2.M3(f1.J(e0Var));
                                }
                            } else {
                                Exception exc = this.j;
                                if (exc == null) {
                                    exc = new Exception();
                                }
                                g0Var2.z3(e0Var, exc);
                            }
                        } else {
                            g0Var2.f7(e0Var);
                        }
                    } else {
                        g0Var2.s3(e0Var);
                    }
                } else {
                    g0Var2.s8(e0Var);
                }
            } else {
                g0Var2.M3(f1.J(e0Var));
            }
            return q.a;
        }
    }

    /* compiled from: ExoPlayerEventsMapper.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
        public final /* synthetic */ com.amazon.aps.iva.m6.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.m6.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            j.f(g0Var2, "$this$notify");
            String str = this.h.a.b;
            j.e(str, "download.request.id");
            g0Var2.x6(str);
            return q.a;
        }
    }

    public ExoPlayerEventsMapperImpl(f fVar) {
        this.b = fVar;
    }

    @Override // com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerEventsMapper
    public final void D1(com.amazon.aps.iva.m6.c cVar, Exception exc) {
        j.f(cVar, "download");
        notify(new a(cVar, this.b.a(cVar), exc));
    }

    @Override // com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerEventsMapper
    public final void J1(com.amazon.aps.iva.m6.c cVar) {
        j.f(cVar, "download");
        notify(new b(cVar));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c.addEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.c.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.c.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
        j.f(lVar, "action");
        this.c.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c.removeEventListener(g0Var2);
    }
}
