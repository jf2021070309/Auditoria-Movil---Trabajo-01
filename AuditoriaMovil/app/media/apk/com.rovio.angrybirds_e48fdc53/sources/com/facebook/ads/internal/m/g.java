package com.facebook.ads.internal.m;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.ads.internal.m.b;
import com.facebook.ads.internal.q.a.r;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class g implements b.a {
    private static final String a = g.class.getSimpleName();
    private Context b;
    private com.facebook.ads.internal.e.d c;

    public g(Context context, com.facebook.ads.internal.e.d dVar) {
        this.b = context;
        this.c = dVar;
    }

    private static JSONArray a(JSONArray jSONArray, JSONArray jSONArray2) {
        int length = jSONArray != null ? 0 + jSONArray.length() : 0;
        if (jSONArray2 != null) {
            length += jSONArray2.length();
        }
        return a(jSONArray, jSONArray2, length);
    }

    private static JSONArray a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        int i2;
        double d;
        JSONObject jSONObject;
        int i3;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        double d2;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        double d3;
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        JSONObject jSONObject6 = null;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        JSONObject jSONObject7 = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if ((i5 < length || i4 < length2) && i > 0) {
                if (i5 >= length || jSONObject6 != null) {
                    i2 = i5;
                } else {
                    try {
                        jSONObject5 = jSONArray.getJSONObject(i5);
                        d3 = jSONObject5.getDouble("time");
                    } catch (JSONException e) {
                        jSONObject5 = null;
                        d3 = Double.MAX_VALUE;
                    }
                    d4 = d3;
                    i2 = i5 + 1;
                    jSONObject6 = jSONObject5;
                }
                if (i4 >= length2 || jSONObject7 != null) {
                    d = d5;
                    jSONObject = jSONObject7;
                    i3 = i4;
                } else {
                    try {
                        jSONObject4 = jSONArray2.getJSONObject(i4);
                        d = jSONObject4.getDouble("time");
                    } catch (JSONException e2) {
                        jSONObject4 = null;
                        d = Double.MAX_VALUE;
                    }
                    jSONObject = jSONObject4;
                    i3 = i4 + 1;
                }
                if (jSONObject6 == null && jSONObject == null) {
                    d5 = d;
                    i4 = i3;
                    jSONObject7 = jSONObject;
                    i5 = i2;
                } else {
                    if (jSONObject6 == null || d < d4) {
                        jSONArray3.put(jSONObject);
                        d = Double.MAX_VALUE;
                        double d6 = d4;
                        jSONObject2 = null;
                        jSONObject3 = jSONObject6;
                        d2 = d6;
                    } else {
                        jSONArray3.put(jSONObject6);
                        d2 = Double.MAX_VALUE;
                        jSONObject3 = null;
                        jSONObject2 = jSONObject;
                    }
                    i--;
                    d5 = d;
                    i4 = i3;
                    i5 = i2;
                    jSONObject7 = jSONObject2;
                    jSONObject6 = jSONObject3;
                    d4 = d2;
                }
            }
        }
        if (i > 0) {
            if (jSONObject6 != null) {
                jSONArray3.put(jSONObject6);
            } else if (jSONObject7 != null) {
                jSONArray3.put(jSONObject7);
            }
        }
        return jSONArray3;
    }

    private JSONObject a(int i) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray a2;
        try {
            cursor2 = this.c.d();
            try {
                cursor = this.c.a(i);
            } catch (JSONException e) {
                cursor3 = null;
                cursor4 = cursor2;
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
        } catch (JSONException e2) {
            cursor3 = null;
            cursor4 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            cursor2 = null;
        }
        try {
            if (cursor.getCount() > 0) {
                JSONObject a3 = a(cursor);
                jSONArray = c(cursor);
                jSONObject = a3;
            } else {
                jSONArray = null;
                jSONObject = null;
            }
            JSONArray a4 = (!com.facebook.ads.internal.l.a.g(this.b) || (a2 = com.facebook.ads.internal.f.e.a(this.b, i)) == null || a2.length() <= 0) ? jSONArray : a(a2, jSONArray, i);
            if (a4 != null) {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put("tokens", jSONObject);
                }
                jSONObject2.put(com.umeng.analytics.pro.d.ar, a4);
            } else {
                jSONObject2 = null;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                cursor.close();
                return jSONObject2;
            }
            return jSONObject2;
        } catch (JSONException e3) {
            cursor3 = cursor;
            cursor4 = cursor2;
            if (cursor4 != null) {
                cursor4.close();
            }
            if (cursor3 != null) {
                cursor3.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private JSONObject a(Cursor cursor) {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(0), cursor.getString(1));
        }
        return jSONObject;
    }

    private void a(String str) {
        if (com.facebook.ads.internal.f.e.c(str)) {
            com.facebook.ads.internal.f.e.a(str);
        } else {
            this.c.a(str);
        }
    }

    private JSONArray b(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(com.facebook.ads.internal.e.c.a.a));
            jSONObject.put("token_id", cursor.getString(com.facebook.ads.internal.e.c.b.a));
            jSONObject.put("type", cursor.getString(com.facebook.ads.internal.e.c.d.a));
            jSONObject.put("time", r.a(cursor.getDouble(com.facebook.ads.internal.e.c.e.a)));
            jSONObject.put("session_time", r.a(cursor.getDouble(com.facebook.ads.internal.e.c.f.a)));
            jSONObject.put("session_id", cursor.getString(com.facebook.ads.internal.e.c.g.a));
            String string = cursor.getString(com.facebook.ads.internal.e.c.h.a);
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(com.facebook.ads.internal.e.c.i.a));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray c(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(2));
            jSONObject.put("token_id", cursor.getString(0));
            jSONObject.put("type", cursor.getString(4));
            jSONObject.put("time", r.a(cursor.getDouble(5)));
            jSONObject.put("session_time", r.a(cursor.getDouble(6)));
            jSONObject.put("session_id", cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(9));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONObject d() {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray a2;
        try {
            cursor2 = this.c.f();
            try {
                cursor = this.c.e();
                try {
                    if (cursor2.getCount() <= 0 || cursor.getCount() <= 0) {
                        jSONArray = null;
                        jSONObject = null;
                    } else {
                        JSONObject a3 = a(cursor2);
                        jSONArray = b(cursor);
                        jSONObject = a3;
                    }
                    JSONArray a4 = (!com.facebook.ads.internal.l.a.g(this.b) || (a2 = com.facebook.ads.internal.f.e.a(this.b)) == null || a2.length() <= 0) ? jSONArray : a(a2, jSONArray);
                    if (a4 != null) {
                        jSONObject2 = new JSONObject();
                        if (jSONObject != null) {
                            jSONObject2.put("tokens", jSONObject);
                        }
                        jSONObject2.put(com.umeng.analytics.pro.d.ar, a4);
                    } else {
                        jSONObject2 = null;
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                        return jSONObject2;
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    cursor3 = cursor;
                    cursor4 = cursor2;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (JSONException e2) {
                cursor3 = null;
                cursor4 = cursor2;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (JSONException e3) {
            cursor3 = null;
            cursor4 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            cursor2 = null;
        }
    }

    @Override // com.facebook.ads.internal.m.b.a
    public JSONObject a() {
        int j = com.facebook.ads.internal.l.a.j(this.b);
        return j > 0 ? a(j) : d();
    }

    @Override // com.facebook.ads.internal.m.b.a
    public boolean a(JSONArray jSONArray) {
        boolean g = com.facebook.ads.internal.l.a.g(this.b);
        boolean z = true;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("id");
                int i2 = jSONObject.getInt(PluginConstants.KEY_ERROR_CODE);
                if (i2 == 1) {
                    if (!this.c.b(string) && g) {
                        com.facebook.ads.internal.f.e.b(string);
                    }
                } else if (i2 >= 1000 && i2 < 2000) {
                    a(string);
                    z = false;
                } else if (i2 >= 2000 && i2 < 3000 && !this.c.b(string) && g) {
                    com.facebook.ads.internal.f.e.b(string);
                }
            } catch (JSONException e) {
            }
        }
        return z;
    }

    @Override // com.facebook.ads.internal.m.b.a
    public void b() {
        this.c.g();
        this.c.b();
        com.facebook.ads.internal.f.e.c(this.b);
    }

    @Override // com.facebook.ads.internal.m.b.a
    public void b(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                a(jSONArray.getJSONObject(i).getString("id"));
            } catch (JSONException e) {
            }
        }
    }

    @Override // com.facebook.ads.internal.m.b.a
    public boolean c() {
        Cursor cursor;
        Cursor d;
        int j = com.facebook.ads.internal.l.a.j(this.b);
        if (j < 1) {
            return false;
        }
        try {
            d = this.c.d();
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            boolean z = (d.moveToFirst() ? d.getInt(0) : 0) + com.facebook.ads.internal.f.e.b(this.b) > j;
            if (d != null) {
                d.close();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            cursor = d;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
