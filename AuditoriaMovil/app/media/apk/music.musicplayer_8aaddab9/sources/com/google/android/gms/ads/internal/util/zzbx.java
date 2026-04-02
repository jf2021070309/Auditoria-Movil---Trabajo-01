package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzfae;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbx {
    public static final zzbw<Map<String, ?>> zza = new zzbv();

    public static List<String> zza(JSONArray jSONArray, List<String> list) throws JSONException {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                list.add(jSONArray.getString(i2));
            }
        }
        return list;
    }

    public static List<String> zzb(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject zzc(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, zzd(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, zzc(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                String valueOf = String.valueOf(peek);
                valueOf.length();
                throw new IllegalStateException("unexpected json token: ".concat(valueOf));
            } else {
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray zzd(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(zzd(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(zzc(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                String valueOf = String.valueOf(peek);
                valueOf.length();
                throw new IllegalStateException("unexpected json token: ".concat(valueOf));
            } else {
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void zze(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zze(jsonWriter.name(next), (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                } else {
                    zzf(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public static void zzf(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj = jSONArray.get(i2);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zze(jsonWriter, (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                } else {
                    zzf(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public static JSONObject zzg(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject zzh(JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        if (zzn == null) {
            return null;
        }
        return zzn.optJSONObject(strArr[1]);
    }

    public static boolean zzi(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        if (zzn == null) {
            return false;
        }
        return zzn.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzj(String str, JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        return zzn == null ? "" : zzn.optString(strArr[0], "");
    }

    public static Bundle zzk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i2 = 0;
                        Object obj = null;
                        for (int i3 = 0; obj == null && i3 < length; i3++) {
                            obj = !jSONArray.isNull(i3) ? jSONArray.opt(i3) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            zzcgt.zzi(valueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(valueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj instanceof JSONObject) {
                            Parcelable[] parcelableArr = new Bundle[length];
                            while (i2 < length) {
                                parcelableArr[i2] = !jSONArray.isNull(i2) ? zzk(jSONArray.optJSONObject(i2)) : null;
                                i2++;
                            }
                            bundle.putParcelableArray(next, parcelableArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i2 < length) {
                                dArr[i2] = jSONArray.optDouble(i2);
                                i2++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i2 < length) {
                                strArr[i2] = !jSONArray.isNull(i2) ? jSONArray.optString(i2) : null;
                                i2++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i2 < length) {
                                zArr[i2] = jSONArray.optBoolean(i2);
                                i2++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            zzcgt.zzi(String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, zzk((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    zzcgt.zzi(valueOf2.length() != 0 ? "Unsupported type for key:".concat(valueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }

    public static String zzl(zzfae zzfaeVar) {
        if (zzfaeVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzm(jsonWriter, zzfaeVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e2) {
            zzcgt.zzg("Error when writing JSON.", e2);
            return null;
        }
    }

    private static void zzm(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof zzfae) {
            zze(jsonWriter, ((zzfae) obj).zzd);
        } else if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Object obj2 : (List) obj) {
                zzm(jsonWriter, obj2);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    zzm(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        }
    }

    private static JSONObject zzn(JSONObject jSONObject, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length - 1; i2++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i2]);
        }
        return jSONObject;
    }
}
