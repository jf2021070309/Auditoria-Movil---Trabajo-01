package com.amazon.aps.iva.u6;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o6.t;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.f;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.j0;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.q5.y0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: EventLogger.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.b6.b {
    public static final NumberFormat d;
    public final r0.d a = new r0.d();
    public final r0.b b = new r0.b();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String X(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return d.format(((float) j) / 1000.0f);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void A(b.a aVar, v vVar) {
        Z(aVar, "videoInputFormat", v.f(vVar));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void B(b.a aVar) {
        Y(aVar, "audioEnabled");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void D(b.a aVar, f fVar) {
        Z(aVar, "audioAttributes", fVar.b + "," + fVar.c + "," + fVar.d + "," + fVar.e);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void E(b.a aVar) {
        Y(aVar, "drmKeysLoaded");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void F(b.a aVar, t tVar) {
        Z(aVar, "downstreamFormat", v.f(tVar.c));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void H(b.a aVar, int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                str = "?";
            } else {
                str = "TRANSIENT_AUDIO_FOCUS_LOSS";
            }
        } else {
            str = "NONE";
        }
        Z(aVar, "playbackSuppressionReason", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void I(b.a aVar, String str) {
        Z(aVar, "videoDecoderReleased", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void J(b.a aVar) {
        Y(aVar, "audioDisabled");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void K(b.a aVar, com.amazon.aps.iva.a6.f fVar) {
        Y(aVar, "videoDisabled");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void L(b.a aVar, int i) {
        Z(aVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void N(b.a aVar, String str) {
        Z(aVar, "videoDecoderInitialized", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void O(b.a aVar, int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "?";
                    } else {
                        str = "ENDED";
                    }
                } else {
                    str = "READY";
                }
            } else {
                str = "BUFFERING";
            }
        } else {
            str = "IDLE";
        }
        Z(aVar, "state", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void P(b.a aVar) {
        Y(aVar, "videoEnabled");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void Q(b.a aVar, float f) {
        Z(aVar, "volume", Float.toString(f));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void R(b.a aVar) {
        Y(aVar, "drmKeysRemoved");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void S(b.a aVar, boolean z) {
        Z(aVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void T(b.a aVar, j0 j0Var) {
        V(aVar, "playerFailed", null, j0Var);
        p.c();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void U(b.a aVar, int i, long j, long j2) {
        V(aVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
        p.c();
    }

    public final String V(b.a aVar, String str, String str2, Throwable th) {
        String str3;
        StringBuilder b = x.b(str, " [");
        b.append(W(aVar));
        String sb = b.toString();
        if (th instanceof j0) {
            StringBuilder b2 = x.b(sb, ", errorCode=");
            int i = ((j0) th).b;
            if (i != 5001) {
                if (i != 5002) {
                    if (i != 7000) {
                        if (i != 7001) {
                            switch (i) {
                                case 1000:
                                    str3 = "ERROR_CODE_UNSPECIFIED";
                                    break;
                                case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                                    str3 = "ERROR_CODE_REMOTE_ERROR";
                                    break;
                                case 1002:
                                    str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                                    break;
                                case 1003:
                                    str3 = "ERROR_CODE_TIMEOUT";
                                    break;
                                case 1004:
                                    str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                                    break;
                                default:
                                    switch (i) {
                                        case CastStatusCodes.AUTHENTICATION_FAILED /* 2000 */:
                                            str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                            break;
                                        case CastStatusCodes.INVALID_REQUEST /* 2001 */:
                                            str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                            break;
                                        case CastStatusCodes.CANCELED /* 2002 */:
                                            str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                            break;
                                        case CastStatusCodes.NOT_ALLOWED /* 2003 */:
                                            str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                            break;
                                        case CastStatusCodes.APPLICATION_NOT_FOUND /* 2004 */:
                                            str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                            break;
                                        case CastStatusCodes.APPLICATION_NOT_RUNNING /* 2005 */:
                                            str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                            break;
                                        case CastStatusCodes.MESSAGE_TOO_LARGE /* 2006 */:
                                            str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                            break;
                                        case CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL /* 2007 */:
                                            str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                            break;
                                        case 2008:
                                            str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                            break;
                                        default:
                                            switch (i) {
                                                case 3001:
                                                    str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                                    break;
                                                case 3002:
                                                    str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                                    break;
                                                case 3003:
                                                    str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                                    break;
                                                case 3004:
                                                    str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 4001:
                                                            str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                            break;
                                                        case 4002:
                                                            str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                            break;
                                                        case 4003:
                                                            str3 = "ERROR_CODE_DECODING_FAILED";
                                                            break;
                                                        case 4004:
                                                            str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                            break;
                                                        case 4005:
                                                            str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 6000:
                                                                    str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                    break;
                                                                case 6001:
                                                                    str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                    break;
                                                                case 6002:
                                                                    str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                    break;
                                                                case 6003:
                                                                    str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                    break;
                                                                case 6004:
                                                                    str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                    break;
                                                                case 6005:
                                                                    str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                    break;
                                                                case 6006:
                                                                    str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                    break;
                                                                case 6007:
                                                                    str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                    break;
                                                                case 6008:
                                                                    str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                    break;
                                                                default:
                                                                    if (i >= 1000000) {
                                                                        str3 = "custom error code";
                                                                        break;
                                                                    } else {
                                                                        str3 = "invalid error code";
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
                        }
                    } else {
                        str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
                    }
                } else {
                    str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                }
            } else {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            }
            b2.append(str3);
            sb = b2.toString();
        }
        if (str2 != null) {
            sb = q.b(sb, ", ", str2);
        }
        String e = p.e(th);
        if (!TextUtils.isEmpty(e)) {
            StringBuilder b3 = x.b(sb, "\n  ");
            b3.append(e.replace("\n", "\n  "));
            b3.append('\n');
            sb = b3.toString();
        }
        return com.amazon.aps.iva.c80.a.f(sb, "]");
    }

    public final String W(b.a aVar) {
        String str = "window=" + aVar.c;
        v.b bVar = aVar.d;
        if (bVar != null) {
            StringBuilder b = x.b(str, ", period=");
            b.append(aVar.b.c(bVar.a));
            str = b.toString();
            if (bVar.a()) {
                StringBuilder b2 = x.b(str, ", adGroup=");
                b2.append(bVar.b);
                StringBuilder b3 = x.b(b2.toString(), ", ad=");
                b3.append(bVar.c);
                str = b3.toString();
            }
        }
        return "eventTime=" + X(aVar.a - this.c) + ", mediaPos=" + X(aVar.e) + ", " + str;
    }

    public final void Y(b.a aVar, String str) {
        V(aVar, str, null, null);
        p.b();
    }

    public final void Z(b.a aVar, String str, String str2) {
        V(aVar, str, str2, null);
        p.b();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void a(b.a aVar, boolean z) {
        Z(aVar, "isPlaying", Boolean.toString(z));
    }

    public final void a0(f0 f0Var, String str) {
        int i = 0;
        while (true) {
            f0.b[] bVarArr = f0Var.b;
            if (i < bVarArr.length) {
                Objects.toString(bVarArr[i]);
                p.b();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void b(b.a aVar, y0 y0Var) {
        Z(aVar, "videoSize", y0Var.b + ", " + y0Var.c);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void c(int i, b.a aVar) {
        Z(aVar, "droppedFrames", Integer.toString(i));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void d(b.a aVar, Exception exc) {
        V(aVar, "internalError", "drmSessionManagerError", exc);
        p.c();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void e(int i, l0.d dVar, l0.d dVar2, b.a aVar) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "?";
                            } else {
                                str = "INTERNAL";
                            }
                        } else {
                            str = "REMOVE";
                        }
                    } else {
                        str = "SKIP";
                    }
                } else {
                    str = "SEEK_ADJUSTMENT";
                }
            } else {
                str = "SEEK";
            }
        } else {
            str = "AUTO_TRANSITION";
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(dVar.c);
        sb.append(", period=");
        sb.append(dVar.f);
        sb.append(", pos=");
        sb.append(dVar.g);
        int i2 = dVar.i;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(dVar.h);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(dVar.j);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(dVar2.c);
        sb.append(", period=");
        sb.append(dVar2.f);
        sb.append(", pos=");
        sb.append(dVar2.g);
        int i3 = dVar2.i;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(dVar2.h);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(dVar2.j);
        }
        sb.append("]");
        Z(aVar, "positionDiscontinuity", sb.toString());
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void f(b.a aVar, boolean z) {
        Z(aVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void g(b.a aVar, boolean z) {
        Z(aVar, "loading", Boolean.toString(z));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void h(b.a aVar, v0 v0Var) {
        f0 f0Var;
        W(aVar);
        p.b();
        ImmutableList<v0.a> a = v0Var.a();
        for (int i = 0; i < a.size(); i++) {
            v0.a aVar2 = a.get(i);
            p.b();
            for (int i2 = 0; i2 < aVar2.b; i2++) {
                aVar2.h(i2);
                g0.w(aVar2.d(i2));
                com.amazon.aps.iva.q5.v.f(aVar2.c(i2));
                p.b();
            }
            p.b();
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < a.size(); i3++) {
            v0.a aVar3 = a.get(i3);
            for (int i4 = 0; !z && i4 < aVar3.b; i4++) {
                if (aVar3.h(i4) && (f0Var = aVar3.c(i4).k) != null && f0Var.c() > 0) {
                    p.b();
                    a0(f0Var, "    ");
                    p.b();
                    z = true;
                }
            }
        }
        p.b();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void i(int i, b.a aVar, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "?";
                        } else {
                            str = "END_OF_MEDIA_ITEM";
                        }
                    } else {
                        str = "REMOTE";
                    }
                } else {
                    str = "AUDIO_BECOMING_NOISY";
                }
            } else {
                str = "AUDIO_FOCUS_LOSS";
            }
        } else {
            str = "USER_REQUEST";
        }
        sb.append(str);
        Z(aVar, "playWhenReady", sb.toString());
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void j(b.a aVar) {
        Y(aVar, "drmKeysRestored");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void k(b.a aVar) {
        Y(aVar, "drmSessionReleased");
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void l(b.a aVar, k0 k0Var) {
        Z(aVar, "playbackParameters", k0Var.toString());
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void m(b.a aVar, Object obj) {
        Z(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void n(b.a aVar, b0 b0Var, int i) {
        W(aVar);
        if (i == 0 || i != 1) {
        }
        p.b();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void o(b.a aVar, String str) {
        Z(aVar, "audioDecoderInitialized", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void p(b.a aVar, int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "?";
                } else {
                    str = "ALL";
                }
            } else {
                str = "ONE";
            }
        } else {
            str = "OFF";
        }
        Z(aVar, "repeatMode", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void r(b.a aVar, t tVar) {
        Z(aVar, "upstreamDiscarded", com.amazon.aps.iva.q5.v.f(tVar.c));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void s(b.a aVar, com.amazon.aps.iva.o6.q qVar, t tVar, IOException iOException) {
        V(aVar, "internalError", "loadError", iOException);
        p.c();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void u(b.a aVar, int i) {
        int j = aVar.b.j();
        r0 r0Var = aVar.b;
        int q = r0Var.q();
        W(aVar);
        p.b();
        for (int i2 = 0; i2 < Math.min(j, 3); i2++) {
            r0.b bVar = this.b;
            r0Var.g(i2, bVar);
            X(g0.e0(bVar.e));
            p.b();
        }
        if (j > 3) {
            p.b();
        }
        for (int i3 = 0; i3 < Math.min(q, 3); i3++) {
            r0.d dVar = this.a;
            r0Var.o(i3, dVar);
            X(dVar.a());
            p.b();
        }
        if (q > 3) {
            p.b();
        }
        p.b();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void v(b.a aVar, com.amazon.aps.iva.q5.v vVar) {
        Z(aVar, "audioInputFormat", com.amazon.aps.iva.q5.v.f(vVar));
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void w(b.a aVar, f0 f0Var) {
        W(aVar);
        p.b();
        a0(f0Var, "  ");
        p.b();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void x(b.a aVar, int i, int i2) {
        Z(aVar, "surfaceSize", i + ", " + i2);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void y(b.a aVar, String str) {
        Z(aVar, "audioDecoderReleased", str);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void C(b.a aVar, com.amazon.aps.iva.o6.q qVar, t tVar) {
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void G(b.a aVar, com.amazon.aps.iva.o6.q qVar, t tVar) {
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void q(b.a aVar, com.amazon.aps.iva.o6.q qVar, t tVar) {
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void z(b.a aVar, int i, long j) {
    }
}
