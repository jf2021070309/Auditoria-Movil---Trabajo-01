package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: KotlinTarget.kt */
/* loaded from: classes4.dex */
public enum n {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<n> ALL_TARGET_SET;
    private static final List<n> ANNOTATION_CLASS_LIST;
    private static final List<n> CLASS_LIST;
    private static final List<n> COMPANION_OBJECT_LIST;
    private static final Set<n> DEFAULT_TARGET_SET;
    private static final List<n> ENUM_ENTRY_LIST;
    private static final List<n> ENUM_LIST;
    private static final List<n> FILE_LIST;
    private static final List<n> FUNCTION_LIST;
    private static final List<n> INTERFACE_LIST;
    private static final List<n> LOCAL_CLASS_LIST;
    private static final List<n> OBJECT_LIST;
    private static final List<n> PROPERTY_GETTER_LIST;
    private static final List<n> PROPERTY_SETTER_LIST;
    private static final Map<e, n> USE_SITE_MAPPING;
    private final String description;
    private final boolean isDefault;
    public static final a Companion = new a();
    private static final HashMap<String, n> map = new HashMap<>();

    /* compiled from: KotlinTarget.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    static {
        n[] values;
        int i;
        for (n nVar : values()) {
            map.put(nVar.name(), nVar);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values2) {
            if (nVar2.isDefault) {
                arrayList.add(nVar2);
            }
        }
        DEFAULT_TARGET_SET = x.c1(arrayList);
        ALL_TARGET_SET = o.d0(values());
        n nVar3 = ANNOTATION_CLASS;
        n nVar4 = CLASS;
        ANNOTATION_CLASS_LIST = f1.K(nVar3, nVar4);
        LOCAL_CLASS_LIST = f1.K(LOCAL_CLASS, nVar4);
        CLASS_LIST = f1.K(CLASS_ONLY, nVar4);
        n nVar5 = COMPANION_OBJECT;
        n nVar6 = OBJECT;
        COMPANION_OBJECT_LIST = f1.K(nVar5, nVar6, nVar4);
        OBJECT_LIST = f1.K(STANDALONE_OBJECT, nVar6, nVar4);
        INTERFACE_LIST = f1.K(INTERFACE, nVar4);
        ENUM_LIST = f1.K(ENUM_CLASS, nVar4);
        n nVar7 = ENUM_ENTRY;
        n nVar8 = PROPERTY;
        n nVar9 = FIELD;
        ENUM_ENTRY_LIST = f1.K(nVar7, nVar8, nVar9);
        n nVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = f1.J(nVar10);
        n nVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = f1.J(nVar11);
        FUNCTION_LIST = f1.J(FUNCTION);
        n nVar12 = FILE;
        FILE_LIST = f1.J(nVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = i0.U(new com.amazon.aps.iva.kb0.j(eVar, nVar13), new com.amazon.aps.iva.kb0.j(e.FIELD, nVar9), new com.amazon.aps.iva.kb0.j(e.PROPERTY, nVar8), new com.amazon.aps.iva.kb0.j(e.FILE, nVar12), new com.amazon.aps.iva.kb0.j(e.PROPERTY_GETTER, nVar11), new com.amazon.aps.iva.kb0.j(e.PROPERTY_SETTER, nVar10), new com.amazon.aps.iva.kb0.j(e.RECEIVER, nVar13), new com.amazon.aps.iva.kb0.j(e.SETTER_PARAMETER, nVar13), new com.amazon.aps.iva.kb0.j(e.PROPERTY_DELEGATE_FIELD, nVar9));
    }

    n(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    /* synthetic */ n(String str, boolean z, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
