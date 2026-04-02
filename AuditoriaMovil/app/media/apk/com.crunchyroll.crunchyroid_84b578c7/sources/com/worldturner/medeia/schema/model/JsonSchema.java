package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.f;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.pointer.JsonPointerKt;
import com.worldturner.medeia.schema.validation.ArrayUniqueItemsValidator;
import com.worldturner.medeia.schema.validation.ArrayValidator;
import com.worldturner.medeia.schema.validation.BooleanValueValidator;
import com.worldturner.medeia.schema.validation.ConstValidator;
import com.worldturner.medeia.schema.validation.ContentValidator;
import com.worldturner.medeia.schema.validation.EnumValidator;
import com.worldturner.medeia.schema.validation.ExistentialOperation;
import com.worldturner.medeia.schema.validation.ExistentialValidator;
import com.worldturner.medeia.schema.validation.FormatValidator;
import com.worldturner.medeia.schema.validation.IfThenElseValidator;
import com.worldturner.medeia.schema.validation.NotValidator;
import com.worldturner.medeia.schema.validation.NumberValidator;
import com.worldturner.medeia.schema.validation.ObjectValidator;
import com.worldturner.medeia.schema.validation.RefSchemaValidator;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import com.worldturner.medeia.schema.validation.StringValidator;
import com.worldturner.medeia.schema.validation.TypeValidator;
import com.worldturner.medeia.types.SingleOrList;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
/* compiled from: JsonSchema.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\bR\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0005\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0018\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0000\u0012\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010'\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010/\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u0000\u0012\u0016\b\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u000102\u0012\u0016\b\u0002\u0010g\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0000\u0018\u000102\u0012\u0016\b\u0002\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000205\u0018\u000102\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010/\u0012\u0010\b\u0002\u0010l\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u000102\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0000\u0012\u0010\b\u0002\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010y\u001a\u00020I¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u000b\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010'HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b+\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0012\u0010-\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010/HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u000102HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0000\u0018\u000102HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000205\u0018\u000102HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010/HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u000102HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0018HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0012\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bH\u0010\u0017J\t\u0010J\u001a\u00020IHÆ\u0003J¢\u0005\u0010z\u001a\u00020\u00002\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00182\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010'2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010b\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010/2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u0001022\u0016\b\u0002\u0010g\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0000\u0018\u0001022\u0016\b\u0002\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000205\u0018\u0001022\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010/2\u0010\b\u0002\u0010l\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u0001022\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00182\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00182\u0010\b\u0002\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00182\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010y\u001a\u00020IHÆ\u0001¢\u0006\u0004\bz\u0010{J\t\u0010|\u001a\u00020\u000fHÖ\u0001J\t\u0010}\u001a\u00020 HÖ\u0001J\u0014\u0010\u0080\u0001\u001a\u00020\u00152\b\u0010\u007f\u001a\u0004\u0018\u00010~HÖ\u0003R+\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010K\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000f\n\u0005\bK\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001R\u001c\u0010L\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000f\n\u0005\bL\u0010\u0082\u0001\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001c\u0010M\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000f\n\u0005\bM\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001R\u001c\u0010N\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bN\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010O\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bO\u0010\u008a\u0001\u001a\u0006\b\u008d\u0001\u0010\u008c\u0001R\u001c\u0010P\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bP\u0010\u008a\u0001\u001a\u0006\b\u008e\u0001\u0010\u008c\u0001R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010R\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\bR\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010\u0017R\"\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0005\bS\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010T\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\bT\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010U\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0097\u0001\u001a\u0006\b\u009a\u0001\u0010\u0099\u0001R\u001c\u0010V\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\bV\u0010\u0097\u0001\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001R\u001c\u0010W\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\bW\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u0099\u0001R\u001c\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\bX\u0010\u0097\u0001\u001a\u0006\b\u009d\u0001\u0010\u0099\u0001R\u001b\u0010Y\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\bY\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010\"R\u001b\u0010Z\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\bZ\u0010\u009e\u0001\u001a\u0005\b \u0001\u0010\"R\u001c\u0010[\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b[\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\b\\\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\"\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010'8\u0006¢\u0006\u000f\n\u0005\b]\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010^\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b^\u0010\u009e\u0001\u001a\u0005\bª\u0001\u0010\"R\u001b\u0010_\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b_\u0010\u009e\u0001\u001a\u0005\b«\u0001\u0010\"R\u001b\u0010`\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b`\u0010\u0092\u0001\u001a\u0005\b¬\u0001\u0010\u0017R\u001c\u0010a\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\ba\u0010¤\u0001\u001a\u0006\b\u00ad\u0001\u0010¦\u0001R\u001b\u0010b\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\bb\u0010\u009e\u0001\u001a\u0005\b®\u0001\u0010\"R\u001b\u0010c\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\bc\u0010\u009e\u0001\u001a\u0005\b¯\u0001\u0010\"R\"\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010/8\u0006¢\u0006\u000f\n\u0005\bd\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001c\u0010e\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\be\u0010¤\u0001\u001a\u0006\b³\u0001\u0010¦\u0001R(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\bf\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R(\u0010g\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0000\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\bg\u0010´\u0001\u001a\u0006\b·\u0001\u0010¶\u0001R(\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000205\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\bh\u0010´\u0001\u001a\u0006\b¸\u0001\u0010¶\u0001R\u001c\u0010i\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\bi\u0010¤\u0001\u001a\u0006\b¹\u0001\u0010¦\u0001R\u001c\u0010j\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000f\n\u0005\bj\u0010\u008f\u0001\u001a\u0006\bº\u0001\u0010\u0091\u0001R\"\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010/8\u0006¢\u0006\u000f\n\u0005\bk\u0010°\u0001\u001a\u0006\b»\u0001\u0010²\u0001R\"\u0010l\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006¢\u0006\u000f\n\u0005\bl\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010m\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bm\u0010\u008a\u0001\u001a\u0006\b¿\u0001\u0010\u008c\u0001R\u001c\u0010n\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u008a\u0001\u001a\u0006\bÀ\u0001\u0010\u008c\u0001R\u001c\u0010o\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\bo\u0010\u008a\u0001\u001a\u0006\bÁ\u0001\u0010\u008c\u0001R(\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0000\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\bp\u0010´\u0001\u001a\u0006\bÂ\u0001\u0010¶\u0001R\u001c\u0010q\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\bq\u0010¤\u0001\u001a\u0006\bÃ\u0001\u0010¦\u0001R\u001c\u0010r\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\br\u0010¤\u0001\u001a\u0006\bÄ\u0001\u0010¦\u0001R\u001c\u0010s\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\bs\u0010¤\u0001\u001a\u0006\bÅ\u0001\u0010¦\u0001R\"\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0005\bt\u0010\u0094\u0001\u001a\u0006\bÆ\u0001\u0010\u0096\u0001R\"\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0005\bu\u0010\u0094\u0001\u001a\u0006\bÇ\u0001\u0010\u0096\u0001R\"\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0005\bv\u0010\u0094\u0001\u001a\u0006\bÈ\u0001\u0010\u0096\u0001R\u001c\u0010w\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\u000f\n\u0005\bw\u0010¤\u0001\u001a\u0006\bÉ\u0001\u0010¦\u0001R\u001b\u0010x\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\bx\u0010\u0092\u0001\u001a\u0005\bÊ\u0001\u0010\u0017R\u001a\u0010y\u001a\u00020I8\u0006¢\u0006\u000f\n\u0005\by\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/worldturner/medeia/schema/model/JsonSchema;", "Lcom/worldturner/medeia/schema/model/Schema;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "context", "Lcom/amazon/aps/iva/kb0/q;", "recordIds$medeia_validator_core", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;)V", "recordIds", "buildValidator", "Ljava/net/URI;", "component1", "component2", "component3", "", "component4", "component5", "component6", "Lcom/worldturner/medeia/parser/TreeNode;", "component7", "", "component8", "()Ljava/lang/Boolean;", "", "component9", "Ljava/math/BigDecimal;", "component10", "component11", "component12", "component13", "component14", "", "component15", "()Ljava/lang/Integer;", "component16", "Lcom/amazon/aps/iva/oe0/f;", "component17", "component18", "Lcom/worldturner/medeia/types/SingleOrList;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "", "component26", "component27", "", "component28", "component29", "Lcom/worldturner/medeia/schema/model/PropertyNamesOrJsonSchema;", "component30", "component31", "component32", "component33", "Ljava/util/EnumSet;", "Lcom/worldturner/medeia/schema/model/SimpleType;", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "Lcom/worldturner/medeia/pointer/JsonPointer;", "component47", "schema", "id", "ref", "comment", "title", MediaTrack.ROLE_DESCRIPTION, "default", "readOnly", "examples", "multipleOf", "maximum", "exclusiveMaximum", "minimum", "exclusiveMinimum", "maxLength", "minLength", "pattern", "additionalItems", FirebaseAnalytics.Param.ITEMS, "maxItems", "minItems", "uniqueItems", "contains", "maxProperties", "minProperties", "required", "additionalProperties", "properties", "patternProperties", "dependencies", "propertyNames", "const", "enum", "type", "format", "contentMediaType", "contentEncoding", "definitions", "ifSchema", "thenSchema", "elseSchema", "allOf", "anyOf", "oneOf", "not", "acceptAllOrNothing", "jsonPointer", "copy", "(Ljava/net/URI;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/worldturner/medeia/parser/TreeNode;Ljava/lang/Boolean;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/oe0/f;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/types/SingleOrList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/parser/TreeNode;Ljava/util/Set;Ljava/util/EnumSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/lang/Boolean;Lcom/worldturner/medeia/pointer/JsonPointer;)Lcom/worldturner/medeia/schema/model/JsonSchema;", "toString", "hashCode", "", "other", "equals", "resolvedId", "Ljava/net/URI;", "getResolvedId", "()Ljava/net/URI;", "setResolvedId", "(Ljava/net/URI;)V", "getSchema", "getId", "getRef", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "getTitle", "getDescription", "Lcom/worldturner/medeia/parser/TreeNode;", "getDefault", "()Lcom/worldturner/medeia/parser/TreeNode;", "Ljava/lang/Boolean;", "getReadOnly", "Ljava/util/List;", "getExamples", "()Ljava/util/List;", "Ljava/math/BigDecimal;", "getMultipleOf", "()Ljava/math/BigDecimal;", "getMaximum", "getExclusiveMaximum", "getMinimum", "getExclusiveMinimum", "Ljava/lang/Integer;", "getMaxLength", "getMinLength", "Lcom/amazon/aps/iva/oe0/f;", "getPattern", "()Lcom/amazon/aps/iva/oe0/f;", "Lcom/worldturner/medeia/schema/model/JsonSchema;", "getAdditionalItems", "()Lcom/worldturner/medeia/schema/model/JsonSchema;", "Lcom/worldturner/medeia/types/SingleOrList;", "getItems", "()Lcom/worldturner/medeia/types/SingleOrList;", "getMaxItems", "getMinItems", "getUniqueItems", "getContains", "getMaxProperties", "getMinProperties", "Ljava/util/Set;", "getRequired", "()Ljava/util/Set;", "getAdditionalProperties", "Ljava/util/Map;", "getProperties", "()Ljava/util/Map;", "getPatternProperties", "getDependencies", "getPropertyNames", "getConst", "getEnum", "Ljava/util/EnumSet;", "getType", "()Ljava/util/EnumSet;", "getFormat", "getContentMediaType", "getContentEncoding", "getDefinitions", "getIfSchema", "getThenSchema", "getElseSchema", "getAllOf", "getAnyOf", "getOneOf", "getNot", "getAcceptAllOrNothing", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getJsonPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "<init>", "(Ljava/net/URI;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/worldturner/medeia/parser/TreeNode;Ljava/lang/Boolean;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/oe0/f;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/types/SingleOrList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/parser/TreeNode;Ljava/util/Set;Ljava/util/EnumSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/schema/model/JsonSchema;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/worldturner/medeia/schema/model/JsonSchema;Ljava/lang/Boolean;Lcom/worldturner/medeia/pointer/JsonPointer;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonSchema implements Schema {
    private final Boolean acceptAllOrNothing;
    private final JsonSchema additionalItems;
    private final JsonSchema additionalProperties;
    private final List<JsonSchema> allOf;
    private final List<JsonSchema> anyOf;
    private final String comment;

    /* renamed from: const  reason: not valid java name */
    private final TreeNode f9const;
    private final JsonSchema contains;
    private final String contentEncoding;
    private final String contentMediaType;

    /* renamed from: default  reason: not valid java name */
    private final TreeNode f10default;
    private final Map<String, JsonSchema> definitions;
    private final Map<String, PropertyNamesOrJsonSchema> dependencies;
    private final String description;
    private final JsonSchema elseSchema;

    /* renamed from: enum  reason: not valid java name */
    private final Set<TreeNode> f11enum;
    private final List<TreeNode> examples;
    private final BigDecimal exclusiveMaximum;
    private final BigDecimal exclusiveMinimum;
    private final String format;
    private final URI id;
    private final JsonSchema ifSchema;
    private final SingleOrList<JsonSchema> items;
    private final JsonPointer jsonPointer;
    private final Integer maxItems;
    private final Integer maxLength;
    private final Integer maxProperties;
    private final BigDecimal maximum;
    private final Integer minItems;
    private final Integer minLength;
    private final Integer minProperties;
    private final BigDecimal minimum;
    private final BigDecimal multipleOf;
    private final JsonSchema not;
    private final List<JsonSchema> oneOf;
    private final f pattern;
    private final Map<f, JsonSchema> patternProperties;
    private final Map<String, JsonSchema> properties;
    private final JsonSchema propertyNames;
    private final Boolean readOnly;
    private final URI ref;
    private final Set<String> required;
    private URI resolvedId;
    private final URI schema;
    private final JsonSchema thenSchema;
    private final String title;
    private final EnumSet<SimpleType> type;
    private final Boolean uniqueItems;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSchema(URI uri, URI uri2, URI uri3, String str, String str2, String str3, TreeNode treeNode, Boolean bool, List<? extends TreeNode> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, Integer num2, f fVar, JsonSchema jsonSchema, SingleOrList<JsonSchema> singleOrList, Integer num3, Integer num4, Boolean bool2, JsonSchema jsonSchema2, Integer num5, Integer num6, Set<String> set, JsonSchema jsonSchema3, Map<String, JsonSchema> map, Map<f, JsonSchema> map2, Map<String, PropertyNamesOrJsonSchema> map3, JsonSchema jsonSchema4, TreeNode treeNode2, Set<? extends TreeNode> set2, EnumSet<SimpleType> enumSet, String str4, String str5, String str6, Map<String, JsonSchema> map4, JsonSchema jsonSchema5, JsonSchema jsonSchema6, JsonSchema jsonSchema7, List<JsonSchema> list2, List<JsonSchema> list3, List<JsonSchema> list4, JsonSchema jsonSchema8, Boolean bool3, JsonPointer jsonPointer) {
        j.g(jsonPointer, "jsonPointer");
        this.schema = uri;
        this.id = uri2;
        this.ref = uri3;
        this.comment = str;
        this.title = str2;
        this.description = str3;
        this.f10default = treeNode;
        this.readOnly = bool;
        this.examples = list;
        this.multipleOf = bigDecimal;
        this.maximum = bigDecimal2;
        this.exclusiveMaximum = bigDecimal3;
        this.minimum = bigDecimal4;
        this.exclusiveMinimum = bigDecimal5;
        this.maxLength = num;
        this.minLength = num2;
        this.pattern = fVar;
        this.additionalItems = jsonSchema;
        this.items = singleOrList;
        this.maxItems = num3;
        this.minItems = num4;
        this.uniqueItems = bool2;
        this.contains = jsonSchema2;
        this.maxProperties = num5;
        this.minProperties = num6;
        this.required = set;
        this.additionalProperties = jsonSchema3;
        this.properties = map;
        this.patternProperties = map2;
        this.dependencies = map3;
        this.propertyNames = jsonSchema4;
        this.f9const = treeNode2;
        this.f11enum = set2;
        this.type = enumSet;
        this.format = str4;
        this.contentMediaType = str5;
        this.contentEncoding = str6;
        this.definitions = map4;
        this.ifSchema = jsonSchema5;
        this.thenSchema = jsonSchema6;
        this.elseSchema = jsonSchema7;
        this.allOf = list2;
        this.anyOf = list3;
        this.oneOf = list4;
        this.not = jsonSchema8;
        this.acceptAllOrNothing = bool3;
        this.jsonPointer = jsonPointer;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public SchemaValidator buildValidator(ValidationBuilderContext validationBuilderContext) {
        URI uri;
        FormatValidator formatValidator;
        ContentValidator contentValidator;
        SchemaValidator schemaValidator;
        List<SchemaValidator> list;
        SchemaValidator schemaValidator2;
        SchemaValidator schemaValidator3;
        SchemaValidator schemaValidator4;
        Map<String, ? extends SchemaValidator> map;
        Map<f, ? extends SchemaValidator> map2;
        SchemaValidator schemaValidator5;
        Map<String, ? extends SchemaValidator> map3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SchemaValidator schemaValidator6;
        SchemaValidator schemaValidator7;
        SchemaValidator schemaValidator8;
        SchemaValidator schemaValidator9;
        SchemaValidator booleanValueValidator;
        JsonSchema single;
        List<JsonSchema> list2;
        j.g(validationBuilderContext, "context");
        URI uri2 = this.id;
        if (uri2 != null && JsonPointerKt.hasJsonPointerFragment(uri2)) {
            if (com.amazon.aps.iva.va0.f.b(this.id) || (!j.a(this.id.getFragment(), this.jsonPointer.toString()))) {
                throw new IllegalArgumentException("Invalid $id with non-plain name fragment (see section 8.2.3 of json-schema-core): '" + this.id + '\'');
            }
        } else {
            if (this.id == null || (uri = com.amazon.aps.iva.va0.f.e(validationBuilderContext.getBaseUri(), this.id)) == null) {
                if (validationBuilderContext.getRoot()) {
                    uri = validationBuilderContext.getBaseUri();
                } else {
                    uri = null;
                }
            }
            setResolvedId(uri);
        }
        if (this.ref != null) {
            RefSchemaValidator refSchemaValidator = new RefSchemaValidator(com.amazon.aps.iva.va0.f.e(validationBuilderContext.getBaseUri(), this.ref), validationBuilderContext.getSchemaValidatorsById());
            recordIds$medeia_validator_core(refSchemaValidator, validationBuilderContext);
            return refSchemaValidator;
        }
        ValidationBuilderContext withParent = ValidationBuilderContext.withBaseUri$default(validationBuilderContext, validationBuilderContext.baseUri(this.id), false, 2, null).withParent(this);
        SchemaValidator[] schemaValidatorArr = new SchemaValidator[16];
        schemaValidatorArr[0] = BooleanValueValidator.Companion.create(this.acceptAllOrNothing);
        schemaValidatorArr[1] = TypeValidator.Companion.create(this.type);
        schemaValidatorArr[2] = NumberValidator.Companion.create(this.multipleOf, this.maximum, this.exclusiveMaximum, this.minimum, this.exclusiveMinimum);
        schemaValidatorArr[3] = StringValidator.Companion.create(this.maxLength, this.minLength, this.pattern);
        if (validationBuilderContext.getOptions().getValidateFormat()) {
            formatValidator = FormatValidator.Companion.create(this.format, validationBuilderContext.getOptions().getCustomFormats());
        } else {
            formatValidator = null;
        }
        schemaValidatorArr[4] = formatValidator;
        if (validationBuilderContext.getOptions().getValidateContent()) {
            contentValidator = ContentValidator.Companion.create(this.contentMediaType, this.contentEncoding);
        } else {
            contentValidator = null;
        }
        schemaValidatorArr[5] = contentValidator;
        ArrayValidator.Companion companion = ArrayValidator.Companion;
        JsonSchema jsonSchema = this.additionalItems;
        if (jsonSchema != null) {
            schemaValidator = jsonSchema.buildValidator(withParent);
        } else {
            schemaValidator = null;
        }
        SingleOrList<JsonSchema> singleOrList = this.items;
        if (singleOrList != null && (list2 = singleOrList.getList()) != null) {
            list = SchemaKt.buildValidators(list2, withParent);
        } else {
            list = null;
        }
        SingleOrList<JsonSchema> singleOrList2 = this.items;
        if (singleOrList2 != null && (single = singleOrList2.getSingle()) != null) {
            schemaValidator2 = single.buildValidator(withParent);
        } else {
            schemaValidator2 = null;
        }
        Integer num = this.maxItems;
        Integer num2 = this.minItems;
        JsonSchema jsonSchema2 = this.contains;
        if (jsonSchema2 != null) {
            schemaValidator3 = jsonSchema2.buildValidator(withParent);
        } else {
            schemaValidator3 = null;
        }
        schemaValidatorArr[6] = companion.create(schemaValidator, list, schemaValidator2, num, num2, schemaValidator3);
        schemaValidatorArr[7] = ArrayUniqueItemsValidator.Companion.create(this.uniqueItems, validationBuilderContext.getOptions().getUniqueItemsValidationMethod());
        schemaValidatorArr[8] = ConstValidator.Companion.create(this.f9const);
        schemaValidatorArr[9] = EnumValidator.Companion.create(this.f11enum);
        ObjectValidator.Companion companion2 = ObjectValidator.Companion;
        Integer num3 = this.maxProperties;
        Integer num4 = this.minProperties;
        Set<String> set = this.required;
        JsonSchema jsonSchema3 = this.additionalProperties;
        if (jsonSchema3 != null) {
            schemaValidator4 = jsonSchema3.buildValidator(withParent);
        } else {
            schemaValidator4 = null;
        }
        Map<String, JsonSchema> map4 = this.properties;
        if (map4 != null) {
            map = SchemaKt.buildValidators(map4, withParent);
        } else {
            map = null;
        }
        Map<f, JsonSchema> map5 = this.patternProperties;
        if (map5 != null) {
            map2 = SchemaKt.buildValidators(map5, withParent);
        } else {
            map2 = null;
        }
        JsonSchema jsonSchema4 = this.propertyNames;
        if (jsonSchema4 != null) {
            schemaValidator5 = jsonSchema4.buildValidator(withParent);
        } else {
            schemaValidator5 = null;
        }
        Map<String, PropertyNamesOrJsonSchema> map6 = this.dependencies;
        if (map6 != null) {
            map3 = SchemaKt.buildValidators2(map6, withParent);
        } else {
            map3 = null;
        }
        schemaValidatorArr[10] = companion2.create(num3, num4, set, schemaValidator4, map, map2, schemaValidator5, map3);
        ExistentialValidator.Companion companion3 = ExistentialValidator.Companion;
        ExistentialOperation existentialOperation = ExistentialOperation.ANY_OF;
        List<JsonSchema> list3 = this.anyOf;
        if (list3 != null) {
            List<JsonSchema> list4 = list3;
            arrayList = new ArrayList(r.Y(list4));
            for (JsonSchema jsonSchema5 : list4) {
                arrayList.add(jsonSchema5.buildValidator(withParent));
            }
        } else {
            arrayList = null;
        }
        schemaValidatorArr[11] = companion3.create(existentialOperation, arrayList, validationBuilderContext.getOptions().getOptimizeExistentialValidators());
        ExistentialValidator.Companion companion4 = ExistentialValidator.Companion;
        ExistentialOperation existentialOperation2 = ExistentialOperation.ALL_OF;
        List<JsonSchema> list5 = this.allOf;
        if (list5 != null) {
            List<JsonSchema> list6 = list5;
            arrayList2 = new ArrayList(r.Y(list6));
            for (JsonSchema jsonSchema6 : list6) {
                arrayList2.add(jsonSchema6.buildValidator(withParent));
            }
        } else {
            arrayList2 = null;
        }
        schemaValidatorArr[12] = companion4.create(existentialOperation2, arrayList2, validationBuilderContext.getOptions().getOptimizeExistentialValidators());
        ExistentialValidator.Companion companion5 = ExistentialValidator.Companion;
        ExistentialOperation existentialOperation3 = ExistentialOperation.ONE_OF;
        List<JsonSchema> list7 = this.oneOf;
        if (list7 != null) {
            List<JsonSchema> list8 = list7;
            arrayList3 = new ArrayList(r.Y(list8));
            for (JsonSchema jsonSchema7 : list8) {
                arrayList3.add(jsonSchema7.buildValidator(withParent));
            }
        } else {
            arrayList3 = null;
        }
        schemaValidatorArr[13] = companion5.create(existentialOperation3, arrayList3, validationBuilderContext.getOptions().getOptimizeExistentialValidators());
        NotValidator.Companion companion6 = NotValidator.Companion;
        JsonSchema jsonSchema8 = this.not;
        if (jsonSchema8 != null) {
            schemaValidator6 = jsonSchema8.buildValidator(withParent);
        } else {
            schemaValidator6 = null;
        }
        schemaValidatorArr[14] = companion6.create(schemaValidator6);
        IfThenElseValidator.Companion companion7 = IfThenElseValidator.Companion;
        JsonSchema jsonSchema9 = this.ifSchema;
        if (jsonSchema9 != null) {
            schemaValidator7 = jsonSchema9.buildValidator(withParent);
        } else {
            schemaValidator7 = null;
        }
        JsonSchema jsonSchema10 = this.thenSchema;
        if (jsonSchema10 != null) {
            schemaValidator8 = jsonSchema10.buildValidator(withParent);
        } else {
            schemaValidator8 = null;
        }
        JsonSchema jsonSchema11 = this.elseSchema;
        if (jsonSchema11 != null) {
            schemaValidator9 = jsonSchema11.buildValidator(withParent);
        } else {
            schemaValidator9 = null;
        }
        schemaValidatorArr[15] = companion7.create(schemaValidator7, schemaValidator8, schemaValidator9);
        ArrayList O = o.O(schemaValidatorArr);
        int size = O.size();
        if (size != 0) {
            if (size != 1) {
                booleanValueValidator = ExistentialValidator.Companion.create(ExistentialOperation.ALL_OF, O, true);
                if (booleanValueValidator == null) {
                    j.l();
                    throw null;
                }
            } else {
                booleanValueValidator = (SchemaValidator) x.t0(O);
            }
        } else {
            booleanValueValidator = new BooleanValueValidator(true);
        }
        recordIds$medeia_validator_core(booleanValueValidator, validationBuilderContext);
        return booleanValueValidator;
    }

    public final URI component1() {
        return this.schema;
    }

    public final BigDecimal component10() {
        return this.multipleOf;
    }

    public final BigDecimal component11() {
        return this.maximum;
    }

    public final BigDecimal component12() {
        return this.exclusiveMaximum;
    }

    public final BigDecimal component13() {
        return this.minimum;
    }

    public final BigDecimal component14() {
        return this.exclusiveMinimum;
    }

    public final Integer component15() {
        return this.maxLength;
    }

    public final Integer component16() {
        return this.minLength;
    }

    public final f component17() {
        return this.pattern;
    }

    public final JsonSchema component18() {
        return this.additionalItems;
    }

    public final SingleOrList<JsonSchema> component19() {
        return this.items;
    }

    public final URI component2() {
        return this.id;
    }

    public final Integer component20() {
        return this.maxItems;
    }

    public final Integer component21() {
        return this.minItems;
    }

    public final Boolean component22() {
        return this.uniqueItems;
    }

    public final JsonSchema component23() {
        return this.contains;
    }

    public final Integer component24() {
        return this.maxProperties;
    }

    public final Integer component25() {
        return this.minProperties;
    }

    public final Set<String> component26() {
        return this.required;
    }

    public final JsonSchema component27() {
        return this.additionalProperties;
    }

    public final Map<String, JsonSchema> component28() {
        return this.properties;
    }

    public final Map<f, JsonSchema> component29() {
        return this.patternProperties;
    }

    public final URI component3() {
        return this.ref;
    }

    public final Map<String, PropertyNamesOrJsonSchema> component30() {
        return this.dependencies;
    }

    public final JsonSchema component31() {
        return this.propertyNames;
    }

    public final TreeNode component32() {
        return this.f9const;
    }

    public final Set<TreeNode> component33() {
        return this.f11enum;
    }

    public final EnumSet<SimpleType> component34() {
        return this.type;
    }

    public final String component35() {
        return this.format;
    }

    public final String component36() {
        return this.contentMediaType;
    }

    public final String component37() {
        return this.contentEncoding;
    }

    public final Map<String, JsonSchema> component38() {
        return this.definitions;
    }

    public final JsonSchema component39() {
        return this.ifSchema;
    }

    public final String component4() {
        return this.comment;
    }

    public final JsonSchema component40() {
        return this.thenSchema;
    }

    public final JsonSchema component41() {
        return this.elseSchema;
    }

    public final List<JsonSchema> component42() {
        return this.allOf;
    }

    public final List<JsonSchema> component43() {
        return this.anyOf;
    }

    public final List<JsonSchema> component44() {
        return this.oneOf;
    }

    public final JsonSchema component45() {
        return this.not;
    }

    public final Boolean component46() {
        return this.acceptAllOrNothing;
    }

    public final JsonPointer component47() {
        return this.jsonPointer;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.description;
    }

    public final TreeNode component7() {
        return this.f10default;
    }

    public final Boolean component8() {
        return this.readOnly;
    }

    public final List<TreeNode> component9() {
        return this.examples;
    }

    public final JsonSchema copy(URI uri, URI uri2, URI uri3, String str, String str2, String str3, TreeNode treeNode, Boolean bool, List<? extends TreeNode> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, Integer num2, f fVar, JsonSchema jsonSchema, SingleOrList<JsonSchema> singleOrList, Integer num3, Integer num4, Boolean bool2, JsonSchema jsonSchema2, Integer num5, Integer num6, Set<String> set, JsonSchema jsonSchema3, Map<String, JsonSchema> map, Map<f, JsonSchema> map2, Map<String, PropertyNamesOrJsonSchema> map3, JsonSchema jsonSchema4, TreeNode treeNode2, Set<? extends TreeNode> set2, EnumSet<SimpleType> enumSet, String str4, String str5, String str6, Map<String, JsonSchema> map4, JsonSchema jsonSchema5, JsonSchema jsonSchema6, JsonSchema jsonSchema7, List<JsonSchema> list2, List<JsonSchema> list3, List<JsonSchema> list4, JsonSchema jsonSchema8, Boolean bool3, JsonPointer jsonPointer) {
        j.g(jsonPointer, "jsonPointer");
        return new JsonSchema(uri, uri2, uri3, str, str2, str3, treeNode, bool, list, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, num, num2, fVar, jsonSchema, singleOrList, num3, num4, bool2, jsonSchema2, num5, num6, set, jsonSchema3, map, map2, map3, jsonSchema4, treeNode2, set2, enumSet, str4, str5, str6, map4, jsonSchema5, jsonSchema6, jsonSchema7, list2, list3, list4, jsonSchema8, bool3, jsonPointer);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JsonSchema) {
                JsonSchema jsonSchema = (JsonSchema) obj;
                if (!j.a(this.schema, jsonSchema.schema) || !j.a(this.id, jsonSchema.id) || !j.a(this.ref, jsonSchema.ref) || !j.a(this.comment, jsonSchema.comment) || !j.a(this.title, jsonSchema.title) || !j.a(this.description, jsonSchema.description) || !j.a(this.f10default, jsonSchema.f10default) || !j.a(this.readOnly, jsonSchema.readOnly) || !j.a(this.examples, jsonSchema.examples) || !j.a(this.multipleOf, jsonSchema.multipleOf) || !j.a(this.maximum, jsonSchema.maximum) || !j.a(this.exclusiveMaximum, jsonSchema.exclusiveMaximum) || !j.a(this.minimum, jsonSchema.minimum) || !j.a(this.exclusiveMinimum, jsonSchema.exclusiveMinimum) || !j.a(this.maxLength, jsonSchema.maxLength) || !j.a(this.minLength, jsonSchema.minLength) || !j.a(this.pattern, jsonSchema.pattern) || !j.a(this.additionalItems, jsonSchema.additionalItems) || !j.a(this.items, jsonSchema.items) || !j.a(this.maxItems, jsonSchema.maxItems) || !j.a(this.minItems, jsonSchema.minItems) || !j.a(this.uniqueItems, jsonSchema.uniqueItems) || !j.a(this.contains, jsonSchema.contains) || !j.a(this.maxProperties, jsonSchema.maxProperties) || !j.a(this.minProperties, jsonSchema.minProperties) || !j.a(this.required, jsonSchema.required) || !j.a(this.additionalProperties, jsonSchema.additionalProperties) || !j.a(this.properties, jsonSchema.properties) || !j.a(this.patternProperties, jsonSchema.patternProperties) || !j.a(this.dependencies, jsonSchema.dependencies) || !j.a(this.propertyNames, jsonSchema.propertyNames) || !j.a(this.f9const, jsonSchema.f9const) || !j.a(this.f11enum, jsonSchema.f11enum) || !j.a(this.type, jsonSchema.type) || !j.a(this.format, jsonSchema.format) || !j.a(this.contentMediaType, jsonSchema.contentMediaType) || !j.a(this.contentEncoding, jsonSchema.contentEncoding) || !j.a(this.definitions, jsonSchema.definitions) || !j.a(this.ifSchema, jsonSchema.ifSchema) || !j.a(this.thenSchema, jsonSchema.thenSchema) || !j.a(this.elseSchema, jsonSchema.elseSchema) || !j.a(this.allOf, jsonSchema.allOf) || !j.a(this.anyOf, jsonSchema.anyOf) || !j.a(this.oneOf, jsonSchema.oneOf) || !j.a(this.not, jsonSchema.not) || !j.a(this.acceptAllOrNothing, jsonSchema.acceptAllOrNothing) || !j.a(this.jsonPointer, jsonSchema.jsonPointer)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Boolean getAcceptAllOrNothing() {
        return this.acceptAllOrNothing;
    }

    public final JsonSchema getAdditionalItems() {
        return this.additionalItems;
    }

    public final JsonSchema getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final List<JsonSchema> getAllOf() {
        return this.allOf;
    }

    public final List<JsonSchema> getAnyOf() {
        return this.anyOf;
    }

    public final String getComment() {
        return this.comment;
    }

    public final TreeNode getConst() {
        return this.f9const;
    }

    public final JsonSchema getContains() {
        return this.contains;
    }

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final String getContentMediaType() {
        return this.contentMediaType;
    }

    public final TreeNode getDefault() {
        return this.f10default;
    }

    public final Map<String, JsonSchema> getDefinitions() {
        return this.definitions;
    }

    public final Map<String, PropertyNamesOrJsonSchema> getDependencies() {
        return this.dependencies;
    }

    public final String getDescription() {
        return this.description;
    }

    public final JsonSchema getElseSchema() {
        return this.elseSchema;
    }

    public final Set<TreeNode> getEnum() {
        return this.f11enum;
    }

    public final List<TreeNode> getExamples() {
        return this.examples;
    }

    public final BigDecimal getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    public final BigDecimal getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    public final String getFormat() {
        return this.format;
    }

    public final URI getId() {
        return this.id;
    }

    public final JsonSchema getIfSchema() {
        return this.ifSchema;
    }

    public final SingleOrList<JsonSchema> getItems() {
        return this.items;
    }

    public final JsonPointer getJsonPointer() {
        return this.jsonPointer;
    }

    public final Integer getMaxItems() {
        return this.maxItems;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMaxProperties() {
        return this.maxProperties;
    }

    public final BigDecimal getMaximum() {
        return this.maximum;
    }

    public final Integer getMinItems() {
        return this.minItems;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final Integer getMinProperties() {
        return this.minProperties;
    }

    public final BigDecimal getMinimum() {
        return this.minimum;
    }

    public final BigDecimal getMultipleOf() {
        return this.multipleOf;
    }

    public final JsonSchema getNot() {
        return this.not;
    }

    public final List<JsonSchema> getOneOf() {
        return this.oneOf;
    }

    public final f getPattern() {
        return this.pattern;
    }

    public final Map<f, JsonSchema> getPatternProperties() {
        return this.patternProperties;
    }

    public final Map<String, JsonSchema> getProperties() {
        return this.properties;
    }

    public final JsonSchema getPropertyNames() {
        return this.propertyNames;
    }

    public final Boolean getReadOnly() {
        return this.readOnly;
    }

    public final URI getRef() {
        return this.ref;
    }

    public final Set<String> getRequired() {
        return this.required;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public URI getResolvedId() {
        return this.resolvedId;
    }

    public final URI getSchema() {
        return this.schema;
    }

    public final JsonSchema getThenSchema() {
        return this.thenSchema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumSet<SimpleType> getType() {
        return this.type;
    }

    public final Boolean getUniqueItems() {
        return this.uniqueItems;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        URI uri = this.schema;
        int i47 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i48 = i * 31;
        URI uri2 = this.id;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        } else {
            i2 = 0;
        }
        int i49 = (i48 + i2) * 31;
        URI uri3 = this.ref;
        if (uri3 != null) {
            i3 = uri3.hashCode();
        } else {
            i3 = 0;
        }
        int i50 = (i49 + i3) * 31;
        String str = this.comment;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i51 = (i50 + i4) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i52 = (i51 + i5) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i53 = (i52 + i6) * 31;
        TreeNode treeNode = this.f10default;
        if (treeNode != null) {
            i7 = treeNode.hashCode();
        } else {
            i7 = 0;
        }
        int i54 = (i53 + i7) * 31;
        Boolean bool = this.readOnly;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int i55 = (i54 + i8) * 31;
        List<TreeNode> list = this.examples;
        if (list != null) {
            i9 = list.hashCode();
        } else {
            i9 = 0;
        }
        int i56 = (i55 + i9) * 31;
        BigDecimal bigDecimal = this.multipleOf;
        if (bigDecimal != null) {
            i10 = bigDecimal.hashCode();
        } else {
            i10 = 0;
        }
        int i57 = (i56 + i10) * 31;
        BigDecimal bigDecimal2 = this.maximum;
        if (bigDecimal2 != null) {
            i11 = bigDecimal2.hashCode();
        } else {
            i11 = 0;
        }
        int i58 = (i57 + i11) * 31;
        BigDecimal bigDecimal3 = this.exclusiveMaximum;
        if (bigDecimal3 != null) {
            i12 = bigDecimal3.hashCode();
        } else {
            i12 = 0;
        }
        int i59 = (i58 + i12) * 31;
        BigDecimal bigDecimal4 = this.minimum;
        if (bigDecimal4 != null) {
            i13 = bigDecimal4.hashCode();
        } else {
            i13 = 0;
        }
        int i60 = (i59 + i13) * 31;
        BigDecimal bigDecimal5 = this.exclusiveMinimum;
        if (bigDecimal5 != null) {
            i14 = bigDecimal5.hashCode();
        } else {
            i14 = 0;
        }
        int i61 = (i60 + i14) * 31;
        Integer num = this.maxLength;
        if (num != null) {
            i15 = num.hashCode();
        } else {
            i15 = 0;
        }
        int i62 = (i61 + i15) * 31;
        Integer num2 = this.minLength;
        if (num2 != null) {
            i16 = num2.hashCode();
        } else {
            i16 = 0;
        }
        int i63 = (i62 + i16) * 31;
        f fVar = this.pattern;
        if (fVar != null) {
            i17 = fVar.hashCode();
        } else {
            i17 = 0;
        }
        int i64 = (i63 + i17) * 31;
        JsonSchema jsonSchema = this.additionalItems;
        if (jsonSchema != null) {
            i18 = jsonSchema.hashCode();
        } else {
            i18 = 0;
        }
        int i65 = (i64 + i18) * 31;
        SingleOrList<JsonSchema> singleOrList = this.items;
        if (singleOrList != null) {
            i19 = singleOrList.hashCode();
        } else {
            i19 = 0;
        }
        int i66 = (i65 + i19) * 31;
        Integer num3 = this.maxItems;
        if (num3 != null) {
            i20 = num3.hashCode();
        } else {
            i20 = 0;
        }
        int i67 = (i66 + i20) * 31;
        Integer num4 = this.minItems;
        if (num4 != null) {
            i21 = num4.hashCode();
        } else {
            i21 = 0;
        }
        int i68 = (i67 + i21) * 31;
        Boolean bool2 = this.uniqueItems;
        if (bool2 != null) {
            i22 = bool2.hashCode();
        } else {
            i22 = 0;
        }
        int i69 = (i68 + i22) * 31;
        JsonSchema jsonSchema2 = this.contains;
        if (jsonSchema2 != null) {
            i23 = jsonSchema2.hashCode();
        } else {
            i23 = 0;
        }
        int i70 = (i69 + i23) * 31;
        Integer num5 = this.maxProperties;
        if (num5 != null) {
            i24 = num5.hashCode();
        } else {
            i24 = 0;
        }
        int i71 = (i70 + i24) * 31;
        Integer num6 = this.minProperties;
        if (num6 != null) {
            i25 = num6.hashCode();
        } else {
            i25 = 0;
        }
        int i72 = (i71 + i25) * 31;
        Set<String> set = this.required;
        if (set != null) {
            i26 = set.hashCode();
        } else {
            i26 = 0;
        }
        int i73 = (i72 + i26) * 31;
        JsonSchema jsonSchema3 = this.additionalProperties;
        if (jsonSchema3 != null) {
            i27 = jsonSchema3.hashCode();
        } else {
            i27 = 0;
        }
        int i74 = (i73 + i27) * 31;
        Map<String, JsonSchema> map = this.properties;
        if (map != null) {
            i28 = map.hashCode();
        } else {
            i28 = 0;
        }
        int i75 = (i74 + i28) * 31;
        Map<f, JsonSchema> map2 = this.patternProperties;
        if (map2 != null) {
            i29 = map2.hashCode();
        } else {
            i29 = 0;
        }
        int i76 = (i75 + i29) * 31;
        Map<String, PropertyNamesOrJsonSchema> map3 = this.dependencies;
        if (map3 != null) {
            i30 = map3.hashCode();
        } else {
            i30 = 0;
        }
        int i77 = (i76 + i30) * 31;
        JsonSchema jsonSchema4 = this.propertyNames;
        if (jsonSchema4 != null) {
            i31 = jsonSchema4.hashCode();
        } else {
            i31 = 0;
        }
        int i78 = (i77 + i31) * 31;
        TreeNode treeNode2 = this.f9const;
        if (treeNode2 != null) {
            i32 = treeNode2.hashCode();
        } else {
            i32 = 0;
        }
        int i79 = (i78 + i32) * 31;
        Set<TreeNode> set2 = this.f11enum;
        if (set2 != null) {
            i33 = set2.hashCode();
        } else {
            i33 = 0;
        }
        int i80 = (i79 + i33) * 31;
        EnumSet<SimpleType> enumSet = this.type;
        if (enumSet != null) {
            i34 = enumSet.hashCode();
        } else {
            i34 = 0;
        }
        int i81 = (i80 + i34) * 31;
        String str4 = this.format;
        if (str4 != null) {
            i35 = str4.hashCode();
        } else {
            i35 = 0;
        }
        int i82 = (i81 + i35) * 31;
        String str5 = this.contentMediaType;
        if (str5 != null) {
            i36 = str5.hashCode();
        } else {
            i36 = 0;
        }
        int i83 = (i82 + i36) * 31;
        String str6 = this.contentEncoding;
        if (str6 != null) {
            i37 = str6.hashCode();
        } else {
            i37 = 0;
        }
        int i84 = (i83 + i37) * 31;
        Map<String, JsonSchema> map4 = this.definitions;
        if (map4 != null) {
            i38 = map4.hashCode();
        } else {
            i38 = 0;
        }
        int i85 = (i84 + i38) * 31;
        JsonSchema jsonSchema5 = this.ifSchema;
        if (jsonSchema5 != null) {
            i39 = jsonSchema5.hashCode();
        } else {
            i39 = 0;
        }
        int i86 = (i85 + i39) * 31;
        JsonSchema jsonSchema6 = this.thenSchema;
        if (jsonSchema6 != null) {
            i40 = jsonSchema6.hashCode();
        } else {
            i40 = 0;
        }
        int i87 = (i86 + i40) * 31;
        JsonSchema jsonSchema7 = this.elseSchema;
        if (jsonSchema7 != null) {
            i41 = jsonSchema7.hashCode();
        } else {
            i41 = 0;
        }
        int i88 = (i87 + i41) * 31;
        List<JsonSchema> list2 = this.allOf;
        if (list2 != null) {
            i42 = list2.hashCode();
        } else {
            i42 = 0;
        }
        int i89 = (i88 + i42) * 31;
        List<JsonSchema> list3 = this.anyOf;
        if (list3 != null) {
            i43 = list3.hashCode();
        } else {
            i43 = 0;
        }
        int i90 = (i89 + i43) * 31;
        List<JsonSchema> list4 = this.oneOf;
        if (list4 != null) {
            i44 = list4.hashCode();
        } else {
            i44 = 0;
        }
        int i91 = (i90 + i44) * 31;
        JsonSchema jsonSchema8 = this.not;
        if (jsonSchema8 != null) {
            i45 = jsonSchema8.hashCode();
        } else {
            i45 = 0;
        }
        int i92 = (i91 + i45) * 31;
        Boolean bool3 = this.acceptAllOrNothing;
        if (bool3 != null) {
            i46 = bool3.hashCode();
        } else {
            i46 = 0;
        }
        int i93 = (i92 + i46) * 31;
        JsonPointer jsonPointer = this.jsonPointer;
        if (jsonPointer != null) {
            i47 = jsonPointer.hashCode();
        }
        return i93 + i47;
    }

    public final void recordIds$medeia_validator_core(SchemaValidator schemaValidator, ValidationBuilderContext validationBuilderContext) {
        ValidationBuilderContext validationBuilderContext2;
        boolean z;
        j.g(schemaValidator, "validator");
        j.g(validationBuilderContext, "context");
        URI resolvedId = getResolvedId();
        if (resolvedId != null) {
            if (this.id != null || validationBuilderContext.getRoot()) {
                validationBuilderContext.put(resolvedId, this, schemaValidator);
                if (!com.amazon.aps.iva.va0.f.c(resolvedId)) {
                    validationBuilderContext.put(com.amazon.aps.iva.va0.f.f(resolvedId), this, schemaValidator);
                }
            }
            if (validationBuilderContext.getRoot() && (!j.a(validationBuilderContext.getBaseUri(), getResolvedId()))) {
                validationBuilderContext.put(validationBuilderContext.getBaseUri(), this, schemaValidator);
            }
        }
        int i = 0;
        for (Object obj : validationBuilderContext.getParents()) {
            int i2 = i + 1;
            if (i >= 0) {
                JsonSchema jsonSchema = (JsonSchema) obj;
                URI resolvedId2 = jsonSchema.getResolvedId();
                if (resolvedId2 != null) {
                    if (!com.amazon.aps.iva.va0.f.b(resolvedId2)) {
                        if (i == f1.B(validationBuilderContext.getParents())) {
                            String fragment = resolvedId2.getFragment();
                            if (fragment != null && fragment.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                            }
                        }
                    }
                    validationBuilderContext.put(com.amazon.aps.iva.va0.f.d(resolvedId2, jsonSchema.jsonPointer.relativize(this.jsonPointer).toString(), true), this, schemaValidator);
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        Map<String, JsonSchema> map = this.definitions;
        if (map != null) {
            for (Map.Entry<String, JsonSchema> entry : map.entrySet()) {
                JsonSchema value = entry.getValue();
                URI resolvedId3 = getResolvedId();
                if (resolvedId3 == null || (validationBuilderContext2 = ValidationBuilderContext.withBaseUri$default(validationBuilderContext, resolvedId3, false, 2, null).withParent(this)) == null) {
                    validationBuilderContext2 = validationBuilderContext;
                }
                value.buildValidator(validationBuilderContext2);
            }
        }
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public void setResolvedId(URI uri) {
        this.resolvedId = uri;
    }

    public String toString() {
        return "JsonSchema(schema=" + this.schema + ", id=" + this.id + ", ref=" + this.ref + ", comment=" + this.comment + ", title=" + this.title + ", description=" + this.description + ", default=" + this.f10default + ", readOnly=" + this.readOnly + ", examples=" + this.examples + ", multipleOf=" + this.multipleOf + ", maximum=" + this.maximum + ", exclusiveMaximum=" + this.exclusiveMaximum + ", minimum=" + this.minimum + ", exclusiveMinimum=" + this.exclusiveMinimum + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", pattern=" + this.pattern + ", additionalItems=" + this.additionalItems + ", items=" + this.items + ", maxItems=" + this.maxItems + ", minItems=" + this.minItems + ", uniqueItems=" + this.uniqueItems + ", contains=" + this.contains + ", maxProperties=" + this.maxProperties + ", minProperties=" + this.minProperties + ", required=" + this.required + ", additionalProperties=" + this.additionalProperties + ", properties=" + this.properties + ", patternProperties=" + this.patternProperties + ", dependencies=" + this.dependencies + ", propertyNames=" + this.propertyNames + ", const=" + this.f9const + ", enum=" + this.f11enum + ", type=" + this.type + ", format=" + this.format + ", contentMediaType=" + this.contentMediaType + ", contentEncoding=" + this.contentEncoding + ", definitions=" + this.definitions + ", ifSchema=" + this.ifSchema + ", thenSchema=" + this.thenSchema + ", elseSchema=" + this.elseSchema + ", allOf=" + this.allOf + ", anyOf=" + this.anyOf + ", oneOf=" + this.oneOf + ", not=" + this.not + ", acceptAllOrNothing=" + this.acceptAllOrNothing + ", jsonPointer=" + this.jsonPointer + ")";
    }

    public /* synthetic */ JsonSchema(URI uri, URI uri2, URI uri3, String str, String str2, String str3, TreeNode treeNode, Boolean bool, List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, Integer num2, f fVar, JsonSchema jsonSchema, SingleOrList singleOrList, Integer num3, Integer num4, Boolean bool2, JsonSchema jsonSchema2, Integer num5, Integer num6, Set set, JsonSchema jsonSchema3, Map map, Map map2, Map map3, JsonSchema jsonSchema4, TreeNode treeNode2, Set set2, EnumSet enumSet, String str4, String str5, String str6, Map map4, JsonSchema jsonSchema5, JsonSchema jsonSchema6, JsonSchema jsonSchema7, List list2, List list3, List list4, JsonSchema jsonSchema8, Boolean bool3, JsonPointer jsonPointer, int i, int i2, e eVar) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? null : uri2, (i & 4) != 0 ? null : uri3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : treeNode, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : list, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bigDecimal, (i & 1024) != 0 ? null : bigDecimal2, (i & 2048) != 0 ? null : bigDecimal3, (i & 4096) != 0 ? null : bigDecimal4, (i & 8192) != 0 ? null : bigDecimal5, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num, (32768 & i) != 0 ? null : num2, (65536 & i) != 0 ? null : fVar, (131072 & i) != 0 ? null : jsonSchema, (262144 & i) != 0 ? null : singleOrList, (524288 & i) != 0 ? null : num3, (1048576 & i) != 0 ? null : num4, (2097152 & i) != 0 ? null : bool2, (4194304 & i) != 0 ? null : jsonSchema2, (8388608 & i) != 0 ? null : num5, (16777216 & i) != 0 ? null : num6, (33554432 & i) != 0 ? null : set, (67108864 & i) != 0 ? null : jsonSchema3, (134217728 & i) != 0 ? null : map, (268435456 & i) != 0 ? null : map2, (536870912 & i) != 0 ? null : map3, (1073741824 & i) != 0 ? null : jsonSchema4, (i & Integer.MIN_VALUE) != 0 ? null : treeNode2, (i2 & 1) != 0 ? null : set2, (i2 & 2) != 0 ? null : enumSet, (i2 & 4) != 0 ? null : str4, (i2 & 8) != 0 ? null : str5, (i2 & 16) != 0 ? null : str6, (i2 & 32) != 0 ? null : map4, (i2 & 64) != 0 ? null : jsonSchema5, (i2 & 128) != 0 ? null : jsonSchema6, (i2 & 256) != 0 ? null : jsonSchema7, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : list2, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : list4, (i2 & 4096) != 0 ? null : jsonSchema8, (i2 & 8192) != 0 ? null : bool3, jsonPointer);
    }
}
