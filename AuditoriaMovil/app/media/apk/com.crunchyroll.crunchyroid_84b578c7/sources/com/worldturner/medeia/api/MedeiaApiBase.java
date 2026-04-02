package com.worldturner.medeia.api;

import com.amazon.aps.iva.a60.b;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonParserAdapter;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.MultipleConsumer;
import com.worldturner.medeia.parser.SimpleObjectMapper;
import com.worldturner.medeia.parser.SimpleTreeBuilder;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.parser.tree.JsonParserFromSimpleTree;
import com.worldturner.medeia.schema.model.JsonSchema;
import com.worldturner.medeia.schema.model.Schema;
import com.worldturner.medeia.schema.model.SchemaWithBaseUri;
import com.worldturner.medeia.schema.model.ValidationBuilderContext;
import com.worldturner.medeia.schema.parser.JsonSchemaDraft04Type;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatingConsumer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: MedeiaApiBase.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JN\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002J8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J.\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010$\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004H&J\u001c\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J8\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'J\u0018\u0010-\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H$J\u0010\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020'H$R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/worldturner/medeia/api/MedeiaApiBase;", "", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "version", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "loadMetaSchemaValidator", "", "Lcom/worldturner/medeia/schema/model/Schema;", "parsedSchemas", "Lcom/worldturner/medeia/api/ValidationOptions;", "options", "", "Ljava/net/URI;", "Lcom/worldturner/medeia/api/VersionedTree;", "schemaIds", "validatorMap", "buildValidators", "validators", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "context", "", "findRefsToAnywhere", "Lcom/worldturner/medeia/api/SchemaSource;", FirebaseAnalytics.Param.SOURCE, "ids", "loadSchema", "Lcom/worldturner/medeia/parser/SimpleObjectMapper;", "schemaBuilder", "tree", "Lcom/amazon/aps/iva/kb0/q;", "parseTreeIntoJsonSchema", "parseIntoTree", "Lcom/worldturner/medeia/api/InputSource;", "Ljava/io/OutputStream;", "target", "validator", "copyStream", "sources", "loadSchemas", "Ljava/io/Writer;", FirebaseAnalytics.Param.DESTINATION, "convertSchemaToDraft07", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "consumer", "Lcom/worldturner/medeia/parser/JsonParserAdapter;", "createSchemaParser", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "createTokenDataConsumerWriter", "metaSchemaValidators", "Ljava/util/Map;", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public abstract class MedeiaApiBase {
    private final Map<JsonSchemaVersion, SchemaValidator> metaSchemaValidators = new ConcurrentHashMap();

    private final List<SchemaValidator> buildValidators(List<? extends Schema> list, ValidationOptions validationOptions, Map<URI, VersionedTree> map, Map<URI, SchemaValidator> map2) {
        Set<URI> linkedHashSet;
        ValidationBuilderContext validationBuilderContext = new ValidationBuilderContext(false, null, null, null, null, validationOptions, 31, null);
        List<? extends Schema> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (Schema schema : list2) {
            arrayList.add(schema.buildValidator(validationBuilderContext));
        }
        if (validationOptions.getSupportRefsToAnywhere()) {
            linkedHashSet = findRefsToAnywhere(arrayList, map, validationBuilderContext);
        } else {
            linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SchemaValidator) it.next()).recordUnknownRefs(linkedHashSet);
            }
        }
        if (!(!linkedHashSet.isEmpty())) {
            if (map2 != null) {
                map2.putAll(validationBuilderContext.getSchemaValidatorsById());
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Invalid schema combination, unresolved $ref references: ".concat(x.B0(linkedHashSet, null, null, null, null, 63)));
    }

    private final Set<URI> findRefsToAnywhere(List<? extends SchemaValidator> list, Map<URI, VersionedTree> map, ValidationBuilderContext validationBuilderContext) {
        ArrayList<SchemaValidator> arrayList = new ArrayList();
        LinkedHashSet<URI> linkedHashSet = null;
        for (int i = 1; i <= 100; i++) {
            linkedHashSet = new LinkedHashSet();
            for (SchemaValidator schemaValidator : list) {
                schemaValidator.recordUnknownRefs(linkedHashSet);
            }
            for (SchemaValidator schemaValidator2 : arrayList) {
                schemaValidator2.recordUnknownRefs(linkedHashSet);
            }
            boolean z = false;
            for (URI uri : linkedHashSet) {
                VersionedTree access$findNode = MedeiaApiBaseKt.access$findNode(map, uri);
                if (access$findNode != null) {
                    arrayList.add(MedeiaApiBaseKt.access$parseSchemaFromTree(access$findNode, validationBuilderContext.withBaseUri(uri, true)));
                    z = true;
                }
            }
            if (!z) {
                break;
            }
        }
        if (linkedHashSet == null) {
            return b0.b;
        }
        return linkedHashSet;
    }

    private final SchemaValidator loadMetaSchemaValidator(JsonSchemaVersion jsonSchemaVersion) {
        if (this.metaSchemaValidators.get(jsonSchemaVersion) == null) {
            this.metaSchemaValidators.put(jsonSchemaVersion, loadSchemas(f1.J(MetaSchemaSource.Companion.forVersion(jsonSchemaVersion)), new ValidationOptions(false, null, false, false, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
        }
        SchemaValidator schemaValidator = this.metaSchemaValidators.get(jsonSchemaVersion);
        if (schemaValidator != null) {
            return schemaValidator;
        }
        j.l();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Schema loadSchema$default(MedeiaApiBase medeiaApiBase, SchemaSource schemaSource, ValidationOptions validationOptions, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                map = new LinkedHashMap();
            }
            return medeiaApiBase.loadSchema(schemaSource, validationOptions, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadSchema");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaValidator loadSchemas$default(MedeiaApiBase medeiaApiBase, List list, Map map, ValidationOptions validationOptions, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                validationOptions = ValidationOptions.DEFAULT;
            }
            return medeiaApiBase.loadSchemas(list, map, validationOptions);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadSchemas");
    }

    private final VersionedTree parseIntoTree(SchemaSource schemaSource) {
        String str;
        try {
            SimpleTreeBuilder simpleTreeBuilder = new SimpleTreeBuilder(0);
            JsonParserAdapter createSchemaParser = createSchemaParser(schemaSource, simpleTreeBuilder);
            createSchemaParser.parseAll();
            q qVar = q.a;
            b.k(createSchemaParser, null);
            TreeNode takeResult = simpleTreeBuilder.takeResult();
            if (takeResult != null) {
                String textProperty = takeResult.textProperty("$schema");
                JsonSchemaVersion jsonSchemaVersion = (JsonSchemaVersion) MedeiaApiBaseKt.access$getSchemaUriToVersionMapping$p().get(textProperty);
                if (jsonSchemaVersion == null) {
                    jsonSchemaVersion = schemaSource.getVersion();
                }
                if (jsonSchemaVersion != null) {
                    return new VersionedTree(takeResult, jsonSchemaVersion, schemaSource.getInput().getName());
                }
                StringBuilder sb = new StringBuilder();
                if (textProperty != null) {
                    str = "Version specified \"" + textProperty + "\" is not known in " + schemaSource;
                    if (str != null) {
                        sb.append(str);
                        sb.append(", modify schema or pass version in SchemaSource.version");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                str = "Version not specified in schema " + schemaSource;
                sb.append(str);
                sb.append(", modify schema or pass version in SchemaSource.version");
                throw new IllegalArgumentException(sb.toString());
            }
            throw new o("null cannot be cast to non-null type com.worldturner.medeia.parser.TreeNode");
        } catch (IOException e) {
            throw new Exception("In file with baseUri " + schemaSource.getBaseUri(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.worldturner.medeia.parser.MultipleConsumer] */
    private final void parseTreeIntoJsonSchema(SimpleObjectMapper simpleObjectMapper, VersionedTree versionedTree, ValidationOptions validationOptions) {
        if (validationOptions.getValidateSchema()) {
            simpleObjectMapper = new MultipleConsumer(f1.K(new SchemaValidatingConsumer(loadMetaSchemaValidator(versionedTree.getVersion()), 0, 2, null), simpleObjectMapper));
        }
        JsonParserFromSimpleTree jsonParserFromSimpleTree = new JsonParserFromSimpleTree(versionedTree.getTree(), simpleObjectMapper, versionedTree.getInputSourceName());
        try {
            jsonParserFromSimpleTree.parseAll();
            q qVar = q.a;
            b.k(jsonParserFromSimpleTree, null);
        } finally {
        }
    }

    public final void convertSchemaToDraft07(SchemaSource schemaSource, Writer writer) {
        j.g(schemaSource, FirebaseAnalytics.Param.SOURCE);
        j.g(writer, FirebaseAnalytics.Param.DESTINATION);
        JsonSchemaDraft04Type.INSTANCE.write(loadSchema(schemaSource), createTokenDataConsumerWriter(writer));
    }

    public abstract void copyStream(InputSource inputSource, OutputStream outputStream, SchemaValidator schemaValidator) throws IOException;

    public abstract JsonParserAdapter createSchemaParser(SchemaSource schemaSource, JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer);

    public abstract JsonTokenDataConsumer createTokenDataConsumerWriter(Writer writer);

    public final SchemaValidator loadSchema(SchemaSource schemaSource) {
        j.g(schemaSource, FirebaseAnalytics.Param.SOURCE);
        return loadSchemas$default(this, f1.J(schemaSource), null, null, 6, null);
    }

    public final SchemaValidator loadSchemas(List<? extends SchemaSource> list) {
        return loadSchemas$default(this, list, null, null, 6, null);
    }

    private final Schema loadSchema(SchemaSource schemaSource, ValidationOptions validationOptions, Map<URI, VersionedTree> map) {
        VersionedTree parseIntoTree = parseIntoTree(schemaSource);
        if (validationOptions.getSupportRefsToAnywhere()) {
            MedeiaApiBaseKt.access$collectIds(parseIntoTree, schemaSource.getBaseUri(), map);
            URI baseUri = schemaSource.getBaseUri();
            if (baseUri != null) {
                map.put(baseUri, parseIntoTree);
            }
        }
        SimpleObjectMapper simpleObjectMapper = new SimpleObjectMapper(parseIntoTree.getVersion().getMapperType$medeia_validator_core(), 0);
        parseTreeIntoJsonSchema(simpleObjectMapper, parseIntoTree, validationOptions);
        Object takeResult = simpleObjectMapper.takeResult();
        if (takeResult != null) {
            JsonSchema jsonSchema = (JsonSchema) takeResult;
            URI baseUri2 = schemaSource.getBaseUri();
            return baseUri2 != null ? new SchemaWithBaseUri(baseUri2, jsonSchema) : jsonSchema;
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.schema.model.JsonSchema");
    }

    public final SchemaValidator loadSchemas(List<? extends SchemaSource> list, Map<URI, SchemaValidator> map) {
        return loadSchemas$default(this, list, map, null, 4, null);
    }

    public final SchemaValidator loadSchemas(List<? extends SchemaSource> list, ValidationOptions validationOptions) {
        j.g(list, "sources");
        j.g(validationOptions, "options");
        return loadSchemas(list, null, validationOptions);
    }

    public final SchemaValidator loadSchemas(List<? extends SchemaSource> list, Map<URI, SchemaValidator> map, ValidationOptions validationOptions) {
        j.g(list, "sources");
        j.g(validationOptions, "options");
        if (!list.isEmpty()) {
            Map<URI, VersionedTree> linkedHashMap = new LinkedHashMap<>();
            List<? extends SchemaSource> list2 = list;
            ArrayList arrayList = new ArrayList(r.Y(list2));
            for (SchemaSource schemaSource : list2) {
                arrayList.add(loadSchema(schemaSource, validationOptions, linkedHashMap));
            }
            return (SchemaValidator) x.t0(buildValidators(arrayList, validationOptions, linkedHashMap, map));
        }
        throw new IllegalArgumentException("Need at least one schema source");
    }
}
