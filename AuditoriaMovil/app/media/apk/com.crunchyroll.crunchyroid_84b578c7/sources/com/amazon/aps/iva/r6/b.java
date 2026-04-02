package com.amazon.aps.iva.r6;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q7.e;
import com.amazon.aps.iva.y7.g;
import java.util.List;
/* compiled from: SubtitleDecoderFactory.java */
/* loaded from: classes.dex */
public interface b {
    public static final a a = new a();

    /* compiled from: SubtitleDecoderFactory.java */
    /* loaded from: classes.dex */
    public class a implements b {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final e a(v vVar) {
            char c;
            String str = vVar.m;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i = vVar.E;
                List<byte[]> list = vVar.o;
                switch (c) {
                    case 0:
                        return new com.amazon.aps.iva.s7.a(list);
                    case 1:
                        return new com.amazon.aps.iva.t7.a();
                    case 2:
                        return new com.amazon.aps.iva.y7.a();
                    case 3:
                        return new g();
                    case 4:
                        return new com.amazon.aps.iva.x7.a(list);
                    case 5:
                        return new com.amazon.aps.iva.u7.a(list);
                    case 6:
                    case '\b':
                        return new com.amazon.aps.iva.r7.a(str, i);
                    case 7:
                        return new com.amazon.aps.iva.r6.a();
                    case '\t':
                        return new com.amazon.aps.iva.r7.b(i, list);
                    case '\n':
                        return new com.amazon.aps.iva.v7.a();
                    case 11:
                        return new com.amazon.aps.iva.w7.c();
                }
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(v vVar) {
            String str = vVar.m;
            if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
                return false;
            }
            return true;
        }
    }
}
