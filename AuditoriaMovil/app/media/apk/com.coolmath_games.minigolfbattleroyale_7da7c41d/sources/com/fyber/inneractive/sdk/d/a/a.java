package com.fyber.inneractive.sdk.d.a;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.g.a.g;
import com.fyber.inneractive.sdk.g.a.h;
import com.fyber.inneractive.sdk.g.a.j;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.g.a.q;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.g.a.s;
import com.fyber.inneractive.sdk.j.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public boolean d = false;
    public boolean e = false;
    public Map<m, c> f = new LinkedHashMap();
    public List<com.fyber.inneractive.sdk.g.a.f> g = new ArrayList();

    public final com.fyber.inneractive.sdk.g.a.a a(com.fyber.inneractive.sdk.g.a.c cVar, List<com.fyber.inneractive.sdk.g.a.c> list) throws e {
        IAlog.b("%sprocess started", "VastProcessor: ");
        if (cVar == null || cVar.c == null) {
            IAlog.b("%sno inline found", "VastProcessor: ");
            throw new e("ErrorNoMediaFiles", "Empty inline ad found");
        }
        int x = l.x();
        int w = l.w();
        com.fyber.inneractive.sdk.g.a.a aVar = new com.fyber.inneractive.sdk.g.a.a(new d(this.c, x, w), new b(x, w));
        aVar.a = cVar.a;
        List<j> list2 = cVar.c.d;
        if (list2 == null || list2.isEmpty()) {
            throw new e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list != null) {
            for (com.fyber.inneractive.sdk.g.a.c cVar2 : list) {
                s sVar = cVar2.b;
                if (sVar != null) {
                    a(aVar, sVar);
                }
            }
        }
        a(aVar, cVar.c);
        if (aVar.e.size() == 0) {
            if (this.f.size() == 0) {
                throw new e("ErrorNoMediaFiles", "No media files exist after merge");
            }
            throw new e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
        if (IAlog.a == 2) {
            IAlog.a("%sLogging merged model media files: ", "VastProcessor: ");
            Iterator<m> it = aVar.b().iterator();
            int i = 0;
            while (it.hasNext()) {
                IAlog.a("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), it.next());
                i++;
            }
        }
        if (IAlog.a == 2) {
            IAlog.a("%sLogging merged model companion ads: ", "VastProcessor: ");
            ArrayList arrayList = new ArrayList(aVar.f);
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    IAlog.a("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((com.fyber.inneractive.sdk.g.a.b) it2.next()).a());
                    i2++;
                }
            } else {
                IAlog.a("%sNo companion ads found!", "VastProcessor: ");
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0240 A[Catch: a -> 0x0387, TryCatch #1 {a -> 0x0387, blocks: (B:88:0x01ed, B:90:0x01f5, B:92:0x01f9, B:93:0x01fd, B:95:0x0203, B:98:0x0210, B:99:0x0223, B:100:0x0224, B:104:0x022d, B:106:0x0235, B:111:0x0240, B:113:0x0244, B:114:0x0248, B:116:0x024e, B:119:0x025d, B:120:0x0270, B:121:0x0271, B:123:0x0279, B:125:0x0281, B:131:0x028b, B:133:0x0293, B:135:0x0297, B:137:0x029f), top: B:166:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028b A[Catch: a -> 0x0387, TryCatch #1 {a -> 0x0387, blocks: (B:88:0x01ed, B:90:0x01f5, B:92:0x01f9, B:93:0x01fd, B:95:0x0203, B:98:0x0210, B:99:0x0223, B:100:0x0224, B:104:0x022d, B:106:0x0235, B:111:0x0240, B:113:0x0244, B:114:0x0248, B:116:0x024e, B:119:0x025d, B:120:0x0270, B:121:0x0271, B:123:0x0279, B:125:0x0281, B:131:0x028b, B:133:0x0293, B:135:0x0297, B:137:0x029f), top: B:166:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0340 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fyber.inneractive.sdk.g.a.a r25, com.fyber.inneractive.sdk.g.a.d r26) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.d.a.a.a(com.fyber.inneractive.sdk.g.a.a, com.fyber.inneractive.sdk.g.a.d):void");
    }

    private static void a(i iVar, r rVar, String str) throws e {
        if (!u.g(str)) {
            throw new e("VastErrorUnsecure", "found unsecure tracking event: " + rVar.w);
        }
        iVar.a(rVar, str);
    }

    private static void a(com.fyber.inneractive.sdk.g.a.a aVar, g gVar, int i, int i2, String str, List<String> list, List<q> list2, String str2, h hVar) {
        com.fyber.inneractive.sdk.g.a.b bVar = new com.fyber.inneractive.sdk.g.a.b(gVar, i, i2);
        bVar.f = str;
        if (list2 != null) {
            for (q qVar : list2) {
                bVar.a(r.a(qVar.a), qVar.b);
            }
        }
        if (list != null) {
            for (String str3 : list) {
                bVar.a(r.EVENT_CLICK, str3);
            }
        }
        bVar.e = str2;
        bVar.b = hVar;
        aVar.f.add(bVar);
    }

    private static int a(String str) {
        String[] split;
        int parseInt;
        int parseInt2;
        if (TextUtils.isEmpty(str) || (split = str.split(CertificateUtil.DELIMITER)) == null || split.length > 3) {
            return 0;
        }
        if (split.length == 1) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        if (split.length == 2) {
            try {
                parseInt = Integer.parseInt(split[1]);
                parseInt2 = Integer.parseInt(split[0]) * 60;
            } catch (NumberFormatException unused2) {
                return 0;
            }
        } else {
            try {
                parseInt = Integer.parseInt(split[2]) + (Integer.parseInt(split[1]) * 60);
                parseInt2 = Integer.parseInt(split[0]) * 3600;
            } catch (NumberFormatException unused3) {
                return 0;
            }
        }
        return parseInt + parseInt2;
    }

    /* renamed from: com.fyber.inneractive.sdk.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040a extends Exception {
        public int a;

        C0040a(String str, int i) {
            super(str);
            this.a = i;
        }
    }
}
