package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class JsonTreeReader extends JsonReader {
    private static final Reader b = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }
    };
    private static final Object c = new Object();
    private Object[] d;
    private int e;
    private String[] f;
    private int[] g;

    public JsonTreeReader(JsonElement jsonElement) {
        super(b);
        this.d = new Object[32];
        this.e = 0;
        this.f = new String[32];
        this.g = new int[32];
        a(jsonElement);
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() {
        a(JsonToken.BEGIN_ARRAY);
        a(((JsonArray) b()).iterator());
        this.g[this.e - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() {
        a(JsonToken.END_ARRAY);
        c();
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() {
        a(JsonToken.BEGIN_OBJECT);
        a(((JsonObject) b()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() {
        a(JsonToken.END_OBJECT);
        c();
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() {
        if (this.e == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b2 = b();
        if (b2 instanceof Iterator) {
            boolean z = this.d[this.e - 2] instanceof JsonObject;
            Iterator it = (Iterator) b2;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z) {
                return JsonToken.NAME;
            } else {
                a(it.next());
                return peek();
            }
        } else if (b2 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (b2 instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (b2 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) b2;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (b2 instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (b2 == c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    private Object b() {
        return this.d[this.e - 1];
    }

    private Object c() {
        Object[] objArr = this.d;
        int i = this.e - 1;
        this.e = i;
        Object obj = objArr[i];
        this.d[this.e] = null;
        return obj;
    }

    private void a(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + d());
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        String str = (String) entry.getKey();
        this.f[this.e - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() {
        JsonToken peek = peek();
        if (peek != JsonToken.STRING && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + peek + d());
        }
        String asString = ((JsonPrimitive) c()).getAsString();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() {
        a(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) c()).getAsBoolean();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() {
        a(JsonToken.NULL);
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + d());
        }
        double asDouble = ((JsonPrimitive) b()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + d());
        }
        long asLong = ((JsonPrimitive) b()).getAsLong();
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() {
        JsonToken peek = peek();
        if (peek != JsonToken.NUMBER && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + d());
        }
        int asInt = ((JsonPrimitive) b()).getAsInt();
        c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d = new Object[]{c};
        this.e = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f[this.e - 2] = "null";
        } else {
            c();
            this.f[this.e - 1] = "null";
        }
        int[] iArr = this.g;
        int i = this.e - 1;
        iArr[i] = iArr[i] + 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return getClass().getSimpleName();
    }

    public void promoteNameToValue() {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        a(entry.getValue());
        a(new JsonPrimitive((String) entry.getKey()));
    }

    private void a(Object obj) {
        if (this.e == this.d.length) {
            Object[] objArr = new Object[this.e * 2];
            int[] iArr = new int[this.e * 2];
            String[] strArr = new String[this.e * 2];
            System.arraycopy(this.d, 0, objArr, 0, this.e);
            System.arraycopy(this.g, 0, iArr, 0, this.e);
            System.arraycopy(this.f, 0, strArr, 0, this.e);
            this.d = objArr;
            this.g = iArr;
            this.f = strArr;
        }
        Object[] objArr2 = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr2[i] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder append = new StringBuilder().append('$');
        int i = 0;
        while (i < this.e) {
            if (this.d[i] instanceof JsonArray) {
                i++;
                if (this.d[i] instanceof Iterator) {
                    append.append('[').append(this.g[i]).append(']');
                }
            } else if (this.d[i] instanceof JsonObject) {
                i++;
                if (this.d[i] instanceof Iterator) {
                    append.append('.');
                    if (this.f[i] != null) {
                        append.append(this.f[i]);
                    }
                }
            }
            i++;
        }
        return append.toString();
    }

    private String d() {
        return " at path " + getPath();
    }
}
