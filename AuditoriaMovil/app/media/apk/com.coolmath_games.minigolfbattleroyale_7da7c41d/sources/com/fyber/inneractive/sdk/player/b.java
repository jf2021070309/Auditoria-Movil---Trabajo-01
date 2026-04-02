package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.aa;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.w;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.h.ae;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.i;
import com.fyber.inneractive.sdk.player.a.g;
import com.fyber.inneractive.sdk.player.a.n;
import com.fyber.inneractive.sdk.player.b.f;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b implements f.a, f.b {
    protected Context a;
    protected com.fyber.inneractive.sdk.player.b.f b;
    protected String c;
    protected q d;
    protected InneractiveAdRequest e;
    public Bitmap g;
    o h;
    o.a i;
    public a m;
    protected int o;
    protected m p;
    private final Set<Vendor> q;
    private final s r;
    private Runnable s;
    private int t;
    private com.fyber.inneractive.sdk.player.a.g v;
    private f y;
    protected boolean f = true;
    public boolean j = false;
    volatile boolean k = false;
    private boolean u = false;
    public com.fyber.inneractive.sdk.player.a.a l = null;
    private boolean w = false;
    private boolean x = false;
    protected int n = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);

        void a(b bVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0049b extends Exception {
        final JSONObject a;
    }

    public abstract void a(i iVar, VideoClickOrigin videoClickOrigin, r... rVarArr);

    public abstract void a(VideoClickOrigin videoClickOrigin, r... rVarArr);

    public abstract View h();

    public abstract com.fyber.inneractive.sdk.player.b.c i();

    public abstract void j();

    protected abstract void k();

    public abstract String l();

    protected abstract void m();

    public com.fyber.inneractive.sdk.g.a.b n() {
        return null;
    }

    public abstract u s();

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Set<Vendor> set, s sVar) {
        this.q = set;
        this.a = context;
        this.r = sVar;
        u();
    }

    public final void b(m mVar, f fVar) {
        this.y = fVar;
        if (mVar != null) {
            final String str = mVar.j;
            this.p = mVar;
            this.n++;
            this.j = false;
            this.t = 0;
            this.u = false;
            this.c = str;
            IAlog.b("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            o oVar = this.h;
            if (oVar != null) {
                oVar.a();
                this.i = null;
            }
            if (this.i == null) {
                this.i = new o.a() { // from class: com.fyber.inneractive.sdk.player.b.4
                    @Override // com.fyber.inneractive.sdk.util.o.a
                    public final void a(Bitmap bitmap) {
                        if (b.this.i != null) {
                            b.this.a(bitmap);
                            b.this.h = null;
                            b.this.i = null;
                        }
                        IAlog.b("MediaPlayerController: fetching video frame success!", new Object[0]);
                    }

                    @Override // com.fyber.inneractive.sdk.util.o.a
                    public final void a() {
                        if (b.this.i != null) {
                            b.this.a((Bitmap) null);
                            b.this.h = null;
                            b.this.i = null;
                        }
                        IAlog.b("MediaPlayerController: fetching video frame failed!", new Object[0]);
                    }
                };
            }
            if (n.a().b() && !this.b.k()) {
                final com.fyber.inneractive.sdk.util.d dVar = new com.fyber.inneractive.sdk.util.d();
                n a2 = n.a();
                int i = this.o;
                q qVar = this.d;
                com.fyber.inneractive.sdk.player.a.g a3 = a2.a(i, str, qVar != null ? qVar.i() : null, new g.e() { // from class: com.fyber.inneractive.sdk.player.b.1
                    @Override // com.fyber.inneractive.sdk.player.a.g.e
                    public final void a(com.fyber.inneractive.sdk.player.a.a aVar, Exception exc) {
                        if (b.this.k) {
                            return;
                        }
                        if (exc != null) {
                            if (exc instanceof g.c) {
                                b.this.a(str);
                                return;
                            } else {
                                b.this.a(exc);
                                return;
                            }
                        }
                        Bitmap bitmap = dVar.a;
                        if (bitmap != null) {
                            IAlog.b("IAMediaPlayerFlowManager: got video first frame", new Object[0]);
                            b.this.a(bitmap);
                            b.this.h = null;
                            b.this.i = null;
                        }
                        b.this.l = aVar;
                        b.this.a(true);
                    }
                });
                this.v = a3;
                a3.o = dVar;
                this.v.a();
            } else {
                a(str);
            }
            a((k.o() ? aa.a(this.r) : aa.b(this.r)) * 1000);
            m();
        }
    }

    public final void c() {
        if (this.b.k()) {
            return;
        }
        this.w = true;
        if (EnumSet.of(com.fyber.inneractive.sdk.player.enums.b.Idle, com.fyber.inneractive.sdk.player.enums.b.Error, com.fyber.inneractive.sdk.player.enums.b.Seeking).contains(this.b.p())) {
            n.a();
            this.b.a(n.a(this.l), this.o);
            IAConfigManager.f();
            s sVar = this.r;
            a(TimeUnit.SECONDS.toMillis(k.o() ? aa.a(sVar) : aa.b(sVar)));
        }
    }

    public void a() {
        this.k = true;
        IAlog.b("IAMediaPlayerFlowManager: destroy", new Object[0]);
        View h = h();
        if (h != null && (h instanceof com.fyber.inneractive.sdk.m.c)) {
            ((com.fyber.inneractive.sdk.m.c) h).destroy();
        }
        v();
        b();
        com.fyber.inneractive.sdk.player.b.f fVar = this.b;
        if (fVar != null) {
            fVar.a();
            this.b = null;
        }
        this.g = null;
        com.fyber.inneractive.sdk.player.a.g gVar = this.v;
        if (gVar != null) {
            gVar.c();
            n.a().b(this.v.d());
        }
        this.y = null;
        if (this.s != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.s);
        }
    }

    public final boolean d() {
        return this.f;
    }

    public final void e() {
        Bitmap bitmap;
        if (this.b != null) {
            if (this.l != null && !this.j) {
                a aVar = this.m;
                if (aVar != null && (bitmap = this.g) != null) {
                    aVar.a(bitmap);
                }
                if (this.b.p() == com.fyber.inneractive.sdk.player.enums.b.Preparing || this.b.p() == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    return;
                }
                n.a();
                this.b.a(n.a(this.l), this.o);
                a((k.o() ? aa.a(this.r) : aa.b(this.r)) * 1000);
                return;
            }
            com.fyber.inneractive.sdk.player.b.f fVar = this.b;
            com.fyber.inneractive.sdk.player.enums.b p = fVar.p();
            if (p == com.fyber.inneractive.sdk.player.enums.b.Completed || p == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                fVar.a(1);
            } else {
                fVar.f();
            }
        }
    }

    public final com.fyber.inneractive.sdk.player.b.f f() {
        return this.b;
    }

    public final void a(Bitmap bitmap) {
        IAlog.b("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.g = null;
        this.g = bitmap;
    }

    public final void g() {
        if (this.u) {
            return;
        }
        k();
        this.u = true;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.b("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        int i = AnonymousClass5.a[bVar.ordinal()];
        if (i == 1) {
            a(false);
        } else if (i == 2) {
            if (this.s == null) {
                k.o();
                a(IAConfigManager.n.h.b * 1000);
                return;
            }
            return;
        } else if (i == 3) {
            this.t = this.b.g();
        } else if (i == 4) {
            b();
            return;
        } else if (i != 5) {
            return;
        }
        b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.b("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc), exc instanceof C0049b ? ((C0049b) exc).a : null);
        if (this.j || !(this.l == null || this.b.p() == com.fyber.inneractive.sdk.player.enums.b.Preparing || this.b.p() == com.fyber.inneractive.sdk.player.enums.b.Prepared)) {
            if (this.l != null) {
                a aVar = this.m;
                if (aVar != null) {
                    aVar.a(this);
                    return;
                }
                return;
            }
            IAlog.b("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IAlog.b("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
        if (!this.b.i()) {
            o oVar = new o(this.a, this.i, this.c, (byte) 0);
            this.h = oVar;
            l.a(oVar, new Void[0]);
        }
        if (this.k) {
            return;
        }
        this.b.a(str, this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(List<String> list) {
        for (final String str : list) {
            final long currentTimeMillis = System.currentTimeMillis();
            IAConfigManager.h().a(new ae(new com.fyber.inneractive.sdk.h.r<String>() { // from class: com.fyber.inneractive.sdk.player.b.2
                @Override // com.fyber.inneractive.sdk.h.r
                public final /* synthetic */ void a(String str2, Exception exc, boolean z) {
                    String str3 = str2;
                    IAlog.b("Hit Request: Hitting URL finished: %s", str);
                    if (exc == null) {
                        IAlog.b("Hit Request: Hitting URL response code: %s", str3);
                    } else {
                        IAlog.b("Hit Request: Hitting URL failed: %s", exc);
                    }
                    IAlog.b("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }, str));
        }
    }

    private void b() {
        if (this.s != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.s);
            this.s = null;
            IAlog.b("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    private void a(long j) {
        b();
        this.s = new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.o();
            }
        };
        com.fyber.inneractive.sdk.util.m.a().postDelayed(this.s, j);
        IAlog.b("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    protected final void o() {
        IAlog.b("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", this.s, Boolean.valueOf(this.k));
        if (this.s == null || this.k) {
            return;
        }
        this.x = true;
        int g = this.b.g();
        int h = this.b.h();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, h);
            jSONObject.put("position", g);
        } catch (JSONException unused) {
        }
        this.s = null;
        com.fyber.inneractive.sdk.player.a.g gVar = this.v;
        if (gVar != null) {
            gVar.c();
            n.a().b(this.v.d());
        }
        if (!this.j) {
            com.fyber.inneractive.sdk.player.b.f fVar = this.b;
            if (fVar != null) {
                fVar.a();
                this.b = null;
                u();
            }
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
            return;
        }
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
    }

    protected final void a(boolean z) {
        int i;
        boolean z2 = true;
        if (!z && this.l != null) {
            this.j = true;
            a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
            if (this.w) {
                return;
            }
            e();
            return;
        }
        int i2 = 0;
        IAlog.b("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
        if (this.k) {
            IAlog.b("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            return;
        }
        if (this.b.i() && this.b.j() != null) {
            a(this.b.j());
        }
        this.j = !z;
        b();
        if (this.y != null) {
            q qVar = this.d;
            if (qVar == null || qVar.f() == null || this.e == null) {
                z2 = false;
            } else {
                if (!a(q(), s(), this.d.f().A) || !this.e.getAllowFullscreen()) {
                    z2 = false;
                }
                this.d.f().v.setVideo(new ImpressionData.Video(z2, (int) TimeUnit.MILLISECONDS.toSeconds(q())));
            }
            try {
                com.fyber.inneractive.sdk.j.g f = this.d != null ? this.d.f() : null;
                n.a aVar2 = new n.a(com.fyber.inneractive.sdk.h.m.EVENT_READY_ON_CLIENT, this.e, f, this.d == null ? null : this.d.i().b());
                if (this.p != null && f != null) {
                    IAlog.b("Video content loader: Vast load took: " + (System.currentTimeMillis() - f.a) + " msec", new Object[0]);
                    if (this.d == null || this.d.f() == null || this.d.f().E == null) {
                        i = 0;
                    } else {
                        i2 = this.d.f().E.h;
                        i = this.d.f().E.i;
                    }
                    aVar2.a(new n.b().a(IronSourceConstants.EVENTS_DURATION, Integer.valueOf(q() / 1000)).a("url", this.p.j).a("bitrate", this.p.f).a("mime", TextUtils.isEmpty(this.p.d) ? "na" : this.p.d).a("delivery", this.p.a).a("load_time", Long.valueOf(System.currentTimeMillis() - f.a)).a("media_file_index", Integer.valueOf(this.n)).a("player", this.b.l()).a("is_video_skippable", Boolean.valueOf(z2)).a("supported_media_files", Integer.valueOf(i2)).a("total_media_files", Integer.valueOf(i)));
                }
                aVar2.b(null);
            } catch (Exception unused) {
            }
            this.y.a();
        }
    }

    private void u() {
        com.fyber.inneractive.sdk.player.b.f a2 = e.a(this.a, this.r);
        this.b = a2;
        a2.a((f.b) this);
        this.b.a((f.a) this);
    }

    private void v() {
        o oVar = this.h;
        if (oVar != null) {
            oVar.a();
            this.i = null;
        }
    }

    public final boolean p() {
        return this.l != null;
    }

    public final int q() {
        if (p()) {
            try {
                return Integer.valueOf(this.l.a("video.duration")).intValue();
            } catch (Exception unused) {
                return 0;
            }
        }
        return this.b.h();
    }

    public final boolean r() {
        return this.b != null;
    }

    public static boolean a(int i, u uVar, int i2) {
        w g;
        if (i2 == 1) {
            return true;
        }
        return (i <= 15999 || (g = uVar.g()) == null || g.f() == Skip.DEFAULT || g.h() == UnitDisplayType.REWARDED) ? false : true;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void c(boolean z) {
        try {
            com.fyber.inneractive.sdk.j.g f = this.d != null ? this.d.f() : null;
            n.a aVar = new n.a(com.fyber.inneractive.sdk.h.m.VAST_MEDIA_LOAD_RETRY_ATTEMPTED, this.e, f, this.d == null ? null : this.d.i().b());
            if (this.p != null && f != null) {
                aVar.a(new n.b().a("waudio", String.valueOf(z)).a("url", this.p.j).a("bitrate", this.p.f).a("mime", TextUtils.isEmpty(this.p.d) ? "na" : this.p.d).a("delivery", this.p.a).a("media_file_index", Integer.valueOf(this.n)).a("player", this.b.l()));
            }
            aVar.b(null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        IAlog.d("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        f fVar = this.y;
        if (fVar != null) {
            try {
                fVar.a(inneractiveVideoError, jSONObject, this.x);
            } catch (Exception e) {
                if (IAlog.a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        v();
        b();
    }

    public static int a(b bVar) {
        q qVar = bVar.d;
        if (qVar == null || qVar.f() == null) {
            return -1;
        }
        return bVar.d.f().A;
    }
}
