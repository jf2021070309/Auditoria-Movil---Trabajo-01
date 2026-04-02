package com.segment.analytics;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class Cartographer {
    static final Cartographer INSTANCE = new Builder().lenient(true).prettyPrint(false).build();
    private final boolean isLenient;
    private final boolean prettyPrint;

    /* renamed from: com.segment.analytics.Cartographer$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$util$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$android$util$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$util$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$util$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$util$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$util$JsonToken[JsonToken.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$util$JsonToken[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        private boolean isLenient;
        private boolean prettyPrint;

        public Cartographer build() {
            return new Cartographer(this.isLenient, this.prettyPrint);
        }

        public Builder lenient(boolean z) {
            this.isLenient = z;
            return this;
        }

        public Builder prettyPrint(boolean z) {
            this.prettyPrint = z;
            return this;
        }
    }

    public Cartographer(boolean z, boolean z2) {
        this.isLenient = z;
        this.prettyPrint = z2;
    }

    private static void arrayToWriter(Object obj, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            writeValue(Array.get(obj, i), jsonWriter);
        }
        jsonWriter.endArray();
    }

    private static void listToWriter(List<?> list, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            writeValue(it.next(), jsonWriter);
        }
        jsonWriter.endArray();
    }

    private static void mapToWriter(Map<?, ?> map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            jsonWriter.name(String.valueOf(entry.getKey()));
            writeValue(entry.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static Object readValue(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        switch (AnonymousClass1.$SwitchMap$android$util$JsonToken[peek.ordinal()]) {
            case 1:
                return readerToMap(jsonReader);
            case 2:
                return readerToList(jsonReader);
            case 3:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return null;
            case 5:
                return Double.valueOf(jsonReader.nextDouble());
            case 6:
                return jsonReader.nextString();
            default:
                throw new IllegalStateException("Invalid token " + peek);
        }
    }

    private static List<Object> readerToList(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(readValue(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static Map<String, Object> readerToMap(JsonReader jsonReader) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), readValue(jsonReader));
        }
        jsonReader.endObject();
        return linkedHashMap;
    }

    private static void writeValue(Object obj, JsonWriter jsonWriter) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (Double.isNaN(d.doubleValue()) || Double.isInfinite(d.doubleValue())) {
                    obj = Double.valueOf(0.0d);
                }
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (Float.isNaN(f.floatValue()) || Float.isInfinite(f.floatValue())) {
                    obj = Double.valueOf(0.0d);
                }
            }
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof List) {
            listToWriter((List) obj, jsonWriter);
        } else if (obj instanceof Map) {
            mapToWriter((Map) obj, jsonWriter);
        } else if (obj.getClass().isArray()) {
            arrayToWriter(obj, jsonWriter);
        } else {
            jsonWriter.value(String.valueOf(obj));
        }
    }

    public Map<String, Object> fromJson(String str) throws IOException {
        if (str != null) {
            if (str.length() != 0) {
                return fromJson(new StringReader(str));
            }
            throw new IllegalArgumentException("json empty");
        }
        throw new IllegalArgumentException("json == null");
    }

    public String toJson(Map<?, ?> map) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(map, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public Map<String, Object> fromJson(Reader reader) throws IOException {
        if (reader != null) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(this.isLenient);
            try {
                return readerToMap(jsonReader);
            } finally {
                reader.close();
            }
        }
        throw new IllegalArgumentException("reader == null");
    }

    public void toJson(Map<?, ?> map, Writer writer) throws IOException {
        if (map == null) {
            throw new IllegalArgumentException("map == null");
        }
        if (writer != null) {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setLenient(this.isLenient);
            if (this.prettyPrint) {
                jsonWriter.setIndent("  ");
            }
            try {
                mapToWriter(map, jsonWriter);
                return;
            } finally {
                jsonWriter.close();
            }
        }
        throw new IllegalArgumentException("writer == null");
    }
}
