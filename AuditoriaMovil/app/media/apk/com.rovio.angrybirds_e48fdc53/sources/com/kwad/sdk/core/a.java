package com.kwad.sdk.core;

import android.text.TextUtils;
import com.kwad.sdk.core.download.DownloadParams;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private ConcurrentHashMap<String, DownloadParams> akg;
    private ConcurrentHashMap<String, AdTemplate> akh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0246a {
        private static final a aki = new a((byte) 0);
    }

    private a() {
        this.akg = new ConcurrentHashMap<>();
        this.akh = new ConcurrentHashMap<>();
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a yQ() {
        return C0246a.aki;
    }

    public final void a(String str, DownloadParams downloadParams) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return;
        }
        this.akg.put(str, downloadParams);
        ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).edit().putString(str, downloadParams.toJson().toString()).apply();
    }

    public final void c(String str, AdTemplate adTemplate) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return;
        }
        this.akh.put(str, adTemplate);
        ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).edit().putString(str, adTemplate.toJson().toString()).apply();
    }

    public final DownloadParams co(String str) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return null;
        }
        DownloadParams downloadParams = this.akg.get(str);
        if (downloadParams != null) {
            return downloadParams;
        }
        String string = ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).getString(str, "");
        if (!TextUtils.isEmpty(string)) {
            DownloadParams downloadParams2 = new DownloadParams();
            try {
                downloadParams2.parseJson(new JSONObject(string));
                return downloadParams2;
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return null;
    }

    public final void cp(String str) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return;
        }
        this.akg.remove(str);
        ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).edit().remove(str).apply();
    }

    public final AdTemplate cq(String str) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return null;
        }
        AdTemplate adTemplate = this.akh.get(str);
        if (adTemplate != null) {
            return adTemplate;
        }
        String string = ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).getString(str, "");
        if (!TextUtils.isEmpty(string)) {
            AdTemplate adTemplate2 = new AdTemplate();
            try {
                adTemplate2.parseJson(new JSONObject(string));
                return adTemplate2;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final void cr(String str) {
        if (((e) ServiceProvider.get(e.class)).getContext() == null) {
            return;
        }
        this.akh.remove(str);
        ((e) ServiceProvider.get(e.class)).getContext().getSharedPreferences("ksadsdk_notification_download_complete", 0).edit().remove(str).apply();
    }
}
