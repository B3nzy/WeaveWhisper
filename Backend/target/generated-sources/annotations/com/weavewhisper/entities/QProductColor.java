package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductColor is a Querydsl query type for ProductColor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductColor extends EntityPathBase<ProductColor> {

    private static final long serialVersionUID = -115059456L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductColor productColor = new QProductColor("productColor");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final EnumPath<com.weavewhisper.enums.ColorType> color = createEnum("color", com.weavewhisper.enums.ColorType.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProduct productRef;

    public QProductColor(String variable) {
        this(ProductColor.class, forVariable(variable), INITS);
    }

    public QProductColor(Path<? extends ProductColor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductColor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductColor(PathMetadata metadata, PathInits inits) {
        this(ProductColor.class, metadata, inits);
    }

    public QProductColor(Class<? extends ProductColor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

