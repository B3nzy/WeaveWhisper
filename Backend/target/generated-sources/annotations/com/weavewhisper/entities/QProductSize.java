package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductSize is a Querydsl query type for ProductSize
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductSize extends EntityPathBase<ProductSize> {

    private static final long serialVersionUID = 1105138372L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductSize productSize = new QProductSize("productSize");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProduct productRef;

    public final EnumPath<com.weavewhisper.enums.SizeType> size = createEnum("size", com.weavewhisper.enums.SizeType.class);

    public QProductSize(String variable) {
        this(ProductSize.class, forVariable(variable), INITS);
    }

    public QProductSize(Path<? extends ProductSize> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductSize(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductSize(PathMetadata metadata, PathInits inits) {
        this(ProductSize.class, metadata, inits);
    }

    public QProductSize(Class<? extends ProductSize> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

