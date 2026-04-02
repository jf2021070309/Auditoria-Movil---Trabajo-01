package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.stream.JsonReader;
import com.worldturner.medeia.parser.AbstractValidatingStreamCopier;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatingConsumer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import kotlin.Metadata;
/* compiled from: GsonValidatingStreamCopier.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonValidatingStreamCopier;", "Lcom/worldturner/medeia/parser/AbstractValidatingStreamCopier;", "Lcom/google/gson/stream/JsonReader;", "createGsonJsonReader", "Lcom/amazon/aps/iva/kb0/q;", "copy", "jsonReader", "Lcom/google/gson/stream/JsonReader;", "Ljava/io/InputStream;", FirebaseAnalytics.Param.SOURCE, "Ljava/io/OutputStream;", "target", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "", "inputSourceName", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/lang/String;)V", "medeia-validator-gson"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class GsonValidatingStreamCopier extends AbstractValidatingStreamCopier {
    private final JsonReader jsonReader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsonValidatingStreamCopier(InputStream inputStream, OutputStream outputStream, SchemaValidator schemaValidator, String str) {
        super(inputStream, outputStream, schemaValidator, str);
        j.g(inputStream, FirebaseAnalytics.Param.SOURCE);
        j.g(outputStream, "target");
        j.g(schemaValidator, "validator");
        this.jsonReader = createGsonJsonReader();
    }

    private final JsonReader createGsonJsonReader() {
        return new GsonJsonReaderDecorator(new InputStreamReader(new AbstractValidatingStreamCopier.ValidatorInputStream(), a.b), new SchemaValidatingConsumer(getValidator(), 0, 2, null), getInputSourceName());
    }

    public final void copy() {
        GsonUtilsKt.gsonParseAll(this.jsonReader);
    }
}
