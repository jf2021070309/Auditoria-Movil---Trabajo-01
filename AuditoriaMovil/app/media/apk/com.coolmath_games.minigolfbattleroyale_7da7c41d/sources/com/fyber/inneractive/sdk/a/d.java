package com.fyber.inneractive.sdk.a;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.h.ac;
import com.fyber.inneractive.sdk.h.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class d {
    public String a;
    public String b;
    public String c;
    private long d;

    public final void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.d) < 60 || !IAConfigManager.c().a.a("use_js_inline", false)) {
            return;
        }
        Application p = l.p();
        if (p == null) {
            IAlog.d("fetchJS() failed context null", new Object[0]);
            return;
        }
        this.d = System.currentTimeMillis();
        IAConfigManager.h().a(new ac(new r<String>() { // from class: com.fyber.inneractive.sdk.a.d.1
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* bridge */ /* synthetic */ void a(String str, Exception exc, boolean z) {
                String str2 = str;
                if (str2 != null) {
                    d.this.a = str2;
                }
            }
        }, p, new c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js")));
        IAConfigManager.h().a(new ac(new r<String>() { // from class: com.fyber.inneractive.sdk.a.d.2
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* bridge */ /* synthetic */ void a(String str, Exception exc, boolean z) {
                String str2 = str;
                if (str2 != null) {
                    d.this.b = str2;
                }
            }
        }, p, new c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
        IAConfigManager.h().a(new ac(new r<String>() { // from class: com.fyber.inneractive.sdk.a.d.3
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* bridge */ /* synthetic */ void a(String str, Exception exc, boolean z) {
                String str2 = str;
                if (str2 != null) {
                    d.this.c = str2;
                }
            }
        }, p, new c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
    }
}
