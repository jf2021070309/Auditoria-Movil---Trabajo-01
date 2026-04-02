package com.amazon.aps.iva.dw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.m6.n;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.zv.b;
import com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerDownloadService;
import java.util.HashMap;
/* compiled from: ExoPlayerDownloadServiceWrapper.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class j implements i {
    public final Context a;
    public final boolean b;

    /* compiled from: ExoPlayerDownloadServiceWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            j jVar = j.this;
            Context context = jVar.a;
            HashMap<Class<? extends com.amazon.aps.iva.m6.n>, n.a> hashMap = com.amazon.aps.iva.m6.n.j;
            Intent action = new Intent(context, ExoPlayerDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON");
            boolean z = jVar.b;
            Intent putExtra = action.putExtra("foreground", z).putExtra("content_id", this.i).putExtra("stop_reason", 100);
            if (z) {
                if (g0.a >= 26) {
                    context.startForegroundService(putExtra);
                } else {
                    context.startService(putExtra);
                }
            } else {
                context.startService(putExtra);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ExoPlayerDownloadServiceWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            Context context = b.a.a;
            if (context != null) {
                boolean z = j.this.b;
                HashMap<Class<? extends com.amazon.aps.iva.m6.n>, n.a> hashMap = com.amazon.aps.iva.m6.n.j;
                Intent putExtra = new Intent(context, ExoPlayerDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS").putExtra("foreground", z);
                if (z) {
                    if (g0.a >= 26) {
                        context.startForegroundService(putExtra);
                    } else {
                        context.startService(putExtra);
                    }
                } else {
                    context.startService(putExtra);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("internalContext");
            throw null;
        }
    }

    /* compiled from: ExoPlayerDownloadServiceWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            j jVar = j.this;
            Context context = jVar.a;
            HashMap<Class<? extends com.amazon.aps.iva.m6.n>, n.a> hashMap = com.amazon.aps.iva.m6.n.j;
            Intent action = new Intent(context, ExoPlayerDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD");
            boolean z = jVar.b;
            Intent putExtra = action.putExtra("foreground", z).putExtra("content_id", this.i);
            if (z) {
                if (g0.a >= 26) {
                    context.startForegroundService(putExtra);
                } else {
                    context.startService(putExtra);
                }
            } else {
                context.startService(putExtra);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ExoPlayerDownloadServiceWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            j jVar = j.this;
            Context context = jVar.a;
            HashMap<Class<? extends com.amazon.aps.iva.m6.n>, n.a> hashMap = com.amazon.aps.iva.m6.n.j;
            Intent action = new Intent(context, ExoPlayerDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON");
            boolean z = jVar.b;
            Intent putExtra = action.putExtra("foreground", z).putExtra("content_id", this.i).putExtra("stop_reason", 0);
            if (z) {
                if (g0.a >= 26) {
                    context.startForegroundService(putExtra);
                } else {
                    context.startService(putExtra);
                }
            } else {
                context.startService(putExtra);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ExoPlayerDownloadServiceWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.m6.m i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.m6.m mVar) {
            super(0);
            this.i = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            j jVar = j.this;
            Context context = jVar.a;
            HashMap<Class<? extends com.amazon.aps.iva.m6.n>, n.a> hashMap = com.amazon.aps.iva.m6.n.j;
            Intent action = new Intent(context, ExoPlayerDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD");
            boolean z = jVar.b;
            Intent putExtra = action.putExtra("foreground", z).putExtra("download_request", this.i).putExtra("stop_reason", 0);
            if (z) {
                if (g0.a >= 26) {
                    context.startForegroundService(putExtra);
                } else {
                    context.startService(putExtra);
                }
            } else {
                context.startService(putExtra);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public j(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public static void a(com.amazon.aps.iva.xb0.a aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            com.amazon.aps.iva.mf0.a.a.m(th);
        }
    }

    @Override // com.amazon.aps.iva.dw.i
    public final void B(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        a(new d(str));
    }

    @Override // com.amazon.aps.iva.dw.i
    public final void C(com.amazon.aps.iva.m6.m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "downloadRequest");
        a(new e(mVar));
    }

    @Override // com.amazon.aps.iva.dw.i
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        a(new a(str));
    }

    @Override // com.amazon.aps.iva.dw.i
    public final void h(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        a(new c(str));
    }

    @Override // com.amazon.aps.iva.dw.i
    public final void r() {
        a(new b());
    }
}
