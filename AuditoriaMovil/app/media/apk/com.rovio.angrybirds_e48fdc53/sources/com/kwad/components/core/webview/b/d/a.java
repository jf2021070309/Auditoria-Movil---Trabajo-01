package com.kwad.components.core.webview.b.d;

import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private List<Integer> XF;
    private final List<Integer> XG;

    /* renamed from: com.kwad.components.core.webview.b.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0215a {
        private static final a XK = new a((byte) 0);
    }

    private a() {
        this.XF = new ArrayList();
        this.XG = Arrays.asList(123, 184, 185, Integer.valueOf((int) FacebookRequestErrorClassification.EC_INVALID_TOKEN), 199, 200);
    }

    /* synthetic */ a(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aQ(int i) {
        if (this.XG.contains(Integer.valueOf(i))) {
            this.XF.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aQ(String str) {
        int i;
        try {
            i = new JSONObject(str).optInt("elementType");
        } catch (Exception e) {
            i = Integer.MAX_VALUE;
        }
        if (this.XG.contains(Integer.valueOf(i))) {
            this.XF.add(Integer.valueOf(i));
        }
    }

    public static a se() {
        return C0215a.XK;
    }

    public final void aR(final int i) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.aQ(i);
            }
        });
    }

    public final void aR(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.aQ(str);
            }
        });
    }

    public final List<Integer> sf() {
        return this.XF;
    }

    public final void sg() {
        this.XF.clear();
    }
}
