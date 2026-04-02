package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class x extends u {
    private String i;
    private String j;

    public x(String str, JSONObject jSONObject) {
        this.j = str;
        this.i = jSONObject.toString();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    public u a(Cursor cursor) {
        this.a = cursor.getLong(0);
        this.b = cursor.getLong(1);
        this.c = cursor.getString(2);
        this.d = cursor.getString(3);
        this.i = cursor.getString(4);
        this.j = cursor.getString(5);
        return this;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    protected void a(ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.a));
        contentValues.put("tea_event_index", Long.valueOf(this.b));
        contentValues.put("session_id", this.c);
        contentValues.put("user_unique_id", this.d);
        contentValues.put(NativeProtocol.WEB_DIALOG_PARAMS, this.i);
        contentValues.put("log_type", this.j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    protected void a(JSONObject jSONObject) {
        jSONObject.put("local_time_ms", this.a);
        jSONObject.put("tea_event_index", this.b);
        jSONObject.put("session_id", this.c);
        jSONObject.put("user_unique_id", this.d);
        jSONObject.put(NativeProtocol.WEB_DIALOG_PARAMS, this.i);
        jSONObject.put("log_type", this.j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    protected String[] a() {
        return new String[]{"local_time_ms", "integer", "tea_event_index", "integer", "session_id", "varchar", "user_unique_id", "varchar", NativeProtocol.WEB_DIALOG_PARAMS, "varchar", "log_type", "varchar"};
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    protected u b(JSONObject jSONObject) {
        this.a = jSONObject.optLong("local_time_ms", 0L);
        this.b = jSONObject.optLong("tea_event_index", 0L);
        this.c = jSONObject.optString("session_id", null);
        this.d = jSONObject.optString("user_unique_id", null);
        this.i = jSONObject.optString(NativeProtocol.WEB_DIALOG_PARAMS, null);
        this.j = jSONObject.optString("log_type", null);
        return this;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    protected JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.a);
        jSONObject.put("tea_event_index", this.b);
        jSONObject.put("session_id", this.c);
        if (!TextUtils.isEmpty(this.d)) {
            jSONObject.put("user_unique_id", this.d);
        }
        jSONObject.put("log_type", this.j);
        try {
            JSONObject jSONObject2 = new JSONObject(this.i);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.opt(next) != null) {
                    l0.b("misc事件存在重复的key", null);
                }
                jSONObject.put(next, obj);
            }
        } catch (Exception e) {
            l0.c("解析 event misc 失败", e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    public String d() {
        return "event_misc";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.u
    public String h() {
        return "param:" + this.i + " logType:" + this.j;
    }
}
