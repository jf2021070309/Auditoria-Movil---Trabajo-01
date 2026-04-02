package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: PanelAnalytics.kt */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: PanelAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a(com.amazon.aps.iva.ls.a aVar) {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(aVar, "screen");
            return new f(cVar, aVar);
        }
    }

    /* compiled from: PanelAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static /* synthetic */ void a(d dVar, Panel panel, com.amazon.aps.iva.jt.a aVar, String str, Boolean bool, Boolean bool2, int i) {
            String str2;
            Boolean bool3;
            Boolean bool4;
            if ((i & 4) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i & 8) != 0) {
                bool3 = null;
            } else {
                bool3 = bool;
            }
            if ((i & 16) != 0) {
                bool4 = null;
            } else {
                bool4 = bool2;
            }
            dVar.d(panel, aVar, str2, bool3, bool4);
        }
    }

    void a(com.amazon.aps.iva.jt.a aVar, String str, String str2, String str3, String str4, t tVar, String str5);

    void b(e eVar);

    void c(int i, MusicAsset musicAsset, String str, String str2, String str3, boolean z);

    void d(Panel panel, com.amazon.aps.iva.jt.a aVar, String str, Boolean bool, Boolean bool2);

    void e(int i, Panel panel, String str, boolean z);

    void f(com.amazon.aps.iva.jt.a aVar, String str, String str2, String str3, String str4);

    void g(Panel panel, com.amazon.aps.iva.fs.b bVar);
}
