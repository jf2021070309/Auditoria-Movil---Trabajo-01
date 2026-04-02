package com.amazon.aps.iva.ta;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.types.ApsIvaConfigKeys;
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.f;
import com.amazon.aps.iva.wa.h;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ApsIvaConfig.java */
/* loaded from: classes.dex */
public final class a {
    public static final Random j = new Random();
    public final f a;
    public SharedPreferences g;
    public final int b = (int) new Date().getTime();
    public String d = null;
    public String e = null;
    public String f = null;
    public JsonObject h = null;
    public JsonObject i = null;
    public final Gson c = w.c().b();

    public a(f fVar) {
        this.a = fVar;
    }

    public final void a(Context context) {
        boolean z;
        boolean z2 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.amazon.aps.interactive.videoAds.apsIvaConfig", 0);
        this.g = sharedPreferences;
        ApsIvaConfigKeys apsIvaConfigKeys = ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_HTML;
        if (sharedPreferences.contains(apsIvaConfigKeys.getConfigKeyName()) && this.g.contains(ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_JS_INTERFACE_NAME.getConfigKeyName()) && this.g.contains(ApsIvaConfigKeys.METRIC_LOGGER_HTTP_URL.getConfigKeyName()) && this.g.contains(ApsIvaConfigKeys.FEATURE_FLAGS.getConfigKeyName()) && this.g.contains(ApsIvaConfigKeys.METRIC_SAMPLING_RATES.getConfigKeyName())) {
            z = true;
        } else {
            z = false;
        }
        Gson gson = this.c;
        if (z) {
            SharedPreferences sharedPreferences2 = this.g;
            ApsIvaConfigKeys apsIvaConfigKeys2 = ApsIvaConfigKeys.SHARED_PREFERENCES_EXPIRY_TIME;
            if (sharedPreferences2.contains(apsIvaConfigKeys2.getConfigKeyName()) && this.g.getInt(apsIvaConfigKeys2.getConfigKeyName(), 0) < this.b) {
                z2 = true;
            }
            if (!z2) {
                this.d = this.g.getString(apsIvaConfigKeys.getConfigKeyName(), "");
                this.e = this.g.getString(ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_JS_INTERFACE_NAME.getConfigKeyName(), "");
                this.f = this.g.getString(ApsIvaConfigKeys.METRIC_LOGGER_HTTP_URL.getConfigKeyName(), "");
                this.h = (JsonObject) gson.fromJson(this.g.getString(ApsIvaConfigKeys.FEATURE_FLAGS.getConfigKeyName(), ""), (Class<Object>) JsonObject.class);
                this.i = (JsonObject) gson.fromJson(this.g.getString(ApsIvaConfigKeys.METRIC_SAMPLING_RATES.getConfigKeyName(), ""), (Class<Object>) JsonObject.class);
                return;
            }
        }
        LogUtils.d("a", "ApsIvaConfig: Empty or Expired Cache, loading Default Configs");
        StringBuilder sb = new StringBuilder();
        try {
            ClassLoader classLoader = a.class.getClassLoader();
            Objects.requireNonNull(classLoader);
            InputStream resourceAsStream = classLoader.getResourceAsStream("defaultApsIvaConfig.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException e) {
            LogUtils.e("a", String.format("ApsIvaConfig: IO Error while reading default configs: %s", e));
        }
        JsonObject jsonObject = (JsonObject) gson.fromJson(sb.toString(), (Class<Object>) JsonObject.class);
        this.d = jsonObject.get(ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_HTML.getConfigKeyName()).getAsString();
        this.e = jsonObject.get(ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_JS_INTERFACE_NAME.getConfigKeyName()).getAsString();
        this.f = jsonObject.get(ApsIvaConfigKeys.METRIC_LOGGER_HTTP_URL.getConfigKeyName()).getAsString();
        this.h = jsonObject.get(ApsIvaConfigKeys.FEATURE_FLAGS.getConfigKeyName()).getAsJsonObject();
        this.i = jsonObject.get(ApsIvaConfigKeys.METRIC_SAMPLING_RATES.getConfigKeyName()).getAsJsonObject();
        SharedPreferences sharedPreferences3 = this.g;
        f fVar = this.a;
        fVar.f = sharedPreferences3;
        try {
            ((h) fVar.b).a.execute(fVar.g);
        } catch (RejectedExecutionException e2) {
            LogUtils.e("e", String.format("ApsIvaConfigFetcher: Runnable Task Cannot Be Accepted For Execution: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("e", String.format("ApsIvaConfigFetcher: Error Executing Runnable Task: %s", e3));
        }
    }

    public final boolean b(String str) {
        JsonObject jsonObject;
        int i;
        int i2;
        if (this.h.has(str)) {
            jsonObject = this.h.get(str).getAsJsonObject();
        } else {
            jsonObject = null;
        }
        if (jsonObject != null && jsonObject.has("start")) {
            i = jsonObject.get("start").getAsInt();
        } else {
            i = -1;
        }
        if (jsonObject != null && jsonObject.has("max")) {
            i2 = jsonObject.get("max").getAsInt();
        } else {
            i2 = 0;
        }
        if (j.nextInt(i2) > i - 1) {
            return false;
        }
        return true;
    }
}
