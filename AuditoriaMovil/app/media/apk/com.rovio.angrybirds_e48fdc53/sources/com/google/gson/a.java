package com.google.gson;

import com.google.gson.internal.bind.util.ISO8601Utils;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes2.dex */
final class a implements JsonDeserializer<Date>, JsonSerializer<Date> {
    private final DateFormat a;
    private final DateFormat b;

    a() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    a(int i) {
        this(DateFormat.getDateInstance(i, Locale.US), DateFormat.getDateInstance(i));
    }

    public a(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    a(DateFormat dateFormat, DateFormat dateFormat2) {
        this.a = dateFormat;
        this.b = dateFormat2;
    }

    @Override // com.google.gson.JsonSerializer
    /* renamed from: a */
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonPrimitive jsonPrimitive;
        synchronized (this.b) {
            jsonPrimitive = new JsonPrimitive(this.a.format(date));
        }
        return jsonPrimitive;
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }
        Date a = a(jsonElement);
        if (type != Date.class) {
            if (type == Timestamp.class) {
                return new Timestamp(a.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(a.getTime());
            }
            throw new IllegalArgumentException(getClass() + " cannot deserialize to " + type);
        }
        return a;
    }

    private Date a(JsonElement jsonElement) {
        Date parse;
        synchronized (this.b) {
            try {
                parse = this.b.parse(jsonElement.getAsString());
            } catch (ParseException e) {
                try {
                    parse = this.a.parse(jsonElement.getAsString());
                } catch (ParseException e2) {
                    try {
                        parse = ISO8601Utils.parse(jsonElement.getAsString(), new ParsePosition(0));
                    } catch (ParseException e3) {
                        throw new JsonSyntaxException(jsonElement.getAsString(), e3);
                    }
                }
            }
        }
        return parse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a.class.getSimpleName());
        sb.append('(').append(this.b.getClass().getSimpleName()).append(')');
        return sb.toString();
    }
}
