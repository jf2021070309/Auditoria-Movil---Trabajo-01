package com.worldturner.medeia.api;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.va0.f;
import com.worldturner.medeia.parser.ArrayNode;
import com.worldturner.medeia.parser.ObjectNode;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.SimpleObjectMapper;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.parser.tree.JsonParserFromSimpleTree;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.schema.model.JsonSchema;
import com.worldturner.medeia.schema.model.ValidationBuilderContext;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: MedeiaApiBase.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a&\u0010\n\u001a\u0004\u0018\u00010\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0002\u001a*\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u0006H\u0002\u001a<\u0010\u0014\u001a\u00020\r*\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u001a>\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u001a\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u000f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0018\u0010%\u001a\u00020\u0012*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/worldturner/medeia/api/VersionedTree;", "tree", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "context", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "parseSchemaFromTree", "", "Ljava/net/URI;", "nodeMap", "ref", "findNode", "baseUri", "ids", "Lcom/amazon/aps/iva/kb0/q;", "collectIds", "Lcom/worldturner/medeia/parser/TreeNode;", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "version", "", "inputSourceName", "collectIdsNonRoot", "registerAndGetJsonSchemaId", "Lcom/worldturner/medeia/pointer/JsonPointer;", "pointer", "resolve", "URI_DRAFT04", "Ljava/lang/String;", "URI_DRAFT06", "URI_DRAFT07", "", "schemaUriToVersionMapping", "Ljava/util/Map;", "", "MAX_REF_RESOLVE_ITERATIONS", "I", "getIdProperty", "(Lcom/worldturner/medeia/api/JsonSchemaVersion;)Ljava/lang/String;", "idProperty", "medeia-validator-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class MedeiaApiBaseKt {
    private static final int MAX_REF_RESOLVE_ITERATIONS = 100;
    private static final String URI_DRAFT04 = "http://json-schema.org/draft-04/schema#";
    private static final String URI_DRAFT06 = "http://json-schema.org/draft-06/schema#";
    private static final String URI_DRAFT07 = "http://json-schema.org/draft-07/schema#";
    private static final Map<String, JsonSchemaVersion> schemaUriToVersionMapping;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonSchemaVersion.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonSchemaVersion.DRAFT04.ordinal()] = 1;
            iArr[JsonSchemaVersion.DRAFT06.ordinal()] = 2;
            iArr[JsonSchemaVersion.DRAFT07.ordinal()] = 3;
        }
    }

    static {
        String z0 = q.z0("#", URI_DRAFT04);
        JsonSchemaVersion jsonSchemaVersion = JsonSchemaVersion.DRAFT04;
        j jVar = new j(z0, jsonSchemaVersion);
        j jVar2 = new j(URI_DRAFT04, jsonSchemaVersion);
        String z02 = q.z0("#", URI_DRAFT06);
        JsonSchemaVersion jsonSchemaVersion2 = JsonSchemaVersion.DRAFT06;
        j jVar3 = new j(z02, jsonSchemaVersion2);
        j jVar4 = new j(URI_DRAFT06, jsonSchemaVersion2);
        String z03 = q.z0("#", URI_DRAFT07);
        JsonSchemaVersion jsonSchemaVersion3 = JsonSchemaVersion.DRAFT07;
        schemaUriToVersionMapping = i0.U(jVar, jVar2, jVar3, jVar4, new j(z03, jsonSchemaVersion3), new j(URI_DRAFT07, jsonSchemaVersion3));
    }

    public static final void collectIds(VersionedTree versionedTree, URI uri, Map<URI, VersionedTree> map) {
        URI registerAndGetJsonSchemaId = registerAndGetJsonSchemaId(versionedTree.getTree(), uri, map, versionedTree.getVersion(), versionedTree.getInputSourceName());
        if (registerAndGetJsonSchemaId == null) {
            registerAndGetJsonSchemaId = f.a;
        }
        map.put(registerAndGetJsonSchemaId, versionedTree);
        collectIdsNonRoot(versionedTree.getTree(), registerAndGetJsonSchemaId, map, versionedTree.getVersion(), versionedTree.getInputSourceName());
    }

    private static final void collectIdsNonRoot(TreeNode treeNode, URI uri, Map<URI, VersionedTree> map, JsonSchemaVersion jsonSchemaVersion, String str) {
        if (treeNode instanceof ObjectNode) {
            URI registerAndGetJsonSchemaId = registerAndGetJsonSchemaId(treeNode, uri, map, jsonSchemaVersion, str);
            if (registerAndGetJsonSchemaId != null) {
                uri = registerAndGetJsonSchemaId;
            }
            for (TreeNode treeNode2 : ((ObjectNode) treeNode).getNodes().values()) {
                collectIdsNonRoot(treeNode2, uri, map, jsonSchemaVersion, str);
            }
        } else if (treeNode instanceof ArrayNode) {
            for (TreeNode treeNode3 : ((ArrayNode) treeNode).getNodes()) {
                collectIdsNonRoot(treeNode3, uri, map, jsonSchemaVersion, str);
            }
        }
    }

    public static final VersionedTree findNode(Map<URI, VersionedTree> map, URI uri) {
        TreeNode resolve;
        VersionedTree versionedTree = map.get(uri);
        if (versionedTree != null) {
            return versionedTree;
        }
        if (!f.c(uri)) {
            return null;
        }
        String fragment = uri.getFragment();
        com.amazon.aps.iva.yb0.j.b(fragment, "ref.fragment");
        JsonPointer jsonPointer = new JsonPointer(fragment, false, 2, null);
        VersionedTree versionedTree2 = map.get(f.f(uri));
        if (versionedTree2 == null) {
            String uri2 = uri.toString();
            com.amazon.aps.iva.yb0.j.b(uri2, "this.toString()");
            int t0 = q.t0(uri2, '#', 0, 6);
            if (t0 != -1) {
                uri2 = q.A0(uri2, t0, uri2.length(), "").toString();
            }
            versionedTree2 = map.get(new URI(uri2));
        }
        if (versionedTree2 == null || (resolve = resolve(versionedTree2.getTree(), jsonPointer)) == null) {
            return null;
        }
        return new VersionedTree(resolve, versionedTree2.getVersion(), versionedTree2.getInputSourceName());
    }

    private static final String getIdProperty(JsonSchemaVersion jsonSchemaVersion) {
        int i = WhenMappings.$EnumSwitchMapping$0[jsonSchemaVersion.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new h();
            }
            return "$id";
        }
        return "id";
    }

    public static final SchemaValidator parseSchemaFromTree(VersionedTree versionedTree, ValidationBuilderContext validationBuilderContext) {
        SimpleObjectMapper simpleObjectMapper = new SimpleObjectMapper(versionedTree.getVersion().getMapperType$medeia_validator_core(), 0);
        new JsonParserFromSimpleTree(versionedTree.getTree(), simpleObjectMapper, versionedTree.getInputSourceName()).parseAll();
        Object takeResult = simpleObjectMapper.takeResult();
        if (takeResult != null) {
            return ((JsonSchema) takeResult).buildValidator(validationBuilderContext);
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.schema.model.JsonSchema");
    }

    private static final URI registerAndGetJsonSchemaId(TreeNode treeNode, URI uri, Map<URI, VersionedTree> map, JsonSchemaVersion jsonSchemaVersion, String str) {
        URI uri2;
        URI resolve;
        String textProperty = treeNode.textProperty(getIdProperty(jsonSchemaVersion));
        if (textProperty != null) {
            try {
                uri2 = new URI(textProperty);
                if (uri != null && (resolve = uri.resolve(uri2)) != null) {
                    uri2 = resolve;
                }
                map.put(uri2, new VersionedTree(treeNode, jsonSchemaVersion, str));
            } catch (URISyntaxException unused) {
                uri2 = uri;
            }
            if (uri2 != null) {
                return uri2;
            }
            return uri;
        }
        return uri;
    }

    public static final TreeNode resolve(TreeNode treeNode, JsonPointer jsonPointer) {
        TreeNode treeNode2;
        boolean z;
        com.amazon.aps.iva.yb0.j.g(treeNode, "receiver$0");
        com.amazon.aps.iva.yb0.j.g(jsonPointer, "pointer");
        String firstName = jsonPointer.firstName();
        if (treeNode instanceof ObjectNode) {
            treeNode2 = ((ObjectNode) treeNode).getNodes().get(firstName);
        } else if (treeNode instanceof ArrayNode) {
            try {
                treeNode2 = ((ArrayNode) treeNode).getNodes().get(Integer.parseInt(firstName));
            } catch (NumberFormatException unused) {
            }
        } else if (treeNode instanceof SimpleNode) {
            if (firstName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                treeNode2 = (SimpleNode) treeNode;
            }
            treeNode2 = null;
        } else {
            throw new h();
        }
        JsonPointer tail = jsonPointer.tail();
        if (tail != null) {
            if (treeNode2 == null) {
                return null;
            }
            return resolve(treeNode2, tail);
        }
        return treeNode2;
    }
}
