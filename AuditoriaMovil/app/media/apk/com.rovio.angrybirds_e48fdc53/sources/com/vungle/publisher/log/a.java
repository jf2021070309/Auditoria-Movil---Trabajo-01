package com.vungle.publisher.log;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vungle.publisher.env.n;
import com.vungle.publisher.env.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class a {
    @Inject
    r a;
    @Inject
    n b;

    public JsonObject a(File file) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("batch_id", Long.valueOf(this.a.p()));
        jsonObject.addProperty("device_guid", this.a.q());
        JsonArray jsonArray = new JsonArray();
        if (file != null && file.exists()) {
            a(jsonArray, file);
        }
        jsonObject.add(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, jsonArray);
        return jsonObject;
    }

    private void a(JsonArray jsonArray, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] a = a(readLine);
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("device_timestamp", a[0]);
                    jsonObject.addProperty("time_zone", a[1]);
                    jsonObject.addProperty("context", a[2]);
                    jsonObject.addProperty("log_level", a[3]);
                    jsonObject.addProperty("event_id", a[4]);
                    jsonObject.addProperty("sdk_user_agent", a[5]);
                    jsonObject.addProperty("log_message", a[6]);
                    jsonObject.addProperty("bundle_id", this.b.a());
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.add("metadata", jsonObject);
                    jsonObject2.addProperty("raw_log", readLine);
                    jsonArray.add(jsonObject2);
                } else {
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private String[] a(String str) {
        return str.split(";");
    }
}
