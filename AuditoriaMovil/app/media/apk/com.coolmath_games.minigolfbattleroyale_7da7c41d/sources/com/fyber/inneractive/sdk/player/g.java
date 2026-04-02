package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.i.i;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements f {
    public com.fyber.inneractive.sdk.j.g a;
    public a b;
    public m c;
    public a.InterfaceC0046a d;
    s e;
    private com.fyber.inneractive.sdk.player.a f;
    private InneractiveAdRequest g;
    private boolean h = false;

    /* loaded from: classes.dex */
    public interface a {
        void b(InneractiveInfrastructureError inneractiveInfrastructureError);

        void h();
    }

    public g(com.fyber.inneractive.sdk.j.g gVar, InneractiveAdRequest inneractiveAdRequest, q qVar, a aVar) {
        this.g = inneractiveAdRequest;
        this.a = gVar;
        this.b = aVar;
        this.e = qVar.i();
        this.f = new com.fyber.inneractive.sdk.player.a(qVar);
    }

    public final void b() {
        a.InterfaceC0046a interfaceC0046a = this.d;
        if (interfaceC0046a != null) {
            interfaceC0046a.a(this.c, this);
        } else {
            this.b.b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    public final void c() {
        try {
            com.fyber.inneractive.sdk.player.a aVar = this.f;
            if (aVar.b == null) {
                aVar.b = new d(l.p(), aVar.a.f(), aVar.a.h(), aVar.a.g(), aVar.a);
            }
            this.d = aVar.b;
        } catch (Throwable th) {
            this.b.b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fyber.inneractive.sdk.player.g$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InneractiveVideoError.Error.values().length];
            a = iArr;
            try {
                iArr[InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static com.fyber.inneractive.sdk.h.l a(InneractiveVideoError.Error error) {
        int i = AnonymousClass1.a[error.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return com.fyber.inneractive.sdk.h.l.VAST_ERROR_BUFFER_TIMEOUT;
                        }
                        IAlog.b("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
                        return com.fyber.inneractive.sdk.h.l.VAST_UNKNOWN_PLAYER_ERROR;
                    }
                    return com.fyber.inneractive.sdk.h.l.VAST_ERROR_PRE_BUFFER_TIMEOUT;
                }
                return com.fyber.inneractive.sdk.h.l.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            }
            return com.fyber.inneractive.sdk.h.l.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        return com.fyber.inneractive.sdk.h.l.VAST_ERROR_NO_MEDIA_FILES;
    }

    public final void d() {
        com.fyber.inneractive.sdk.player.a aVar = this.f;
        if (aVar.c != null) {
            aVar.c.a();
        }
        if (aVar.b != null) {
            aVar.b.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        a aVar = this.b;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z) {
        InneractiveErrorCode inneractiveErrorCode;
        if (inneractiveVideoError != null) {
            n.a aVar = new n.a(a(inneractiveVideoError.getPlayerError()), this.g, this.a, this.e.b());
            if (jSONObject != null) {
                aVar.a(jSONObject.toString());
            }
            aVar.b(null);
            IAlog.b("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            inneractiveErrorCode = z ? InneractiveErrorCode.LOAD_TIMEOUT : null;
            IAlog.b("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            new n.a(com.fyber.inneractive.sdk.h.l.VPAID_ERROR_UNSECURE_CONTENT, this.g, this.a, this.e.b()).b(null);
        }
        this.c = null;
        com.fyber.inneractive.sdk.j.g gVar = this.a;
        if (gVar != null && gVar.E != null) {
            this.c = this.a.E.a();
        }
        if (this.c == null) {
            e();
            a aVar2 = this.b;
            if (aVar2 != null) {
                if (inneractiveVideoError != null) {
                    aVar2.b(new InneractiveInfrastructureError(inneractiveErrorCode, inneractiveVideoError.getCause()));
                } else {
                    aVar2.b(new InneractiveInfrastructureError(inneractiveErrorCode));
                }
                d();
            }
        } else if (this.h) {
        } else {
            c();
            b();
        }
    }

    public final void e() {
        new n.a(a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError()), this.g, this.a, this.e.b()).b(null);
    }

    public final void a(String str, String... strArr) {
        a.InterfaceC0046a interfaceC0046a = this.d;
        if (interfaceC0046a != null) {
            interfaceC0046a.a(str, strArr);
        }
    }

    public final i a(boolean z) {
        return this.d.a(z, this);
    }
}
