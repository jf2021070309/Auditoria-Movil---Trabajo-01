package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: DateTypeAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/DateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Date;", "Lcom/google/gson/stream/JsonWriter;", "out", "date", "Lcom/amazon/aps/iva/kb0/q;", "write", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "Ljava/text/SimpleDateFormat;", "writeDateFormat", "Ljava/text/SimpleDateFormat;", "readDateFormat", "secondaryReadDateFormat", "<init>", "(Ljava/text/SimpleDateFormat;Ljava/text/SimpleDateFormat;Ljava/text/SimpleDateFormat;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final int $stable = 8;
    private final SimpleDateFormat readDateFormat;
    private final SimpleDateFormat secondaryReadDateFormat;
    private final SimpleDateFormat writeDateFormat;

    public DateTypeAdapter() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DateTypeAdapter(java.text.SimpleDateFormat r3, java.text.SimpleDateFormat r4, java.text.SimpleDateFormat r5, int r6, com.amazon.aps.iva.yb0.e r7) {
        /*
            r2 = this;
            r7 = r6 & 1
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            java.lang.String r1 = "UTC"
            if (r7 == 0) goto L16
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.US
            r3.<init>(r0, r7)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r1)
            r3.setTimeZone(r7)
        L16:
            r7 = r6 & 2
            if (r7 == 0) goto L28
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.US
            r4.<init>(r0, r7)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r1)
            r4.setTimeZone(r7)
        L28:
            r6 = r6 & 4
            if (r6 == 0) goto L3c
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r6 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
            java.util.Locale r7 = java.util.Locale.US
            r5.<init>(r6, r7)
            java.util.TimeZone r6 = java.util.TimeZone.getTimeZone(r1)
            r5.setTimeZone(r6)
        L3c:
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.DateTypeAdapter.<init>(java.text.SimpleDateFormat, java.text.SimpleDateFormat, java.text.SimpleDateFormat, int, com.amazon.aps.iva.yb0.e):void");
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(JsonReader jsonReader) {
        Date parse;
        j.f(jsonReader, "reader");
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            String nextString = jsonReader.nextString();
            synchronized (this.readDateFormat) {
                try {
                    parse = this.readDateFormat.parse(nextString);
                } catch (ParseException unused) {
                    synchronized (this.writeDateFormat) {
                        parse = this.secondaryReadDateFormat.parse(nextString);
                    }
                }
            }
            return parse;
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        j.f(jsonWriter, "out");
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.writeDateFormat) {
            format = this.writeDateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    public DateTypeAdapter(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, SimpleDateFormat simpleDateFormat3) {
        j.f(simpleDateFormat, "writeDateFormat");
        j.f(simpleDateFormat2, "readDateFormat");
        j.f(simpleDateFormat3, "secondaryReadDateFormat");
        this.writeDateFormat = simpleDateFormat;
        this.readDateFormat = simpleDateFormat2;
        this.secondaryReadDateFormat = simpleDateFormat3;
    }
}
