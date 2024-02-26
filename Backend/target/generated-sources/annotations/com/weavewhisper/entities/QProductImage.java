package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductImage is a Querydsl query type for ProductImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductImage extends EntityPathBase<ProductImage> {

    private static final long serialVersionUID = -109588744L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductImage productImage = new QProductImage("productImage");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath imageName = createString("imageName");

    public final QProduct productRef;

    public QProductImage(String variable) {
        this(ProductImage.class, forVariable(variable), INITS);
    }

    public QProductImage(Path<? extends ProductImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductImage(PathMetadata metadata, PathInits inits) {
        this(ProductImage.class, metadata, inits);
    }

    public QProductImage(Class<? extends ProductImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

