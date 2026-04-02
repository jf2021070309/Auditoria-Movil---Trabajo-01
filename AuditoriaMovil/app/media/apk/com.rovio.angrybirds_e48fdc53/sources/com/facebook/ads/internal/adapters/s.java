package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
/* loaded from: classes2.dex */
public class s extends b {
    private static final String c = s.class.getSimpleName();
    private final com.facebook.ads.internal.q.c.a d;
    private final com.facebook.ads.internal.m.c e;
    private r f;
    private boolean g;

    public s(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.q.c.a aVar, com.facebook.ads.internal.r.a aVar2, c cVar2) {
        super(context, cVar2, aVar2);
        this.e = cVar;
        this.d = aVar;
    }

    public void a(r rVar) {
        this.f = rVar;
    }

    @Override // com.facebook.ads.internal.adapters.b
    protected void a(Map<String, String> map) {
        if (this.f == null || TextUtils.isEmpty(this.f.c())) {
            return;
        }
        this.e.a(this.f.c(), map);
    }

    public synchronized void b() {
        if (!this.g && this.f != null) {
            this.g = true;
            if (this.d != null && !TextUtils.isEmpty(this.f.e())) {
                this.d.post(new Runnable() { // from class: com.facebook.ads.internal.adapters.s.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (s.this.d.c()) {
                            Log.w(s.c, "Webview already destroyed, cannot activate");
                        } else {
                            s.this.d.loadUrl("javascript:" + s.this.f.e());
                        }
                    }
                });
            }
        }
    }
}
