package com.fyber.inneractive.sdk.h;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h {
    Map<String, Object> a;
    private String b;
    private String c = null;

    public abstract boolean d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new InvalidParameterException();
        }
        this.a = new HashMap();
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.a.put(str, obj);
    }

    public void b() {
        if (d()) {
            c s = IAConfigManager.s();
            s.a.offer(c.a(this));
            if (s.a.size() > 30) {
                s.a();
                if (s.c != null) {
                    s.c.sendEmptyMessage(12312329);
                }
            }
        }
    }

    public void a(String str) {
        this.c = str;
    }

    public String c() {
        return this.c;
    }
}
