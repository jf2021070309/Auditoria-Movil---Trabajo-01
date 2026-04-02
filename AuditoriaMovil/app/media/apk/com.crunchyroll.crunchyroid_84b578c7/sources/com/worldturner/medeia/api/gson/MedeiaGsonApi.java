package com.worldturner.medeia.api.gson;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.worldturner.medeia.api.InputPreference;
import com.worldturner.medeia.api.InputSource;
import com.worldturner.medeia.api.MedeiaApiBase;
import com.worldturner.medeia.api.SchemaSource;
import com.worldturner.medeia.parser.JsonParserAdapter;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.gson.GsonJsonReaderDecorator;
import com.worldturner.medeia.parser.gson.GsonJsonWriterDecorator;
import com.worldturner.medeia.parser.gson.GsonTokenDataWriter;
import com.worldturner.medeia.parser.gson.GsonUtilsKt;
import com.worldturner.medeia.parser.gson.GsonValidatingStreamCopier;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatingConsumer;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlin.Metadata;
/* compiled from: MedeiaGsonApi.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/worldturner/medeia/api/gson/MedeiaGsonApi;", "Lcom/worldturner/medeia/api/MedeiaApiBase;", "Lcom/worldturner/medeia/api/InputSource;", FirebaseAnalytics.Param.SOURCE, "Ljava/io/Reader;", "createReader", "decorateInputStream", "decorateReader", "Ljava/io/OutputStream;", "target", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "Lcom/amazon/aps/iva/kb0/q;", "copyStream", "Lcom/google/gson/stream/JsonReader;", "createJsonReader", "reader", "Ljava/io/Writer;", "writer", "Lcom/google/gson/stream/JsonWriter;", "createJsonWriter", "Lcom/worldturner/medeia/api/SchemaSource;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "consumer", "Lcom/worldturner/medeia/parser/JsonParserAdapter;", "createSchemaParser", FirebaseAnalytics.Param.DESTINATION, "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "createTokenDataConsumerWriter", "parseAll", "", "addBuffer", "Z", "<init>", "(Z)V", "medeia-validator-gson"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class MedeiaGsonApi extends MedeiaApiBase {
    private final boolean addBuffer;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPreference.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[InputPreference.STREAM.ordinal()] = 1;
            iArr[InputPreference.READER.ordinal()] = 2;
        }
    }

    public MedeiaGsonApi() {
        this(false, 1, null);
    }

    private final Reader createReader(InputSource inputSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[inputSource.getPreference().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return decorateReader(inputSource);
            }
            throw new h();
        }
        return decorateInputStream(inputSource);
    }

    private final Reader decorateInputStream(InputSource inputSource) {
        InputStream stream = inputSource.getStream();
        if (this.addBuffer) {
            stream = new BufferedInputStream(stream);
        }
        return new InputStreamReader(stream, a.b);
    }

    private final Reader decorateReader(InputSource inputSource) {
        Reader reader = inputSource.getReader();
        if (this.addBuffer) {
            return new BufferedReader(reader);
        }
        return reader;
    }

    @Override // com.worldturner.medeia.api.MedeiaApiBase
    public void copyStream(InputSource inputSource, OutputStream outputStream, SchemaValidator schemaValidator) {
        j.g(inputSource, FirebaseAnalytics.Param.SOURCE);
        j.g(outputStream, "target");
        j.g(schemaValidator, "validator");
        new GsonValidatingStreamCopier(inputSource.getStream(), outputStream, schemaValidator, inputSource.getName()).copy();
    }

    public final JsonReader createJsonReader(SchemaValidator schemaValidator, InputSource inputSource) {
        j.g(schemaValidator, "validator");
        j.g(inputSource, FirebaseAnalytics.Param.SOURCE);
        return new GsonJsonReaderDecorator(createReader(inputSource), new SchemaValidatingConsumer(schemaValidator, 0, 2, null), inputSource.getName());
    }

    public final JsonWriter createJsonWriter(SchemaValidator schemaValidator, Writer writer) {
        j.g(schemaValidator, "validator");
        j.g(writer, "writer");
        return new GsonJsonWriterDecorator(writer, new SchemaValidatingConsumer(schemaValidator, 0, 2, null), null);
    }

    @Override // com.worldturner.medeia.api.MedeiaApiBase
    public JsonParserAdapter createSchemaParser(SchemaSource schemaSource, JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer) {
        j.g(schemaSource, FirebaseAnalytics.Param.SOURCE);
        j.g(jsonTokenDataAndLocationConsumer, "consumer");
        return new GsonJsonReaderDecorator(createReader(schemaSource.getInput()), jsonTokenDataAndLocationConsumer, schemaSource.getInput().getName());
    }

    @Override // com.worldturner.medeia.api.MedeiaApiBase
    public JsonTokenDataConsumer createTokenDataConsumerWriter(Writer writer) {
        j.g(writer, FirebaseAnalytics.Param.DESTINATION);
        return new GsonTokenDataWriter(new JsonWriter(writer));
    }

    public final void parseAll(JsonReader jsonReader) {
        j.g(jsonReader, "reader");
        GsonUtilsKt.gsonParseAll(jsonReader);
    }

    public MedeiaGsonApi(boolean z) {
        this.addBuffer = z;
    }

    public /* synthetic */ MedeiaGsonApi(boolean z, int i, e eVar) {
        this((i & 1) != 0 ? true : z);
    }

    public final JsonReader createJsonReader(SchemaValidator schemaValidator, Reader reader) {
        j.g(schemaValidator, "validator");
        j.g(reader, "reader");
        return new GsonJsonReaderDecorator(reader, new SchemaValidatingConsumer(schemaValidator, 0, 2, null), null);
    }
}
