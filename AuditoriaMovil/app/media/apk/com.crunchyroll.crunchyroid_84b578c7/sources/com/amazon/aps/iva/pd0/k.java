package com.amazon.aps.iva.pd0;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.pd0.b;
import com.amazon.aps.iva.pd0.c;
import com.amazon.aps.iva.yb0.e0;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes4.dex */
public final class k implements j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] W = {e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "withDefinedIn", "getWithDefinedIn()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "modifiers", "getModifiers()Ljava/util/Set;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "startFromName", "getStartFromName()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "debugMode", "getDebugMode()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "verbose", "getVerbose()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "unitReturnType", "getUnitReturnType()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "withoutReturnType", "getWithoutReturnType()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "enhancedTypes", "getEnhancedTypes()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderDefaultModality", "getRenderDefaultModality()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "receiverAfterName", "getReceiverAfterName()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), e0.b(new com.amazon.aps.iva.yb0.p(e0.a(k.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    public final l A;
    public final l B;
    public final l C;
    public final l D;
    public final l E;
    public final l F;
    public final l G;
    public final l H;
    public final l I;
    public final l J;
    public final l K;
    public final l L;
    public final l M;
    public final l N;
    public final l O;
    public final l P;
    public final l Q;
    public final l R;
    public final l S;
    public final l T;
    public final l U;
    public final l V;
    public boolean a;
    public final l b = new l(b.c.a, this);
    public final l c;
    public final l d;
    public final l e;
    public final l f;
    public final l g;
    public final l h;
    public final l i;
    public final l j;
    public final l k;
    public final l l;
    public final l m;
    public final l n;
    public final l o;
    public final l p;
    public final l q;
    public final l r;
    public final l s;
    public final l t;
    public final l u;
    public final l v;
    public final l w;
    public final l x;
    public final l y;
    public final l z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c1, String> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(c1 c1Var) {
            com.amazon.aps.iva.yb0.j.f(c1Var, "it");
            return "...";
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ee0.e0, com.amazon.aps.iva.ee0.e0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ee0.e0 invoke(com.amazon.aps.iva.ee0.e0 e0Var) {
            com.amazon.aps.iva.ee0.e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
            return e0Var2;
        }
    }

    public k() {
        Boolean bool = Boolean.TRUE;
        this.c = new l(bool, this);
        this.d = new l(bool, this);
        this.e = new l(i.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new l(bool2, this);
        this.g = new l(bool2, this);
        this.h = new l(bool2, this);
        this.i = new l(bool2, this);
        this.j = new l(bool2, this);
        this.k = new l(bool, this);
        this.l = new l(bool2, this);
        this.m = new l(bool2, this);
        this.n = new l(bool2, this);
        this.o = new l(bool, this);
        this.p = new l(bool, this);
        this.q = new l(bool2, this);
        this.r = new l(bool2, this);
        this.s = new l(bool2, this);
        this.t = new l(bool2, this);
        this.u = new l(bool2, this);
        this.v = new l(bool2, this);
        this.w = new l(bool2, this);
        this.x = new l(b.h, this);
        this.y = new l(a.h, this);
        this.z = new l(bool, this);
        this.A = new l(o.RENDER_OPEN, this);
        this.B = new l(c.l.a.a, this);
        this.C = new l(r.PLAIN, this);
        this.D = new l(p.ALL, this);
        this.E = new l(bool2, this);
        this.F = new l(bool2, this);
        this.G = new l(q.DEBUG, this);
        this.H = new l(bool2, this);
        this.I = new l(bool2, this);
        this.J = new l(b0.b, this);
        this.K = new l(m.a, this);
        this.L = new l(null, this);
        this.M = new l(com.amazon.aps.iva.pd0.a.NO_ARGUMENTS, this);
        this.N = new l(bool2, this);
        this.O = new l(bool, this);
        this.P = new l(bool, this);
        this.Q = new l(bool2, this);
        this.R = new l(bool, this);
        this.S = new l(bool, this);
        this.T = new l(bool2, this);
        this.U = new l(bool2, this);
        this.V = new l(bool, this);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void a() {
        this.E.c(this, W[29], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void b() {
        this.F.c(this, W[30], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void c(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "<set-?>");
        this.D.c(this, W[28], pVar);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final boolean d() {
        return ((Boolean) this.m.getValue(this, W[11])).booleanValue();
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void e() {
        this.v.c(this, W[20], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void f() {
        this.f.c(this, W[4], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final Set<com.amazon.aps.iva.nd0.c> g() {
        return (Set) this.K.getValue(this, W[35]);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final boolean h() {
        return ((Boolean) this.h.getValue(this, W[6])).booleanValue();
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void i() {
        this.w.c(this, W[21], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void j() {
        this.h.c(this, W[6], Boolean.TRUE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void k(Set<? extends i> set) {
        com.amazon.aps.iva.yb0.j.f(set, "<set-?>");
        this.e.c(this, W[3], set);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void l(LinkedHashSet linkedHashSet) {
        this.K.c(this, W[35], linkedHashSet);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void m(r rVar) {
        com.amazon.aps.iva.yb0.j.f(rVar, "<set-?>");
        this.C.c(this, W[27], rVar);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void n() {
        this.c.c(this, W[1], Boolean.FALSE);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void o(com.amazon.aps.iva.pd0.b bVar) {
        this.b.c(this, W[0], bVar);
    }

    public final com.amazon.aps.iva.pd0.a p() {
        return (com.amazon.aps.iva.pd0.a) this.M.getValue(this, W[37]);
    }
}
